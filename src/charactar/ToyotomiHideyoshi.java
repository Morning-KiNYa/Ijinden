package charactar;

public class ToyotomiHideyoshi extends Character {
	
	public ToyotomiHideyoshi() {
		this.name = "豊臣秀吉"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 4; // レアリティ・可変
		this.era = "安土桃山時代"; // 活躍した時代・不変
		this.physical = 270; // 闘ステータス・可変
		this.intelligence = 540; // 知ステータス・可変
		this.mental = 405; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "インテリ・アップⅢ"; // スキル名
		this.skillEffect = "自分の知が90%アップ"; // スキル効果文
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.9; // 効果倍率
	}

}
