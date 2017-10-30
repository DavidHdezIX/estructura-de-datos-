package listas;

import java.util.Scanner; //Mandamos llamar la libreria

public class TestListaSimple { //Inicio de la clase TestListaSimple

	private ListaSimple lista= new ListaSimple(); //hacemos una instancia de la clase ListaSimple con el nombre lista
	
	public static void main(String[] args) { //Metodo Principal de las 3 clases donde se ejecutan todos los metodos
		TestListaSimple tls= new TestListaSimple();//se hace una instancia de la clase TestListaSimple con el nombre tls
		
		int opcion=0;//iniciamos en 0 la variable opcion de tipo entero
		Scanner sc= new Scanner(System.in);//iniciamos nuestra variable que nos permitira ingresar datos por consola
		
		do{ // ciclo do while
			
			//menu de opciones
			System.out.println("LISTA DE OPCIONES");
			System.out.println("1.- Vacio");
			System.out.println("2.- Insertar al Principio");
			System.out.println("3.- Insertar al Final");
			System.out.println("4.- Insertar en Posición");
			System.out.println("5.- Localizar");
			System.out.println("6.- Buscar");
			System.out.println("7.- Eliminar");
			System.out.println("8.- Imprimir");
			System.out.println("9.- Salir");
			System.out.print("Ingresa una opcion: ");
			opcion=sc.nextInt(); //se ingresa opcion que deseamos ingresar 
			
			System.out.println("");//salto de linea para dejar espacion entre el menu de opciones y la opcion seleccionada
			
			
			//inicia nuestraestructura switch para buscar la opcion ingresada 
			switch(opcion){ //busca el valor que ingresamos en la variable opcion
			
			//################################################################################################################################
			
			case 1: // si el valor ingresado en la variable opcion ingresa a la opcion que dice si nuestra lista esta vacia
				//se inicia un if para preguntar sila lista esta vacia
				if(tls.lista.isvacio()){//se manada a llamar al metodo dentro de la estructura if buscando un verdadero
					System.out.println("Lista Vacia");//si la lista esta vacaia imprimira en pantalla el mensaje lista vacia
				}else{//en caso de que la lista no este vacia
					System.out.println("Lista No Vacia");//se imprimira en pantalla que la lista no esta vacia 
				}//fin del else
			break;//se pone un break para salir de la estrucutra swich al momento de ingresar al case 1
			
			//###############################################################################################################################
			
			case 2: // Si la opcion es 2 ingresa a insertar al pincipio
				System.out.print("Ingresa Valor a insertar: "); //Imprimimos en pantalla un mensaje donde pida el valor a insertar
				tls.lista.insertarPrincipio(sc.nextInt()); //madamos a llamar el metodo insertarPincipio por medio de la instancia lista y a su vez leemos el valor y lo mandamos como parametro 
				System.out.println("Valor Insertado");//Se imprime un mensaje de que el valor a sido Insertado Correctamente
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 2
				
			//##############################################################################################################################	
				
			case 3: //si la opcion ingresada es 3 ingresa a insertar al final
				System.out.print("Ingresa Valor a insertar: ");//Imprimimos en pantalla un mensaje donde pida el valor a insertar
				tls.lista.insertarFinal(sc.nextInt()); //madamos a llamar el metodo insertarFinal por medio de la instancia lista y a su vez leemos el valor y lo mandamos como parametro
				System.out.println("Valor Insertado");//Se imprime un mensaje de que el valor a sido Insertado Correctamente
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 3
				
			//###############################################################################################################################	
				
			case 4:// si la opcion ingresada es ingresa a insertar Posicion
				System.out.print("Ingresa el valor: ");//Imprimimos en pantalla un mensaje donde pida el valor a insertar
				int valor=sc.nextInt(); //declarmaos y pedimos el valor de la variable entera valor
				System.out.print("Ingresa la Posicion: "); //Imprimimos en pantalla un mensaje donde pida la posicion donde se insrtara el valor
				int posicion=sc.nextInt();//decaramos y pedimos el valor de la variable posicion
				tls.lista.insertarPosicion(valor,posicion);//mandamos llamar el metodo insertarPosicion y mandamos los valores de valor y posicion
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 4
			
			//##############################################################################################################################	
				
			case 5:// si la opcion ingresada es 5 ingresa a la opcion localizar
				System.out.print("Ingresa Valor a localizar: ");//Imprimimos en pantalla un mensaje donde pida el valor a localizar
				
				if(tls.lista.localizar(sc.nextInt())){// se hace una estructura if  en la cual se manda a llamar el metodo localizar y se lee el valor a localizar
					System.out.println("Nodo Lozalizado");//si encuentra un verdadero imprime en panatalla Nodo Localizado
				}else{//en caso de que no encuentre el valor
					System.out.println("Nodo NO Lozalizado"); //Imprime en pantalla el Nodo no localizado en caso de que no se encuentre
				}//fin del else
				System.out.println("Valor Insertado");//Se imprime un mensaje de que el valor a sido Insertado Correctamente
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 5
				
			//################################################################################################################################
				
			case 6: //si la opcion es 6 ingresa a buscar
				
				System.out.print("Ingresa Valor a buscar: "); //Imprimimos en pantalla un mensaje donde pida el valor a buscar
				tls.lista.buscar(sc.nextInt());//mandamos llamar el metodo buscar y mandamos el valor que se pedira en consola
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 6
			
			//#################################################################################################################################	
				
			case 7: //si la opcion es 7 ingresamos a la opcion eliminar
				
				System.out.print("Ingresa la posicion a eliminar: "); //Imprimimos en pantalla un mensaje donde pida el valor a eliminar
				tls.lista.eliminar(sc.nextInt());//mandamos llamar el metodo eliminar y mandamos el valor que se pedira en consola
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 7
				
			//################################################################################################################################
				
			case 8:// si la opcion es 8 ingresamos a imprimir lista
				System.out.println(tls.lista.imprimir()); //Imprimimos en pantalla el metodo que mandamos llamar llamado imprimir
				break; //se pone un break para salir de la estrucutra swich al momento de ingresar al case 8
				
			//################################################################################################################################
				
			}//fin de la estructura switch
			
			//Saltos de lineas para dejar espacio entre las opciones ingresadas y el menu principal
			System.out.println("");
			System.out.println("");
			
		}while(opcion!=9); //fin del ciclo do while
		
	}//fin del meotdo principal

}//fin de la clase TestListaSimple
