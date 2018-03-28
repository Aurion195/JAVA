
public class Square implements GeomFig
{
	private double x ;

	/**Constructeur du carré
	 * @param x = longueur
	 */
	public Square(double x) 
	{
		this.x = x ;
	}
	
	/**Fonction de la class Square utilisant une fonction de la classe
	 * abstraite GeomFig pour calculer un perimetre
	 * @return
	 */
	public double perimetre()
	{
		return x*x ;
	}
	
	/**Surdéfinition de la la fonction perimetre de la classe Square
	 * @param y = largeur
	 * @return
	 */
	public double perimetre(int y)
	{
		return y*y ;
	}
}
