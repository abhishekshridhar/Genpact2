import java.util.Scanner;

public class StudentApplication {
	
	public void showmenu() {
		System.out.println("1. Create Student");
		System.out.println("2. Display Student");
		System.out.println("3. Exit");
	}
	
	
	public static void main(String[] args) {
		StudentApplication sa = new StudentApplication();
		sa.showmenu();
		
		/* Alternatively, we can decalre showmenu as static and in main just call showmenu() without making
		 * an object
		 */
		
		/* we cant create a class object in case statement, so we create
		 * a null object like this
		 */
		
		Student st = null;
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();//byte short int char enum
		
		switch(ch) {
		case 1:
			
			System.out.println("Enter roll no");
			int rollno=sc.nextInt();
			System.out.println("Enter name");
			sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("Enter the marks");
			int marks = sc.nextInt();
			break;
			
		case 2:
			System.out.println("option 2");
			break;
			
		default:
			System.out.println("wrong choice");
		}
		
		Student s = new Student();
		s.init(21,"Krishna",99.8f);
		s.display();
		
		
		float newmarks = s.getmarks();
		//System.out.println("the new marks "+newmarks);
		newmarks+=52;
		s.setmarks(newmarks);
		System.out.println("After updating");
		//s.init(21, "krishna", +newmarks);
		s.display();
		s.calculategrade(newmarks);
	
	
	Student s2 = new Student();
	s2.init(22,"Krishna Bhai",67.8f);
	s2.display();
	newmarks=s2.getmarks();
	s2.calculategrade(newmarks);
	}
	
	


}
