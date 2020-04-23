/***
 * Powered by: VMDB
 * **/
package serie5;

public class SerieB {
	public static long SerieB(int n){
		if(n==0) return 2;
		if(n==1) return 0;
		
		if(n>1) return SerieB(n-1)-SerieB(n-2);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<=20; i++){
			System.out.println(SerieB(i));
		}

	}
}
