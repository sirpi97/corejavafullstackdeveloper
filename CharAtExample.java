package Basics;

public class CharAtExample 
{
	void charat1()
	{
		String name="sirpiya";
		char ch=name.charAt(3);
		System.out.println(ch);
		
	}
	void charat2()
	{
		StringBuffer sb=new StringBuffer("javaprogram");
		char ch=sb.charAt(6);
		System.out.println(ch);
				
	}
	void charat3()
	{
		StringBuilder sb=new StringBuilder("javaprogram");
		char ch=sb.charAt(7);
		System.out.println(ch);
				
	}
	void indexofdemo()
	{
		String str="wearefriends";
		String substr="   efr   ";
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a',4));
		System.out.println(str.indexOf(substr));
		System.out.println(str.indexOf(substr,5));
		System.out.println(str.length());
		System.out.println(str.replace('a','T'));
		System.out.println("SubString: "+str.substring(3));
		System.out.println("SubString: "+str.substring(3,5));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(substr+str);
		String s="welcome to our new home";
		boolean b=s.contains("welvcome");
		System.out.println(b);
		System.out.println(s.contains("hello"));
		System.out.println(s.endsWith("home"));
		System.out.println("StartWith: "+s.startsWith("com"));
		String date1=String.join(":","19","08","2022");
		System.out.println("Date: "+date1);
		String time1=String.join(":","12","58","30");
		System.out.println("Time: "+time1);
		String a="";
		String c="Demo";
		System.out.println(a.isEmpty());
		System.out.println(c.isEmpty());
		}
	

	public static void main(String[] args) 
	{
		CharAtExample ch=new CharAtExample();
		ch.charat1();
		ch.charat2();
		ch.charat3();
		ch.indexofdemo();

	}

}
