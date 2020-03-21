public class Cabra{
	private int numeroCuernos;
	private int numeroPatas;
	private int numeroOrejas;
	private String sonido;
	private String nombre;
	
	/*constructores*/
	public Cabra(int cuernos, int patas, int orejas, String sonido, String nombre){
		this.numeroCuernos=cuernos;
		this.numeroPatas=patas;
		this.numeroOrejas=orejas;
		this.sonido=sonido;
		this.nombre=nombre;
	}
	
	public Cabra(int cuernos, int patas, String nombre){
		this.numeroCuernos=cuernos;
		this.numeroPatas=patas;
		this.nombre=nombre;
	}
	
	/*getters y setters*/
	//cuernos//
	public int getNumeroCuernos(){
		return numeroCuernos;
	}
	
	public void setNumeroCuernos(int cuernos){ //¿puedo llamarlo cuernos tambien? ¿como los cuernos del constructor?SI//
		numeroCuernos=cuernos;
	}
	//patas//
	public int getNumeroPatas(){
		return numeroPatas;
	}
	
	public void setNumeroPatas(int patas){
		numeroPatas=patas;
	}
	//orejas//
	public int getNumeroOrejas(){
		return numeroOrejas;
	}
	
	public void setNumeroOrejas(int orejas){
		numeroOrejas=orejas;
	}
	//sonido//
	public String getSonido(){
		return sonido;
	}
	
	public void setSonido(String sonido){
		this.sonido=sonido;
	}
	//nombre//
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String toString(){
		return "Nombre: "+nombre+" Cuerno: "+numeroCuernos+" Patas: "+numeroPatas+" Orejas: "+numeroOrejas+" Sonido: "+sonido;
	}
}