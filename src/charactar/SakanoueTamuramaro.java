package charactar;

public class SakanoueTamuramaro extends Character {
	
	public SakanoueTamuramaro() {
		this.name = "坂上田村麻呂"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 1; // レアリティ・可変
		this.era = "平安時代"; // 活躍した時代・不変
		int hp; // 使わなかった。
		this.physical = 170; // 闘ステータス・可変
		this.intelligence = 115; // 知ステータス・可変
		this.mental = 75; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "なし"; // スキル名
		this.skillEffect = ""; // スキル効果文
		this.skillRange = -1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 0; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1; // 効果倍率
	}

	

}
