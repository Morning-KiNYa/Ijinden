import java.util.Random;

import charactar.Character;
import charactar.HujiwaranoYorimichi;
import charactar.SeiSyounagon;

public class Yokohama extends Area {
	
	public Yokohama() {
		this.name = "横浜";
		this.progress = 8;
		this.stRequired = 6;
		this.basicMoney = 60;
		this.bossAdjustment = 1.6;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(120) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new SeiSyounagon();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new HujiwaranoYorimichi();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 5) {
			p.AreaList.add(5, new Chiba());
			System.out.println("新たなエリア「千葉」に出陣できるようになりました！");
		}
		return null;
	}

}
