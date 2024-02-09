
import java.util.Random;

import charactar.Character;
import charactar.Himiko;
import charactar.SoganoUmako;

public class Harajuku extends Area {
	public Harajuku() {
		this.name = "原宿";
		this.progress = 20;
		this.stRequired = 1;
		this.basicMoney = 10;
		this.bossAdjustment = 1.1;
	}

	public int randomMoney() {
		return this.basicMoney + new Random().nextInt(15) + 1;
	}

	@Override
	public Character dropChara() {
		return new SoganoUmako();
	}

	public Character dropBoss() {
		return new Himiko();
	}

	public Area newArea(Player p) {
		if (p.AreaList.size() == 1) {
			p.AreaList.add(1, new Shibuya());
			System.out.println("新たなエリア「渋谷」に出陣できるようになりました！");
		}
		return new Shibuya();
	}

}
