package charactar;

public class SoganoIruka extends Character {
	public SoganoIruka() {
		this.name = "蘇我入鹿";
		this.type = 1;
		this.rare = 2;
		this.era = "古墳時代";
//		2　540
		this.hp = 270;
		this.physical = 115;
		this.intelligence = 255;
		this.mental = 170;
		//合計値540
		this.skill = "インテリ・アップⅠ";
		this.skillEffect = "自分の知が30％アップ";
		this.skillRange = 0; // 誰の？ 0自分/1味方/2相手
		this.skillStatus = 1; // 何を？ 0闘/1知/2心/3HP
		this.skillSize = 1.3; // 効果倍率
	}

	

}
