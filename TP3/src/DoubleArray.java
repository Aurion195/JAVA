
public class DoubleArray 
{
	/** Affiche la matrice 
	 * 	tab[i].length permet de connaître
	 *  la taille de la ligne est de la parcourir
	 */
	public void display(double[][] tab)
	{
		for(int i = 0 ; i < tab.length ; i++)
		{
			for(int j = 0 ; j < tab[i].length ; j++)
			{
				System.out.print(tab[i][j]+" ") ;
			}
			System.out.println();
		}
	}
	
	/** Renvoi vrai si toutes les lignes du tableau
	 *  ont la même longeur 
	 * @return : renvoi true / false ;
	 */
	public boolean regular(double[][] tab)
	{
		if(tab != null)
		{
			int test = tab[0].length ;
			int test2 = 0 ;
			
			for(int i = 0 ; i < tab.length ; i++)
			{
				test2 = tab[i].length ;
				
				if(test != test2)
				{
					return false ;
				}
			}
		
			return true ;
		}
		else
		{
			System.out.println("Le tableau est null") ;
			return false ;
		}
	}
	
	/** Renvoi la somme de chaque ligne de la matrice
	 *  dans une case d'un tableau à une dimension
	 * @return : renvoi le tableau 
	 */
	public double[] lineSomme(double[][] tab)
	{
		int n = tab.length ;
		double [] t = new double[n] ;
		
		for(int i = 0 ; i < tab.length ; i++)
		{
			for(int j = 0 ; j < tab[i].length ; j++)
			{
				t[i] += tab[j][i] ;
			}
		}
		
		return t ;
	}

	/** Calcul la somme de deux matrice seulement si elles
	 *  sont identiques
	 * @param B : Instance de la classe DoubleArray
	 * @return t : renvoi la matrice 
	 */
	public double[][] sum(double[][] tab, double [][]btab)
	{
		boolean v, v1 ;
		v = regular(tab) ;
		v1 = regular(btab);
		
		if(v != v1)
		{
			return null ;
		}
		else
		{
			int N = btab.length ;
			int N1 = btab[0].length ;
			int N2 = tab.length ;
			
			if(N != N2) return null ;
			else
			{
				double [][] t= new double [N][N2] ;
				
				for(int i = 0 ; i < N ; i++)
				{
					for(int j = 0 ; j < N1 ; j++)
					{
						t[i][j] = tab[i][j] + btab[i][j] ;
					}
				}
				
				return t ;
			}
		}
	}
}
