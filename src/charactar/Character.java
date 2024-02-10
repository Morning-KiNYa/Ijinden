package charactar;
public abstract class Character {

	public String name; // 名前・不変
	public int type; // 属性（一番高いステータス）・不変
	public int rare; // レアリティ・可変
	public String era; // 活躍した時代・不変
	int hp; // 使わなかった。
	public int physical; // 闘ステータス・可変
	public int intelligence; // 知ステータス・可変
	public int mental; // 心ステータス・可変
//	初期合計値
//	1　360
//	2　540
//	3　810
//	4　1215
//	5※1823
	
	public String skill; // スキル名
	public String skillEffect; // スキル効果文
	public int skillRange; // 誰の？ 0自分/1味方/2相手
	public int skillStatus; // 何を？ 0闘/1知/2心/3HP
	public double skillSize; // 効果倍率

	public void displayStatus() {
		String[] types = {"闘","知","心"};
		System.out.println("-------------------------------------------------");
		System.out.println("名前：" + this.name+" / 活躍した時代："+this.era);
		System.out.println("属性："+types[this.type]+" / レアリティ：☆"+this.rare);
		System.out.println("ステータス：闘 " + this.physical + " / 知 " + this.intelligence + " / 心 " + this.mental);
		System.out.println("スキル:" + this.skill);
		System.out.println("(" + this.skillEffect + ")");
		System.out.println("-------------------------------------------------");
	}

	public void rarityUp() {
		if (this.rare >= 5) {
			System.out.println("これ以上、レアリティはあがりません");
		} else {
			this.rare++;
			System.out.println(this.name+"のレアリティが上がりました！");
			double physicalUP = this.physical*0.3;
			double intelliUP = this.intelligence*0.3;
			double mentalUP = this.mental*0.3;
			this.physical += (int)physicalUP;
			this.intelligence += (int)intelliUP;
			this.mental += (int)mentalUP;
			System.out.println("レアリティ：☆"+this.rare+"(+1)");
			System.out.println("闘:"+this.physical+"(+"+(int)physicalUP+")");
			System.out.println("知:"+this.intelligence+"(+"+(int)intelliUP+")");
			System.out.println("心:"+this.mental+"(+"+(int)mentalUP+")");
		}
	}

}
