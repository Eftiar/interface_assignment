package package4;

public class MaxOddNumber {

    public static void main(String[] args) {
        int a;
        int maxA = 0;
        System.out.println("Odd numbers are : ");
        for (a = 0; a <= 20; a++) {
            if (a % 2 != 0) {
                maxA = a;
                System.out.println(+a);
            }
        }
        System.out.println("\nMaximum number: " +maxA);

    }


}
