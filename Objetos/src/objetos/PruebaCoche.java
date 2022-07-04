package objetos;

import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Coche coche1=new Coche();
		
		System.out.println("Modelo: ");
		coche1.setModelo(entrada.nextLine());
		
		System.out.println("Marca: ");
		coche1.setMarca(entrada.nextLine());
		
		System.out.println("Potencia: ");
		coche1.setPotencia(entrada.nextInt());
	
		
		System.out.println("Velocidad Maxima: ");
		coche1.setVelocidadMax(entrada.nextInt());
		
		coche1.acelerar();
		
		System.out.printf("Velocidad: %dkm/h.\n",coche1.getVelocidad());
		
		coche1.acelerar();
		System.out.printf("Despues de acelerar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		
		coche1.acelerar();
		System.out.printf("Despues de acelerar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		
		coche1.acelerar();
		System.out.printf("Despues de acelerar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		
		coche1.frenar();
		System.out.printf("Despues de frenar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		coche1.frenar();
		System.out.printf("Despues de frenar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		coche1.frenar();
		System.out.printf("Despues de frenar en 10km/h,la velocidad es: %d\n",coche1.getVelocidad());
		

		Coche c2=new Coche("Seat","Leon",105,170);
		entrada.close();
	}

}
