
public class Directeur {
	private  static Directeur instance = null;
	private static String statut ;
	private static String name ;
	private static double salaire ;
	
	/**Crée un directeur
	 * @param statut = role
	 * @param name = nom
	 * @param salaire = salaire + (1 + (0.4*chiffreAffaireTotal))
	 */
	private Directeur(String name, double salaire, int chiffreAffaireTotal) {
		Directeur.statut = "Directeur" ;
		Directeur.name = name;
		Directeur.salaire = salaire + (0.04*chiffreAffaireTotal) ;
	}
	
	/**Permet de créer seulement une seul instance de classe
	 * va vérifier si une instance n'a pas été créer.
	 * C'est la méthode getInstance qui va vérfier si l'instance est nul
	 * si elle est null, elle va créer une classe à l'aide du constructeur privé
	 * sinon elle renvoi exactement la même instance
	 * @param name = nom du directeur
	 * @param salaire = salaire
	 * @param chiffreAffaireTotal = chiffre d'affaire de la personne
	 * @return
	 */
	public static Directeur getInstrance(String name, double salaire, int chiffreAffaireTotal) {
		if(instance == null) {
			instance = new Directeur(name,salaire,chiffreAffaireTotal); // On peut y accéder à la méthode privée
		}

			return instance;
	}
	
	/**Renvoi le statut
	 * @return
	 */
	public static String getStatut() {
		return statut;
	}
	
	/**Renvoi le nom de la personne
	 * @return
	 */
	public static String getName() {
		return name;
	}

	/**Renvoi le salaire de la personne convertit en string
	 * @return
	 */
	public static String getSalaire() {
		return Double.toString(salaire);
	}
}
