package ejercicios;
//ORGANIZACIOND DE DATOS DE TIPO BURBUJA SENCILLA. ORGANIZARA LOS DATOS DE FORMA DESENDENTE ES DECIR DE MENOR A MAYOR
public class burbuja
{

	public static void bubbleSort(alumno[] al)
	{
		alumno replace=null;
		int a = al.length;
		for(int piv=0;piv<=a;piv++)
		{
			for(int pun=piv+1;pun<a;pun++)
			{
				if(al[piv].compareTo(al[pun])>0)
				{
					replace=al[piv];//SE GUARDA EL VALOR ANTERIOR PARA QUE NO SE PIERDA
					al[piv]=al[pun];//SUSTITUCION DE DATOS
					al[pun]=replace;
				}
				if(pun==al.length)
				{
					
				}
			}
		}
	}
}