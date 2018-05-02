
public class TP5 {
	public static void exercice1() {
		Paie ex = new Paie(100) ;
		ex.addEmploye("Thomas",1500,40,12,15) ;
		ex.addCommercial("Victor", 1200, 700);
		ex.addDirecteur("Gilou", 3500, 3000);
		ex.addDirecteur("Mathias", 2500, 10000);
		
		ex.Display();
	}
	
	public static void main(String args []) {
		exercice1() ;
		
		Liste l = new Liste() ;
		
		l.addDebut("Entree 1 ") ;
		l.addDebut("Entree 2 ") ;
		
		l.display() ;
	}
}
