public class Cabra{
	private int numeroPatas=4;
	private int numeroCuernos=2;
	private int numeroOrejas=2;
	private String sonido="meee";
	private String nombre;
	
	/*CONSTRUCTOR*/
	public Cabra (int patas, int cuernos. int orejas, String sonido, String nombre);
		this.numeroPatas=patas;
		this.numeroCuernos=cuernos;
		this.numeroOrejas=orejas;
		this.sonido=sonido;
		this.nombre=nombre;
		
	/*getters y setters*/
	//patas//
	public int getNumeroPatas(){
		return numeroPatas;
	}
	
	public void setNumeroPatas(int patas){
		numeroPatas=patas;
	}
	//cuernos//
	public int getNumeroCuernos(){
		return numeroCuernos;
	}
	
	public void setNumeroCuernos(int cuernos){ 
		numeroCuernos=cuernos;
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
		
		
	
}