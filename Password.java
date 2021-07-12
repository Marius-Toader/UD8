public class Password {
	private static int LONGITUD = 8;
	private static String CONTRASEÑA = "";
	
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = CONTRASEÑA;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		for (int i = 0; i < longitud; i++) {
			this.contraseña += (int) (Math.random()*(9 - 0 - 1) + 1); 
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}