
import java.util.Scanner ;

public class TP1
{
   public static void main(String[] args)
   {
     //question1A(args) ;                                                      //exercice 1
     //question1B(args) ;
     //question2() ;                                                           //exercice 2
     question3(args) ;                                                           //exercice 3
   }

  public static void question1A(String [] s)
  {
    String out = " " ;
    for(int j = s.length-1 ; j >= 0 ; j--)
    {
      out += s[j] ;
      out += "    " ;
    }

    System.out.println(out) ;
    out = " " ;
  }

   public static void question1B(String[] s)
   {
      for(int i = s.length-1; i >= 0; i--)
      {
        for(int j = s[i].length()-1; j>=0; j--)
        {
          System.out.print(s[i].charAt(j)) ;                                //charAt() permet d'afficher seulement le caractère qui est demander
        }
      }

      System.out.println("-----------------------------------------------------");

   }


    public static void question2()
    {
      System.out.println("entrez votre equations ") ;
      Scanner sc = new Scanner(System.in) ;                                 //L'équivalent du cin en c++
      System.out.println("Saisissez le premier parametre : ") ;
      int a = sc.nextInt() ;                                                //nextint() permet de récuperer ce qu'on écrit dans la console
      System.out.println("Saisissez le deuxieme parametre : ") ;
      int b = sc.nextInt() ;
      System.out.println("Saisissez le troisieme parametre : ") ;
      int c = sc.nextInt() ;

      System.out.println() ;
      System.out.println("---------------------------------------------------") ;


  		int delta = (b*b)-(4*a*c) ;                                            // on def delta
  		if (delta < 0)                                                         // si delta inferieur a 0 pas de solution
      {
  			System.out.println("Pas de solution ") ;
      }
  		else if (delta == 0)                                                   // delta = 0 -> 1 solution
      {
  			System.out.println("1 solution : " + ( -b / (2*a) )) ;
      }
  		else
      {
  			System.out.println("2 solutions : " + ( -b + Math.sqrt(delta) ) / (2*a) + " ET " + ( -b -Math.sqrt(delta) )/ (2*a));
      }
    }


    public static void question3(String[] s) 
    {
      Integer jour = Integer.valueOf(s[0]);
      Integer mois = Integer.valueOf(s[1]);
      Integer anne = Integer.valueOf(s[2]);

      int day=jour;
      int month=mois;
      int year=anne;

      if(jour>31||mois>12||mois<1||jour<1){
        System.out.println("Date non correct");
      }
      else
      {
      
        if(anne%4==0 && mois == 2)
        {
          if(jour == 28)  day = 29;
          else if(day >= 29)
          {
            month+=1;
            day=1;
          }
          else
          {
            day+=1;
          }
        }
        else if(mois ==12 && jour == 31)
        {
          day=1;
          month=1;
          year++;
        }
        else
        {
          if(mois==1||mois==3||mois==5||mois==7||mois==9||mois==11)
          {
            if(day==31)
            {
              day=1;
              month+=1;
            }
            else
            {
            day+=1;
            }
          }
          else
          {
          if(day>=28 && month == 2)
          {
            month+=1;
            day=1;
          }
          else if(day>=30)
          {
            day=1;
            month+=1;
          }
          else
          {
            day+=1;
          }
        }
      }
      System.out.println("la date suivante : "+day+"/"+month+"/"+year);
    }
    
  }
}
