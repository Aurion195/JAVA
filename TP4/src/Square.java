
public class Square extends Quadri {
	private double x ;
	/**Constructeur du carré
	 * @param x = longueur
	 */
	public Square(int cote) {
		super(cote,cote,cote,cote);
		x = cote ;
	}
	
	public double perimeter() {
		return x * x ;
	}
}
