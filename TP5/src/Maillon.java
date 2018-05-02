
public class Maillon {
    Object info ; //Information d'une donnée
    Maillon suiv; //Information vers la donnée suivante
     

    /**Crée un maillon d'objet i
     * @param i
     * @param s
     */
    Maillon(Object i, Maillon s) {
    	info = i;
    	suiv = s;
    }

	/**Renvoi l'info contenue dans le maillon
	 * @return
	 */
	public Object getInfo() {
		return info;
	}

	/**Permet d'avoir le maillon suivants
	 * @return
	 */
	public Maillon getSuiv() {
		return suiv;
	}
}
