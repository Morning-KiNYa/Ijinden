
import charactar.Character;

public abstract class Area {
	public String name;
	public int progress;
	public int stRequired;
	public int basicMoney;
	public double bossAdjustment;

	public abstract int randomMoney();

	public abstract Character dropChara();
	
	public abstract Character dropBoss();
	
	public abstract Area newArea(Player p);

}
