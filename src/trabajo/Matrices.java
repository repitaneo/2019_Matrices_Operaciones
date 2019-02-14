package trabajo;

public class Matrices {

	
	private int FILAS; 
	private int COLUMNAS; 
	private int original[][];
	
	
	
	/**
	 * Contructor
	 * @param filas filas de la matriz
	 * @param columnas columnas de la matriz
	 */
	public Matrices(int filas,int columnas) {
	
		FILAS = filas;
		COLUMNAS = columnas;
		original = new int[FILAS][COLUMNAS];
		
		for(int i=0;i<FILAS;i++) {
			
			for(int j=0;j<COLUMNAS;j++) {
				
				original[i][j] = (int) (Math.random()*9)+1;
			}
		}
	}
	
	
	
	
	public void imprimir() {
		
		System.out.println("\n\n");
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				
				System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
	
	
	
	
	/**
	 * Elimina una columna de la matriz
	 * @param columnaEliminar número de columna a eliminar
	 */
	public void eliminarColumna(int columnaEliminar) {
		
		// compuebo si está dentro de los límites
		if((columnaEliminar>=0)&(columnaEliminar<COLUMNAS)) {

			int filitas = FILAS;
			int columnitas = COLUMNAS -1;
			int pequenia [][] = new int [filitas][columnitas];
			int n = 0;
			
			for(int i=0;i<filitas;i++) {
				for(int j=0;j<columnitas;j++) {
					
					if(n==columnaEliminar) n++;

					pequenia[i][j] = original[i][n];
					n++;
				}
				n = 0;
			}
			
			FILAS = filitas;
			COLUMNAS = columnitas;
			original = pequenia;
		}
	}
	
	
	
	
	
	
	/**
	 * Elimina una fila de la matriz
	 * @param filaEliminar número de fila a eliminar
	 */
	public void eliminarFilas(int filaEliminar) {
		
		// compuebo si está dentro de los límites
		if((filaEliminar>=0)&(filaEliminar<FILAS)) {

			int filitas = FILAS-1;
			int columnitas = COLUMNAS;
			int pequenia [][] = new int [filitas][columnitas];
			int m = 0;
			
			for(int i=0;i<filitas;i++) {
				
				if(m==filaEliminar) m++;
				
				for(int j=0;j<columnitas;j++) {
					
					pequenia[i][j] = original[m][j];
				}
				m++;
			}
			
			FILAS = filitas;
			COLUMNAS = columnitas;
			original = pequenia;
		}
	}
	
	
	
	public void addColumna() {
		
		int filotas = FILAS;
		int columnotas = COLUMNAS+1;
		int grande [][] = new int [filotas][columnotas];
		
		
		for(int j=0;j<columnotas;j++) {
			for(int i=0;i<filotas;i++) {
		
				if(j!=(columnotas-1)) {
					grande[i][j] = original[i][j];
				}
				else {
					grande[i][j] = (int) (Math.random()*9)+1;
				}
			}
		}
		
		original = grande;
		FILAS= filotas;
		COLUMNAS= columnotas;
	}
	
	
	
	
	
	
	public void addFila() {
		
		int filotas = FILAS+1;
		int columnotas = COLUMNAS;
		int grande [][] = new int [filotas][columnotas];
		
		
		for(int i=0;i<filotas;i++) {
			for(int j=0;j<columnotas;j++) {
		
				if(i!=(filotas-1)) {
					grande[i][j] = original[i][j];
				}
				else {
					grande[i][j] = (int) (Math.random()*9)+1;
				}
			}
		}
		
		original = grande;
		FILAS= filotas;
		COLUMNAS= columnotas;
	}	
	
	
	
}
