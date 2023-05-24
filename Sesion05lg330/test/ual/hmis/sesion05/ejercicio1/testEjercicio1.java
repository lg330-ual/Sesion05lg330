package ual.hmis.sesion05.ejercicio1;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class testEjercicio1 {

	Ejercicio1 ej = new Ejercicio1();
	
	//Numeros no primos cuyos factores tampocos sean primos
	@ParameterizedTest
	@ValueSource(ints = {6, 8, 10, 15, 27, 48})
	public void noPrimosFactoresNoPrimos(int num) {
		assertEquals(1, ej.transformar(num));
	}
	
	//Numeros no primos en los cuales uno de los factores es primo y distinto de 2,3 y 5
	@ParameterizedTest
	@CsvSource({"14,7", "21,7", "22,11", "28,7", "46,23", "87,29"})
	public void noPrimosFactoresPrimos(int num, int expected) {
		assertEquals(expected, ej.transformar(num));
	}
	
	
	@ParameterizedTest
	@CsvSource({"7,7", "11,11", "13,13", "17,17", "19,19", "23,23", "29,29", "31,31"})
	public void numPrimo(int num, int expected) {
		assertEquals(expected, ej.transformar(num));
	}
	
	
}
