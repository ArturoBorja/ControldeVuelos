import java.util.Date;
import java.util.List;
import java.util.Random;
public class Vuelo {
	String nombre;
	Date hora;
	Aeropuerto puerto1;
	Aeropuerto puerto2;
	Avion avion;
	Piloto piloto;
	int asiento;
	public Vuelo(List<Aeropuerto> puertos) {
		long    ms;
		int a2;
		int a3;
		ms = 1565771200000L + (Math.abs(new Random().nextLong()) % (1L * 180 * 24 * 60 * 60 * 1000));
		this.hora = new Date(ms);
		a2=((int) (Math.random() * puertos.size()) + 1);
		a2--;
		this.puerto1=puertos.get(a2);
		do {
			a3=((int) (Math.random() * puertos.size()) + 1);
			a3--;
		}while(a3==a2);
		this.puerto2=puertos.get(a3);
		puerto1.vuelosout.add(this);
		puerto2.vuelosin.add(this);
		puertos.set(a2, puerto1);
		puertos.set(a3, puerto2);
		this.avion=new Avion();
		this.asiento=(int) (Math.random() * avion.capacidad) + 1;
		this.piloto=new Piloto();
		this.nombre="Vuelo-G"+Double.toString((int) (Math.random() * 9999) + 1000);
	}
	public void Imprimir() {
		System.out.println(nombre+"\t\t\t\t"+hora);
		System.out.println("\tSalida: "+puerto1.nombre);
		System.out.println("\tLlegada: "+puerto2.nombre);
		System.out.print("\tPiloto: ");
		piloto.Imprimir();
		System.out.print("\tAciento: "+asiento+"\tAvion: ");
		avion.Imprimir();
		System.out.println();
	}
	public void ImprimirV() {
		System.out.println(nombre+"\t\t\t\t"+hora);
	}
}
