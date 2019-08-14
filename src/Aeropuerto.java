import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	int dado;
	String nombre;
	String ciudad;
	List<Vuelo> vuelosout;
	List<Vuelo> vuelosin;
	public Aeropuerto() {
		this.dado=(int) (Math.random() * 7) + 1;
		switch (dado) {
		case 1:
			this.ciudad = "Lima";
			dado=0;
			break;
		case 2:
			this.ciudad = "New York";
			this.dado=(int) (Math.random() * 3) + 1;
			break;
		case 3:
			this.ciudad = "Sydney";
			this.dado=(int) (Math.random() * 3) + 1;
			break;
		case 4:
			this.ciudad = "Los Angeles";
			this.dado=(int) (Math.random() * 3) + 1;
			break;
		case 5:
			this.ciudad = "Toronto";
			this.dado=(int) (Math.random() * 3) + 1;
			break;
		case 6:
			this.ciudad = "Londres";
			this.dado=(int) (Math.random() * 3) + 1;
			break;
		default:
			this.ciudad = "Bogota";
			dado=0;
			break;
		}
		switch (dado) {
		case 0:
			this.nombre = "Aeropuerto Internacional de "+ciudad;
			break;
		case 1:
			this.nombre = "International Airport of "+ciudad;
			break;
		case 2:
			this.nombre = "Private International Airport of "+ciudad;
			break;
		default:
			this.nombre = "State International Airport of "+ciudad;
			break;
		}
		this.vuelosin=new ArrayList<Vuelo>();
		this.vuelosout=new ArrayList<Vuelo>();
	}
	public void Imprimir() {
		System.out.println(nombre);
		System.out.println("Vuelos Entrantes:");
		for(Vuelo a : vuelosin) {
			a.Imprimir();
		}
		System.out.println("Vuelos Salientes:");
		for(Vuelo a : vuelosout) {
			a.Imprimir();
		}
	}
}
