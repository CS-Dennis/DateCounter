package application;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateCounter dateCounter = new DateCounter(LocalDate.of(2020, 7, 1));
		
		dateCounter.countDays();
		
	}

}
