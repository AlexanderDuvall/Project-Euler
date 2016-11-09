package ProjectEuler;

public class P10 {
	public static void problem() {
		// == 0 is composite
		// != 0 is prime
		long m = 05;
		int a = 0;
		for (int i = 4; i < 2000000; i++) {
			for (int j = 2; j < i / 2+1; j++) {
				if (i % j == 0) {
					a++;
					break;
				}
			}
			if (a==0)
				m+=i;
			a=0;
			System.out.println(i);
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		problem();
	}
}
