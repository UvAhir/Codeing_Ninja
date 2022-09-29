package CodingNinja.Lecture_4_Loops.problemLec4;

import java.util.Scanner;

public class totalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        String grade1 = sc.next();
        char grade = grade1.charAt(0);
        int all;
        if(grade==65){
            all = 1700;
        }
        else if (grade==66) {
            all = 1500;
        }   
        else{
            all = 1300;
        }
        double ts = ((salary+(0.20*salary)+(0.50*salary)+all)-(0.11*salary));
        System.out.println(ts);
        double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
    }
    
}
