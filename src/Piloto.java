public class Piloto extends Persona{
	double hvuelo;
	int categoria;
	
	public Piloto(String nombre, String apellido, int edad, double hvuelo, int categoria) {
		super(nombre, apellido, edad);
		this.hvuelo = hvuelo;
		this.categoria = categoria;
	}

	public Piloto() {
		super();
		this.edad=(int) (Math.random() * 75) + 30;
		this.hvuelo= (Math.random() * 50000) + 100;
		if(hvuelo<4500) {
			this.categoria=1;
		}else if(hvuelo<10500) {
			this.categoria=2;
		}else {
			this.categoria=3;
		}
	}
	public void Imprimir() {
		super.Imprimir();
		System.out.println("Categoria: "+categoria+"(HV:"+hvuelo+")");
	}
}
