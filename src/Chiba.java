import java.util.Random;

import charactar.Character;
import charactar.Murasakishikibu;
import charactar.ShirakawaTenno;

public class Chiba extends Area {
	
	public Chiba() {
		this.name = "千葉";
		this.progress = 7;
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
		return new Murasakishikibu();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new ShirakawaTenno();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 6) {
			p.AreaList.add(6, new Saitama());
			System.out.println("新たなエリア「埼玉」に出陣できるようになりました！");
		}
		return null;
	}

}
