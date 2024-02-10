package charactar;

public class Himiko extends Character {

	public Himiko() {
		this.name = "卑弥呼"; // 名前・不変
		this.type = 1; // 属性（一番高いステータス）・不変
		this.rare = 2; // レアリティ・可変
		this.era = "古墳時代"; // 活躍した時代・不変
		this.hp = 270; // HP・不変
		this.physical = 180; // 闘ステータス・可変
		this.intelligence = 120; // 知ステータス・可変
		this.mental = 240; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		
		this.skill = "メンタル・アップⅠ";
		this.skillEffect = "自分の心が30％アップ";
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 2; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率

	}

}
