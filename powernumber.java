package CodingNinja.Lecture_4_Loops.problemLec4;

import java.util.Scanner;

public class powernumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int expo = sc.nextInt();
        long temp = 1;

        while (expo != 0) {
            temp = temp*base;
            --expo;
        }

        System.out.println(temp);
    }
}
