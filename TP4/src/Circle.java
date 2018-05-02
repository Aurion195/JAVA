
public class Circle implements GeomFig {
	private double x = 0 ;

	/**Construsteur de cercle
	 * @param x = rayon
	 * @param name = nom
	 * @return 
	 */
	public Circle(double x) {
		if(x < 0) {
			System.out.println("Le rayon doit être supérieur à 0");
			return ;
		}
		else {
			this.x = x ;
		}
	}
	
	/**Affiche le cercle et ses caractéristique
	 * nom + prénom
	 */
	public void Display() {
		System.out.println("[ Rayon = "+x+" ]");
	}
	
	
	public double perimetre() {
		return Math.PI * (this.x * 2);
	}
}
