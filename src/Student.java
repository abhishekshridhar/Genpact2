
public class Student {
	private int rollno;
	private String name,naam;
	private float marks;
	
	public void init(int roll,String name,float marks) {
		
		this.rollno=roll;
		this.naam=name;
		this.marks=marks;
	}
	
	public float getmarks() {
		return this.marks;
	}
	
	public void setmarks(float marks) {
		this.marks=marks;
		
		
	}
	
	
	public void display() {
		System.out.println("Roll No: "+rollno+"\tName: "+naam+ "\thas scored: " + this.marks+"Marks");
	}
	
	public void calculategrade(float marks) {
		if(marks>=80) {
			System.out.println("Grade A");
		}
		
		else if(marks>=60) {
			System.out.println("Grade B");
		}
		
		else if(marks>=40) {
			System.out.println("Grade C");
		}
		
		else
			System.out.println("Fail");
	}

}
