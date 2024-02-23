package ch08;

public class Radio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("라디오 켜줘");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오 꺼주랑");
		
	}

	
}
