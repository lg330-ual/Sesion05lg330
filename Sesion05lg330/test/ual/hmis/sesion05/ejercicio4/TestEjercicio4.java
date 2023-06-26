package ual.hmis.sesion05.ejercicio4;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Test;

public class TestEjercicio4 {

	@Test
	public void creacionClase() {
		Ejercicio4 ej4 = new Ejercicio4();
		Assert.assertNotNull(ej4);
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "./matrices.csv", numLinesToSkip = 1)
	public void testDiagonales(String csv) {
		// Arrange
		String[] mString = csv.split(";");
		int[][] matriz = formatMatrix(mString[0], 1);
		int[][] esperada = formatMatrix(mString[1], 2);

		// Act
		int[][] actual = Ejercicio4.obtenerDiagonales(matriz);
		
		// Assert
		Assert.assertArrayEquals(esperada, actual);

	}

	@ParameterizedTest
	@CsvFileSource(resources = "./matrices.csv", numLinesToSkip = 1)
	public void testSumaColumnas(String csv) {
		// Arrange
		String[] mString = csv.split(";");
		double[][] matriz = formatMatrixDouble(mString[0]);

		String[] arrayString = mString[2].split(",");
		double[] arraySumaEsperado = new double[matriz[0].length];
		
		for (int i = 0; i < arrayString.length; i++) {
			arraySumaEsperado[i] = Double.parseDouble(arrayString[i]);
		}

		//Act
		double[] arraySumaActual = Ejercicio4.sumarColumnas(matriz);
		
		// Assert
		assertArrayEquals(arraySumaEsperado, arraySumaActual);

	}

	public int[][] formatMatrix(String stringCSV, int tipoMatriz) {
		if (stringCSV.isEmpty() || stringCSV.isBlank()) {
			return null;
		}
		
		String[] splittedString = stringCSV.split(",");

		int dimension = 0;
		int[][] matriz = null;
		if (tipoMatriz == 1) {
			dimension = (int) Math.sqrt(splittedString.length);
			matriz = new int[dimension][dimension];
		} else if (tipoMatriz == 2) {
			dimension = (splittedString.length == 1) ? 1 : splittedString.length / 2;
			matriz = new int[2][dimension];
		}

		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Integer.parseInt(splittedString[k]);
				if (splittedString.length != 1) {
					k++;
				}
			}
		}

		return matriz;
	}

	public double[][] formatMatrixDouble(String stringCSV) {
		String[] splittedString = stringCSV.split(",");

		int dimension = (int) Math.sqrt(splittedString.length);
		double[][] matriz = new double[dimension][dimension];

		int k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = Integer.parseInt(splittedString[k]);
				k++;
			}
		}

		return matriz;
	}

}
