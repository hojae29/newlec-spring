package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	// 필드에 @Autowired 붙일시 기본생성자를 통해 DI
	// required 옵션을 false로 설정하면 등록된 빈이 없어도 오류가 발생하지 않는다.
	@Autowired(required = false)
	@Qualifier("exam2")
	private Exam exam;
	
	public GridExamConsole() {
		System.out.println("constructor");
	}

	public GridExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println("┌─────────┬─────────┐");
		System.out.println("│  total  │   avg   │");
		System.out.println("├─────────┼─────────┤");
		System.out.printf("│   %3d   │  %3.2f   │\n",exam.total(),exam.avg());
		System.out.println("└─────────┴─────────┘");
	}

	@Override
	public void setExam(Exam exam) {
		System.out.println("setter injection");
		this.exam = exam;
	}
}
