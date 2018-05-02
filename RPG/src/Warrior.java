
public class Warrior extends Personnage
{
	private String type ;

	public Warrior(int life, int mana, int attaque, int attaqueSpe,String name) 
	{
		super(life, mana, attaque, attaqueSpe, name);
		this.type = "Warrior";
	}

	public String getType() 
	{
		return type;
	}
	
	public void dispaly()
	{
		System.out.println();
	}
}
