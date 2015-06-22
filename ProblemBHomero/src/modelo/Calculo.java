package modelo;

public class Calculo {

	private int participantes;
	private int tareas;

	public Calculo(int participantes, int tareas) {
		this.participantes = participantes;
		this.tareas = tareas;
	}
	
	public Calculo(){
		
	}

	public int getParticipantes() {
		return participantes;
	}

	public void setParticipantes(int participantes) {
		this.participantes = participantes;
	}

	public int getTareas() {
		return tareas;
	}

	public void setTareas(int tareas) {
		this.tareas = tareas;
	}

	/**
	 * este m�todo simula la obtenion de las entradas por medio de un archivo de texto
	 * @param participantes
	 * @param tareas
	 * @param homero
	 * @return
	 */
	public static int[][] obtenerTareas(int participantes, int tareas) {

		int[][] estadoTareas = new int[participantes][tareas];
		
		for (int i = 0; i < estadoTareas.length; i++) {
			for (int j = 0; j < estadoTareas[i].length; j++) {
				estadoTareas[i][j]=(int)(Math.random()*2);
			}
		}
		return estadoTareas;
	}
	
	public static void definirPuntajes(int [][]tareas, int cantTareas){
		int[]puntajes = new int[cantTareas];//
		int contador=0;
		for (int i = 0; i < tareas.length; i++) {
			contador=0;
			for (int j = 0; j < tareas[i].length; j++) {
				if(tareas[j][i]==0){
					contador++;
				}
			}
			puntajes[i]=contador;
			System.out.println(puntajes[i]);
		}
	}
	
	public static void asignarPuntajes(int[][]estadoTareas, int[]puntajePreguntas, int participantes){
		
		int[] puntajeparticipantes = new int [participantes];
		
		for (int i = 0; i < estadoTareas.length; i++) {
			for (int j = 0; j < estadoTareas[i].length; j++) {
				if(estadoTareas[i][j]==1){
					puntajeparticipantes[i]+=puntajePreguntas[i];
				}
			}
		}
		
	}
	
	
	public static void imprimirMatriz(int[][]matriz){
		String cadena="";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				cadena+= matriz[i][j]+ "  ";
			}
			cadena+="\n";
		}
		System.out.println(cadena);
	}
	
}
