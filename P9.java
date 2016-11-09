package ProjectEuler;

public class P9 {
	public static void problem() {
		// a<b<c
		for (int a = 3; a < 1000; a++) {
			for (int b = 2; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					if (a < b && b < c)
						if ((a * a) + (b * b) == (c * c))
							if(a+b+c==1000)
							System.out.println(a + " " + b + " " + c+" "+ (c*c)+" "+((a*b*c)));
						else
							break;
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("go");
		problem();
		System.out.println("don");
	}

}
