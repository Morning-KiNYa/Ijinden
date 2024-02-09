package charactar;

public class NakatominoKamatari extends Character {
	
	public NakatominoKamatari() {
		this.name = "中臣鎌足";
		this.type = 2;
		this.rare = 2;
		this.era = "古墳時代";
//		2　540
		this.hp = 270;
		this.physical = 170;
		this.intelligence = 115;
		this.mental = 255;
		//合計値540
		this.skill = "メンタル・アップⅠ";
		this.skillEffect = "自分の心が30％アップ";
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果量
	}

	@Override
	public double[] skill() {
		double range = 0;
		// 誰の？ 0/自分 1/味方 2/相手
		double status = 2;
		// 何を？ 0/闘 1/知 2/心
		double size = 1.3;
		// どれくらい変動させる？
		double[] skill = {range,status,size};
		return skill;
	}

	@Override
	public int attack(int type) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
