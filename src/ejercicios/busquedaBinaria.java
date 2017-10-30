package ejercicios;

public class busquedaBinaria 
{
	static double p1=0, p2=0, pt;
	static alumno vp1,sustituir;
	static boolean bandera=false;
	public static boolean buscar(alumno busq, alumno[] a)
	{
		p2=a.length-1;
		pt=(0+p2)/2;
		vp1=a[(int)pt];
		while(!bandera)
		{
			if(busq.compareTo(vp1)>0)
				{
					p1=(int)pt+1;
					pt=(p1+p2)/2;
					vp1=a[(int)pt];
				}
			if(busq.compareTo(vp1)<0)
				{
					p2=(int)pt-1;
					pt=(p1+p2)/2;
					vp1=a[(int)pt];
				}
			if(p1>=a.length || p2<p1)
				{
					return false;
				}
			else if(busq.compareTo(vp1)==0)
				{
					return true;
				}
		}
		return false;
	}
}
