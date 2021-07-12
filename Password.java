public class Password {
	private static int LONGITUD = 8;
	private static String CONTRASE�A = "";
	
	private int longitud;
	private String contrase�a;
	
	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = CONTRASE�A;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		for (int i = 0; i < longitud; i++) {
			this.contrase�a += (int) (Math.random()*(9 - 0 - 1) + 1); 
		}
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}