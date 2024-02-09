package capsule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import charactar.Character;
import charactar.NakanoOenoOji;
import charactar.NakatominoKamatari;
import charactar.SoganoIruka;

public class PermanentGasha {

	public static Character Permanent() {
		List<Character> permanent2 = new ArrayList<Character>();
		permanent2.add(new NakanoOenoOji());
		permanent2.add(new SoganoIruka());
		permanent2.add(new NakatominoKamatari());

		List<Character> permanent3 = new ArrayList<Character>();

		List<Character> permanent4 = new ArrayList<Character>();

		Character obt = null;
		int rare = new Random().nextInt(100) + 1;
		if (rare < 59) {
			int lottery = new Random().nextInt(permanent2.size() - 1);
			obt = permanent2.get(lottery);
		} else if (rare < 96) {
			int lottery = new Random().nextInt(permanent3.size() - 1);
			obt = permanent3.get(lottery);
		} else if (rare < 100) {
			int lottery = new Random().nextInt(permanent4.size() - 1);
			obt = permanent4.get(lottery);
		}
		return obt;
	}

}
