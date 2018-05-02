
public class Maillon 
{
    Object info ; //Information d'une donnée
    Maillon suiv; //Information vers la donnée suivante
     
    /**Crée un maillon d'objet i
     * @param i = type de l'object
     * @param s
     */
    Maillon(Object i, Maillon s) 
    {
    	this.info = i;
    	this.suiv = s;
    }
    
  
	/** Affiche l'objet de du maillon
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return "Objet -> " + info ;
	}


	/**Renvoi l'info contenue dans le maillon
	 * @return
	 */
	public Object getInfo() 
	{
		return info;
	}

	/**Permet d'avoir le maillon suivants
	 * @return
	 */
	public Maillon getSuiv() 
	{
		return suiv;
	}
}
