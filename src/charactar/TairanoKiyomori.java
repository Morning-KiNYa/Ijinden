package charactar;

public class TairanoKiyomori extends Character {
	
	public TairanoKiyomori() {
		this.name = "平清盛"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 2; // レアリティ・可変
		this.era = "平安時代"; // 活躍した時代・不変
		this.physical = 250; // 闘ステータス・可変
		this.intelligence = 175; // 知ステータス・可変
		this.mental = 115; // 心ステータス・可変
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

}
