import java.lang.Math;
import java.util.Scanner;

public class LongestDistance {

    public static void main(String[] args) {

        Scanner in = null;
        try {
            in = new Scanner(System.in);
        } catch (Exception e) {
            System.out.println("unable to open scanner");
            System.exit(1);
        }

        int[][] co = readFile(in);

        double[] result = shortestAndLongestDistance(co);
        int longest = new Double(result[0]).intValue(), 
            shortest = new Double(result[1]).intValue();

        System.out.println(longest);
        System.out.println(shortest);

        in.close();
    }

    public static int[][] readFile(Scanner sc) {
        int numLines = sc.nextInt();
        int[][] co = new int[numLines][2];

        for (int i = 0; i < numLines; i++) {
            co[i][0] = sc.nextInt();
            co[i][1] = sc.nextInt();
        }

        return co;
    }

    public static double distanceBetween(int a[], int b[]){
        double deltaX = a[0] - b[0], deltaY = a[1] - b[1];
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double[] shortestAndLongestDistance(int[][] c) {

        if (c.length < 2) {
            double[] result = { 0, 0 };
            return result;
        }

        double longest = 0, shortest = Integer.MAX_VALUE;
        for (int i = 0; i < c.length; i++) {
            for (int o = i + 1; o < c.length; o++) {
                double distance = distanceBetween(c[i], c[o]);

                if (distance > longest) {
                    longest = distance;
                }

                if (distance < shortest) {
                    shortest = distance;
                }
            }
        }

        double[] result = { longest, shortest };
        return result;
    }

}