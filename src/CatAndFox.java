import java.util.Scanner;

public class CatAndFox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int coin3 = 0;
        int coin5 = 0;

        while (n % 5 != 0){
            n = n - 3;
            coin3++;
        }
        System.out.println(n / 5 + " " + coin3);
    }
}