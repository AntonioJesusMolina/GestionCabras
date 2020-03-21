import java.util.ArrayList;
public class Main{
	
	static Cabra cabra1,cabra2, cabra3, cabra4, cabra5,cabra6, cabra7;

	
	
	
	public static void main(String []args){
		/*
		Cabra cabra1 = new Cabra(3,4,1,"meeee", "pantalones");
		Cabra cabra2 = new Cabra(4,4,2,"beee","fulanica");
		Cabra cabra3 = new Cabra(2,4,2,"tuuusaaa","Latusa");
		Cabra cabra4 = new Cabra(2,3,2,"muuu","Menganica");
		Cabra cabra5 = new Cabra(3,2,2,"mieeerda","Cani");
		Cabra cabra6 = new Cabra(1,4,3,"veeeeesss","Bakalá");
		Cabra cabra7 = new Cabra(2,4,3,"ieeeee","Pochola");
		*/
		cabra1 = new Cabra(3,4,1,"meeee", "pantalones");
		cabra2 = new Cabra(4,4,2,"beee","fulanica");
		cabra3 = new Cabra(2,4,2,"tuuusaaa","Latusa");
		cabra4 = new Cabra(2,3,2,"muuu","Menganica");
		cabra5 = new Cabra(3,2,2,"mieeerda","Cani");
		cabra6 = new Cabra(1,4,3,"veeeeesss","Bakalá");
		cabra7 = new Cabra(2,4,3,"ieeeee","Pochola");
		
		ArrayList<Cabra> cabras = new ArrayList<Cabra>();
		
			
		cabras.add(cabra1);
		cabras.add(cabra2);
		cabras.add(cabra3);
		cabras.add(cabra4);
		cabras.add(cabra5);
		cabras.add(cabra6);
		cabras.add(cabra7);
		
		ArrayList<Cabra> cornudas = new ArrayList<Cabra>();
		ArrayList<Cabra> nocornudas = new ArrayList<Cabra>();
		
		for (int i=0; i<cabras.size(); i++){
			//System.out.println(i);
			if(cabras.get(i).getNumeroCuernos()>2){
				cornudas.add(cabras.get(i));
				System.out.println("Soy Cornuda "+cabras.get(i).getNombre());
				
			} else {
				nocornudas.add(cabras.get(i));
				System.out.println("No soy cornuda "+cabras.get(i).getNombre());
				
			}		
			
		} 
		
		System.out.println(cabra1);
		System.out.println(cabra2);

	}
	
}
