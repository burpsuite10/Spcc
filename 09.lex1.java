import java.util.*;

import java.util.Scanner;

class lex1 

{
   
	public static void main(String args[])

	{
  
		Scanner scr=new Scanner(System.in);
  
		String s;
  
		int i;
  
		System.out.println("Enter a expression");
  
		s=scr.next();
  
		for(i=0;i<s.length();i++)
		
{
  
			s.charAt(i);
  
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
			
{
  
				System.out.println("Identifier:"+s.charAt(i));

			}
  
			if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='=')
			
{
  
				System.out.println("Operator:"+s.charAt(i));
			
}
  
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')

			{
  
				System.out.println("Digit:"+s.charAt(i));
			
}
		
}
	
}

}
