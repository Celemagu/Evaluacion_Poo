package evaluacionPoo.Cine;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {

		Silla sillas = new Silla(10, 6);
		sillas.poblarSillas();

		Scanner m = new Scanner(System.in);
		int opcion;
		do {
			System.out.println();
			System.out.println("=====Nuestro menú=====");
			System.out.println("1. Visualizar estado Asientos");
			System.out.println("2. Agregar Reserva");
			System.out.println("3. Eliminar reserva");
			System.out.println("4. Salir");
			System.out.println("Ingrese el número con la opción que desea");
			opcion = m.nextInt();

			switch (opcion) {
			case 1:
				sillas.estadoSillas();
				break;
			case 2:

				Scanner s = new Scanner(System.in);
				System.out.println("Ingrese el nombre");
				String nombre = s.nextLine();
				System.out.println("Ingrese la identificacion");
				int identificacion = s.nextInt();
				Cliente cliente = new Cliente(nombre, identificacion);
				System.out.println();

				sillas.estadoSillas();

				System.out.println();
				System.out.println("Ingrese la fila de la silla que desea ocupar");
				int fs = s.nextInt();
				System.out.println("Ingrese la Columna de la silla que desea ocupar");
				int cs = s.nextInt();
				sillas.ocupSilla(fs, cs);
				break;
			case 3:
				Scanner ds = new Scanner(System.in);
				System.out.println("Ingrese la fila de la silla que desea Liberar");
				int fs1 = ds.nextInt();
				System.out.println("Ingrese la Columna de la silla que desea Liberar");
				int cs1 = ds.nextInt();
				sillas.desocupSilla(fs1, cs1);
				break;
			case 4:
				System.out.println("Haz salido con exito");
				System.out.println();
				break;
			default:
				System.out.println("Ingrese un número de opción valido");
				System.out.println();
			}
		} while (opcion != 4);

	}

}
