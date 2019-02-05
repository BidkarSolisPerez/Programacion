import java.lang.Math;

public class FirstProgram{
	public static void main(String args[]){
		int var1 = 25;
		int var2 = 25;
		
		System.out.println("First Java program");
		System.out.println("La suma de: var1: " + var1 + " y " + var2 + " es:" + var1 + var2);
		System.out.println("La resta de: var1: " + var1 + " y " + var2 + " es:" + (var1 - var2));
		System.out.println("La multiplicacion de: var1: " + var1 + " y " + var2 + " es:" + var1 * var2);
		System.out.println("La division de: var1: " + var1 + " y " + var2 + " es:" + var1 / var2);
		System.out.println("La operacion mod de: var1: " + var1 + " y " + var2 + " es:" + var1 % var2);
		System.out.println("La potencia de var1: " + var1 + " es " + Math.pow(var1,2));
	}
}
