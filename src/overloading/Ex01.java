package overloading;            //------------> Overloading
class TestClass01{
	public void sumFunc() {
		System.out.println("매개변수 없는 sumFunc");
	}
	public void sumFunc(int n) {
		System.out.println("n을가지고 연산합니다.");
		
	}	public void sumFunc(int n, int num) {
		System.out.println(n+num+"입니다.");
	}
		public void sumFunc(String n, String num) {
			System.out.println(n+num+"입니다.");
		}

}
public class Ex01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();// 2번째 줄
		t.sumFunc(); // 3번째 줄
		t.sumFunc(10);// 6번째 줄 int n 대입
		t.sumFunc(10,20); // 9번째 줄 2개 이상일때 변수를 2개 넣어줌
		t.sumFunc("안녕","하시고");// 12번째 줄 문자열일때는 String
		
		
		
	}
}
