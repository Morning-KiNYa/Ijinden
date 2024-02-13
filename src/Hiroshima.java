import java.util.Random;

import charactar.Character;
import charactar.HujiwaranoHuhito;
import charactar.ThomasEdison;

public class Hiroshima extends Area {
	
	public Hiroshima() {
		this.name = "広島";
		this.progress = 5;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 3.2;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new HujiwaranoHuhito();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new ThomasEdison();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 11) {
			p.AreaList.add(11, new Fukuoka());
			System.out.println("新たなエリア「福岡」に出陣できるようになりました！");
		}
		return null;
	}

}
