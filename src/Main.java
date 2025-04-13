import java.util.Scanner;
import javax.swing.JOptionPane;

// clase para el círculo
class Circulo {
	final double PI = 3.141692;
	double radio;
	public void setRadio(double radio) { // método setter
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
	public double calcularVolumen() {
		return (4.0/3.0) * PI * (radio * radio * radio);
	}
}

// clase para el rectángulo y el cuadrado
class Rectangulo {
	double alto, ancho;
	public void setValores(double alto, double ancho) { // método setter
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
	public void setValores(double alto, double ancho, double largo) { // método setter
		this.alto = alto;
		this.ancho = ancho;
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
		/*
		// preparacion de ejemplo para el joptionpane
		String[] opciones = {"hola", "chau"};
		JOptionPane.showInputDialog(null, "Titulo", "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		*/

		// ejemplo con el radio de una esfera
		System.out.print("Ingrese el radio de la esfera: ");
		radio = input.nextDouble();
		
		Esfera esfera = new Esfera();
		esfera.setRadio(radio);
		System.out.println("Resultado = " + esfera.calcularVolumen());

	}

}
