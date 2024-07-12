package lambdaexp;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class FlightDetails{
	int flightId;
	String flightName ;
	String from;
	String to;
	double duration;
	int price;
	
	
	public FlightDetails(int flightId, String flightName, String from, String to, double duration, int price) {
		this.flightId = flightId;
		this.flightName = flightName;
		this.from = from;
		this.to = to;
		this.duration = duration;
		this.price = price;
	}
}


public class Ex7Flights {

	public static void main(String[] args) {
		ArrayList<FlightDetails> hs1 = new ArrayList<>();
		
		hs1.add(new FlightDetails(101,"Air India" , "Mumbai", " London" , 14.5 , 80000 ));
		hs1.add(new FlightDetails(102,"Vistara" , "USA", " Delhi" , 18.5 , 100000 ));
		hs1.add(new FlightDetails(103,"Indigo" , "Thailand", " Pune" , 7.3 ,20000 ));
		hs1.add(new FlightDetails(104,"Qatar AirWays" , "Chennai", " Bahrain" , 3.5 , 14000 ));
		hs1.add(new FlightDetails(105,"British Airaways" , "Nottingham", " Ahmedabad" , 12.5 , 90000 ));
		hs1.add(new FlightDetails(106,"SpiceJet" , "Dallas", " Pune" , 15.9 , 115000 ));
		hs1.add(new FlightDetails(107,"" , "India", " London" , 14.5 , 85000 ));
		hs1.add(new FlightDetails(108,"Air India" , "India", " London" , 14.5 , 70000 ));
		
		Collections.sort(hs1 , ( f1 , f2)->{
			if(f1.price>f2.price)
			{
				return 1;
			}
			else if (f1.price<f2.price) {
				return -1;
			}
			return 0;
		});
		
		hs1.forEach((m)->{System.out.println(m.flightId + " " + m.flightName +" " + m.from + " " + m.to + " " + m.duration + " " + m.price);});
		

	}

}
