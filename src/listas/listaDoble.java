package listas;

public class listaDoble 
{

	
	private nodoDoble cabeza;
	//variable Cabeza como privada 

	//Get de cabeza
	public nodoDoble getCabeza() 
	{
		return cabeza;
	}
	
	//Set de cabeza
	public void setCabeza(nodoDoble cabeza) 
	{
		this.cabeza = cabeza;
	}

	
	//metodo  boolean llamada isvacio
	public boolean isvacio()
	{   
		boolean respuesta=false;
		//variable de tipo boolean en false 
		
		if(this.cabeza==null)
		{
			//estructura if donde pregunta si cabeza es igual a null
		
			respuesta=true;
			//en caso verdadero cambia true
		}
		//fin del if
		
		return respuesta;
		//regresa el valor de la variable respuesta
	}
	//fin de la clase isvacio
	
	
	//metodo void llamado insertar que recibe  valor int
	public void insertar(musica valor)
	{
		//instancia de la clase NodoDoble llamada nombre de nuevo 
		nodoDoble nuevo= new nodoDoble();
		nuevo.setDato(valor);
		//asigna a nuestra variable dato el valor que recibe el metodo insertar 
		
		//siguiente nodo apunte hacia null
		nuevo.setSiguiente(null);
		nuevo.setAnterior(null);
		// anterior nodo apunte hacia null
		this.cabeza=nuevo; 
		//se otorga a cabeza el valor del nuevo nodo
	}
	//fin del metodo insertar 

