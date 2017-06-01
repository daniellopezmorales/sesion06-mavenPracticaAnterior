//
// Universidad de Almer�a
// Ingenier�a Inform�tica
// Fuente Java seg�n Plantilla
//
// PRACTICA : Sesi�n 2 Ejercicio 5
// ASIGNATURA : Metodolog�a de la programaci�n
//
package org.mp.sesion02;

import java.util.Random;

/**
 * Class that creates a deck.
 * @author Miguel �ngel Escribano Belmonte
 * @version 1.0
 */
public class Baraja {

	/** 
	 * Name of the deck. 
	 */
	private String nombreBaraja;
	
	/** 
	 * array of cards in the deck. 
	 */
	private Carta[] cartas;
	
	/**
	 * Constructor that creates the deck.
	 *
	 * @param nombreBaraja, the name (kind) of the deck
	 * @param cartas, the carts
	 */
	public Baraja(String nombreBaraja, Carta[] cartas) {
		this.nombreBaraja = nombreBaraja;
		this.cartas = cartas;
	}

	/**
	 * that method give us the carts
	 * @return the carts
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	
}
