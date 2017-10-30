package listas;

public class ListaSimple 
{//inicio de la clase ListaSimple

		private NodoSimple cabeza;
		//Iniciamos nuestra variable Cabeza como privada 

		//hacemos el get de cabeza
		public NodoSimple getCabeza() 
		{
			return cabeza;
		}
		
		//hacemos el set de cabeza
		public void setCabeza(NodoSimple cabeza) 
		{
			this.cabeza = cabeza;
		}
	
		
		//hacemos un metodo un boolean llamada isvacio
		public boolean isvacio()
		{   
			boolean respuesta=false;
			//variable de tipo boolean en false 
			
			if(this.cabeza==null)
			{
				//creamos una estructura if donde pregunta si cabeza es igual a null
				respuesta=true;
				//en caso verdadero cambiara true
			}
			//fin del if
			
			return respuesta;
			//se regresa el valor de la variable respuesta
		}
		//fin de la clase isvacio
		
		
		//metodo void llamadoinsertar que recibe  valor int
		public void insertar(int valor)
		{
			 //inicio de la clase
			NodoSimple nuevo= new NodoSimple();
			
			//instancia de la clase NodoSimple llamada nombre de nuevo
			nuevo.setDato(valor);
			//asignamos a nuestra variable dato el valor que recibe el metodo insertar 
			
			nuevo.setSiguiente(null);
			//ultimo nodo apunte hacia null
			
			this.cabeza=nuevo; 
			//se le da a cabeza el valor del nuevo nodo
		}
		//fin del meotodo insertar 
		
		
		//metodo void llamado insertarPrincipio que recibe valor int
		public void insertarPrincipio(int valor)
		{
			//inicio del metodo insertPrincipio	
			if(this.isvacio())
			{
				//preguntamos si la lista esta vacia
				this.insertar(valor);
				//si esta vacia insertamos el valor en la primera posicion
			}else
				{
				     //inicio del else
					NodoSimple nuevo= new NodoSimple(); 
					//instancia de la clase NodoSimple llamada nuevo
					
					nuevo.setDato(valor);
					//se asigna nuestra variable dato el valor que recibe nuestro metodo insertar
					
					nuevo.setSiguiente(this.cabeza);
					//al nodo siguiente se le asigna el valor de la cabeza
					
					this.cabeza=nuevo; 
					//se le da a cabeza el valor del nuevo nodo
				}
			     //fin del else
		}
		//fin de insertarPrincipio
		
		
		//metodo void llamado insertarFinal
		public void insertarFinal(int valor)
		{
			
			if(this.isvacio())
			{
				//estructura if para saber si la lista esta vacia
				this.insertar(valor);
				//si la lista esta vacia se inserta el valor en la primera posicion
			}
				else
				{
					//inicio el else
					NodoSimple nuevo= new NodoSimple();
					//instancia de la clase NodoSimple llamada nuevo
					
					nuevo.setDato(valor);
					//nuestra variable dato el valor que recibe nuestro metodo insertar
					
					nuevo.setSiguiente(null);
					//nuestro ultimo nodo apunte hacia null
					
					NodoSimple temporal=this.cabeza; 
					//instancia de la clase NodoSimple llamada temporal
					
					while(temporal.getSiguiente()!=null)
					{
						//ciclo while mientras temporal no sea null se ejecutará
						temporal=temporal.getSiguiente();
						//se guarda nuestro nodo siguiente para no perder la referencia
					}
					//fin del while
					
					temporal.setSiguiente(nuevo);
					// nodo temporal se asigna el valor de nuevo
					
				}
			    //fin del else
			}
		     //fin del metodo insertarFinal
		
		
		//metodo int contar
		public int contar()
		{
			
			int respuesta=0;
			//variable int de respuesta e inicia en 0
			
			NodoSimple temporal=this.cabeza; 
			//instancia de la clase NodoSimple llamada temporal
			
			while(temporal!=null)
			{
				//ciclo while que miestras temporal sea diferente de null se ejecutará
				
				respuesta++;
				//varible inclementable nombrada respuesta con cada vuelta que haga ciclo 
				
				temporal=temporal.getSiguiente();
				// se asigna a temporal el valor (temporal siguiente)
			}
			//fin del cilco while
			
			return respuesta;
			//regresa  el valor de la variable respuesta
		}
		//fin del meotodo contar
		
		
		//metodo  NodoSimple llamado encontrar que recibe un int 
		public NodoSimple encontrar(int posicion)
		{
			
			NodoSimple temporal=this.cabeza;
			//asigna la variable temporal el valor de la cabeza
			
			NodoSimple anterior=null;
			//variable llamada anterior y la iniciamos en null
			
			int i=0;
			//variable int y la iniciada en 0
			
			while(i<posicion)
			{
				//ciclo while funciona miestras i sea menor que la posicion
				
				i++;
				// se aumenta i en cada vuelta del ciclo

				anterior=temporal;
				//asigna a anterior el valor de temporal
				
				temporal=temporal.getSiguiente();
				//temporal es igual a temporal siguiente
			}
			//fin del ciclo while
			return anterior;
			//regresa el valor de anterior
		
		}
		//fin del metodo encontrar
		
		
		//metodo void llamado insertarPosicion
		public void insertarPosicion(int valor, int posicion)
		{
			//inicio del metodo donde recibira las varaiables valor y posicion de tipo int
			
			//if donde la posicion es mayor a 0 y contar es mayor que 1 y posicion es menor o igual que contar entrara a otro if
			if (posicion>0 && this.contar()>1 && posicion<=this.contar())
			{
				if(posicion==1)
				{
					//si la posicion es igual a 1
					
					this.insertarPrincipio(valor);
					//insertamos el valor en la primera posicion
				}
				else if(posicion==this.contar())
				{
					//inicio del else if
					
				}
					else
					{
						 //inicio del else
							
							NodoSimple anterior=this.encontrar(posicion-1); 
							//variable anterior de tipo NodoSimple que es igual al encontrar el valor de posicion - 1
							
							NodoSimple nuevo=new NodoSimple();
							//instancia llamada (nuevo) de la clase NodoSimple
							
							nuevo.setDato(valor);
							//asigna a nuevo el valor de la variable valor
							
							nuevo.setSiguiente(anterior.getSiguiente());
							//a el siguiente nodo le agrega el valor del nodo anterior
							
							anterior.setSiguiente(nuevo);
							// anterior se le asigna nuevo
						
					}//fin del else
			
			}//fin del if	
		
		}//fin del metodo insertarPosicion
		
		
		//meotdo boolean llamado localizar que recibe un int
		public boolean localizar(int valor)
		{
			
			
			boolean respuesta=false;
			//variable boolean llamada respuesta y la iniciada en false
			
			NodoSimple temporal=this.cabeza;
			//variale de tipo NodoSimple que contenga el valor de cabeza
			
			while(temporal!=null)
			{
				//ciclo while que funcione mientras temporal sea diferente de null
				
				if(temporal.getDato()==valor)
				{
				//creamos un if dentro del cliclo donde si temporal es igual a valor
					respuesta=true;//camabiamos respuesta a true en caso de ser verdadero
				}//fin del if
				temporal=temporal.getSiguiente();// temporal va ser igual a temporal siguiente
			}// fin del while
			
			return respuesta;//regresamos el valor de respuesta
		}//fin del metodo localizar
		
		
		//metodo de tipo void llamado buscar que recibe un valor int
		public void buscar(int valor)
		{
			
			boolean respuesta=false;
			//variable de tipo boolean llamada respuesta y la inciamos en false
			
			NodoSimple temporal=this.cabeza;
			//creamos una variable  temporal de tipo NodoSimple y se le asignara el valor de cabeza
			
			while(temporal!=null)
			{// ciclo while que funciona mientras temporal sea diferente de null
				
				if(temporal.getDato()==valor)
				{
					//si temporal es igual a valor
					
					respuesta=true;
					//la respuesta es cambia a true
					
					System.out.println("Valor encontrado es: "+temporal.getDato());
					//imprime un mensaje que diga, valor encontrado 
				}
				//fin del if
				
				temporal=temporal.getSiguiente();
				//temporal es igual a temporal siguiente
			}
			//fin del while
			
			if(respuesta==false)
			{
				//si la respuesta es igual a false
				
				System.out.println("Valor encontrado es: "+temporal.getDato());
				//imprime en pantalla el valor encontrado 
			}
			//fin del if
			
		}
		//fin del metodo buscar
		
