package variable;
class Test07{
	public static final String KOREA = "대한민국";
	public static int num;
	static {
		num = 12345;
	}
}
public class Ex07 {
	public static void main(String[] args) {
	//final String KOREA = "대한민국"; // final은 지정한 값을 변경 할 수 없다.
	//KOREA = "미국";
		System.out.println(Test07.KOREA);
		System.out.println(Test07.num);
		Test07 t = new Test07();
		System.out.println(t.KOREA);
		
}
}
