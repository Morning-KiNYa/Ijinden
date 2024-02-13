import java.util.Random;

import charactar.Character;
import charactar.FlorenceNightingale;
import charactar.NintokuTenno;

public class Fukuoka extends Area {
	
	public Fukuoka() {
		this.name = "福岡";
		this.progress = 4;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 3.4;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new NintokuTenno();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new FlorenceNightingale();
	}

	@Override
	public Area newArea(Player p) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("現在あそべるエリアはここまでです");
		return null;
	}

}
