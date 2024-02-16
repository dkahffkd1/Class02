package overloading;

import java.util.Scanner;

class Hi{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String a) {
		this.name = name;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hi h = new Hi();
		String name;
		int age;
		System.out.println("이름 입력");
		name = sc.next();
		h.getName();
		System.out.println("나이 입력");
		age = sc.nextInt();
		age = age-2;
		h.setName(name);
		h.setAge(age);
		int b = h.getAge();
		//System.out.println(Name+"님의 나이는" +  +"살입니다");
		
	}
}
