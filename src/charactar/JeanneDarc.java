package charactar;

public class JeanneDarc extends Character {
	
	public JeanneDarc() {
		this.name = "ジャンヌ・ダルク"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "15世紀前半"; // 活躍した時代・不変
		this.physical = 320; // 闘ステータス・可変
		this.intelligence = 210; // 知ステータス・可変
		this.mental = 280; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "フィジカル・アップⅡ"; // スキル名
		this.skillEffect = "自分の闘が60%アップ"; // スキル効果文
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.6; // 効果倍率
	}

}
