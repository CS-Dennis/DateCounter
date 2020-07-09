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
//		The Epoch Day count is a simple incrementing count of days where day 0 is 1970-01-01 (ISO). This definition is the same for all chronologies, enabling conversion.
		long todayEpochDay = today.toEpochDay();
		long userInputDateEpochDay = userInputDate.toEpochDay();
		
		long countDays = todayEpochDay-userInputDateEpochDay;
		
		return 0;
	}
}
