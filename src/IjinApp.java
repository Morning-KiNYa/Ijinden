import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import capsule.Gasha;
import capsule.PermanentGasha;
import capsule.ValentineGasha;
import charactar.Character;
import charactar.NakanoOenoOji;
import charactar.NakatominoKamatari;
import charactar.SoganoIruka;
import gsonsave.GsonSave;

public class IjinApp {

	public static void main(String[] args) throws Exception {
		String[] types = { "闘", "知", "心" };
		Player p;

		System.out.println("*****偉人伝*****");
		while (true) {
			System.out.print("1.はじめから / 2.つづきから >> ");
			int selectCont = new Scanner(System.in).nextInt();
			switch (selectCont) {
			case 1:
				System.out.println("");
				Thread.sleep(1000);
				System.out.println("突如として出現した時空の歪みから現れたのは、");
				Thread.sleep(3000);
				System.out.println("時代を超えて集まった名だたる偉人たち……");
				Thread.sleep(3000);
				System.out.println("現れた偉人達によって支配された都市へ出陣し、");
				Thread.sleep(3000);
				System.out.println("倒した偉人の力をカードに封印して仲間に！");
				Thread.sleep(3000);
				System.out.println("集めた偉人たちを従え、現代の天下統一を目指しましょう！");
				Thread.sleep(3000);
				p = new Player();
				break;
			case 2:
				p = load();
				break;
			default:
				System.out.println("正しい数字を入力してください");
				continue;
			}

			while (true) {
				if (p.getStamina()<=0) {
					System.out.println("");
					System.out.println((p.getMoney()/2)+"円支払ってスタミナを全回復しました！");
					p.setMoney(-(p.getMoney()/2));
					p.setStamina(p.getMaxStamina());
				}
				System.out.println("");
				System.out.println("***MENU***");
				System.out.println("1.出陣 / 2.ガシャ / 3.カード一覧 / 4.編成 / 5.修行");
				System.out.print("（0でセーブして終了） >> ");
				int selectMenu = new java.util.Scanner(System.in).nextInt();
				switch (selectMenu) {
				case 1:
					work(p);
					break;
				case 2:
					capsule(p);
					break;
				case 3:
					while (true) {
						System.out.println("");
						System.out.println("仲間になった偉人の詳細を確認できます");
						System.out.println("-1・・・メニューに戻る");
						System.out.println("-9・・・カード売却");
						int selectCh = displayMyCharacters(p.MyCharacters);

						if (selectCh == -1) {
							break;
						} else if (selectCh == -9) {
							saleCard(p);
							continue;
						} else {
							p.MyCharacters.get(selectCh).displayStatus();
							System.out.println("カード一覧に戻りますか？");
							System.out.print("1.はい / 2.いいえ >> ");
							int selectReturn = new Scanner(System.in).nextInt();
							switch (selectReturn) {
							case 1:
								continue;
							case 2:
								break;
							default:
								System.out.println("正しい数字が入力されなかったため、メニューに戻ります");
								break;
							}
							break;
						}
					}
					break;
				case 4:
					organization(p);
					break;
				case 5:
					training(p);
					break;
				case 999:
					p.setMoney(99999999);
					break;
				case 0:
					System.out.println("データを保存して終了します");
					/*セーブ処理*/
					save(p);
					System.out.println("データを保存が完了しました");
					return;
				default:
					System.out.println("正しい番号を入力してください");
					break;
				}
			}
		}
	}

	public static int displayMyCharacters(List<Character> list) {
		/*ここにリスト表示処理*/
		if (list.size() <= 0) {
			System.out.println("仲間の偉人がいません");
			return -1;
		}
		for (Character c : list) {
			System.out.println(list.indexOf(c) + "・・・[☆" + c.rare + "]" + c.name);
		}
		System.out.print("偉人を選択してください >> ");
		int chNum = new Scanner(System.in).nextInt();
		if (chNum >= list.size()) {
			System.out.println("正しい数字を入力してください");
			return -1;
		}
		return chNum;
	}

