package 練習.enumlearning;

//列舉
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATURDAY
}
public class enumTest {
    
    Day day;

    public enumTest(Day day) {
		this.day = day;
	}

    public void tellItLikeItIs() {
		
		switch(day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
			
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
			
		case SATURDAY: case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
    }

    public static void main(String[] args) {

        enumTest firstDay = new enumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        enumTest thirdDay = new enumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        enumTest fifthDay = new enumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        enumTest sixthDay = new enumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        enumTest seventhDay = new enumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();

    }
}
