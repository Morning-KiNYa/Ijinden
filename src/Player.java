import java.util.ArrayList;
import java.util.List;

import charactar.Character;

public class Player {
	private int money;
	private int stamina;
	private int maxStamina;
	//仲間になった偉人
	List<Character> MyCharacters = new ArrayList<Character>();
	//所持しているアイテム
//	List<Item> MyItems = new ArrayList<Item>();
	//いける出陣先リスト
	List<Area>AreaList = new ArrayList<Area>();
	
	//編成したパーティ（最大3人）
	List<Character> Units = new ArrayList<Character>();
	//編成したパーティーを格納しておくリスト
//	List<Character[]> MyUnits = new ArrayList<Character[]>();
	
	public Player() {
		this.money = 0;
		this.stamina = 100;
		this.maxStamina = 100;
//		AreaList.set(0,"原宿");
	}
	
	public Player(int money,int stamina,int maxStamina) {
		this.money = money;
		this.stamina = stamina;
		this.maxStamina = maxStamina;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina += stamina;
		if (this.stamina > this.maxStamina) {
			this.stamina = this.maxStamina;
		}
	}
	
	public int getMaxStamina() {
		return maxStamina;
	}

	public void setMaxStamina(int maxStamina) {
		this.maxStamina += maxStamina;
	}

}
