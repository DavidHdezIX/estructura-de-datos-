package ejercicios;

import java.util.Scanner;

public class la_principal
{   
	//private static final int[] a = null;
	private static alumno[]a;
	private static int n, opc;
	private static ingresar_alumnos ia=new ingresar_alumnos();
    private String nc;
	private busquedaSecuencial bs=new busquedaSecuencial();
    
    
	public static void main(String[] args) 
	{
          la_principal prin= new la_principal();
          mergesort_2 Objeto=new mergesort_2();
          System.out.println("numero de elementos");	
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          
          a =new alumno[n];
          
          ia.ingresar(n, a);
          
          prin.opc=0;
          
          while(prin.opc!=8)
          {
        	  
          
          System.out.println("   Menu de opciones  ");
          System.out.println("1.- Busqueda secuencial ");
          System.out.println("2.- Busqueda Binaria ");
          System.out.println("3.- Ordenamiento Burbuja");
          System.out.println("4.- Ordenamiento de la Mersort ");
          System.out.println("5.- Ordenamiento Quick Sort ");
          System.out.println("6.- Ordenamiento Shell Sort");
          System.out.println("7.- Imprimir en base de datos ");
          System.out.println("8.- Salir");
          System.out.println("  Seleccione la opcion  ");
	      prin.opc=sc.nextInt();
	      String busqueda=null;
	      switch(opc)
	      {
	      case 1:
		    	  //BUSQUEDA SECUECIAL
		    	  System.out.print("\nIngresa numero de control:");
		    	  busqueda=sc.next();
		    	  if(prin.bs.buscar(busqueda,a))
			    	  {
			    		  System.out.println("Ya se encontro el alumno");
			    	  }
		    	  else
			    	  {
			    		  System.out.println("No se encontro el alumno");
			    	  }
		    	  break;
	      case 2:
	    	  //BUSQUEDA BINARIA
	    	  burbuja.bubbleSort(a);
	    	  System.out.print("Alumno a buscar (N control)");
	    	  String busq=sc.next();
	    	  alumno busqueda1=null;
	    	  System.out.print("1");
	    	  for(int i =0;i<=a.length-1;i++)
	    	  {
		    	  System.out.print("2");

	    		  if(a[i].getNumerocontrol().equals(busq))
	    		  {
		    			busqueda1=a[i];
		    		  	i=a.length+1;
		    		  	if(busquedaBinaria.buscar(busqueda1,a))
			    		  	{
			    		  		System.out.print("Alumno encontrado");
			    		  	}
		         }
		         if(i==a.length)
			    		  {
			    			  System.out.println("Alumno no encontrado");
			    		  }
	    	  }
	    	  
	    	  break;
	      case 3:
	    	  //ORDENAMIENTO BURBUJA
	    	  System.out.println("Ordenamiento de Burbuja\nVector original\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  burbuja.bubbleSort(a);
	    	  System.out.println("Vector Acomodado\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  break;
	      case 4:
	    	  //ORDENAMIENTO MERGE SORT
	    	  System.out.println("Ordenamiento de Merge Sort\nVector original\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  mergesort_2.MergeSort(a);
	    	  System.out.println("Vector Acomodado\n");
	    	  for(int i=0;i<a.length;i++){
	    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
	    	  }
	    	  break;
	      case 5:
	    	  //ORDENAMIENTO QUICK SORT
	    	  System.out.println("Ordenamiento de Quick Sort\nVector original\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  quickshort.qs(0,a.length-1, a);
	    	  System.out.println("Vector Acomodado\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  break;
	      case 6:
	    	 //ORDENAMIENTO SHELL SORT
	    	  System.out.println("Ordenamiento de Shell Sort\nVector original\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  Shell.ShellSort(a);
	    	  System.out.println("Vector Acomodado\n");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  break;
	      case 7:
	    	  //IMPRIMIR DATOS
	    	  System.out.println("\nVector");
	    	  for(int i=0;i<a.length;i++)
		    	  {
		    		  System.out.println(a[i].getNombre()+"\t"+a[i].getNumerocontrol()+"\n");
		    	  }
	    	  break;
	      case 8:
	    	  //SALIR
	    	  System.out.println("Bye!! =D");
	    	  prin.opc=8;
	    	  break;
	      default:
	    	 System.out.println("Ingresa una opcion valida! >:(");
	      }
      }
	
	}

}
