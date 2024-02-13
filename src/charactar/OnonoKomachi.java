package charactar;

public class OnonoKomachi extends Character {
	public OnonoKomachi() {
		this.name = "小野小町"; // 名前・不変
		this.type = 2; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "平安時代・前期"; // 活躍した時代・不変
		this.physical = 265; // 闘ステータス・可変
		this.intelligence = 175; // 知ステータス・可変
		this.mental = 370; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "メンタル・シャインⅡ"; // スキル名
		this.skillEffect = "味方の心が30%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

}
