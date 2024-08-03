package lambdaexp;

import java.util.Optional;

public class Ex17OptionalClass {

	public static void main(String[] args) {
		String[] names = new String[11];
		
		Optional<String[]> check = Optional.ofNullable(names);
		
		if(check.isPresent())
		{
			String userName = names[7].toUpperCase();
			System.out.println(userName);
		}
		else
		{
			System.out.println("The value is missing!");
		}

	}

}
