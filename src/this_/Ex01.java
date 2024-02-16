package this_;
class Test01{
	public int num = 12345;
	public void test() {
		int num = 303030;
		System.out.println("this : " + this);
		System.out.println("this : " + this.num);
		System.out.println("num : " + num);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println("main : " + t); // 객체 --> t는 객체에 대한 저장소
		System.out.println("main num : " +t.num);
		t.test();
	}
}
