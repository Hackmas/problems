import java.util.*;
import java.io.*;

public class Total {
    public static void main(String[] args) {
        int result = new BufferedReader(new InputStreamReader(System.in))
            .lines()
            .mapToInt(Integer::parseInt)
            .sum();
        System.out.println(result);
    }
}

