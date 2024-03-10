package p3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {

		public static void main(String[] args) {
			
			GenericXmlApplicationContext context = 
					new GenericXmlApplicationContext("classpath:car-context.xml");
			
			Car ob1 = context.getBean(Car.class);
			
			ob1.run();
			
			context.close();
			
		}
}
