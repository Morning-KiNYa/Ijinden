import java.util.Random;

import charactar.Character;
import charactar.JeanneDarc;
import charactar.SoganoUmako;

public class Kobe extends Area {
	
	public Kobe() {
		this.name = "神戸";
		this.progress = 5;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 3.0;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new SoganoUmako();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new JeanneDarc();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 10) {
			p.AreaList.add(10, new Hiroshima());
			System.out.println("新たなエリア「広島」に出陣できるようになりました！");
		}
		return null;
	}

}
