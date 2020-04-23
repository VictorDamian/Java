/***
 * Powered by: VMDB
 * **/
package serie5;

public class SerieC {
	public static long SerieC (long n){
		if(n<3){
			return n+1;
		}
		if(n==3){
			return SerieC(n-2);
		}else{
			return SerieC(n-4);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++)
			System.out.println(SerieC(i));	
	}

}
