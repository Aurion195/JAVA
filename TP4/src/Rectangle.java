
public class Rectangle extends Quadri {
	private double a, b ;

	/**Constructeur de rectangle
	 * @param a = largeur
	 * @param b = longueur
	 */
	public Rectangle(double x, double y) {
		super(x,y,x,y) ;
		this.a = x ;
		this.b = y ;
	}
	
	/**Fonction de la class Rectangle utilisant une fonction de la classe
	 * abstraite GeomFig pour calculer un perimetre
	 * @return
	 */
	public double perimetre() {
		return a*b ;
	}
}
