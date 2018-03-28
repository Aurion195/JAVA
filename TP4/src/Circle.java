
public class Circle implements GeomFig
{
	private String name ;
	private double x = 0 ;

	/**Construsteur de cercle
	 * @param x = rayon
	 * @param name = nom
	 * @return 
	 */
	public Circle(double x, String name) 
	{
		this.name = name ;
		this.x = x;
	}
	
	/**Affiche le cercle et ses caractéristique
	 * nom + prénom
	 */
	public void Display()
	{
		System.out.println("[ nom = "+name+" ; rayon = "+x+" ]");
	}
	
	public double perimetre()
	{
		return Math.PI * (x * x);
	}
}
