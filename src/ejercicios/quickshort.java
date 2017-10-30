package ejercicios;
public class quickshort 
{
	static int izq,der;
	static alumno temp,piv;
	static int n=0;
	
	
	public static void qs(int lizq, int lder,alumno[] a)
	{
		izq=lizq;
		der=lder;
		piv=a[(int)(lizq+lder)/2];
		
		while(izq<=der)
		{
			while(a[izq].compareTo(piv)<0)
			{
				izq++;
			}
			while(a[der].compareTo(piv)>0)
			{
				der--;
			}
			if(izq<=der)
			{
				temp=a[izq];
				a[izq]=a[der];
				a[der]=temp;
				izq++;
				der--;
			}
		}
		if(lizq<der)
		{
			qs(lizq,der,a);
		}
		if(izq<lder)
		{
			qs(izq,lder,a);
		}
	}
	
}
