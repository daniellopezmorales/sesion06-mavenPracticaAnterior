//
// Universidad de Almer�a
// Ingenier�a Inform�tica
// Fuente Java seg�n Plantilla
//
// PRACTICA : Sesi�n 2 Ejercicio 5
// ASIGNATURA : Metodolog�a de la programaci�n
//
package org.mp.sesion02;

/**
 * Class which creates a card.
 * @author Miguel �ngel Escribano Belmonte
 * @version 1.0
 */
public class Carta implements Comparable {

	/** The suit of the card (4 possibilities) */
	private String palo;
	
	/** The number of the card. */
	private int numero;
	
	/**
	 * Number that let us to compare a card with others
    */
	private int valor;
	
	/**
	 * Constructor that creates cards.
	 *
	 * @param palo, the suit of the deck
	 * @param numero, the number of each card
	 */
	public Carta(String palo, int numero) {
		this.palo = palo;
		this.numero = numero;
		this.valor = valor;
		/*switch(palo){
		case "O":this.valor = this.numero;break;
		case "C":this.valor = 12+this.numero;break;
		case "E":this.valor = 24+this.numero;break;
		case "B":this.valor = 36+this.numero;break;
		}*/
		if (palo.equals("O")) {
			this.valor = this.numero;
		} else if (palo.equals("C")) {
			this.valor = 12+this.numero;
		} else if (palo.equals("E")) {
			this.valor = 24+this.numero;
		} else if (palo.equals("B")) {
			this.valor = 36+this.numero;
		}
	}
	
	/**
	 * This method compares two cards and give us a number whereby we can know which card is higher
	 * 
	 * @return a number (-1, 1 or 0).
	 */
	public int compareTo(Object obj){
		Carta b = (Carta)obj;
		if(valor<b.valor)
			return -1;
		if(valor>b.valor)
			return 1;
		return 0;
	}


}
