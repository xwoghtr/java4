import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Table dimension");
        Scanner in = new Scanner(System.in);
        int tableDimension = in.nextInt();
        int[] tab = new int[tableDimension];
        for (int i = 0; i < tableDimension; i++) {
            tab[i] = in.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < tableDimension; i++) {

            if ((tab[i] == 1) && (tab[i + 1] == 2) && (tab[i + 2] == 3)) {

                found = true;
            }
        }
        if (found) {
            System.out.println("I got it !");
        }
    }
}
