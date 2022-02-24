package Data;

public class DemoDataType {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rollno=10;
		 char alpha='b';
		 double per=89.90;
		 float sal=88.76f;
		 String str="Its data types demo";
		 void Demo()
		 {
			 String str1="its demo method";
			 System.out.println("str1="+str1);
			 System.out.println("Rollno="+rollno);
			 System.out.println("Alpha="+alpha);
			 System.out.println("Percentage="+per);
			 System.out.println("Salary="+sal);
		 }
		 void print()
		 {
			 String str1="Its print method";
			 System.out.println("str1="+str1);
			 System.out.println("Rollno="+rollno);
			 System.out.println("Alpha="+alpha);
			 System.out.println("Percentage="+per);
			 System.out.println("Salary="+sal);
		 }
		 public static void main(String[]args)
		 {
			 DemoDataType dt=new DemoDataType();
			 dt.Demo();
			 dt.print();	 
		 }
	}

