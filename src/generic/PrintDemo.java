package generic;

public class PrintDemo {
	
	//Method which takes generic type and will print what was sent to it.
	public <T> void printData(T t)
	{
		System.out.println(t);
	}
	
	public static <T> void classChecker(T t)
	{
		System.out.println("The entered data\t"+t+"\t belongs to class\t"+t.getClass());
	}
	
	public static void main(String[] args)
	{
		PrintDemo object=new PrintDemo();
		String data="Manan";
		Integer number=12;
		
		object.printData(data);
		object.printData(number);
		
		PrintDemo.classChecker(data);
		PrintDemo.classChecker(number);
	}
	

}
