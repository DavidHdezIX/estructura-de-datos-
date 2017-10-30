package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class mergesort_2
{
    public static  int n=0;
	
	public static alumno [] VectorOriginal,VectorOrdenado,a;
	
	
	
	public static void MergeSort(alumno VectorOriginal[])
	{
		int i,j,k;
		if (VectorOriginal.length > 1)
		{
			int Nizq=VectorOriginal.length/2;
			int Nder=VectorOriginal.length-Nizq;
			alumno Vizq[]= new alumno[Nizq];
			alumno Vder[]= new alumno[Nder];
			
			for (i=0;i<Nizq;i++)
				{
					Vizq[i]=VectorOriginal[i];
				}
			for (i=Nizq;i<Nizq+Nder;i++)
				{
					Vder[i-Nizq]=VectorOriginal[i];
				}
				MergeSort(Vizq);
				MergeSort(Vder);
			
			i=0;j=0;k=0;
			
			while (Vizq.length!=j && Vder.length!=k)
			{
				if (Vizq[j].compareTo(Vder[k])<0)
					{
						VectorOriginal[i]=Vizq[j];
						i++;
						j++;
					}
				else
					{
						VectorOriginal[i]=Vder[k];
						i++;
						k++;
					}
			}
			while (Vizq.length!=j)
				{
					VectorOriginal[i]=Vizq[j];
					i++;
					j++;
				}
			while (Vder.length!=k)
				{
					VectorOriginal[i]=Vder[k];
					i++;
					k++;
				}
		}
		
	}
}

