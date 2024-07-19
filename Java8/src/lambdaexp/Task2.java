package lambdaexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter number of Students ");
		int n = Integer.parseInt(br.readLine());
			
		
		List<String> codes= new  ArrayList<String> ();
		for(int i = 0 ; i<n ; i++)
		{
			System.out.println("Enter the 7 digit  code");
			String code = br.readLine();
			if(code.length() == 7)
			{
				codes.add(code);
				
			}
			else
			{
				System.out.println("Please Enter 7 digit number only ");
				i--;
			}
			
		}
		
		System.out.println(codes);
		
		TreeMap<String , Integer> splCodes = new TreeMap();
		
		codes.forEach((item) ->{
			int splCode = extractNum(item , n);
			splCodes.put(item,  splCode);
		});
		
		System.out.println(splCodes);
		
	}
	
	public static int extractNum(String code , int size)
	{
		int splCode =0;
		for(int i =0 ;i <= size ;i++)
		{
			char chara = code.charAt(i);
			if(chara >= 48 && chara <= 57 ){
				int ch = chara - '0';
				splCode = splCode *10 + ch;
			}
			
		}
		return splCode;
	}
	

}
