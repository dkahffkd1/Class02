package variable;
class test01{
	public String name, addr;
	int age;
	public int test1() // 변수가 숫자이기 때문에 반환 type은 void가 아닌 int 
	{
		int num = 100;
		System.out.println("test1 : " + num);
		return num;
	}
	public void test2(int num) 
	{
		System.out.println("test2 : " + num);
	}
}
public class Ex01 {
	public static void main(String[] args) {
		test01 t = new test01();
		int n = t.test1();
		t.test2(n);
		/*String name ="홍길동";//<<<<<<<<<< 지역변수
		if(true) {
			String n = "1111";
			name = "김개똥";     // if(true)라 값이 변경이 되어서 name= 김개똥이 됌
							   // if 문에서 만든 변수는 if문 안에서만 사용 가능
		}
		System.out.println(n);  // 큰 범위에서 만든 변수는 작은 범위에서 사용할 수 있지만 작은 범위에서 만든 변수는 큰 범위에서 사용할 수 없음
		System.out.println(name);*/  // ex) main에서 만든 변수는 if문 안에서 사용 할 수 있지만 if문에서 만든 변수는 main에 사용 할 수 없음
	}
}
