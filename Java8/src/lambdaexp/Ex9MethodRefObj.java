package lambdaexp;

interface StateInter{
	void display(State s);
}

class State {
	
	String name ;
	String cm;
	String capital;
	double weather;
	
	public State(String name, String cm, String capital, double weather) {
		this.name = name;
		this.cm = cm;
		this.capital = capital;
		this.weather = weather;
	}
	
	public static void information(State s)
	{
		System.out.println("The CM of " + s.name + " is Mr." + s.cm );
		System.out.println("The Capital is " + s.capital + " and weather is" + s.weather + " degreed");
		System.out.println();
	}
}
public class Ex9MethodRefObj {

	public static void main(String[] args) {
	State s1 = new State("Maharashtra" , "Udhhav Thackray" , "Mumbai" , 28.5 );
	State s2 = new State("Delhi" , "Arvind Kejriwal" , "NCR" , 38 );
	State s3 = new State("Uttar Pradesh" , "Yogi Adityanath" , "Lakhnow" , 45 );
	State s4 = new State("Kashmir" , "Omar Abdullah" , "ShriNagar" , 16);
	
	StateInter si1 = State::information;
	si1.display(s1);

	StateInter si2 = State::information;
	si2.display(s2);

	StateInter si3 = State::information;
	si3.display(s3);

	StateInter si4 = State::information;
	si4.display(s4);

	
	}

}
