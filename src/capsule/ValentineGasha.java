package capsule;

import java.util.Random;

import charactar.ValentineHoujouMasako;
import charactar.ValentineJeanneDarc;
import charactar.ValentineMurasakiShikibu;

public class ValentineGasha extends PermanentGasha {
	
	public ValentineGasha() {
		super();
		this.name = "[期間限定]バレンタインガシャ";
		this.price = 2500;
		this.message = "※10回引くと最後の1枚は☆3確定！\n"
				+ "[開催期間]2024年2月5日 15:00～2024年2月16日 14:59";
		
		capsuleSet();
		
		this.pickUpCh = this.permanent4.get(new Random().nextInt(3)+3);
	}
	
	public void capsuleSet() {
		super.capsuleSet();
		// 限定キャラを追加
		this.permanent4.add(new ValentineJeanneDarc());
		this.permanent4.add(new ValentineMurasakiShikibu());
		this.permanent4.add(new ValentineHoujouMasako());
	}

}
