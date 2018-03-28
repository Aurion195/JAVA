
public class Polygon 
{
	private String name ;
	private int nb ;
	
	/**Consttructeur du polygon
	 * @param name = nom
	 * @param nb = nombre de côté
	 */
	public Polygon(String n, int nbc)
	{
		this.name = n;
		this.nb = nbc ;
	}

	/**Renvoi le nom du polygon
	 * @return
	 */
	public String getName() 
	{
		return name;
	}


	/**Renvoi le nombre de côté
	 * @return
	 */
	public int getNb() 
	{
		return nb;
	}


}
