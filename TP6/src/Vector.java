
public class Vector 
{
	private int x, y, z ;

	
	/**Constructeur du vector
	 * @param x = int
	 * @param y = int 
	 * @param z = int
	 */
	public Vector(int x, int y, int z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/** Affiche le vecteur
	 * @see java.lang.Object#toString()
	 */
	public String toString() 
	{
		return "Vector [ x = " + x + ", y = " + y + ", z = " + z + "]";
	}
}
