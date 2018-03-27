
public class Paie
{
	private int x ;
	private int cpt;
	private String[][] paye = null ;
	Directeur dir ;
	Commercial com ;
	Employe emp ;
	
	public Paie(int x) 
	{
		this.x = x ;
		cpt = 0 ;
		this.paye = new String[x][3] ;
		
		for(int i = 0 ; i < x ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				paye[i][j] = "." ;
			}
		}
	}
	
	public void addEmploye(String name, int salaire, int nbHeureTravailler,int tauxHoraire, int pourcentage)
	{
		emp = new Employe(name,salaire,nbHeureTravailler,tauxHoraire,pourcentage) ;
		
		paye[cpt][0] = emp.getStatut() ;
		paye[cpt][1] = emp.getName();
		paye[cpt][2] = emp.getSalaire() ;
		cpt++ ;

	}
	
	public void addCommercial(String name, int salaire, int chiffreAffaire)
	{
		com = new Commercial(name,salaire,chiffreAffaire) ;

		paye[cpt][0] = com.getStatut() ;
		paye[cpt][1] = com.getName() ;
		paye[cpt][2] = com.getSalaire() ;
		cpt++ ;
	}
	
	public void addDirecteur(String name, double salaire, int chiffreAffaireTotal)
	{
		dir = dir.getInstrance(name,salaire,chiffreAffaireTotal) ;

		paye[cpt][0] = dir.getStatut() ;
		paye[cpt][1] = dir.getName() ;
		paye[cpt][2] = dir.getSalaire() ;
		cpt++;
	}
	
	public void Display()
	{
		for(int i = 0 ; i < cpt ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				System.out.print(paye[i][j]+" ");
			}
			System.out.println();
		}
	}
}
