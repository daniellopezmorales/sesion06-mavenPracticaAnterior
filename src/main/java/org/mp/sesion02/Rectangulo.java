//
// Universidad de Almer�a
// Ingenier�a Inform�tica
// Fuente Java seg�n Plantilla
//
// PRACTICA : Ejercicio 1 de la Sesi�n 02
// ASIGNATURA : Metodolog�a de la programaci�n
//

package org.mp.sesion02;

/**
 * class that creates rectangles
 * @author Miguel �ngel Escribano Belmonte
 * @version 1.0
 */
/**
 * @author Miguel
 *
 */
public class Rectangulo extends Figura {
	/**
	 * Constructor that creates rectangles
	 * @param largo, length of the rectangle
	 * @param ancho, width of the rectangle
	 */
	public Rectangulo(double largo, double ancho) {
		super("Rectangulo");
		base = largo;
		alt = ancho;
	}
	
	/**
	 * Constructor that creates rectangles
	 * @param largo, length of the rectangle
	 * @param ancho, width of the rectangle
	 * @param nombre, name of the rectangle
	 */

	public Rectangulo(String nombre, double largo, double ancho) {
		super(nombre);
		base = largo;
		alt = ancho;
	}
	   
	/* 
     * Method that give us the area of the rectangle
     */
	
	public double area() {
		return base * alt;
	}

	/**
	 * save the length of the circle
	 */
	private double base;
	
	/**
	 * save the width of the circle
	 */
	private double alt;

}