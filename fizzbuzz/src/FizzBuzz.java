import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int antall = sc.nextInt();

        for (int i = 1; i <= antall; i++) {
            boolean multiple3 = (i % 3 == 0),
                multiple5 = (i % 5 == 0);

            if (multiple3) {
                System.out.print("Fizz");
            }

            if (multiple5) {
                System.out.print("Buzz");
            }

            if (!(multiple3 || multiple5)) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