		//metodo de tipo boolean llamado eliminar que recibira un valor de tipo int
		public boolean eliminar( int posicion)
		{
			//inicio del metodo
			
			boolean respuesta=false;
			//creamos una variable de tipo boolean llamada respuesta y la iniciamos en false
			
			if(posicion==1)
			
			{
				//if donde si posicion es igual a 1
				
				this.setCabeza(this.cabeza.getSiguiente());
				//la cabeza sera cambiada a la nueva cabeza
				
				respuesta=true;
				// se cambia la variable respuesta a true
			}
			else
			{
				
				NodoSimple temporal=this.encontrar(posicion-1);
				//variable llamada temporal de tipo NodoSimple que sera igual a encontrar con l valor de posicion -1
				
				temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
				//temporal siguiente sera igual a la posion del nuevo nodo
				
				respuesta=true;
				// se regresa como verdaero  la variable respuesta
			}
			//fin del else
			
			return respuesta; 
			// se regresa el contenido de la variable respuesta
		}
		//fin del metodo eliminar
		
		
		//metodo de tipo StringBuilder llamado imprimir
		public StringBuilder imprimir()
		{
			
			StringBuilder cadena =new StringBuilder();
			//se crea una variable llamda cadena de tipo StringBuilder
			
			cadena.append("Cabeza--->");
			//se indica que es a cabeza
			
			NodoSimple temporal=this.cabeza;
			//se le asigna el valor de temporal el valor de cabeza
			
			while(temporal!=null)
			{
				//ciclo while donde se repetira mientras temporal sea diferente que null
				
				cadena.append(temporal.getDato());
				//se obtiene los valores de la lista
				
				cadena.append("--->");
				//se indica con esta flecha hacia donde estan enlazados los numeros de la lista
				
				temporal=temporal.getSiguiente();
				//se va recorriendo el final de la lista para apuntar hacia null
			
			}
			//fin del ciclo while
			
			cadena.append("NULL");
			//se indica que es el final de la cadena
			
			return cadena;
			//regresa la cadena y se imprime en pantalla
		}
		//fin del meotodo


}//fin de la clase
