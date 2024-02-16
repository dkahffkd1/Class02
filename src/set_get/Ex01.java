package set_get;
class Test01{
	private int num = 12345; // private = 은닉화
	public void test(int n) {
		num = n; // int 형태로 받아서 num에다가 n을 추가
	}
		public int test2() {
		return num;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test(1000);
		System.out.println(t.test2());
	}		
}











