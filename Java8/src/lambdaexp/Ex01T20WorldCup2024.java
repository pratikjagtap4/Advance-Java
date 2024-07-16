package lambdaexp;

interface WorldCup {
	String position();
}
public class Ex01T20WorldCup2024 implements WorldCup {
	
	public String position() {

		return "India Won";
	}
	
	public static void main(String[] args)
	{
		WorldCup winner = new Ex01T20WorldCup2024();
		System.out.println(winner.position());
		
		
		WorldCup runnersUp = new WorldCup() {
			public String position()
			{
				return "South Africa";
			}
		};
		
		System.out.println(runnersUp.position());
		
		
		WorldCup lastPosition = () -> "Porkistan";
		System.out.println(lastPosition.position());
	}
	
}
