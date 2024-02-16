package variable; /////////class 변수
class Test04{        // class 변수 > instance변수> 지역 변수
	public int num ; //instance 변수 
	public static String msg = "연습";// class 변수 -> static을 넣어줘야 함
}
public class Ex04 {
	public static void main(String[] args) {
		System.out.println("변경 전 : " + Test04.msg);
		Test04.msg ="11111";
		System.out.println(Test04.msg);
		
		
		
		Test04 t = new Test04(); // <---- instance
		t.num =100;
	}
}
