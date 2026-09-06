import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> person = new ArrayList<>();	
	Person p = new Person();

	p.setWeight(180);
	p.setAge(23);

	System.out.println(p.getWeight() + " " + p.getAge());
	System.out.println("Enter number of calories eaten(per day): " );
	int cal = scanner.nextInt();



		
	}
}
