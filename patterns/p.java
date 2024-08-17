import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n ;
		int space = -1;
		int row = 1;
		while (row <= 2*n-1) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}

			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// star
			int k = 1;
			if (row == 1 || row == 2*n-1) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// Mirror
			if (row < n) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			// Next Row ki Prep
			row++;
			System.out.println();

		}

    }
}
