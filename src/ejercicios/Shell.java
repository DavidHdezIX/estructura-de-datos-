package ejercicios;


public class Shell 
{	
	
	public static void ShellSort(alumno[] VectorOriginal)
	{
		int salto,i,j,k;
		alumno aux;
		salto=VectorOriginal.length/2;
		while (salto>0)
		{
			for(i=salto;i<VectorOriginal.length;i++)
			{
				j=i-salto;
				
				while(j>=0)
				{
					k=j+salto;
					if (VectorOriginal[j].compareTo(VectorOriginal[k])<=0)
						{
							j=-1;
						}
					else
						{
							aux=VectorOriginal[j];
							VectorOriginal[j]=VectorOriginal[k];
							VectorOriginal[k]=aux;
							j=j-salto;
						}
				}
			}
			salto=salto/2;
		}
	}
}



