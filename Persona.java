public class Persona {
	private final String NOMBRE = "";
	private final int EDAD = 0;
	private final String DNI = "";
	private final String SEXO = "H";
	private final int PESO = 0;
	private final double ALTURA = 0.0;
	
	private String nombre;
	private int edad;
	private String Dni;
	private String sexo;
	private int peso;
	private double altura;
	
	public Persona() {
		this.nombre = NOMBRE;
		this.edad = EDAD;
		this.Dni = DNI;
		this.sexo = SEXO;
		this.peso = PESO;
		this.altura = ALTURA;
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.Dni = DNI;
		this.sexo = sexo;
		this.peso = PESO;
		this.altura = ALTURA;
	}
	
	public Persona(String nombre, int edad, String DNI, String sexo, int peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.Dni = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}