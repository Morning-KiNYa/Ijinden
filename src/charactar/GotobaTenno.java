package charactar;

public class GotobaTenno extends Character {
	
	public GotobaTenno() {
	
	this.name = "後鳥羽天皇"; // 名前・不変
	this.type = 0; // 属性（一番高いステータス）・不変
	this.rare = 1; // レアリティ・可変
	this.era = "鎌倉時代"; // 活躍した時代・不変
	this.physical = 180; // 闘ステータス・可変
	this.intelligence = 110; // 知ステータス・可変
	this.mental = 70; // 心ステータス・可変
//	初期合計値
//	1　360
//	2　540
//	3　810
//	4　1215
//	5※1823
	
	this.skill = "なし"; // スキル名
	this.skillEffect = " - "; // スキル効果文
	this.skillRange = -1; // 誰の？ 0自分/1味方/2相手
	this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
	this.skillSize = 1; // 効果倍率
	
	}

}
