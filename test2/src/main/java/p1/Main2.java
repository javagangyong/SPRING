package p1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		// Context init = new InitialContext();
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:hello-context.xml");
		
		// 지정한 타입의 객체가 컨테이너 안에 하나만 있다면 자료형만으로 불러올 수 있다
		Hello ob1 = context.getBean(Hello.class);
		
		// 지정한 타입의 객체가 컨테이너 안에 두개 이상 있다면 id를 지정하여 불러올 수 있다
		Hello ob2 = context.getBean("hello", Hello.class);
		
		System.out.println(ob1.getText());
		System.out.println(ob2.getText());
		System.out.println(ob1 == ob2);
		// 스프링컨테이너 안에 있는 객체는 기본적으로 싱글톤형식
		
		// 스프링은 내부에 스프링 컨테이너라는 객체 보관소를 가진다
		// 스프링 컨테이너 내부에 준비된 객체를 스프링 빈이라고 부른다
		// 스프링 빈은 별도의 추가 설정이 없다면, 기본적으로 싱글톤으로 구현된다
		// 스프링 컨테이너에 객체를 생성하기 위해서 xml 설정파일을 활용하여 처리한다
		// 이때 xml파일은 컨테이너 내부에 객체를 준비하기 위한, 주문서 개념으로 생각한다
		
		// 파일 입출력이 내장되어있기 때문에 close
		context.close();
	}
}
