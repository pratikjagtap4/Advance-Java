package stack;

import java.util.Stack;

public class Stack3 {
	public static void pushBottom(int data , Stack<Integer> s) {
		if(s.empty())
		{
			s.push(data);
			return;
		}
		
		int top = s.pop();
		pushBottom(data , s);
		s.push(top);	
	}
	
	public static void reverse(Stack<Integer>s)
	{
		if(s.empty())
		{
			return;
		}
		
		int top = s.pop();
		reverse(s);
		pushBottom(top , s);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		
//		pushBottom(4, s);
		reverse(s);
		
		while(!s.empty())
		{
			System.out.println(s.pop());
		}
		

	}

}
