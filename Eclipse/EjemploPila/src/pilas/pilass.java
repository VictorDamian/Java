package pilas;

public class pilass {

		protected Nodo inicio,fin;
		
			public pilass(){
				inicio=null;
			}
			
		public boolean estaVacia(){
			return inicio==null;
			
		}
	public int cima(){
		return fin.dato;
	}
		

	
	public void inserta(int i, int c){
		for (int j=0;j<c;j++){
			inserta(i);
		}
	}
		public void inserta(int i){
			if(!estaVacia()){
               fin.siguiente=new Nodo(i);
				fin=fin.siguiente;
				
			}else{
				inicio= new Nodo(i, inicio);
				fin=inicio;
			}
		}
		
		public void calculatotal(int i){
			
		}
	
		
		public int elimina(int c){
			 
			int suma=0;
			for (int j=0; j<c;j++){
				suma +=elimina();
	        }
		return suma;	
				}
		
		public int elimina(){
			
			int i=fin.dato;
			if(inicio==fin){
				inicio=null;
				fin=null;
			}
			
			else{
				Nodo temp;
				for(temp=inicio;temp.siguiente!=fin;temp=temp.siguiente);
				fin=temp;
				fin.siguiente=null;
			}
			return i;
			}
		
     public boolean estaEnLaLista(int i){
			Nodo temp;
			for(temp=inicio;temp!=null && temp.dato!=i;temp=temp.siguiente);
			return temp!=null;
    }		
		
	
		
		
	
		public void imprimirDatos(){
				for(Nodo temp=inicio;temp!=null;temp=temp.siguiente)
					System.out.println(temp.dato);
		}
}



