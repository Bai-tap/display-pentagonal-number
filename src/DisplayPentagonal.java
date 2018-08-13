import java.util.Scanner;

public class DisplayPentagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int number = getPentagonalNumber(n);
        System.out.println(number);
    }

    public static int getPentagonalNumber(int n) {
        int number = n * (3 * n - 1) * 2;
        return number;
    }
}
