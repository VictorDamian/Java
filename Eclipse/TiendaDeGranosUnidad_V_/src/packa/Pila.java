package packa;

public class Pila {
protected Nodo inicio,fin;
	
	public Pila(){
		inicio=null;
		fin=null;
	}
	
	public boolean estaVacia(){
		return inicio==null;
	}
	
	public void insertaFin(int i){
		if(inicio==fin){
			inicio=new Nodo(i,inicio); 
			if(fin == null)
				fin=inicio;
		}else{
			if(!estaVacia()){
				fin.siguiente=new Nodo(i);
				fin=fin.siguiente;
			}else{
				fin=new Nodo(i);
			}
		}
	}
	
	public int eliminaDelFin(){
		int i=fin.dato;
		if(inicio==fin){
			inicio=null;
			fin=null;
		}else{
			Nodo temp;
			for(temp=inicio;temp.siguiente!=fin;temp=temp.siguiente);
			fin=temp;
			fin.siguiente=null;
		}
		return i;
	}
    
	public void inserta(int i,int c){
		for (int n=0;n<c;n++){
			insertaFin(i);
		}
	}
	public int elimina(int c){
		int suma=0;
		for (int n=0;n<c;n++){
			suma+=eliminaDelFin();
		}
		return suma;
	}
}      