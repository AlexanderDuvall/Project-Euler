package ProjectEuler;

public class P4 {
	public static void main(String[] args) {
		String mm = "0";
		for (int i = 100; i < 1000; i++) {
			for (int j = 0100; j < 1000; j++) {
				StringBuilder sm = new StringBuilder(Integer.toString(Math
						.multiplyExact(i, j)));
				if (sm.toString().equals(sm.reverse().toString())) {
					if (Integer.parseInt(sm.toString()) > Integer.parseInt(mm)) {
						mm = sm.toString();
					}
				}
			}
		}
		System.out.println("Final answer:");
		System.out.println(mm);
	}

}
