package ch07;

public class CellPhone  extends Phone { //CellPhone - 자식 클래스, Phone - 부모 클래스

	//필드
	private String telecom;
	
	//getter setter
	public String getTelecom () {
		return telecom;
	}
	
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	//메서드

	
	//오버라이드
	@Override // 기존 함수인지, 오버라이드한 함수인지 구분하기 위해 주석 사용하는 것 권장
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("cellPhone의 전원 켬");
	}

	@Override
	void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("cellPhone의 전원 끔");
	}

	//오버라이드 하지 않고 함수를 인용함 >> 오버라이드 하셈 일케 하지 말고
	void powerOnCellPhone() {
		System.out.println("CellPhone - 전원 켬");
	}
	
	void powerOffCellPhone() {
		System.out.println("CellPhone - 전원 끔");
	}
	

	
}
