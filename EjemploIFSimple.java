//Importaci�n de librer�a para poder leer
//caracteres desde el teclado
import java.util.Scanner;

public class EjemploIFSimple {
	public static void main(String args[]) {
		//Declaraci�n para poder leer los caract�res
		//por el teclado.
		Scanner in = new Scanner(System.in);
		
		System.out.println("Por favor ingrese un n�mero entero: ");
		int numeroLeido = in.nextInt();
		
		if (numeroLeido %2 == 0) 
			System.out.println("El n�mero " + numeroLeido + " es par");
		else
			System.out.println("El n�mero " + numeroLeido + " es impar");
	}
}