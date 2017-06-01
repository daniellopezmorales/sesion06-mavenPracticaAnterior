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
 * Class which creates a figure
 * @author Miguel �ngel Escribano Belmonte
 * @version 1.0
 */
public abstract class Figura implements Comparable
{
    /**
     * abstract method that give us the area of the figure, the method is implemented in each class for each figure
     */
    abstract public double area();

    /**
     * method that save in the variable "nombre" the name of the figure
     * @param nombreFigura, name of the figure
     */
    public Figura( String nombreFigura )
    {
        nombre = nombreFigura;
    }

    /**
     * @param lder
     * @return true or false, it depends of the area of both figures
     */
    final public boolean menorQue( Figura lder )
    {
        return area( ) < lder.area( );
    }

    /* 
     * method that returns the name of the figure and the area of the figure as a text string.
     */
    final public String toString( )
    {
        return nombre + " con area " + area( );
    }

    /**
     * @return the name of the figure.
     */
    public String getNombre(){
    	return nombre;
    }
    
    /**
	 * This method compares two figures and give us a number whereby we can know which card is higher
	 * 
	 * @return a number (-1, 1 or 0).
	 */
    public int compareTo(Object o) {

		Figura figura = (Figura) o;
		if (area() == figura.area()) {
			return 0;
		} else if (area() > figura.area()) {
			return 1;
		} else {
			return -1;
		}

	}
    
	/**
	 * @param a
	 */
	public static void insercion(Comparable []a){
		Comparable aux;
		for(int i = 0;i < a.length; i++){
			aux = a[i];
			int j;
			for(j = i - 1;j>=0 && aux.compareTo(a[j]) < 0;j--){
				a [j+1] = a[j];
			}
			a[j+1] = aux;
		}
	}
    
    /**
     * save the name of the figure
     */
    private String nombre;
}