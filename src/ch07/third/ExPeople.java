package ch07.third;

public class ExPeople {

	public static void main(String[] args) {
		
		Student student = new Student(12345);
		
		System.out.println("학번" + student.getStudentNo());
		System.out.println("이름" + student.getName());
		System.out.println("주민등록번호" + student.getSsn());
		//입력된 값이 없기 때문에 값이 모두 null로 출력됨
		
		Student student2=new Student("유예린", "010525-4080516", 20826297);
		
		System.out.println("이름 : " + student2.getName());
		System.out.println("주민등록번호 : " + student2.getSsn());
		System.out.println("학번 : " + student2.getStudentNo());
		
		
		
	}
}
