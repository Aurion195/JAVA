
public class Thief extends Personnage
{
	private String type ;

	public Thief(int life, int mana, int attaque, int attaqueSpe, String name) 
	{
		super(life, mana, attaque, attaqueSpe, name);
		this.type = "Thief";
	}
}
