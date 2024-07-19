package lambdaexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter number of items ");
		int n = Integer.parseInt(br.readLine());
		
		
		System.out.println("Please enter your name: ");
		String custName = br.readLine();
		
			
		List<String> product = new  ArrayList<String> ();
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println("Enter product name");
			String prod = br.readLine();
			
			product.add(prod);
		}
		discount(product , custName);
	}
	
	public static void discount(List<String> product , String name)
	{
//		product.forEach((item)-> System.out.println(item.contains(name)));
		
		List isAvailable = product.stream().filter((item)->item.contains(name)).collect(Collectors.toList());
			
		System.out.println(isAvailable.size());
		
	}

}
