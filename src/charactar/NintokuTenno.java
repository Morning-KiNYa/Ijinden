package charactar;

public class NintokuTenno extends Character {
	
	public NintokuTenno() {
		this.name = "仁徳天皇"; // 名前・不変
		this.type = 2; // 属性（一番高いステータス）・不変
		this.rare = 1; // レアリティ・可変
		this.era = "古墳時代"; // 活躍した時代・不変
		int hp; // 使わなかった。
		this.physical = 120; // 闘ステータス・可変
		this.intelligence = 80; // 知ステータス・可変
		this.mental = 160; // 心ステータス・可変
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
