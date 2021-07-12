public class Electrodomestico {
	private final String COLOR = "blanco";
	private final int PRECIOBASE = 100;
	private final char CONSUMO = 'F';
	private final int PESO = 5;
	
	private int preciobase;
	private String color;
	private char consumo;
	private int peso;
	
	public Electrodomestico() {
		this.preciobase = PRECIOBASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}
	
	private static boolean comprobarConsumo(char consumo) {
		boolean valido = false;
		switch (consumo) {
			case 'A': valido = true;
				break;
			case 'B': valido = true;
				break;
			case 'C': valido = true;
				break;
			case 'D': valido = true;
				break;
			case 'E': valido = true;
				break;
			case 'F': valido = true;
				break;
		}
		return valido;
	}
	
	private static boolean comprobarColor(String color) {
		boolean valido = false;
		switch (color) {
			case "blanco": valido = true;
				break;
			case "negro": valido = true;
				break;
			case "rojo": valido = true;
				break;
			case "azul": valido = true;
				break;
			case "gris": valido = true;
				break;
		}
		return valido;
	}
	
	public Electrodomestico(int precio, int peso) {
		this.preciobase = precio;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = peso;
	}
	
	public Electrodomestico(int precio, String color, char consumo, int peso) {
		this.preciobase = precio;
		if (comprobarColor(color)) {
			this.color = color;
		}
		else {
			this.color = COLOR;
		}
		if (comprobarConsumo(consumo)) {
			this.consumo = consumo;
		}
		else {
			this.consumo = CONSUMO;
		}
		this.peso = peso;
	}

	public int getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(int preciobase) {
		this.preciobase = preciobase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}