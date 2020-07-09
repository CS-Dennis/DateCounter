package application;
import java.time.LocalDate;

public class DateCounter {
	private LocalDate today;
	private LocalDate userInputDate;
	
	DateCounter(LocalDate userInputDate){
		this.userInputDate = userInputDate;
		this.today = LocalDate.now();
	}
	
//	count how many days since userinputdate until today (include today).
	public int countDays() {
		
		return 0;
	}
}
