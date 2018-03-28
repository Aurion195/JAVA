
public class Quadri implements GeomFig
{
	private double a, b, c, d ;

	/**Constructeur de polygone
	 * @param a = largeur
	 * @param b = largeur
	 * @param c = largeur
	 * @param d = largeur
	 */
	public Quadri(double a, double b, double c, double d) 
	{
		this.a = a ;
		this.b = b ;
		this.c = c ;
		this.d = d ;
	}
	
	/**Fonction de la class Quadri utilisant une fonction de la classe
	 * abstraite GeomFig pour calculer un perimetre
	 * @return
	 */
	public double perimetre()
	{
		return a+b+c+d ;
	}
}
