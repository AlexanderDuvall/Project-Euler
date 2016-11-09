package ProjectEuler;

import java.util.ArrayList;

public class P3 {
	public static void main(String[] args) {
		ArrayList<Integer> m = new ArrayList<Integer>();
		long z = 600851475143L ;
		int s = 0;
		for (int i = 1; i <= z; i++) {
			if (z % i == 0) {
				z /= i;
				m.add(i);
				System.out.println(z);
			}
			for (int j = 0; j < m.size(); j++) {
				s = Math.max(s, m.get(j));
			}
		}
		System.out.println("The Final answer is "+s);
	}
	
}
