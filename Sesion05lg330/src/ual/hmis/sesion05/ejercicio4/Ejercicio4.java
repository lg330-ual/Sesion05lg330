package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	public static int[][] obtenerDiagonales(int[][] matriz) {
		int[][] matrizSalida = new int[2][matriz.length];

		for (int i = 0, j = matriz.length - 1; i < matrizSalida[0].length && j >= 0; i++, j--) {
			matrizSalida[0][i] = matriz[i][i];
			matrizSalida[1][i] = matriz[i][j];
		}

		return matrizSalida;
	}
	
	public static double [] sumarColumnas(double [][] matriz) {
		double[] arraySuma = new double[matriz[0].length];
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[0].length; i++) {
				arraySuma[j] += matriz[i][j];
			}
		}
		return arraySuma;
	}
}
