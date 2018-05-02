
public class Paie {
	private int x ;
	private int cpt;
	private String[][] paye = null ;
	Directeur dir ;
	Commercial com ;
	Employe emp ;
	
	/**Créer une matrice de String de toute les personnes avec toutes leurs données
	 * @param x = taille de la matrice
	 */
	public Paie(int x) {
		this.x = x ;
		cpt = 0 ;
		this.paye = new String[this.x][3] ;
		
		for(int i = 0 ; i < x ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				paye[i][j] = "." ;
			}
		}
	}
	
	/**Permet d'ajouter un employé, en utilisant le constructeur de la classe Employe
	 * @param name = nom
	 * @param salaire = salaire
	 * @param nbHeureTravailler = heure travailler
	 * @param tauxHoraire = taux horaire
	 * @param pourcentage = variable
	 */
	public void addEmploye(String name, int salaire, int nbHeureTravailler,int tauxHoraire, int pourcentage) {
		emp = new Employe(name,salaire,nbHeureTravailler,tauxHoraire,pourcentage) ;
		
		paye[cpt][0] = emp.getStatut() ;
		paye[cpt][1] = emp.getName();
		paye[cpt][2] = emp.getSalaire() ;
		cpt++ ;
	}
	
	/**Ajoute un commercial, graçe à l'aide de constructeur de la classe COmmercial
	 * @param name = nom
	 * @param salaire = salaire
	 * @param chiffreAffaire = chiffre d'affaire
	 */
	public void addCommercial(String name, int salaire, int chiffreAffaire) {
		com = new Commercial(name,salaire,chiffreAffaire) ;

		paye[cpt][0] = com.getStatut() ;
		paye[cpt][1] = com.getName() ;
		paye[cpt][2] = com.getSalaire() ;
		cpt++ ;
	}
	
	/**Permet d'ajouter un seul Directeur, grace à l'appel de la méthode getInstance
	 * Avec ceci nous allons créer un seul Directeur
	 * @param name = nom
	 * @param salaire = salaire
	 * @param chiffreAffaireTotal = chiffre d'affaire
	 */
	public void addDirecteur(String name, double salaire, int chiffreAffaireTotal) {
		dir = Directeur.getInstrance(name,salaire,chiffreAffaireTotal) ;

		paye[cpt][0] = Directeur.getStatut() ;
		paye[cpt][1] = Directeur.getName() ;
		paye[cpt][2] = Directeur.getSalaire() ;
		cpt++;
	}
	
	/**Affiche la liste de toute les personnes avec leur statut, nom de la personne
	 * et le salaire après ajout de leur prime s'il y a prime
	 * 
	 */
	public void Display() {
		for(int i = 0 ; i < cpt ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(paye[i][j]+" ");
			}
			System.out.println();
		}
	}
}

