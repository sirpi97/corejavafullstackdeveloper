package Basics;

public class StringExample 
{
	void length()
	{
		String str="edubridge";
		System.out.println("length of str :"+str.length());
	}
	void replace()
	{
		String str="jello,welcome,jai";
		System.out.println(str);
		String replacestr=str.replace("j", "h");
		System.out.println(replacestr);
	}
	void split()
	{
		String str="welcome to our home";
		for(String i:str.split("\\s",0))
		{
			System.out.println(i);
		}
	}
	void substring()
	{
		String str="fullstackdeveloper";
		System.out.println(str.substring(0,4));
	}
	void lowercase()
	{
		String str="HELLO WELCOME TO OUR WORLD";
		System.out.println(str.toLowerCase());
	}
	void uppercase()
	{
		String str="hello welcome to our world";
		System.out.println(str.toUpperCase());
	}
	void trim()
	{
		String str="sirpiya";
		System.out.println(str);
		System.out.println(str.trim());
	}
	void valueof()
	{
		int a=10;    
		String str=String.valueOf(a);    
		System.out.println(str);    
	}
	void equalto()
	{
		String s1="sirpiya";
		String s2="sirpiya";
		String s3=new String("sirpiya");
		System.out.println(s1==s2);
		System.out.println(s2==s3);

	}
	void compareto()
	{
		String s1="sirpiya";
		String s2="sirpiya";
		String s3="priya";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}
	void intern()
	{
		String str1=new String("sirpiya");    
		String str2=str1.intern();    
		System.out.println(str2);
	}
	void charat()
	{
		String str="sirpiya";    
		System.out.println(str.charAt(3));    
		System.out.println(str.charAt(5));   
	}
	void concat()
	{
		String str="sirpiya"+" Mahendran";  
		System.out.println(str);
	}
	

	public static void main(String[] args) 
	{
		StringExample st=new StringExample();
		st.length();
		st.replace();
		st.split();
		st.substring();
		st.lowercase();
		st.uppercase();
		st.trim();
		st.valueof();
		st.equalto();
		st.compareto();
		st.intern();
		st.charat();
		st.concat();
	}

}
