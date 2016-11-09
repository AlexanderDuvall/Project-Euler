package ProjectEuler;

import java.util.ArrayList;

public class P7 {
	public static void main(String[] args) {
		ArrayList<Integer> asdf = new ArrayList<Integer>();
		asdf.add(2);
		System.out.println(asdf.get(0));
		for (int i = 0; i < 100000000000000L; i++) {
			for (int j = 2; j < i; j++) {
				
				if (asdf.size() == 10002) {
					System.out.println(asdf.get(10000));
					System.exit(0);
					break;
				}
				if (i != j) {
					if (i % j != 0) {
						if (j == i - 1) {
							System.out.println(i);
							asdf.add(i);
						}
					} else {
						break;
					}

				}
			}

		}
		System.out.println(asdf.size());
	}
}
