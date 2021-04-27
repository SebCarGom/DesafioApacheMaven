package com.everis.main;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/*
 * Formación Dual - Eclipse 
 * 
 * @author everis
 * 
 */
public class EverisMvn {

	/*
	 * Método principal de la clase.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		final String strOne = "Sevilla";
		final String strTwo = "Cádiz";
		final Integer intOne = 10;
		final Integer intTwo = 5;

		if (NumberUtils.isCreatable(strTwo)) {
			System.out.println("Si es numérico.");
		} else {
			System.out.println("No es numérico.");
		}

		if (NumberUtils.compare(intOne, intTwo) == 0) {
			System.out.println("Son iguales.");
		} else {
			System.out.println("Son distintos.");
		}

		if (StringUtils.isBlank(strOne)) {
			System.out.println("Es nula o vacía.");
		} else {
			System.out.println("Cadena informada.");
		}

	}
}
