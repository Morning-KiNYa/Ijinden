package charactar;

public class ThomasEdison extends Character {
	
	public ThomasEdison() {
		this.name = "トーマス・エジソン"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "19世紀後半"; // 活躍した時代・不変
		this.physical = 280; // 闘ステータス・可変
		this.intelligence = 320; // 知ステータス・可変
		this.mental = 210; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "インテリ・アップⅡ"; // スキル名
		this.skillEffect = "自分の知が60%アップ"; // スキル効果文
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.6; // 効果倍率
	}

}
