
public class Directeur
{
	private  static Directeur instance = null;
	private static String statut ;
	private static String name ;
	private static double salaire ;
	
	/**Cr�e un directeur, seulement un.
	 * @param statut = role
	 * @param name = nom
	 * @param salaire = salaire + (1 + (0.4*chiffreAffaireTotal))
	 */
	private Directeur(String name, double salaire, int chiffreAffaireTotal) 
	{
		this.statut = "Directeur" ;
		this.name = name;
		this.salaire = salaire + (0.4*chiffreAffaireTotal) ;
	}
	
	public static Directeur getInstrance(String name, double salaire, int chiffreAffaireTotal) 
	{
		if(instance == null)
		{
			instance = new Directeur(name,salaire,chiffreAffaireTotal); // On peut y acc�der � la m�thode priv�e
		}

			return instance;
	}
	
	/**Renvoi le statut
	 * @return
	 */
	public static String getStatut() 
	{
		return statut;
	}
	
	/**Renvoi le nom de la personne
	 * @return
	 */
	public static String getName() 
	{
		return name;
	}

	/**Renvoi le salaire de la personne convertit en string
	 * @return
	 */
	public static String getSalaire() 
	{
		return Double.toString(salaire);
	}
}
