package evaluacionPoo.Diptongo;

public class Diptongo {
	public static void main(String[] args) {
		String[] palabras = { "uno", "piensa", "aire", "zoologico", "abuela", "seleccionar", "sueño", "limpiar",
				"paez" };

		StringBuilder sb = new StringBuilder();
		sb.append("Las palabras diptongo son: ");
		for (int i = 0; i < palabras.length; i++) {
			String p = palabras[i];
			if (BusDip(p) == true) {
				sb.append(p).append(", ");
			}

		}
		System.out.print(sb);
	}

	private static boolean BusDip(String p) {
		boolean resultado = false;
		String[] combinaciones = { "ia", "ie", "io", "ua", "ue", "uo", "ai", "au", "ei", "eu", "ou", "oi", "iu", "ui" };
		for (int i = 0; i < combinaciones.length; i++) {
			String c = combinaciones[i];
			if (p.contains(c)) {
				resultado = true;
			}
		}
		return resultado;

	}
}
