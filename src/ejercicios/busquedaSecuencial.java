package ejercicios;

public class busquedaSecuencial 
{
    public boolean buscar (String nc, alumno[] a) //es public boolean no void 
    {
    	boolean respuesta=false;
    	for(int i=0;i<a.length;i++)
    	{
    		if (a[i].getNumerocontrol().equals(nc))
                  {
	                  respuesta=true;
                  }
    	}
		return respuesta;
    }
}
