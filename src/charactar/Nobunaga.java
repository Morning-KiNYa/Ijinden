package charactar;

public class Nobunaga extends Character {
	
	public Nobunaga() {
		this.name = "織田信長";
		this.type = 0;
		this.rare = 3;
		this.era = "安土桃山時代";
		this.hp = 120;
		this.physical = 360;
		this.intelligence = 270;
		this.mental = 180;
		//合計値810
		this.skill = "フィジカル・アップⅡ";
		this.skillEffect = "自分の闘が60％アップ";
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.6; // 効果倍率
	}

	@Override
	public double[] skill() {
		double range = 0;
		// 誰の？
		double status = 0;
		// 何を？
		double size = 0;
		// どれくらい変動させる？
		double[] skill = {range,status,size};
		return skill;
	}

	@Override
	public int attack(int type) {
		if (type == 1) {
			double attack = this.physical*1.6;
			return (int)attack;
		}else if (type == 2) {
			return this.intelligence;
		}else if (type == 3) {
			return this.mental;
		}else {
		return 0;
		}
	}

}
