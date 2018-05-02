
public class Employe {
	private String statut ;
	private String name ;
	private int salaire ;
	
	/**Crée un employé avec son statut et son salaire
	 * @param name = nom de la personne
	 * @param salaire = salaire de base
	 * @param nbHeureTravailler = heure travailler
	 * @param tauxHoraire = le taux horaire
	 * @param pourcentage = variable
	 */
	public Employe(String name, int salaire, int nbHeureTravailler,int tauxHoraire, int pourcentage) {
		int cpt = 0 ;
		
		this.statut = "Employe" ;
		this.name = name ;
		if(nbHeureTravailler > 35) {
			cpt = nbHeureTravailler - 35 ;
			cpt *= (tauxHoraire + pourcentage) ;
		}

		this.salaire = salaire + cpt;
	}

	/**Renvoi le statut de la personne
	 * @return
	 */
	public String getStatut() {
		return statut;
	}

	/**Renvoi le salaire de la personne convertit en string
	 * @return
	 */
	public String getSalaire() {
		return Integer.toString(salaire);
	}
	
	/**Renvoi le nom
	 * @return
	 */
	public String getName() {
		return name ;
	}
}