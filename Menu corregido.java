package menu;

import java.util.Scanner;

public class ejercicio {
	
	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner (System.in)) {
			int opcion, calc; 

			System.out.println("¿Que figura quieres hacer? Presiona el numero 1 para Cuadrado y 2 para Circulo.");
			opcion = scan.nextInt(); 
			double lado, diagonal, per, areacua;
			double radio, circu, areacir;
			double pi = 3.1415;
			
			if (opcion == 1) {
				System.out.println("Valor del lado de tu cuadrado");
				lado = scan.nextDouble();
				
				System.out.println("¿Que es lo que desea calcular? Presione el numero 1 para Perimetro, 2 para Area y 3 para la diagonal");
				calc = scan.nextInt(); 
				
				if (calc == 1) {
					per = (lado*4);
					System.out.println("El perimetro del cuadrado es: " +per);
				}
				
				if (calc == 2) {
					areacua = (lado*lado);
					System.out.println("El area del cuadrado es: " +areacua);
				}
				
				if (calc == 3) {
					diagonal = Math.sqrt(2*lado*lado);
					System.out.println("La diagonal del cuadrado es: " +diagonal);
				}
			}
			
			if (opcion == 2) {
				System.out.println("Valor del radio de tu circulo");
				radio = scan.nextDouble();
				
				System.out.println("¿Que es lo que desea calcular? Presione el numero 1 para Circunferencia y 2 para Area");
				calc = scan.nextInt(); 
				
				if (calc == 1) {
					circu = (2*pi)*radio;
					System.out.println("La circunferencia del circulo es: " +circu);
				}
				
				if (calc == 2) {
					areacir = pi*(radio*radio);
					System.out.println("El area del circulo es: " +areacir); 
				}
				
			}
		}
	
	}


}
