package ch07.third;

public class Student extends People {

	private int studentNo; //학번

	//getter, setter
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	//
	Student( int studentNo) {
		this.studentNo = studentNo;
	}
	
	Student(String name, String ssn, int studentNo) {
		super (name, ssn);
		this.studentNo=studentNo;
	
	

		
	}


	
	
	
}
