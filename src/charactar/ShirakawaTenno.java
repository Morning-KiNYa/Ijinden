package charactar;

public class ShirakawaTenno extends Character {
	
	public ShirakawaTenno() {
		this.name = "白河天皇"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 2; // レアリティ・可変
		this.era = "平安時代"; // 活躍した時代・不変
		this.physical = 170; // 闘ステータス・可変
		this.intelligence = 190; // 知ステータス・可変
		this.mental = 180; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "インテリ・シャインⅠ"; // スキル名
		this.skillEffect = "味方の知が10%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.1; // 効果倍率
	}

	

}
