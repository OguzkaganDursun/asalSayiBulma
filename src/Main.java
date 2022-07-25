import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
        Senaryo
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
         */

        boolean asalMi = false;

        for (int i = 1; i <= 100; i++)
        {
            for (int k=2; k < i; k++)
            {
                if (i % k == 0)
                {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi)
            {
                System.out.println(i);
            }
            asalMi = true;
        }
    }
}
