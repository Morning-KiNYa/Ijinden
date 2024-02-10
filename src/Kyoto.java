import java.util.Random;

import charactar.Character;
import charactar.HoujouTokimune;
import charactar.KhubilaiKhan;

public class Kyoto extends Area {
	
	public Kyoto() {
		this.name = "京都";
		this.progress = 5;
		this.stRequired = 7;
		this.basicMoney = 70;
		this.bossAdjustment = 2.9;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(140) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new HoujouTokimune();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new KhubilaiKhan();
	}

	@Override
	public Area newArea(Player p) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
