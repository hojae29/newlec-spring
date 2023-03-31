package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");

		// console 안의 exam 객체는 @Autowired 어노테이션이 붙어있기 때문에 컴포넌트 스캔을 하면서 자동 주입 (DI)
		// Exam 객체도 @Component 어노테이션이 붙어있어야 주입이 되고, xml 설정에 component-scan의 base-package를 설정해줘야한다.
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
	}
}