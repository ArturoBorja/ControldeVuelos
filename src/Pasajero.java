import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Persona {
	boolean sexo;//hombre TRUE, Mujer False
	List <Vuelo> vuelos;
	public Pasajero(String nombre, String apellido, int edad, boolean sexo) {
		super(nombre, apellido, edad);
		this.sexo = sexo;
	}
	public Pasajero(List<Aeropuerto> puertos) {
		super();
		if (this.dado%2==0) {
			this.sexo=false;
		}else {
			this.sexo=true;
		}
		this.dado=(int) (Math.random() * 12) + 1;
		this.vuelos=new ArrayList<Vuelo>();
		for(int a=0;a<dado;a++) {
			Vuelo v1 = new Vuelo(puertos);
			vuelos.add(v1);
		}
	}
	public void Imprimir() {
		if(this.sexo) {
			System.out.print("(M)\t\t\t");
		}else {
			System.out.print("(F)\t\t\t");
		}
		super.Imprimir();
		System.out.println("\n");
		for(Vuelo a :vuelos) {
			a.Imprimir();
		}
		System.out.println("\n");
	}
}
	
