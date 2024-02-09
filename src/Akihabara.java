
import java.util.Random;

import charactar.Character;
import charactar.NintokuTenno;
import charactar.OnonoImoko;

public class Akihabara extends Area {
	
	public Akihabara() {
		this.name = "秋葉原";
		this.progress = 10;
		this.stRequired = 4;
		this.basicMoney = 40;
		this.bossAdjustment = 1.4;
	}

	@Override
	public int randomMoney() {
		// TODO 自動生成されたメソッド・スタブ
		return this.basicMoney + new Random().nextInt(80)+1;
	}

	@Override
	public Character dropChara() {
		// TODO 自動生成されたメソッド・スタブ
		return new NintokuTenno();
	}

	@Override
	public Character dropBoss() {
		// TODO 自動生成されたメソッド・スタブ
		return new OnonoImoko();
	}

	@Override
	public Area newArea(Player p) {
		if (p.AreaList.size() == 3) {
			p.AreaList.add(3, new Ikebukuro());
			System.out.println("新たなエリア「池袋」に出陣できるようになりました！");
		}
		return null;
	}

}
