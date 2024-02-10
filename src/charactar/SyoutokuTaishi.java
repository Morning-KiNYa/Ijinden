package charactar;

public class SyoutokuTaishi extends Character {
	
	public SyoutokuTaishi() {
		this.name = "聖徳太子"; // 名前・不変
		this.type = 2; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "飛鳥時代"; // 活躍した時代・不変
		this.physical = 270; // 闘ステータス・可変
		this.intelligence = 180; // 知ステータス・可変
		this.mental = 360; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "メンタル・アップⅡ"; // スキル名
		this.skillEffect = "自分の心が60%アップ"; // スキル効果文
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.6; // 効果倍率
	}

}
