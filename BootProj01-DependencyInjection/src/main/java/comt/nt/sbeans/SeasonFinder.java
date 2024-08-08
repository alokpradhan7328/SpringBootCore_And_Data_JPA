package comt.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	

	public SeasonFinder() {
		System.out.println("SeasonFinder:0-ParamaConstructor");
	}

	@Autowired//field injection
	private LocalDate ld;
	
	//b.method
	
	public String findSeason() {
		//get current month
		int month = ld.getMonthValue();
			if (month>=3 && month<=6)
				return "Summer Season";
			else if(month>=7 && month<=10)
				return "Rain Season";
			else
				return "Winter Season";		
	}
}
