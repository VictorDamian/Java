package pilas;
import java.util.Scanner;

public class EjemploPila {

	
	public static void main(String[] args) {
		
		pilass miPila=new pilass();
		Scanner Leer = new Scanner(System.in);
		int Precio = 0, cantidad = 0, Granos = 0, d=0, retiro = 0;
				
		
		System.out.println("¿Que Grano Desea Comprar?");
		Granos= Leer.nextInt();
		
		
		for(int i = 1;i <= Granos;i++ ){
		
		
			System.out.println("¿Que valor tiene el billete que desea insertar?");
			Precio = Leer.nextInt();
			if(Precio == 20 || Precio==50 || Precio ==100 || Precio == 200 || Precio==500 || Precio==1000){
			
					
				
				System.out.println("¿Cuantos billetes desea depositar?");
				cantidad = Leer.nextInt();
				
				miPila.inserta(Granos, cantidad);
					
		}
			System.out.println("¿Desea realizar algun retiro?");
			System.out.println("1.-ahora no");
			System.out.println("2.-Si");
			d = Leer.nextInt();
			miPila.imprimirDatos();
			
			if(d==2){
				System.out.println("¿Cuantos billetes desea retirar");
				retiro = Leer.nextInt();
				
				try {
					miPila.elimina(retiro);
					miPila.imprimirDatos();
				}catch(Exception er){
					System.out.println("Error");
				}
				}else{
					
				}
		
		
		
		

		
	}
		
	}
}
		
		
