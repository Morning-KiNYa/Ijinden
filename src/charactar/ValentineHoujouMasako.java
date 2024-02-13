package charactar;

public class ValentineHoujouMasako extends Character {
	
	public ValentineHoujouMasako() {
		this.name = "【バレンタイン】北条政子"; // 名前・不変
		this.type = 2; // 属性（一番高いステータス）・不変
		this.rare = 4; // レアリティ・可変
		this.era = "鎌倉時代"; // 活躍した時代・不変
		this.physical = 270; // 闘ステータス・可変
		this.intelligence = 405; // 知ステータス・可変
		this.mental = 540; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "メンタル・チョコレートⅢ"; // スキル名
		this.skillEffect = "味方の心が50%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.5; // 効果倍率
	}

}
