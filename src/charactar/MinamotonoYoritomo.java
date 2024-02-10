package charactar;

public class MinamotonoYoritomo extends Character {
	
	public MinamotonoYoritomo() {
		this.name = "源頼朝"; // 名前・不変
		this.type = 2; // 属性（一番高いステータス）・不変
		this.rare = 2; // レアリティ・可変
		this.era = "鎌倉時代"; // 活躍した時代・不変
		this.physical = 175; // 闘ステータス・可変
		this.intelligence = 110; // 知ステータス・可変
		this.mental = 255; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "メンタル・シャインⅠ"; // スキル名
		this.skillEffect = "味方の心が10%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.1; // 効果倍率
	}

}
