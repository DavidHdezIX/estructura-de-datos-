package listas;

public class nodoDoble 
{
	
	
		private musica dato; 
		// variable dato de forma local
		
		private nodoDoble siguiente,anterior; 
		// variable siguiente del metodo nodo doble
		
		//get y set de la clase nododoble
		public musica getDato() 
		{
			return dato;
		}
		public void setDato(musica dato) 
		{
			this.dato = dato;
		}
		public nodoDoble getSiguiente() 
		{
			return siguiente;
		}
		public void setSiguiente(nodoDoble siguiente)
		{
			this.siguiente = siguiente;
		}
		
		public nodoDoble getAnterior() 
		{
			return anterior;
		}
		public void setAnterior(nodoDoble anterior)
		{
			this.anterior = anterior;
		}
		
}//fin de la clase nodoDoble


