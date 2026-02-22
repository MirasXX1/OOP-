//Код сабақтарды күндерімен және ұзақтығымен сақтайды, оларды шығарады, 
// және жалпы сабақ санын есептейді.



package practice3;

public class problem2 {

	public enum Days {
		MONDAY("Monday"),
		TUESDAY("Tuesday"),
		WEDNESDAY("Wednesday"),
		THURSDAY("Thursday"),
		FRIDAY("Friday");
	
		private final String dayName;
		
		Days(String dayName){
			this.dayName = dayName;
		}
		public String getDay() {
			return dayName;
		}
		
	}
	
	public static final String schoolName = "KBTU";
	public static int lessonCnt;
	public final int duration;
	private Days day;
		
	{
		lessonCnt++;
	}
		
	public problem2(Days day, int duration) {
		this.day = day;
		this.duration = duration;
	}
		
	public void printInfo() {
		System.out.println("Lesson on " + day.getDay());
	}
		
	public void printInfo(boolean showDuration) {
		if(showDuration) {
			System.out.println("Lesson on " + day.getDay() + ", duration " + duration + "minutes");
		} else {
			printInfo();
		}
	}
		
	public int getDuration() {
		return duration;
	}
		
	public static void main(String[] args) {
		problem2 lesson1 = new problem2(Days.MONDAY, 250);
		problem2 lesson2 = new problem2(Days.WEDNESDAY, 0);
			
		lesson1.printInfo();
		lesson2.printInfo(true);
			
		System.out.println("School: " + schoolName);
		System.out.println("Total lessons: " + lessonCnt);
	}
		
}