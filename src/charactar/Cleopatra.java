package charactar;

public class Cleopatra extends Character {
	
	public Cleopatra() {
		this.name = "クレオパトラ"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "エジプト・プトレマイオス朝"; // 活躍した時代・不変
		this.physical = 370; // 闘ステータス・可変
		this.intelligence = 265; // 知ステータス・可変
		this.mental = 175; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "フィジカル・シャインⅡ"; // スキル名
		this.skillEffect = "味方の闘が30%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

}
