import java.util.Random;

import charactar.Character;
import charactar.HujiwaranoMichinaga;
import charactar.SakanoueTamuramaro;

public class Ikebukuro extends Area {
	
	public Ikebukuro() {
	this.name = "池袋";
	this.progress = 9;
	this.stRequired = 5;
	this.basicMoney = 50;
	this.bossAdjustment = 2.5;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(100) + 1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new SakanoueTamuramaro();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new HujiwaranoMichinaga();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 4) {
			p.AreaList.add(4, new Yokohama());
			System.out.println("新たなエリア「横浜」に出陣できるようになりました！");
		}
		return null;
	}

}
