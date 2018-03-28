
/** MATHIEU Thomas
 *  L2 - G3 
 *  @author uapv1703778
 *
 */
public class Vector
{
		protected int x, y, z ;
		private static int TMP = 0 ;
		
		
		/**
		 * Constructeur de la classe pour des valeurs
		 * non définis
		 */
		public Vector()
		{
			x = y = z = 0 ;
			TMP++ ;
		}
		
		/**
		 * Constructeur de la classe pour des valeurs
		 * prédéfinis
		 * @param a : valeur choisi
		 * @param b : valeur choisi
		 * @param c : valeur choisi
		 */
		public Vector(int a, int b, int c)
		{
			super();
			this.x = a;
			this.y = b;
			this.z = c;
			TMP++ ;
		}
		
		/**
		 * Multiplie avec un scalaire
		 * @param mul : chiffre
		 */
		public void multiply(int mul)
		{
			x = x*mul ;
			y = y*mul ;
			z = z*mul ;
		}
		
		/**
		 * Affiche un vecteur avec ses valeurs 
		 */
		public void display()
		{
			System.out.println("Le vecteur est composé des valeurs suivantes : [" + x + " , " + y + " , " + z +"]") ;
		}
		
		/**
		 * Renvoi la somme de la mpultiplication de deux vecteur
		 * @param A	: Vecteur créer
		 * @return : renvoi la somme
		 */
		public int multiplyVector(Vector A)
		{
			int somme = (A.x * x) + (A.y * y) + (A.z * z) ;
			return somme ;
		}
		
		/** On va créer un vecteur en mettant dedans les
		 * valeurs des vector et le renvoyer
		 * @param A : Vecteur créer
		 * @return : renvoi le vecteur
		 */
		public Vector additionVector(Vector A)
		{
			Vector c = new Vector(A.x + x, A.y + y, A.z + z) ;
			TMP ++ ;
			return c ;
		}
		
		/** Permet de connaitre le nombre de vecteur créer
		 * @return : renvoi la valeur de vecteur créer
		 */
		public static int getTmp()
		{
			return TMP ;
		}
				
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		public String toString() 
		{
			return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
		}	
		
		/** Va intervertir les deux vecteur
		 * @param A : Vecteur
		 */
		public void melange(Vector A)
		{
			int i = A.x ;
			int j = A.y ;
			int k = A.z ;
			
			A.x = x ;
			A.y = y ;
			A.z = z ;
			
			x = i ;
			y = j ;
			z = k ; 
		}
}
