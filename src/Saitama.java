import java.util.Random;

import charactar.Character;
import charactar.MinamotonoYoshitomo;
import charactar.TairanoKiyomori;

public class Saitama extends Area {
	
	public Saitama() {
		this.name = "埼玉";
		this.progress = 6;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 2.7;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new MinamotonoYoshitomo();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new TairanoKiyomori();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 7) {
			p.AreaList.add(7, new Osaka());
			System.out.println("新たなエリア「大阪」に出陣できるようになりました！");
		}
		return null;
	}

}
