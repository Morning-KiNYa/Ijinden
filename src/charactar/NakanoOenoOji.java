package charactar;

public class NakanoOenoOji extends Character {
	
	public NakanoOenoOji() {
		this.name = "中大兄皇子";
		this.type = 0;
		this.rare = 2;
		this.era = "古墳時代";
//		2　540
		this.hp = 270;
		this.physical = 255;
		this.intelligence = 170;
		this.mental = 115;
		//合計値540
		this.skill = "フィジカル・アップⅠ";
		this.skillEffect = "自分の闘が30％アップ";
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

	@Override
	public double[] skill() {
		double range = 0;
		// 誰の？ 0/自分 1/味方 2/相手
		double status = 0;
		// 何を？ 0/闘 1/知 2/心
		double size = 1.3;
		// どれくらい変動させる？
		double[] skill = {range,status,size};
		return skill;
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public int attack(int type) {
		int damage = 0;
		/* ダメージ計算 */
		return damage;
	}
	
}