	public static void saleCard(Player p) {
		while (true) {
			System.out.println("");
			System.out.println("売却する偉人カードを選択してください");
			System.out.println("-1・・・戻る");
			int select = displayMyCharacters(p.MyCharacters);
			if (select == -1) {
				return;
			}
			p.MyCharacters.get(select).displayStatus();
			System.out.println("この偉人カードを売却しますか？（売却価格:" + (p.MyCharacters.get(select).rare * 120) + "円）");
			System.out.print("1.はい / 2.いいえ >> ");
			int selectSale = new Scanner(System.in).nextInt();
			for (Character c : p.Units) {
				if (c == p.MyCharacters.get(selectSale)) {
					System.out.println("編成されている偉人カードは売却できません");
					return;
				}
			}
			switch (selectSale) {
			case 1:
				int salePrice = (p.MyCharacters.get(select).rare * 120);
				p.setMoney(salePrice);
				System.out.println(p.MyCharacters.get(select).name + "を売却しました");
				System.out.println("お金：" + p.getMoney() + "円（+" + salePrice + "円）");
				p.MyCharacters.remove(select);
				break;
			case 2:
				break;
			default:
				return;
			}
			return;
		}
	}

	public static void tutorial(Player p) {
		System.out.println("");
		System.out.println("初めての出陣に際し、あなたに力を貸してくれる偉人がいるようです。");
		System.out.println("");
		while (true) {
			System.out.println("仲間にする偉人を1人選んでください。");
			System.out.print("1.中大兄皇子 / 2.蘇我入鹿 / 3.中臣鎌足 >> ");
			int firstMember = new java.util.Scanner(System.in).nextInt();
			Character fm = null;
			while (true) {
				switch (firstMember) {
				case 1:
					fm = new NakanoOenoOji();
					break;
				case 2:
					fm = new SoganoIruka();
					break;
				case 3:
					fm = new NakatominoKamatari();
					break;
				default:
					System.out.println("");
					System.out.println("正しい数字が入力されなかったため、ランダムで選ばれます");
					int fmError = new Random().nextInt(3);
					if (fmError == 0) {
						fm = new NakanoOenoOji();
					} else if (fmError == 1) {
						fm = new SoganoIruka();
					} else if (fmError == 2) {
						fm = new NakatominoKamatari();
					}
					break;
				}
				fm.displayStatus();
				System.out.println("この偉人と出陣しますか？");
				System.out.print("1.はい / 2.いいえ >> ");
				int selectNum = new java.util.Scanner(System.in).nextInt();
				switch (selectNum) {
				case 1:
					p.MyCharacters.add(fm);
					System.out.println(fm.name + "が仲間になりました！");
					p.Units.add(fm);
					p.AreaList.add(new Harajuku());
					return;
				case 2:
					System.out.println("");
					break;
				}
				break;

			}

		}

	}

