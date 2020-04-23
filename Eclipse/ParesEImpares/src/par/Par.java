package par;

public class Par {
	public static boolean par(int n){
		if(n==0)
			return true;
		else
			return impar(n-1);
	}
	public static boolean impar(int n){
		if(n==0)
			return false;
		else
			return par(n-1);
	}
	
	public static void main(String[] args) {
			System.out.println(impar(10));
			
		}
	}
