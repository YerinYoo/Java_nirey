package ch08;

public class Television implements RemoteControl {
	//인터페이스를 구현한 클래스 - 일반 클래스 X
	//일반 클래스처럼 사용해도 문제 X

	@Override
	public void turnOn() {
		
		System.out.println("티비 켜주랑");
		
	}

	@Override
	public void turnOff() {

		System.out.println("티비 꺼줘");
		
	}

}