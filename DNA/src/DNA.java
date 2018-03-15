import java.util.*;

public class DNA {
    static String validChars = "ATCG";

    public static String readSequence(Scanner sc) {
        String sequence = "";
        int seqLen = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < seqLen; i++) {
            char character = sc.nextLine().charAt(0);
            if (!validChars.contains(String.valueOf(character))) {
                System.out.println("INVALID");
                System.exit(0);
            }
            sequence = sequence + character;
        }

        return sequence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String query = readSequence(sc);
        String sequence = readSequence(sc);

        int match = 0;
        boolean found = false;
        while (match != -1) {
            match = sequence.indexOf(query, match);
            if (match != -1) {
                System.out.println(match);
                found = true;
                match++;
            }
        }

        if (!found) {
            System.out.println("NO MATCH");
        }

    }
}