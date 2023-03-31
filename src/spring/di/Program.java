package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		// console 안의 exam 객체는 @Autowired 어노테이션이 붙어있기 때문에 컴포넌트 스캔을 하면서 자동 주입 (DI)
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
	}
}