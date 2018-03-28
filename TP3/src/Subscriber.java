
public class Subscriber 
{
	public String name ;
	public String numero ;
	
	/**Permet de créer la classe Subscriber qui va garder
	 * en valeur le nom et le numéro de tel
	 * @param n = Nom de la personne
	 * @param numero = Numéro de la personne
	 */
	public Subscriber(String n, String numero) 
	{
		this.name = n ;
		this.numero = numero;
	}

	/**Renvoi le nom de la personne
	 * @return
	 */
	public String getName() 
	{
		return name;
	}

	/**Renvoi le numéro de la personne
	 * @return
	 */
	public String getNumero() 
	{
		return numero;
	}
}
