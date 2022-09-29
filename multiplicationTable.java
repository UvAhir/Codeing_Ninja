package CodingNinja.Lecture_4_Loops.problemLec4;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<11; i++){
            // System.out.println(i);
            System.out.println(n*i);
        }
    }    
}
