public class Gato{
	private int numeroPatas=4;
	private String nombre;
	private String sonido="miau";
	
	public Gato(int patas, String nombre, String sonido){
		this.numeroPatas=patas;
		this.nombre=nombre;
		this.sonido=sonido;
		
	}
	public int getNumeroPatas(){
		return numeroPatas;
	}
	
	public void setNumeroPatas(int patitas){
		numeroPatas=patitas;
	}
	
	public String obtenerNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getSonido(){
		return sonido;
	}
	
	public void setSonido(String sonido){
		this.sonido=sonido;
	}
	
}