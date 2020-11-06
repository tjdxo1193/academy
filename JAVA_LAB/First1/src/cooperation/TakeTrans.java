package cooperation;

public class TakeTrans {
	
	public static void main(String[] agrs) {
		Student studentJames=new Student("james",5000);
		Student studentTomas=new Student("tomas",10000);
		
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		
		studentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen=new Subway("2È£¼±");
		studentTames.takeSubway(SubwayGreen);
		
		studentTames.showInfo();
		SubwayGreen.showInfo();
	}

}
