/***
 * Powered by: VMDB
 * **/
package serie5;

public class Serie {
	public static long serie5(int n){
						//Indicamos que si "n" esta en la posicion de "0" lo almacenara 
		if(n==0)
			return 0; 	//si es asi nos retornara en un "0"
		else 			//aqui indicamos que lo que este en la posicion anterior le 
			 			//sumaremos un 1 para la proxima serie
			return serie5(n-1) + n;
	}
	
						//el ciclo for nos contara los valores que queremos que muestre
						//en este caso seran los primeros 20 digitos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++)
			System.out.println(serie5(i));
	}
}
