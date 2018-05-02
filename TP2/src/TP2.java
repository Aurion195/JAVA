import java.util.Scanner;

public class TP2 {	
	public static void main(String args[]) {
		int a, b, c ;
		
		Scanner sc = new Scanner(System.in);								//Permet la saisie utilsiateur
		System.out.println("Veuillez saisir les chiffres :");
		System.out.print("a = ") ;
		a = sc.nextInt() ;
		System.out.print("b = ") ;
		b = sc.nextInt() ;
		System.out.print("c = ") ;
		c = sc.nextInt() ;

		Vector M = new Vector(a, b,c) ;
		M.display() ;
		
		Vector Mul = new Vector(a, b, c) ;
		Mul.multiply(4) ;
		System.out.println("Voici le vector aprés l'avoir mutiplié par un nombre") ;
		Mul.display() ;
		
		int MulVec = Mul.multiplyVector(M) ;
		System.out.println("La somme des multiplications des vector est égale à " + MulVec) ;
		
		int somme = Vector.getTmp() ;
		System.out.println("Nous avons créer " + somme + " vecteur.") ;
		
		String vecteur = M.toString() ;
		System.out.println("Voici le vecteur convertit en string : " + vecteur) ;
		
		System.out.println("Voici les vecteur avant changement : ") ;
		M.display() ;
		Mul.display();
		System.out.println("Voici les vecteur aprés changement : ") ;
		M.melange(Mul) ;
		M.display();
		Mul.display() ;
		
		System.out.println("\n"+"\n"+"\n") ;
		System.out.println("Voici la class PairVect") ;
		
		PairVect K = new PairVect(M, Mul) ;
		PairVect L = new PairVect(4, 5, 3, 9, 7, 8) ; 
		System.out.println(K) ;
		
		System.out.println("Voici le premier vecteur componsant la pair : ") ;
		System.out.println(K.getPremier()) ;
		
		System.out.println("Voici le second vecteur composant la pair : ") ;
		System.out.println(K.getDeuxieme()) ;
		
		System.out.println(L) ;
	}
}