
public class Point 
{
	private int abs, ord ;
	
	/**Constructeur du point
	 * @param abs = absicce
	 * @param ord = ordonnée
	 */
	public Point(int abs, int ord) 
	{
		this.abs = abs;
		this.ord = ord;
	}

	/** Affiche le point
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return "Point [abs = " + abs + ", ord = " + ord + "]";
	}
}
