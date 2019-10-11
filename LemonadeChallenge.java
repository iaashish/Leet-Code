
public class LemonadeChallenge {
	public static void main(String args[]) {
		int[] bills = new int[] { 5, 5, 10, 10, 5, 20, 5, 10, 5, 5 };
		int ten = 0, five = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				bills[i] = 0;
				five++;
			} else if (bills[i] == 10 && five > 0) {
				five--;
				ten++;
				bills[i] = 0;
			} else if (bills[i] == 20 && five > 2 || ten > 0) {
				if (ten > 0 && five > 0) {
					ten--;
					five = five - 2;
					bills[i] = 0;
				} else if (five > 2) {

					five = five - 3;
					bills[i] = 0;
				} else {
					System.out.println("false");
				}
			} else {
				System.out.println("false");
			}
		}
	}

}
