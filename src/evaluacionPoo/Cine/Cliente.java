package evaluacionPoo.Cine;

public class Cliente {

	private static String nombre;
	private static int id;
	private static int identificacion;
	private static int contId;

	public Cliente(String nombre, int identificacion) {
		this.id = ++contId;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	public static String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

}
