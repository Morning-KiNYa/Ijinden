package charactar;

public class KanmuTenno extends Character {
	
	public KanmuTenno() {
		this.name = "桓武天皇"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "平安時代"; // 活躍した時代・不変
		this.physical = 180; // 闘ステータス・可変
		this.intelligence = 360; // 知ステータス・可変
		this.mental = 270; // 心ステータス・可変
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
