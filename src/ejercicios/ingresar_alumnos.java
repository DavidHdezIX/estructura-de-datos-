package ejercicios;

import java.util.Scanner;

public class ingresar_alumnos 
{
      public void ingresar(int n, alumno[] a)
      {
    	  Scanner sc= new Scanner(System.in);
    	  
    	  for (int i=0;i<n;i++)
    	  {
    		a[i]=new alumno();  
    	    System.out.print("Ingrese número de control "+(i+1));
    	    a[i].setNumerocontrol(sc.nextLine());
    	    System.out.println("");
    	    System.out.println("Ingrese el nombre del alumno "+ (i+1));
    	    a[i].setNombre(sc.nextLine());
    	    System.out.println("Ingrese la direccion del alumno "+ (i+1));
    	    a[i].setDireccion(sc.nextLine());
    	    System.out.println("-------------------------------------------------");
    	  
    	  }
    	  
          //return false;
      }






}
