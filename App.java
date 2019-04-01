package jar;

import java.util.Scanner;


public class App {
	
	/**
	 * método que pide al usuario que introduzca un número por teclado
	 * @return double
	 */
	public static double pedirNumeroUsuario() {
		double numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero = entrada.nextDouble();
		return numero;
	}
	
	/**
	 * método que calcula la suma de dos números
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double sumar(double a, double b) {
		double operacion;
		operacion = a + b;
		return operacion;
	}
	
	/**
	 * método que calcula la diferencia entre dos números
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double restar(double a, double b) {
		double operacion;
		operacion = a - b;		
		return operacion;
	}
	
	/**
	 * método que calcula la división de dos números
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double dividir(double a, double b) {
		double operacion;
		try {
			operacion = a / b;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " No se puede dividir entre 0");
			operacion = 0;
		}
		return operacion;
	}
	
	/**
	 * método que calcula la multiplicación de dos números
	 * @param a
	 * @param b
	 * @return double
	 */
	public static double multiplicar(double a, double b) {
		double operacion;
		operacion = a * b;
		return operacion;
	}
	
	public static void factorizar(double a) {
		int divisor = 2;
        while(a != 1) {
            if(a % divisor == 0){
                System.out.print(divisor + " ");
                a = a / divisor;
            }else {
               divisor++;
            }
        }
	}
	
	
	
	
	
    public static void main( String[] args ) {
    	//desde aquí se ejecuta el programa:
    	
    	double a = 10;
    	double b = 5;
    	double resultadoSuma;
    	double resultadoResta;
    	double resultadoMultiplicar;
    	double resultadoDividir;
    	
    	//pido al usuario los números con los que vamos a operar
    	//a = pedirNumeroUsuario();
    	//b = pedirNumeroUsuario();
    	
    	//realizo las operaciones matemáticas: suma, resta, multiplicar, dividir
    	resultadoSuma = App.sumar(a, b);
    	resultadoResta = App.restar(a, b);
    	resultadoDividir = App.dividir(a, b);
    	resultadoMultiplicar = App.multiplicar(a, b);
    	
    	//pantalla
        System.out.println( "Proyecto Utilidades Matemáticas:" );
        System.out.println("Suma -> " + resultadoSuma);  
        System.out.println("Resta -> " + resultadoResta);
        System.out.println("Multiplicar -> " + resultadoMultiplicar);
        System.out.println("Dividir -> " + resultadoDividir);
        System.out.print("Factorización -> ");
        App.factorizar(a);
    }
    
}
