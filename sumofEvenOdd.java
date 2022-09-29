package CodingNinja.Lecture_4_Loops.problemLec4;

import java.util.Scanner;

public class sumofEvenOdd {
    public static void main(String[] args) {
        int A = 0, B = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a!=0){
            int z=a%10;
            if(z%2==0){
                A=A+z;
            }
            else if(z%2!=0){
                B=B+z;
            }
           a=(int)(a/10);
        }
        System.out.println(A+" "+B);
    }
}
