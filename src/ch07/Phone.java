package ch07;

public class Phone { //부모 클래스

	//필드	
	private String model;
	private String color;
	
	//메서드
	void powerOn() { System.out.println(model + "전원 켬"); }
	void powerOff() {System.out.println(model + "전원 끔"); }
	void ring() {System.out.println("벨 울림"); }
	void sendVoice (String message) { System.out.println("자기 : " + message); }
	void receiveVoice (String message) {System.out.println("상대방 : " + message); }
	void hangUp() {System.out.println("전화 끊음"); }
	
	//getter setter 사용
	public String getModel () {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getColor () {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
}
