package ejercicios;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class list 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList <String> list=new ArrayList <String> ();
		
		list.add("Andrea");
		list.add("Amaya");
		list.add("Julio");
		
		java.util.Iterator<String> iter = list.iterator();
		while (iter.hasNext())
		  System.out.println(iter.next());

	}

}
