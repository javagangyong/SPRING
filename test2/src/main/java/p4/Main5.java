package p4;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main5 {
	public static void main(String[] args) throws Exception {
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("classpath:board-context.xml");
		
		BoardController controller = context.getBean(BoardController.class);
		
		List<BoardDTO> list = controller.getBoardList();
		
		for(BoardDTO dto : list) {
			System.out.printf("%d) %s %s\n", dto.getIdx(), dto.getTitle(), dto.getWriter());
		}
		System.out.println();
		
		context.close();
	}

}
