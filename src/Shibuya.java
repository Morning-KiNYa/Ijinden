
import java.util.Random;

import charactar.Character;
import charactar.HujiwaranoHuhito;
import charactar.TenmuTenno;

public class Shibuya extends Area {
	
	public Shibuya() {
		this.name = "渋谷";
		this.progress = 10;
		this.stRequired = 2;
		this.basicMoney = 15;
		this.bossAdjustment = 2.2;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(35)+1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new HujiwaranoHuhito();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new TenmuTenno();
	}

	public Area newArea(Player p) {
		if (p.AreaList.size() == 2) {
			p.AreaList.add(2, new Akihabara());
			System.out.println("新たなエリア「秋葉原」に出陣できるようになりました！");
		}
		return null;
	}

}
