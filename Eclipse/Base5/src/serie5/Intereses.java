/***
 * Powered by: VMDB
 * **/
package serie5;
	public class Intereses {

		public static void main(String[] args) {
			for (int i = 0; i < 13; i++) {
				System.out.println("mes "+i+" "+interes(i));
			}
			
		}
		public static double interes(int n){
			if(n==0){ 
				return 20000;
			}else{
				return interes(n-1)+interes(n-1)*(((2.0*n)+1.0)/100);
			}
		}

	}