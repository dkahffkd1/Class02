package variable;

public class TestClass05_2 {
	public static void main(String[] args) {
		//StaticTest05 s = new StaticTest05();//Static을 넣으면 (class) 객체화 할 필요가 없음
		System.out.println("해당 경로에 데이터를 가져옵니다.");
		System.out.println(StaticTest05.URL);//객체를 빼고 class 이름을 넣어도 실행 가능
	}
}
