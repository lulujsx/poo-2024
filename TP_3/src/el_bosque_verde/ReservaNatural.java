package el_bosque_verde;
import java.util.List;
import java.util.ArrayList;

public class ReservaNatural {
	
	private ArrayList<Especie> especies = new ArrayList();
	private ArrayList<Cuidador> cuidadorxs = new ArrayList();
	private ArrayList<Habitat> habitats = new ArrayList();
	
	ReservaNatural(){
		
	}
	
	
	void agregarEspecie(Especie esp) {
		this.especies.add(esp);
	}
	
	Integer buscarEspecie(String nombre) {
		Integer contador = 0;
		for(int i=0;i<this.especies.size();i++) {
			if(this.especies.get(i).getNombre() == nombre) {
				contador++;
			}
		}
		return contador;
	}
	
//	double calcularPromedio() {
//		
//	}
//	
//	double calcularSueldoTotal(){
//		
//	}
	
	public static void main(String[] args) {
		Especie especie1 = new Especie("gato","michi",1);
		Habitat habitatMichi = new Habitat("moron",3.14,especie1);
		ReservaNatural reserva1 = new ReservaNatural();
		reserva1.agregarEspecie(especie1);
		Integer resultado = reserva1.buscarEspecie("gato");
		System.out.println(resultado);
		Cuidador cuidador1 = new Cuidador("Luisito",1);
		cuidador1.setSueldo(200.0);
		Cuidador cuidador2 = new Cuidador("Comunica",2);
		cuidador2.setSueldo(250.0);
	}
	
}
