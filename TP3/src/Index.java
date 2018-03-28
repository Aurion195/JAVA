
public class Index 
{
	private int n = 0 ;
	private int cpt = 0 ;
	private Subscriber S[] ;
	
	
	/**Constructeur de tableau de Subscriber
	 * @param n
	 */
	public Index(int n) 
	{
		this.n = n;
		this.cpt = 0 ;
		S = new Subscriber[n] ;
	}
	
	/**Ajoute une personne dans l'index, si elle n'est pas
	 * déjà présente dans l'index
	 * @param s = Le nom que l'on veut ajouter
	 * @param N = Le numéro de téléphone
	 * @return
	 */
	public boolean addSubscriber(String s, String N)
	{
		if(cpt == n)
		{
			return false ;
		}
		else
		{
			Subscriber Sub = new Subscriber(s,N) ;
			
			for(int i = 0 ; i < cpt ; i++)
			{
				if(Sub == S[i])
				{
					System.out.println("Error : Le contact existe déjà.") ;
					return false ;
				}
			}
			
			S[cpt] = Sub ;
			cpt++ ;
		}
		
		return true ;
	}
	
	/**Affiche l'index
	 * 
	 */
	public void Display()
	{
		for(int i = 0 ; i < cpt ; i++)
		{
			System.out.println("[ nom = "+S[i].getName()+" ; tel = "+S[i].getNumero()+" ]") ;
		}
	}
	
	/**Renvoi le numéro de téléphone du nom
	 * seulement s'il existe
	 * @param name = le nom qui est choisi
	 * @return
	 */
	public String getNumber(String name)
	{
		String x = "Error" ;
		
		if(S != null)
		{
			for(int i = 0 ; i < cpt ; i++)
			{
				if(S[i].getName() == name)
				{
					return S[i].getNumero() ;
				}
			}
		
			System.out.println("Le nom n'est pas dedans") ;
		}
		
		return x ;
	}
	
	/**Permet de connaitre la taille de l'index
	 * @return
	 */
	public int getNbSubscriber()
	{
		return cpt ;
	}
	
	/**Permet d'avoir le nom de la personne en fonction 
	 * de son numéro de téléphone
	 * @param n = numéro de tel
	 * @return
	 */
	public String getSubscriber(String n)
	{
		String x = "Error" ;
		if(S != null)
		{
			for(int i = 0 ; i < cpt ; i++)
			{
				if(S[i].getNumero() == n)
				{
					return S[i].getName() ;
				}
			}
		
			System.out.println("Le numéro n'est pas dedans") ;
		}
		return x ;
		
	}
		
	/**Permet de trier le tableau de subscriber en fonction 
	 * de leurs ordre alphabétique
	 * @return
	 */
	public Index getSortedSubscribers()
	{
		Index I = new Index(this.getNbSubscriber()) ;
		Subscriber mp = new Subscriber("","") ;
		
		I = this ;
		
		for(int i = 0 ; i < this.getNbSubscriber() ; i++)
		{
			for(int j = 1 ; j < this.getNbSubscriber()-1 ; j++)
			{
				if(I.S[j-1].getName().compareTo(I.S[j].getName()) > 0)
				{
					mp = I.S[j-1] ;
					I.S[j-1] = I.S[j] ;
					I.S[j] = mp ;
				}
			}
		}
		
		return I ;
	}
}
