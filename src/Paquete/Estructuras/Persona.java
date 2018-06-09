package Datos;


public class Persona {
	
	private int Cedula;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private int Edad;
	
	public Persona(int Cedula, String Nombre, String Apellido1, String Apellido2, int Edad) {
		this.setCedula(Cedula);
		this.setNombre(Nombre);
		this.setApellido1(Apellido1);
		this.setApellido2(Apellido2);
		this.setEdad(Edad);
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String apellido1) {
		Apellido1 = apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String apellido2) {
		Apellido2 = apellido2;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	public void modificarPersona(int Cedula, String Nombre, String Apellido1, String Apellido2, int Edad) {
		this.setCedula(Cedula);
		this.setNombre(Nombre);
		this.setApellido1(Apellido1);
		this.setApellido2(Apellido2);
		this.setEdad(Edad);
	}

	public String toString() {
		String Dato= "\n| Cedula: "+this.Cedula+"\t| Edad: "+this.Edad+
				"\n| Nombre: "+this.Nombre+"\t| Apellido1: "+this.Apellido1+"\t| Apellido2: "+this.Apellido2+
				"\n------------------------------------------------------------";
		return Dato;
	}

    void modificarPersona(int Latitud, int Longitud, String Lugar, String medio, String dia, String mes, String año) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
