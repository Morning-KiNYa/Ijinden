package charactar;

public class SoganoUmako extends Character {
	
	public SoganoUmako() {
		this.name = "蘇我馬子"; // 名前・不変
		this.type = 0; // 属性（一番高いステータス）・不変
		this.rare = 1; // レアリティ・可変
		this.era = "飛鳥時代"; // 活躍した時代・不変
		this.physical = 160; // 闘ステータス・可変
		this.intelligence = 120; // 知ステータス・可変
		this.mental = 80; // 心ステータス・可変
//		初期合計値
//		1　360
//		2　540
//		3　810
//		4　1215
//		5※1823
		this.skill = "なし";
		this.skillEffect = "";
		this.skillRange = -1; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = -1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1; // 効果倍率
	}
	

	@Override
	public double[] skill() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int attack(int type) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
