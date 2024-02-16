                                          package variable;

import java.util.Scanner;

class yes02{

	public String name,grade;
	public int kor,eng,math,sum;
	public double avg;
	Scanner sc= new Scanner(System.in);
	public void no1(String n ) {
		System.out.println("입력");
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

	}
	public void no2() {
		sum = kor+eng+math;
		avg = sum/3;
		if(avg>=90) {
			grade = "A";
			if(avg>=80) {
				grade = "B";;
			}else {
				grade = "C";;
			}
		}
	}
	public void no3() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
	}



}
public class Quiz2 {


}

