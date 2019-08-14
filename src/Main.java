import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		List<Aeropuerto> puertos =new ArrayList<Aeropuerto>();
		List<Pasajero> pasajeros =new ArrayList<Pasajero>();
		for(int a=0; a<4;a++) {
			Aeropuerto a1=new Aeropuerto();
			puertos.add(a1);
		}
//		for(Aeropuerto a : puertos) {
//			a.Imprimir();
//		}
		for(int a=0; a<6;a++) {
			Pasajero a1=new Pasajero(puertos);
			pasajeros.add(a1);
		}
//		pasajeros.get(0).Imprimir();
		
		int go;
		do {
			System.out.println("Que decea hacer: ");
			System.out.println("1: listar aeropuertos");
			System.out.println("2: listar Pasajeros");
			System.out.println("0: cerrar programa");
			go=Entrada.entero();
			if(go==1) {
				Aeropuertos(puertos,go);
			}else if (go==2) {
				Pasajeros(pasajeros,go);
			}
		}while(go!=0);
		
	}
	public static void Aeropuertos(List<Aeropuerto> aeropuertos, int go) {
		int a1=1;
		for(Aeropuerto a : aeropuertos ) {
			System.out.println(a1+".- "+a.nombre);
			a1++;
		}
		System.out.println(a1+".- Regresar");
		go=Entrada.entero();
		if(go<=aeropuertos.size()) {
			aeropuertos.get(go-1).Imprimir();
		}
	}
	public static void Pasajeros(List<Pasajero> pasajeros, int go) {
		int a1=1;
		for(Pasajero a : pasajeros) {
			System.out.println(a1+".- "+a.nombre+" "+a.apellido);
			a1++;
		}
		System.out.println(a1+".- Regresar");
		go=Entrada.entero();
		if(go<=pasajeros.size()) {
			pasajeros.get(go-1).Imprimir();
		}
		
	}

}