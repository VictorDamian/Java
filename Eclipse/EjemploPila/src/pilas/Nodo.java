package pilas;

public class Nodo {

		public int dato;
		
		public Nodo siguiente;
		
		public Nodo(int i){
			this(i,null);
		}
		
		public Nodo(int i, Nodo n){
			dato=i;
			siguiente=n;
		}
}
