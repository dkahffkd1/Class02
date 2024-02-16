package variable;
class Test02{ // 여러 공간을 사용 할 때는 class를 사용 .. 
	
	public int num; // instance(객체) 변수
	
	public void test1() 
	{
		num = 100;
		System.out.println("test1 : " + num);

	}
	public void test2() {
		System.out.println("test2: " + num);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.test1(); t.test2();
				
	}
}
