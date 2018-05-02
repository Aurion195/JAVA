
public class Liste {
	protected Maillon premier;
	protected Maillon dernier;
	
	/**Constructeur de la liste chainée
	 * 
	 */
	public  Liste() {
	    premier = null ;
	}
	
	/**Vérifie que la liste n'est pas null
	 * @return
	 */
	public boolean vide() {
	    return premier == null;
	}
	
	/**Ajoute un maillon en début de la chaine
	 * @param i
	 */
	public void addDebut(Object i) {
	    Maillon p = new Maillon(i,null) ;
	    
	    if(this.vide()) {
	        premier = p;
	    }
	    else {
	    	p.suiv = premier ;
	    	premier = p ;
	    }
	}
	
	/**Affiche la liste chainée d'objet
	 */
	public void display() {
		String x = "Ma liste chainée est : " ;
		for(Maillon p = premier ; p!= null ; p = p.suiv) {
			x += String.valueOf(p.info)+" " ;	
		}
		
		System.out.println(x);
	}
}
