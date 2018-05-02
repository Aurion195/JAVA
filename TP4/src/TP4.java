
public class TP4 {
	public static void main(String args[]) {
		Quadri q = new Quadri(1,2,3,4) ;
		Rectangle r = new Rectangle(2,4) ;
		Square s = new Square(4) ;
		
		System.out.println("Le périmètre du quadrilatère est de : "+q.perimetre()) ;
		System.out.println("Le périmètre du rectangle est de : "+r.perimetre());
		System.out.println("Le périmètre du carré est de : "+s.perimetre());
	}
}
