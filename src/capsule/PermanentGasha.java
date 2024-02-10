package capsule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import charactar.Character;
import charactar.HoujouTokiyori;
import charactar.HoujouYasutoki;
import charactar.KanmuTenno;
import charactar.MinamotonoYoritomo;
import charactar.NakanoOenoOji;
import charactar.NakatominoKamatari;
import charactar.OdaNobunaga;
import charactar.SoganoIruka;
import charactar.SyoutokuTaishi;
import charactar.TokugawaIeyasu;
import charactar.ToyotomiHideyoshi;
import charactar.YamatoTakeru;

public class PermanentGasha extends Gasha {
	List<Character> permanent2 = new ArrayList<Character>();
	List<Character> permanent3 = new ArrayList<Character>();
	List<Character> permanent4 = new ArrayList<Character>();

	public PermanentGasha() {
		this.name = "[常設]偉人ガシャ";
		this.price = 2500;
		this.message = "※10回引くと最後の1枚は☆3確定！";
		
		capsuleSet();

		this.pickUpCh = this.permanent4.get(new Random().nextInt(this.permanent4.size()));
	}

	public void capsuleSet() {
		// 抽選しなおすために一度リストを空にする
		this.permanent2.clear();
		this.permanent3.clear();
		this.permanent4.clear();

		// ☆2
		this.permanent2.add(new NakanoOenoOji());
		this.permanent2.add(new SoganoIruka());
		this.permanent2.add(new NakatominoKamatari());
		this.permanent2.add(new HoujouTokiyori());
		this.permanent2.add(new HoujouYasutoki());
		this.permanent2.add(new MinamotonoYoritomo());

		// ☆3
		this.permanent3.add(new YamatoTakeru());
		this.permanent3.add(new KanmuTenno());
		this.permanent3.add(new SyoutokuTaishi());

		// ☆4
		this.permanent4.add(new OdaNobunaga());
		this.permanent4.add(new ToyotomiHideyoshi());
		this.permanent4.add(new TokugawaIeyasu());
	}

	public Character Gasha1() {
		capsuleSet();
		Character obt = null;
		int rare = new Random().nextInt(100) + 1;
		if (rare < 89) {
			int lottery = new Random().nextInt(this.permanent2.size());
			obt = this.permanent2.get(lottery);
		} else if (rare < 96) {
			int lottery = new Random().nextInt(this.permanent3.size());
			obt = this.permanent3.get(lottery);
		} else if (rare < 100) {
			int lottery = new Random().nextInt(this.permanent4.size());
			obt = this.permanent4.get(lottery);
		}
		return obt;
	}

	public Character Gasha10() {
		capsuleSet();
		Character obt = null;
		int rare = new Random().nextInt(100) + 1;
		if (rare < 96) {
			int lottery = new Random().nextInt(this.permanent3.size());
			obt = this.permanent3.get(lottery);
		} else if (rare < 100) {
			int lottery = new Random().nextInt(this.permanent4.size());
			obt = this.permanent4.get(lottery);
		}
		return obt;
	}

}
