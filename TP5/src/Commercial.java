
public class Commercial
{
	private String statut ;
	private String name ;
	private double salaire ;
	
	
	/**Crée un commercial
	 * @param statut = role
	 * @param name = nom
	 * @param salaire = salaire * (1+chiffreAffaire/100)
	 * @param chiffreAffaire
	 */
	public Commercial(String name, int salaire, double chiffreAffaire)
	{
		this.statut = "Commercial" ;
		this.name = name ;
		this.salaire = salaire * (1+(chiffreAffaire/100)*0.01) ;
	}


	/**Renvoi le statut
	 * @return
	 */
	public String getStatut() 
	{
		return statut;
	}


	/**Renvoi le nom
	 * @return
	 */
	public String getName() 
	{
		return name;
	}


	/**Renvoi le salaire convertit en string
	 * @return
	 */
	public String getSalaire() 
	{
		return Double.toString(salaire);
	}
}