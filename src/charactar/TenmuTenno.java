package charactar;

public class TenmuTenno extends Character {
	
	public TenmuTenno() {
		this.name = "天武天皇"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 2; // レアリティ・可変
		this.era = "飛鳥時代"; // 活躍した時代・不変
		int hp; // HP・不変
		this.physical = 240; // 闘ステータス・可変
		this.intelligence = 180; // 知ステータス・可変
		this.mental = 120; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "フィジカル・アップⅠ"; // スキル名
		this.skillEffect = "自分の闘が30%アップ"; // スキル効果文
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

	@Override
	public double[] skill() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int attack(int type) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
