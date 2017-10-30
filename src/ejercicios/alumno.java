package ejercicios;

public class alumno implements Comparable 
{
   private String numerocontrol,nombre,direccion;

	public String getNumerocontrol() 
	{
		return numerocontrol;
	}
	
	public void setNumerocontrol(String numerocontrol) 
	{
		this.numerocontrol = numerocontrol;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getDireccion() 
	{
		return direccion;
	}
	
	public void setDireccion(String direccion) 
	{
		this.direccion = direccion;
	}
	
	public int compareTo(String arg0) 
	{
		return direccion.compareTo(arg0);
	}

	@Override
	public String toString() 
	{
		
		return "numero de control: " + this.numerocontrol+ "Nombre del alumno "+ this.nombre;
	}

	@Override
	public int compareTo(Object o) 
	{
		alumno alumno=(alumno) o;
		return this.getNumerocontrol().compareTo(alumno.getNumerocontrol());
		
		
	}
     
    
}