	//metodo void llamado insertarPrincipio que recibe valor int
			public void insertarPrincipio(musica valor)
			{
				//inicio del metodo insertPrincipio	
				if(isvacio())
				{
					//pregunta si la lista esta vacia
					insertar(valor);
					//si esta vacia insertamos el valor en la primera posicion
				}else
					{
					     //inicio del else
						nodoDoble nuevo= new nodoDoble(); 
						//instancia de la clase NodoSimple llamada nuevo
						nuevo.setDato(valor);
						nuevo.setSiguiente(this.cabeza);
						this.cabeza.setAnterior(nuevo);
						nuevo.setAnterior(null);
						this.cabeza=nuevo;

						//se asigna nuestra variable dato el valor que recibe nuestro metodo insertar
						//al nodo siguiente se le asigna el valor de la cabeza
						//se le da a cabeza el valor del nuevo nodo
					}
				     //fin del else
			}
			//fin de insertarPrincipio
			
			
			//metodo void llamado insertarFinal
			public void insertarFinal(musica valor)
			{
				
				if(isvacio())
				{
					//estructura if para saber si la lista esta vacia
					insertar(valor);
					//si la lista esta vacia se inserta el valor en la primera posicion
				}
					else
					{
						//inicio el else
						nodoDoble nuevo= new nodoDoble();
						//instancia de la clase NodoSimple llamada nuevo
						
						nuevo.setDato(valor);
						//nuestra variable dato el valor que recibe nuestro metodo insertar
						
						nuevo.setSiguiente(null);
						//nuestro ultimo nodo apunte hacia null
						
						nodoDoble temporal=this.cabeza; 
						//instancia de la clase NodoSimple llamada temporal
						
						while(temporal.getSiguiente()!=null)
						{
							//ciclo while mientras temporal no sea null se ejecutará
							temporal=temporal.getSiguiente();
							//se guarda nuestro nodo siguiente para no perder la referencia
						}
						//fin del while
						
						temporal.setSiguiente(nuevo);
						nuevo.setAnterior(temporal);
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
				
				nodoDoble temporal=this.cabeza; 
				//instancia de la clase nodoDoble llamada temporal
				
				while(temporal!=null)
				{
					//ciclo while que miestras temporal sea diferente de null se ejecutará
					
					respuesta++;
					//varible inclementable nombrada respuesta con cada vuelta que haga ciclo 
					
					temporal=temporal.getSiguiente();
					//asigna a temporal el valor (temporal siguiente)
				}
				//fin del cilco while
				
				return respuesta;
				//regresa  el valor de la variable respuesta
			}
			//fin del meotodo contar
			
			
			//metodo  NodoDoble llamado encontrar que recibe un int 
			public nodoDoble encontrar(int posicion)
			{
				
				nodoDoble temporal=this.cabeza;
				//asigna la variable temporal el valor de la cabeza
				
				nodoDoble anterior=null;
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
			public void insertarPosicion(musica valor, int posicion)
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
								
								nodoDoble anterior=this.encontrar(posicion-1); 
								//variable anterior de tipo NodoSimple que es igual al encontrar el valor de posicion - 1
								
								nodoDoble nuevo= new nodoDoble();
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
			public boolean localizar(musica valor)
			{
				
				
				boolean respuesta=false;
				//variable boolean llamada respuesta y la iniciada en false
				
				nodoDoble temporal=this.cabeza;
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
			public void buscar(musica valor)
			{
				
				boolean respuesta=false;
				//variable de tipo boolean llamada respuesta y la inciamos en false
				
				nodoDoble temporal=this.cabeza;
				//variable  temporal de tipo nodoDoble se le asignara el valor de cabeza
				
				while(temporal!=null)
				{
					//ciclo while que funciona mientras temporal sea diferente de null
					if(temporal.getDato()==valor)
					{
						//si temporal es igual a valor
						respuesta=true;
						//la respuesta es cambiada a true
						System.out.println("Valor encontrado es: "+temporal.getDato());
						//imprimimos un mensaje en consola que diga valor encontrado 
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
					//imprime el valor encontrado 
				}
				//fin del if
				
			}
			//fin del metodo buscar
			
			//metodo de tipo boolean llamado eliminar que recibe un valor int
			public boolean eliminarFirst()
			{
			   boolean banderita=false;
			   if(isvacio())
			   {
				   banderita=false; 
			   }
			     else 
			     {
			    	 nodoDoble temporal=this.cabeza;
			    	 if(temporal.getSiguiente()!=null)
			    	 {
			    		 this.cabeza=temporal.getSiguiente();
			    		 this.cabeza.getAnterior().setSiguiente(null);
			    		 this.cabeza.setAnterior(null);
			    		 banderita=true;
			    	 }
			    	 else
			    	 {
			    	    temporal=null;
			    	    this.cabeza=null;
			    	 
			    	 }
			     
			     }
			   
				return banderita;
			}
			//fin del metodo eliminar
			
			public boolean eliminarLast()
			{
				boolean banderita=false; 
				
				if(isvacio())
				{
					banderita=false;
			    }
				else 
				{
					nodoDoble temporal=this.cabeza;
					if(temporal.getSiguiente()==null)
						{
						   temporal.setAnterior(null);
						   temporal.setSiguiente(null);
						   this.cabeza=null;					
						   banderita=true;
						}
					  
					else
					  {
							while(temporal.getSiguiente()!=null)
								
							    {
									temporal=temporal.getSiguiente();
								}
									temporal.getAnterior().setSiguiente(null);
									temporal=null;
				                    banderita=true;
					 }
					
				}
				
				return banderita;
			}
			
			
			//metodo de tipo StringBuilder llamado imprimir
			
			public StringBuilder imprimir()
			{
				StringBuilder cadena =new StringBuilder();
				
				//se crea una variable cadena de tipo StringBuilder
				
				       nodoDoble temp=this.cabeza;
					   cadena.append("NULL ---->");
					   while(temp!=null)
					   {
						   
						   cadena.append(temp.getDato().getNombreCancion());
						   cadena.append("----->");
						   temp=temp.getSiguiente();  
					   }
					   
					   cadena.append("null");
					   return cadena;
					   
				   }
				 
				   public StringBuilder imprimirDesdeUltimo()
				   {
					   StringBuilder cadena=new StringBuilder();
					   
					   if ( isvacio() ) 
					   {
					    	  cadena.append("sin lista ");
					    	  return cadena;
					   }
					  
					   nodoDoble temp=this.cabeza;
					   cadena.append("NULL <---->");
					   while(temp.getSiguiente()!=null)
					   {
						   
						   temp=temp.getSiguiente(); 
						   
					   }
					   
					   while(temp!=null)
					   {
						   cadena.append(temp.getDato().getNombreCancion());
						   cadena.append("<----->");
						   temp=temp.getAnterior();  
					   }
					   cadena.append("null");
					   return cadena;
					   
				   }
				
			
			//fin del meotodo
				   


	}//fin de la clase

	
	


