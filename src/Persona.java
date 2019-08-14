public class Persona {
	String nombre;
	String apellido;
	int edad;
	int dado;
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dado =(int) (Math.random() * 7) + 1;
	}
	public Persona() {
		this.dado=(int) (Math.random() * 7) + 1;
		switch (dado) {
		case 1:
			this.apellido = "BORJA";
			break;
		case 2:
			this.apellido = "TEJADA";
			break;
		case 3:
			this.apellido = "LUQUE";
			break;
		case 4:
			this.apellido = "ARIVILCA";
			break;
		case 5:
			this.apellido = "GUTIERRES";
			break;
		case 6:
			this.apellido = "MONROY";
			break;
		default:
			this.apellido = "DIAS";
			break;
		}
		this.dado=(int) (Math.random() * 7) + 1;
		switch (dado) {
		case 1:
			this.nombre ="ARTURO";
			break;
		case 2:
			this.nombre ="MERCEDES";
			break;
		case 3:
			this.nombre ="JOSE";
			break;
		case 4:
			this.nombre ="EVELIN";
			break;
		case 5:
			this.nombre ="GONZALO";
			break;
		case 6:
			this.nombre ="MARCIA";
			break;
		default:
			this.nombre ="FELIPE";
			break;
		}	
		this.edad = (int) (Math.random() * 95) + 1;
	}
	public void Imprimir() {
		int a1 =nombre.length()+apellido.length()+1;
		System.out.print(nombre+" "+apellido);
		for(int a=0;a<18-a1;a++) {
			System.out.print(" ");
		}
		System.out.print("\t( "+edad+" ) ");
	}
	
}
