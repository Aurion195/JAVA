
public class TP3 
{
	/** Affiche un tableau de 1 dimension
	 *  @param t : tableau
	 */
	public static void display(double[] t)
	{
		for(int i = 0 ; i < t.length ; i++)
		{
			System.out.println(t[i]) ;
		}
	}
	
	/** Affiche un tableau de 2 dimension
	 *  @param t : tableau 
	 */
	public static void display(double[][] t)
	{
		for(int i = 0 ; i < t.length ; i++)
		{
			for(int j = 0 ; j < t[i].length ; j++)
			{
				System.out.println(t[i][j]) ;
			}
			System.out.println() ;
		}
	}
	
	/**Main de l'exo 4
	 * 
	 */
	public static void exercice4()
	{
		double[][] B = {{1,3,5},{2,4,6},{10,10,10}} ;
		double[][] C = {{2,2,2},{2,2,2}} ;
		
		DoubleArray N = new DoubleArray() ;
		
		System.out.println("Voici le tableau de tableaux !") ;
		N.display(B) ;
		N.display(C) ;
		
		System.out.println("\n"+"\n"+"La matrice est-elle régulière ? ") ;
		boolean regul = N.regular(B);
		if(regul)
		{
			System.out.println("La matrice est réguliere :)") ;
		}
		else
		{
			System.out.println("Dommage elle n'est pas régulière :(") ;
		}
		N.display(B) ;
		
		System.out.println("\n"+"Voici la somme des colonnes de la matrice") ;
		double [] t = N.lineSomme(B) ;
		display(t) ;
		
		
		double [][] Som = N.sum(B, C) ;
		if(Som != null)
		{
			System.out.println("\n"+"Voici la somme des 2 matrice") ;
			display(Som) ;
		}
		else
		{
			System.out.println("\n"+"La matrice est null") ;
		}
	}
	
	/**Main de l'exercice 5
	 * 
	 */
	public static void exercice5()
	{
		Index T = new Index(10) ;
		
		T.addSubscriber("Mathieu", "0102030405") ;
		T.addSubscriber("Rezaigui", "0607080910") ;
		T.addSubscriber("Alphonse", "1011121314") ;
		T.addSubscriber("Brice", "111111111111") ;
		
		System.out.println("Voici l'index !");
		T.Display() ;
		
		String number = T.getNumber("Mathieu") ;
		System.out.println("Voici le numéro : "+number) ;
		
		Index X = T.getSortedSubscribers() ;
		
		System.out.println("Voici l'index aprés tri") ;
		X.Display() ;
	}
	
	public static void main(String args[])
	{
		//exercice4() ;
		exercice5() ;
	}
}
