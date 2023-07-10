package evaluacionPoo.Cine;

public class Silla {

	private static int idCi;
	private static int f;
	private static int c;
	private static char[][] sillas;

	public Silla(int f, int c) {
		this.f = f;
		this.c = c;
		sillas = new char[f][c];
	}

	public int getFilas() {
		return f;
	}

	public void setFilas(int f) {
		this.f = f;
	}

	public int getColumnas() {
		return c;
	}

	public void setColumnas(int c) {
		this.c = c;
	}

	public static int getIdCi() {
		return idCi;
	}

	public static void setIdCi(int idCi) {
		Silla.idCi = idCi;
	}

	@Override
	public String toString() {
		return f + " " + c;
	}

	public static void poblarSillas() {
		for (int i = 0; i < sillas.length; i++) {
			for (int j = 0; j < sillas[i].length; j++) {
				sillas[i][j] = 'O';
			}
		}
	}

	public static void estadoSillas() {
		System.out.println("Estado de los asientos:");
		System.out.println("------------");
		System.out.println("| Pantalla |");
		System.out.println("------------");
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < c; j++) {
				if (sillas[i][j] == 'X') {
					System.out.print('X');
					System.out.print(" ");
				} else {
					System.out.print('O');
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void ocupSilla(int fila, int columna) {

		if (fila >= 0 && fila < f && columna >= 0 && columna < c) {
			if (sillas[fila][columna] == 'O') {
				sillas[fila][columna] = 'X';
				System.out.println();
				System.out.println("La silla en la posicion " + fila + ":" + columna + " ha sido asignada");
				idCi = ++idCi;
				System.out.println();
				System.out.println("======= Ticket Asignación Silla " + idCi + " =======");
				System.out.println("|");
				System.out.println("| Nombre cliente: " + Cliente.getNombre());
				System.out.println("| Identificacion cliente: " + Cliente.getIdentificacion());
				System.out.println("| Silla asignada: " + fila + "," + columna);
				System.out.println("|");
				System.out.println("=======================");
				System.out.println();

			} else {
				System.out.println();
				System.out.println("La silla en la posicion " + fila + ":" + columna + " ya está asignada");
				System.out.println();
			}
		} else {
			System.out.println();
			System.out.println("La silla en la posicion " + fila + ":" + columna + " No existe");
			System.out.println();
		}
	}

	public void desocupSilla(int fila, int columna) {
		if (fila >= 0 && fila < f && columna >= 0 && columna < c) {
			if (sillas[fila][columna] == 'X') {
				sillas[fila][columna] = 'O';
				System.out.println("La silla en la posicion " + fila + ":" + columna + " ha sido liberada");
				System.out.println();
				System.out.println("======= Ticket Liberación Silla " + idCi + " =======");
				System.out.println("|");
				System.out.println("|  Nombre cliente: " + Cliente.getNombre());
				System.out.println("| Identificacion cliente: " + Cliente.getIdentificacion());
				System.out.println("| Silla Liberada: " + fila + "," + columna);
				System.out.println("|");
				System.out.println("=========================================");
				System.out.println();

			} else {
				System.out.println("La silla en la posicion " + fila + ":" + columna + " Ya está libre");
			}
		} else {
			System.out.println("\"La silla en la posicion " + fila + ":" + columna + " No existe");
		}
	}

}
