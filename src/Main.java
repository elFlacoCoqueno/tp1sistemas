import java.util.Scanner;
import javax.swing.JOptionPane;

// clase para el círculo
class Circulo {
	final double PI = 3.141692;
	double radio;
	Circulo(double radio) { // método setter
		this.radio = radio;
	}
	public double calcularArea() {
		return (radio * radio) * PI;
	}
	public double calcularPerimetro() {
		return 2 * PI * radio;
	}
}
// clase para la esfera, heredada de la clase Circulo
class Esfera extends Circulo {
	Esfera(double radio) {
		super(radio);
	}
	public double calcularVolumen() {
		return (4.0/3.0) * PI * (radio * radio * radio);
	}
}

// clase para el rectángulo y el cuadrado
class Rectangulo {
	double alto, ancho;
	Rectangulo(double alto, double ancho) { // método setter
		this.alto = alto;
		this.ancho = ancho;
	}
	public double calcularArea() {
		return alto * ancho;
	}
	public double calcularPerimetro() {
		return (2 * alto) + (2 * ancho);
	}
}
// clase para el paralelepípedo, heredado de la clase Rectangulo
class Prisma extends Rectangulo {
	double largo;
	Prisma(double alto, double ancho, double largo) {
		super(alto, ancho);
		this.largo = largo;
	}
	public double calcularVolumen() {
		return alto * ancho * largo;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radio, alto, ancho, largo;
		String eleccion, resultado;

		final String[] opciones = {"Circulo", "Rectangulo", "Esfera", "Paralelepípedo"};
		eleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la figura cuyas propiedades desea calcular", "Cálculo de figuras", -1, null, opciones, opciones[0]);
		
		switch (eleccion) {
		case "Circulo":
			radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo:", "Cálculo del círculo", -1));
			Circulo circulo = new Circulo(radio);
			resultado = "Área: " + circulo.calcularArea() + "\nPerímetro: " + circulo.calcularPerimetro();
			JOptionPane.showMessageDialog(null, resultado, "Resultados", -1);
			break;
		case "Rectangulo":
			alto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el alto del rectángulo:", "Cálculo del rectángulo", -1));
			ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del rectángulo:", "Cálculo del rectángulo", -1));
			Rectangulo rectangulo = new Rectangulo(alto, ancho);
			resultado = "Área: " + rectangulo.calcularArea() + "\nPerímetro: " + rectangulo.calcularPerimetro();
			JOptionPane.showMessageDialog(null, resultado, "Resultados", -1);
			break;
		case "Esfera":
			radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera:", "Cálculo de la esfera", -1));
			Esfera esfera = new Esfera(radio);
			resultado = "Área: " + esfera.calcularArea() + "\nPerímetro: " + esfera.calcularPerimetro() + "\nVolumen: " + esfera.calcularVolumen();
			JOptionPane.showMessageDialog(null, resultado, "Resultados", -1);
			break;
		case "Paralelepípedo":
			alto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el alto del paralelepipedo:", "Cálculo del paralelepipedo", -1));
			ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del paralelepipedo:", "Cálculo del paralelepipedo", -1));
			largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo del paralelepipedo:", "Cálculo del paralelepipedo", -1));
			Prisma prisma = new Prisma(alto, ancho, largo);
			resultado = "Área: " + prisma.calcularArea() + "\nPerímetro: " + prisma.calcularPerimetro() + "\nVolumen: " + prisma.calcularVolumen();
			JOptionPane.showMessageDialog(null, resultado, "Resultados", -1);
			break;
		}
		

	}

}
