package ProjectEuler;

public class P6 {
	public static void main(String[] args) {
		// sum of the squares - square of the sum up to 100
		int sumofsquare = 0;
		int squareofsum = 0;
		for (int i = 1; i < 101; i++) {
			sumofsquare += Math.pow(i, 2);// sum of the squares
			squareofsum += (i);// square of the sum
		}
		squareofsum = (int) Math.pow(squareofsum, 2);
		System.out.println(Math.abs(sumofsquare-squareofsum));

	}
}
