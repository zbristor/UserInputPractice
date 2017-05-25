import java.util.Scanner;
public class UserInputPractice 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//String line = "P Sherman 42 Wallaby Way Sydney";
	String firstInitial = sc.next();
	String lastName = sc.next();
	int houseNumber = sc.nextInt();
	String streetName = sc.next();
	String streetType = sc.next();
	String city = sc.next();
	
	System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
	System.out.println(streetName + " " + streetType + " " + city);
	
	}
}