	public static void work(Player p) throws Exception {
		System.out.println("");
		System.out.println("敵陣へ赴き、偉人カードやお金を集めましょう");
		System.out.println("現在のスタミナ："+p.getStamina()+"/"+p.getMaxStamina());
		if (p.MyCharacters.size() <= 0) { // 仲間が一人もいなければ
			tutorial(p);
		}
		System.out.println("");
		System.out.println("出陣エリア一覧");
		System.out.println("-1・・・メニューに戻る");
		for (Area s : p.AreaList) {
			System.out.println(p.AreaList.indexOf(s) + "・・・" + s.name + "(消費スタミナ:" + s.stRequired + " 獲得金:"
					+ s.basicMoney + "～？）");
		}

		System.out.print("出陣するエリアを選択してください >> ");
		int select = new java.util.Scanner(System.in).nextInt();
		if (select == -1) {
			return;
		}
		Area wa = p.AreaList.get(select);
		System.out.println("");
		System.out.println(wa.name + "エリアへ出陣します");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < 100; i += wa.progress) {
			if ((p.getStamina() - wa.stRequired) < 0) {
				System.out.println("スタミナが不足したため帰ります。");
				return;
			}
			if (p.getStamina() == 0) {
				System.out.println("スタミナがなくなったため帰ります。");
				return;
			}
			int randomMoney = wa.randomMoney();
			p.setStamina(-1 * wa.stRequired);
			p.setMoney(randomMoney);
			System.out.println("進捗："+i+"/100%");
			System.out.println(
					"スタミナ：" + p.getStamina() + "/" + p.getMaxStamina() + "(" + (-1 * wa.stRequired) + ") / お金："
							+ p.getMoney()
							+ "(+"
							+ randomMoney + ")");

			int dorop = new java.util.Random().nextInt(3);
			if (dorop == 0) {
				//ドロップなし
			} else if (dorop == 1) {
				p.MyCharacters.add(wa.dropChara());
				System.out.println(wa.dropChara().name + "が仲間になった！");
			} else if (dorop == 2) {
				//スタミナ回復
				p.setStamina(Math.abs(wa.stRequired));
				System.out.println("援軍の差し入れでスタミナが" + Math.abs(wa.stRequired) + "回復！");
			}
			System.out.println("-------------------------------------------------");
			Thread.sleep(1000);
		}
		System.out.println("進捗：100/100%");
		System.out.println("STAGE CLEAR!!");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("*****************エリアBOSS登場*****************");
		Character Boss = wa.dropBoss();
		wa.dropBoss().displayStatus();
		System.out.println("BOSSと戦いますか？");
		System.out.print("1.はい / 2.いいえ >> ");
		int bossSelect = new Scanner(System.in).nextInt();
		System.out.println("");
		switch (bossSelect) {
		case 1:
			boolean result = areaBoss(p, wa);
			System.out.println("");
			if (result == true) {
				p.setMaxStamina(wa.stRequired);
				System.out.println("勝利の記念に、最大スタミナ+" + wa.stRequired);
				p.setStamina(p.getMaxStamina());
				System.out.println("スタミナが全回復しました");
				wa.newArea(p);
				return;
			} else if (result == false) {
				return;
			}
		case 2:
			System.out.println("メニューに戻ります");
			return;
		}

	}

	public static boolean areaBoss(Player p, Area wa) throws Exception {
		//自ユニットのステータスを計算
		//よく考えたら繰り返し処理で1人ずつやればよかったけどもう書いちゃったからいいや

		//個人のステ取得と、自分にしか効果が乗らないスキル処理
		int[] sta0 = { p.Units.get(0).physical, p.Units.get(0).intelligence, p.Units.get(0).mental }; //1人目のステ取得
		if (p.Units.get(0).skillRange == 0) { //自分のステにバフがかかるスキル持っているなら
			double temp0 = sta0[p.Units.get(0).skillStatus] * p.Units.get(0).skillSize; // どのステに効果があるのかと効果量を取得して乗算
			sta0[p.Units.get(0).skillStatus] = (int) temp0; // 計算結果と入れ替え
			System.out.println("味方のスキル発動：" + p.Units.get(0).skill + "\n(" + p.Units.get(0).skillEffect + ")"); // スキル発動メッセージ
		}
		Thread.sleep(1000);

		int[] sta1 = new int[3];
		if (p.Units.size() >= 2) { //2人目がいるならステ取得
			sta1 = new int[] { p.Units.get(1).physical, p.Units.get(1).intelligence, p.Units.get(1).mental };
			if (p.Units.get(1).skillRange == 0) { //自分のステにバフがかかるスキル持っているなら
				double temp1 = sta1[p.Units.get(1).skillStatus] * p.Units.get(1).skillSize; // どのステに効果があるのかと効果量を取得して乗算
				sta0[p.Units.get(1).skillStatus] = (int) temp1; // 計算結果と入れ替え
				System.out.println("味方のスキル発動：" + p.Units.get(1).skill + "\n(" + p.Units.get(1).skillEffect + ")"); // スキル発動メッセージ
			}
			Thread.sleep(1000);

		}

		int[] sta2 = new int[3];
		if (p.Units.size() == 3) { //3人目がいるならステ取得
			sta2 = new int[] { p.Units.get(2).physical, p.Units.get(2).intelligence, p.Units.get(2).mental };
			if (p.Units.get(2).skillRange == 0) { //自分のステにバフがかかるスキル持っているなら
				double temp2 = sta2[p.Units.get(2).skillStatus] * p.Units.get(2).skillSize; // どのステに効果があるのかと効果量を取得して乗算
				sta2[p.Units.get(2).skillStatus] = (int) temp2; // 計算結果と入れ替え
				System.out.println("味方のスキル発動：" + p.Units.get(2).skill + "\n(" + p.Units.get(2).skillEffect + ")"); // スキル発動メッセージ
			}
			Thread.sleep(1000);
		}

		//総合ステータスを算出
		int totalPh = sta0[0] + sta1[0] + sta2[0];
		int totalIn = sta0[1] + sta1[1] + sta2[1];
		int totalMe = sta0[2] + sta1[2] + sta2[2];
		int[] totalSta = { totalPh, totalIn, totalMe };

		//味方全員に効果があるスキル処理
		if (p.Units.get(0).skillRange == 1) { //1人目が味方全員にバフがかかるスキル持っているなら
			double totalTemp0 = totalSta[p.Units.get(0).skillStatus] * p.Units.get(0).skillSize; // どのステに効果があるのかと効果量を取得して乗算
			totalSta[p.Units.get(0).skillStatus] = (int) totalTemp0; // 計算結果と入れ替え
			System.out.println("味方のスキル発動：" + p.Units.get(0).skill + "\n(" + p.Units.get(0).skillEffect + ")"); // スキル発動メッセー
			Thread.sleep(1000);
		}

		if (p.Units.size() >= 2 && p.Units.get(1).skillRange == 1) { //2人目が存在し、味方全員にバフがかかるスキル持っているなら
			double totalTemp1 = totalSta[p.Units.get(1).skillStatus] * p.Units.get(1).skillSize; // どのステに効果があるのかと効果量を取得して乗算
			totalSta[p.Units.get(1).skillStatus] = (int) totalTemp1; // 計算結果と入れ替え
			System.out.println("味方のスキル発動：" + p.Units.get(1).skill + "\n(" + p.Units.get(1).skillEffect + ")"); // スキル発動メッセー
			Thread.sleep(1000);
		}

		if (p.Units.size() >= 3 && p.Units.get(2).skillRange == 1) { //3人目が存在し、味方全員にバフがかかるスキル持っているなら
			double totalTemp2 = totalSta[p.Units.get(2).skillStatus] * p.Units.get(2).skillSize; // どのステに効果があるのかと効果量を取得して乗算
			totalSta[p.Units.get(2).skillStatus] = (int) totalTemp2; // 計算結果と入れ替え
			System.out.println("味方のスキル発動：" + p.Units.get(2).skill + "\n(" + p.Units.get(2).skillEffect + ")"); // スキル発動メッセー
			Thread.sleep(1000);
		}
		System.out.println("");

		//BOSS側のスキル処理
		//個人のステ取得と、自分にしか効果が乗らないスキル処理
		int[] bossSta = { wa.dropBoss().physical, wa.dropBoss().intelligence, wa.dropBoss().mental }; //ボスのステ取得
		if (wa.dropBoss().skillRange == 0 || wa.dropBoss().skillRange == 1) { //自分か味方のステにバフがかかるスキル持っているなら
			double tempBoss = bossSta[wa.dropBoss().skillStatus] * wa.dropBoss().skillSize; // どのステに効果があるのかと効果量を取得して乗算
			bossSta[wa.dropBoss().skillStatus] = (int) tempBoss; // 計算結果と入れ替え
			System.out.println("敵のスキル発動：" + wa.dropBoss().skill + "\n(" + wa.dropBoss().skillEffect + ")"); // スキル発動メッセージ
		}
		Thread.sleep(1000);
		System.out.println("敵は張り切っている！：全てのステータスが" + wa.bossAdjustment + "倍！");
		Thread.sleep(3000);

		int MyTotalSta = totalSta[0] + totalSta[1] + totalSta[2];
		int BossTotalSta = (int) ((int) (bossSta[0] + bossSta[1] + bossSta[2]) * wa.bossAdjustment);

		System.out.println("");
		System.out.print("勝敗は");
		Thread.sleep(1000);
		System.out.print("…");
		Thread.sleep(1000);
		System.out.print("…");
		Thread.sleep(1000);
		System.out.print("?!");
		Thread.sleep(3000);
		System.out.println("");
		System.out.println("自陣戦闘力：" + MyTotalSta);
		Thread.sleep(3000);
		System.out.println("敵陣戦闘力：" + BossTotalSta);
		System.out.println("");
		Thread.sleep(3000);

		if (MyTotalSta > BossTotalSta) {
			System.out.println("勝利！！");
			p.MyCharacters.add(wa.dropBoss());
			System.out.println("[☆" + wa.dropBoss().rare + "]" + wa.dropBoss().name + "が仲間になりました！");
			return true;
		} else if (MyTotalSta == BossTotalSta) {
			System.out.println("引き分け");
			System.out.println("また挑戦しましょう");
		} else if (MyTotalSta < BossTotalSta) {
			System.out.println("敗北……");
			System.out.println("また挑戦しましょう");
		}

		return false;
	}

	public static void training(Player p) {
		if (p.MyCharacters.size() <= 0) {
			System.out.println("まずは出陣して仲間の偉人を集めましょう");
			return;
		}

		System.out.println("");
		System.out.println("同じ偉人を修行パートナーにして、\n能力を高めることができます");
		System.out.println("すべての偉人を最大☆5まで育成することができます");
		while (true) {
			System.out.println("");
			System.out.println("修行する偉人を選んでください");
			System.out.println("-1・・・メニューに戻る");
			int selectCh1 = displayMyCharacters(p.MyCharacters);
			if (selectCh1 == -1) {
				return;
			}
			System.out.println("");
			System.out.println("修行のパートナーになる偉人を選んでください");
			System.out.println("-1・・・戻る");
			int selectCh2 = displayMyCharacters(p.MyCharacters);
			if (selectCh2 == -1) {
				break;
			}
			if (selectCh1 == selectCh2) {
				System.out.println("全く同じ偉人カードが選択されました");
				break;
			}
			if (p.MyCharacters.get(selectCh1).name.equals(p.MyCharacters.get(selectCh2).name)) {
				System.out.println();
				System.out.println("修行する偉人:");
				p.MyCharacters.get(selectCh1).displayStatus();
				System.out.println("修行パートナー：");
				p.MyCharacters.get(selectCh2).displayStatus();
				System.out.println("※パートナーは修行後にいなくなります");
				System.out.println("修行を行いますか？");
				System.out.print("1.はい / 2.いいえ >> ");
				int selectLesson = new Scanner(System.in).nextInt();
				System.out.println("");
				switch (selectLesson) {
				case 1:
					boolean lesson = p.MyCharacters.get(selectCh1).rarityUp();
					if (lesson == true) {
					p.MyCharacters.remove(selectCh2);
					} else if (lesson == false) {
					}
					break;
				case 2:
					break;
				default:
					System.out.println("正しい数字を入力してください");
					break;
				}
			} else {
				System.out.println("同じ種類の偉人カードを選択してください");
				break;
			}

		}
	}

	public static void organization(Player p) {
		if (p.MyCharacters.size() <= 0) {
			System.out.println("まずは出陣して仲間の偉人を集めましょう");
			return;
		}

		System.out.println("");
		System.out.println("共に出陣する偉人を編成します");
		while (true) {

			System.out.println("");
			System.out.println("現在の編成：");
			System.out.println("-1・・・メニューに戻る");
			for (int i = 0; i < p.Units.size(); i++) {
				if (p.Units.get(i) == null) {
					System.out.println(i + "・・・（編成されていません）");
				} else {
					System.out.println(i + "・・・[☆" + p.Units.get(i).rare + "]" + p.Units.get(i).name);
				}
			}
			if (p.Units.size() == 1) {
				System.out.println("1・・・（編成されていません）");
				System.out.println("2・・・（編成されていません）");
			} else if (p.Units.size() == 2) {
				System.out.println("2・・・（編成されていません）");
			}
			System.out.print("入れ替える偉人を選んでください >> ");
			int selectMem = new Scanner(System.in).nextInt();
			if (selectMem == -1) {
				return;
			}
			if (selectMem > 2) {
				System.out.println("正しい数字を入力してください");
				break;
			}
			System.out.println("");
			System.out.println("新しく参加する偉人を選んでください");
			int selectMemNew = displayMyCharacters(p.MyCharacters);
			boolean duplication = true;
			// 重複したインスタンスが選ばれたら、追加は行わず配置のみ上書き
			for (int i = 0; i < p.Units.size(); i++) {
				if (p.MyCharacters.get(selectMemNew).equals(p.Units.get(i))) {
					if (p.Units.size() <= selectMem) {
						p.Units.add(selectMem, p.MyCharacters.get(selectMemNew));
						p.Units.remove(i);
					} else {
						p.Units.set(selectMem, p.MyCharacters.get(selectMemNew));
						p.Units.remove(i);
					}
					duplication = false;
					break;
				}
			}
			if (duplication) {
				if (p.Units.size() - 1 < selectMem) {
					p.Units.add(p.MyCharacters.get(selectMemNew));
				} else {
					p.Units.set(selectMem, p.MyCharacters.get(selectMemNew));
				}

			} else if (duplication = false) {

			}
			System.out.println("編成を変更しました");
			System.out.println("");
			System.out.println("編成を続けますか？");
			System.out.print("1.はい / 2.いいえ >> ");
			int selectCont = new Scanner(System.in).nextInt();
			switch (selectCont) {
			case 1:
				break;
			case 2:
				return;
			default:
				System.out.println("正しい数字を入力してください");
				break;
			}

		}
	}

	public static void save(Player p) {
		GsonSave<Character> SaveMyCharacters = new GsonSave<Character>("MC.json");
		SaveMyCharacters.save(p.MyCharacters);
		GsonSave<Area> SaveMyArea = new GsonSave<Area>("MA.json");
		SaveMyArea.save(p.AreaList);
		GsonSave<Character> SaveMyUnits = new GsonSave<Character>("MU.json");
		SaveMyUnits.save(p.Units);

		String path = "player.csv";
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"))) {
			String line = String.format("%d,%d,%d", p.getMoney(), p.getStamina(), p.getMaxStamina());
			bw.write(line);

		} catch (IOException e) {
			System.out.println("セーブに失敗しました");
		}
		return;
	}

	public static Player load() {
		Player p;
		String path = "player.csv";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
			String line = null;
			line = br.readLine();
			String[] datas = line.split(",");

			int money = Integer.parseInt(datas[0]);
			int stamina = Integer.parseInt(datas[1]);
			int maxStamina = Integer.parseInt(datas[2]);

			p = new Player(money, stamina, maxStamina);

			var LoadMyCharacters = new GsonSave<Character>("MC.json");
			p.MyCharacters = LoadMyCharacters.loadList();
			var LoadMyUnits = new GsonSave<Character>("MU.json");
			p.Units = LoadMyUnits.loadList();
			var LoadMyArea = new GsonSave<Area>("MA.json");
			p.AreaList = LoadMyArea.loadList();

		} catch (IOException e) {
			return null;
		}

		return p;
	}

	public static void capsule(Player p) throws Exception {
		if (p.MyCharacters.size() <= 0) {
			System.out.println("");
			System.out.println("まずは出陣して仲間の偉人を集めましょう");
			return;
		}
		while (true) {
			LocalDateTime now = LocalDateTime.now();
			List<Gasha> GashaList = new ArrayList<Gasha>();
			GashaList.add(new PermanentGasha());

			//期間限定ガシャ
			LocalDateTime limitedStart = LocalDateTime.of(2024, 2, 5, 15, 0, 0);
			LocalDateTime limitedEnd = LocalDateTime.of(2024, 2, 16, 15, 0, 0);
			if (now.isAfter(limitedStart) && now.isBefore(limitedEnd)) {
				GashaList.add(new ValentineGasha());
			}
			System.out.println("");
			System.out.println("開催中のガシャ：");
			System.out.println("-------------------------------------------------");
			for (int i = 0; i < GashaList.size(); i++) {
				System.out.println(i + "・・・" + GashaList.get(i).name);
			}
			System.out.println("-1・・・メニューに戻る");
			System.out.println("-------------------------------------------------");
			System.out.print("確認したいガシャを選んでください >> ");
			int selectGasha = new Scanner(System.in).nextInt();
			if (selectGasha == -1) {
				return;
			}
			while (true) {
				System.out.println("");
				System.out.println(GashaList.get(selectGasha).name);
				System.out.println("目玉カード：");
				GashaList.get(selectGasha).pickUpCh.displayStatus();
				System.out.println("[価格]1回 " + GashaList.get(selectGasha).price + "円 / 10回 "
						+ (GashaList.get(selectGasha).price * 10) + "円 (現在の所持金：" + p.getMoney() + "円");
				if (GashaList.get(selectGasha).message != null) {
					System.out.println(GashaList.get(selectGasha).message);
				}
				System.out.println("1.1回引く / 2.10回引く / -1.戻る");
				System.out.print("このガシャを引きますか？ >> ");
				int select = new Scanner(System.in).nextInt();
				System.out.println("");
				switch (select) {
				case 1:
					if ( p.getMoney() < GashaList.get(selectGasha).price) {
						System.out.println("お金が足りません");
						break;
					}
					Thread.sleep(1000);
					Character get = GashaList.get(selectGasha).Gasha1();
					System.out.println("[☆" + get.rare + "]" + get.name + "が仲間になりました！");
					p.MyCharacters.add(get);
					p.setMoney(-(GashaList.get(selectGasha).price));
					break;
				case 2:
					if ( p.getMoney() < (GashaList.get(selectGasha).price*10)) {
						System.out.println("お金が足りません");
						break;
					}
					for (int i = 0; i < 10; i++) {
						if (i == 9) {
							System.out.println("");
							Thread.sleep(1000);
							Character get10 = GashaList.get(selectGasha).Gasha10();
							System.out.println("[☆" + get10.rare + "]" + get10.name + "が仲間になりました！");
							p.MyCharacters.add(get10);
						} else {
							System.out.println("");
							Thread.sleep(1000);
							Character get10 = GashaList.get(selectGasha).Gasha1();
							System.out.println("[☆" + get10.rare + "]" + get10.name + "が仲間になりました！");
							p.MyCharacters.add(get10);						}
					}
					p.setMoney(-(GashaList.get(selectGasha).price * 10));
					break;
				case -1:
					
				}
				break;

			}

		}

	}
}
