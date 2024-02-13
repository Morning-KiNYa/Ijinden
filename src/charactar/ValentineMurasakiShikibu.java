package charactar;

public class ValentineMurasakiShikibu extends Character {
	
	public ValentineMurasakiShikibu() {
		this.name = "【バレンタイン】紫式部"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 4; // レアリティ・可変
		this.era = "平安時代"; // 活躍した時代・不変
		this.physical = 405; // 闘ステータス・可変
		this.intelligence = 540; // 知ステータス・可変
		this.mental = 270; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "インテリ・チョコレートⅢ"; // スキル名
		this.skillEffect = "味方の知が50％アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.5; // 効果倍率
	}

}
