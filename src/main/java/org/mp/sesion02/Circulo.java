//
// Universidad de Almer�a
// Ingenier�a Inform�tica
// Fuente Java seg�n Plantilla
//
// PRACTICA : Sesi�n 2 Ejercicio 1
// ASIGNATURA : Metodolog�a de la programaci�n
//
package org.mp.sesion02;

/**
 * Class which creates circles
 * @author Miguel �ngel Escribano Belmonte
 * @version 1.0
 */
public class Circulo extends Figura
{
    /**
     * Constructor that generates circles
     * @param r, radius of the circle
     */
    public Circulo( double r )
    {
        super( "Circulo" );
        radio = r;
    }

    /* 
     * Method that give us the area of the circle
     */
    public double area( )
    {
        return PI * radio * radio;
    }

    /**
     * PI constant
     */
    private static final double PI = 3.14159265358979323;
    /**
     * save the radius of the circle
     */
    private double radio;
}