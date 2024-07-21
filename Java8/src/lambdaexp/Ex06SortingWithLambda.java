package lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
	String name;
	int year;
	Double rating;
	String actor;

	public Movie(String name, int year, double rating, String actor) {
		this.name = name;
		this.year = year;
		this.rating = rating;
		this.actor = actor;
	}

}

public class Ex06SortingWithLambda {

	public static void main(String[] args) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		movies.add(new Movie("Kgf" , 2018 , 8 , "Yash"));
		movies.add(new Movie("SitaRamam" , 2022, 9.5 , "Mrunal"));
		movies.add(new Movie("KabirSingh" , 2019, 7.5 , "Shaheed"));
		movies.add(new Movie("Tarzan" , 2006 , 8.5, "Aaayesha"));
		
		Collections.sort(movies , (mov1 , mov2)-> mov1.rating.compareTo(mov2.rating));
		
		movies.forEach((m)-> System.out.println(m.name + " " + m.year + " " + m.rating +  " "  + m.actor));
	}
}
