
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java,Maven,Selenium,Testng";
		String[] myresult=s1.split(",");
//		String a=myresult[0];
//		String b=myresult[1];
//		String c=myresult[2];
//		String d=myresult[3];
//		System.out.println("Results are:" +a);
//		System.out.println("Results are:" +b);
//		System.out.println("Results are:" +c);
//		System.out.println("Results are:" +d);
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(myresult[i]);
		}
		
		String s2="ABC";
		String s3="DEF";
		String s4="XYZ";
		
		String s5=s2.concat(s3).concat(s4);
		System.out.println(s5);
//		String s6=s5.concat(s4);
//		System.out.println(s6);
	}

}
