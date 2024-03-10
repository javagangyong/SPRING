package p1;

public class Main1 {

	public static void main(String[] args) {
		
		Hello ob1 = new Hello();
		String text1 = ob1.getText();
		System.out.println(text1);
		
		Hello ob2 = new Hello();
		String text2 = ob2.getText();
		System.out.println(text2);
		
		// ob1과 ob2는 같은 클래스에 의해 생성된 객체이다
		// 클래스 구성 상 두 객체는 기능적으로 완전 동일하다
		// 객체마다 서로 다른 값을 저장하지도 않는다
		
		// 프로그램 주요 내용이 시작된 이후 객체를 생성하는 일은 시간이 오래 걸린다
		// 자바에서 객체를 생성하는 행위는 일반적인 함수호출보다 더 많은 자원과 시간을 사용한다
		// 커넥션풀과 같은 복잡한 구성의 객체는 실행 이후 만드는것 보다 미리 만드는 것이 유리하다
		
		
		System.out.println(ob1 == ob2);
	}
}
