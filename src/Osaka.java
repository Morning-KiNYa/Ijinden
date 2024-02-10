import java.util.Random;

import charactar.Character;
import charactar.GotobaTenno;
import charactar.HoujouMasako;

public class Osaka extends Area {
	
	public Osaka() {
		this.name = "大阪";
		this.progress = 6;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 2.8;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new GotobaTenno();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new HoujouMasako();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 8) {
			p.AreaList.add(8, new Kyoto());
			System.out.println("新たなエリア「京都」に出陣できるようになりました！");
		}
		return null;
	}

}
