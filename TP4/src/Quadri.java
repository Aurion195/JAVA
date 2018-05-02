
public class Quadri extends Polygon {
	/**Constructeur de polygone
	 * @param a = largeur
	 * @param b = largeur
	 * @param c = largeur
	 * @param d = largeur
	 */
	public Quadri(double x, double y , double z , double w) {
		super(4);
		tmp[0]=x;
		tmp[1]=y;
		tmp[2]=z;
		tmp[3]=w;
	}
}
