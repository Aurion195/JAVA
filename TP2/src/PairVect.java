
public class PairVect {
	private Vector P, D;
	
	/** Va créer un vecteur contenant deux vecteur
	 * il va utiliser les constructeur de la classe
	 * vector
	 * @param x
	 * @param y
	 * @param z
	 * @param a
	 * @param b
	 * @param c
	 */
	public PairVect(int x,int y,int z,int a, int b,int c) {
		this.P= new Vector(x,y,z);
		this.D= new Vector(a,b,c);
	}
	
	/**Créer vecteur grace au constructeur comprenant
	 * des valeurs
	 * @param d
	 * @param c
	 */
	public PairVect(Vector d, Vector c) {
		P = new Vector(d.x,d.y,d.z);
		D = new Vector(c.x,c.y,c.z);
	}
	
	/** Permet d'avoir le premier vecteur
	 * @return
	 */
	
	public Vector getPremier() {
		return P;
	}
	
	/** Permet d'avoir le deuxième vecteur
	 * @return
	 */
	
	public Vector getDeuxieme() {
		return D;
	}

	public String toString() {
		return "PairVect [P=" + P + ", D=" + D + "]";
	}
	

}
