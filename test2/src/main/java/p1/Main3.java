package p1;

import org.springframework.context.support.GenericXmlApplicationContext;

import p2.BatteryAA;
import p2.Toy;

public class Main3 {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:toy-context.xml");
		
		// 스프링 컨테이너에서 불러온 스프링 빈은 energy 수치 및 배터리 설정이 모두 완료된 상태로 불러온다
		Toy toy = context.getBean(Toy.class);
		
		for(int i = 1; i <= 12; i++) {
			toy.run();
		}
		
		// 직접 생성한 객체는 Battery에 대한 의존성과, Battery의 energy 속성이 준비되어 있지 않다
		Toy toy2 = new Toy(new BatteryAA());
		toy2.run();
		
		context.close();
	}
}
