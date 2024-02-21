package ch07;

public class ExCellPhone {

	public static void main(String[] args) {
		
		//객체 생성
		Phone phone = new Phone ();
		
		phone.powerOn();
		
		System.out.println();
		
		phone.setModel("iPhone 14 Pro Max");
		phone.setColor("White");
		
		System.out.println("phone.getModel( ) : " + phone.getModel());
		System.out.println("phone.getColor( ) : " + phone.getColor());
		
		System.out.println();
		
		phone.powerOn();
		phone.powerOff();
		
		System.out.println("=============");
		
		//객체 생성
		CellPhone cellPhone = new CellPhone ();
		
		cellPhone.setTelecom("SKT");
		cellPhone.setColor("Blue");
		cellPhone.setModel("S24");
		
		System.out.println("cellPhone.getTelecom( ) : " + cellPhone.getTelecom());
		System.out.println("cellPhone.getModel( ) : " + cellPhone.getModel()); //상속 받았기 때문에 getModel 가능, set 명령어를 사용하지 않아 null 출력
		System.out.println("cellPhone.getColor( ) : " + cellPhone.getColor());
		
		System.out.println("==============");
		
		cellPhone.powerOffCellPhone();
		cellPhone.powerOnCellPhone();
		
		System.out.println("==============");
		
		cellPhone.powerOn();
		cellPhone.powerOff();
	
	}
	
}
