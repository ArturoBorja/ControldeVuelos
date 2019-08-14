import java.util.Date;
import java.util.Random;
public class Vuelo {
	String nombre;
	Date hora;
	Aeropuerto puerto1;
	Aeropuerto puerto2;
	Avion avion;
	Piloto piloto;
	int asiento;
	public Vuelo() {
		long    ms;
		ms = 1565771200000L + (Math.abs(new Random().nextLong()) % (1L * 180 * 24 * 60 * 60 * 1000));
		this.hora = new Date(ms);
		this.puerto1=new Aeropuerto();
		this.puerto2=new Aeropuerto();
		puerto1.vuelosout.add(this);
		puerto1.vuelosin.add(this);
		this.avion=new Avion();
		this.asiento=(int) (Math.random() * avion.capacidad) + 1;
		this.piloto=new Piloto();
		this.nombre="Vuelo-G"+Double.toString((int) (Math.random() * 9999) + 1000);
	}
	public void Imprimir() {
		System.out.println(nombre+"\t\t"+hora);
		System.out.println("\tSalida: "+puerto1.nombre);
		System.out.println("\tLlegada: "+puerto2.nombre);
		System.out.print("\tPiloto: ");
		piloto.Imprimir();
		System.out.print("\tAciento: "+asiento+"\tAvion: ");
		avion.Imprimir();
		System.out.println();
	}
}
