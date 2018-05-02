
public class Polygon {
	private int nb ;
	protected double [] tmp ;
	
	/**Consttructeur du polygon
	 * @param name = nom
	 * @param nb = nombre de côté
	 */
	public Polygon(int nbc) {
		if(nbc < 2) {
			System.out.println("Erreur : le nombre de valeur doit être supérieur à 2");
			return ;
		}
		else {
			this.nb = nbc ;
			this.tmp = new double[nbc] ;
		}
	}

	/**Fonction permettant de calculer le périmètre d'un polygone
	 * @return
	 */
	public double perimetre() {
		double peri = 0 ;
		for(int i = 0; i < this.nb ; i++) {
			peri += tmp[i];
		}
		return peri;
	}


	/**Renvoi le nombre de côté
	 * @return
	 */
	public int getNb() {
		return nb;
	}


}
