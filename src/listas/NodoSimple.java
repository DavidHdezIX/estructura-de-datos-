package listas;

public class NodoSimple 
{ 
		private int dato; 
		// variable dato de forma local
		private NodoSimple siguiente; 
		// variable siguiente del metodo NodoSimple
		
		//get y set de la clase NodoSimple
		public int getDato() 
		{
			return dato;
		}
		public void setDato(int dato)
		{
			this.dato = dato;
		}
		public NodoSimple getSiguiente()
		{
			return siguiente;
		}
		public void setSiguiente(NodoSimple siguiente)
		{
			this.siguiente = siguiente;
		}
		
}//fin de la clase NodoSimple
