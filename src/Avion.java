public class Avion {
	String modelo;
	String serie;
	String nombre;
	int capacidad;
	int dado;
	public Avion() {
		this.dado=(int) (Math.random() * 7) + 1;
		switch (dado) {
		case 1:
			this.modelo = "Boeing 747";
			capacidad =416;
			break;
		case 2:
			this.modelo = "Airbus A320";
			capacidad =220;
			break;
		default:
			this.modelo = "Túpolev Tu-204";
			capacidad =210;
			break;
		}
		this.serie=Double.toString((int) (Math.random() * 999999) + 100000);
		nombre=modelo+"-"+serie;
	}
	public void Imprimir() {
		System.out.print(nombre+"("+capacidad+")");
	}
}
