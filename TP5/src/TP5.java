
public class TP5 
{
	public static void main(String args [])
	{
		Paie ex = new Paie(100) ;
		ex.addEmploye("Thomas",1500,40,12,15) ;
		ex.addCommercial("Victor", 1200, 700);
		ex.addDirecteur("Gilou", 3500, 3000);
		ex.addDirecteur("Mathias", 2500, 10000);
		
		ex.Display();
	}
}
