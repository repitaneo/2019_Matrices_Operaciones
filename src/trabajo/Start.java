package trabajo;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrices matriz = new Matrices(4,7);
		matriz.imprimir();
		matriz.eliminarColumna(0);
		matriz.imprimir();
		matriz.eliminarColumna(2);
		matriz.imprimir();
		matriz.eliminarFilas(1);
		matriz.imprimir();
	}
}
