package variable;

public class Ex03 {
	public String name;  // 1회성 변수는 지역변수로 사용하는게 좋고 많이 쓰는 변수는 instance변수로 사용하는게 좋음 ㅇㅋ?
	public void inputData() {
		String name = "홍길동";
		
	}
	public void printData() {
		System.out.println(name);
	}
}
