package ejercicios;

import java.util.Scanner;

public class factorial 
{
	static int fact=1,n=0,i=0,num;
	public static void main(String[] args) 
	{
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ingresa n");
		 num=sc.nextInt();
		 rec(num);
		System.out.println(fact);
		
		sc.close();

	}
	
	public static void rec(int n)
	{
		if(n>0)
		{
			fact=fact*num;
			num--;
			rec(num);
		}
	}

}

