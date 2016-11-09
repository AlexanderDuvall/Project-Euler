package ProjectEuler;

public class P5 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000000000000L; i++) {
			System.out.println(i+"asdfasdf");
			for (int j = 1; j < 21; j++) {
				if (i % j == 0) {
					if (j == 20) {
						System.err.println(i);
						System.exit(0);
					}
				} else {
					break;
				}
			}
		}
	}
}
