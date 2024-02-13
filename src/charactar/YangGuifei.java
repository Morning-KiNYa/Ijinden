package charactar;

public class YangGuifei extends Character {
	
	public YangGuifei() {
		this.name = "楊貴妃"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 3; // レアリティ・可変
		this.era = "中国・唐"; // 活躍した時代・不変
		this.physical = 175; // 闘ステータス・可変
		this.intelligence = 370; // 知ステータス・可変
		this.mental = 265; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "インテリ・シャインⅡ"; // スキル名
		this.skillEffect = "味方の知が30%アップ"; // スキル効果文
		this.skillRange = 1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

}
