package ch08;

public class ExTelevision {

	public static void main(String[] args) {
		
		//문법상 문제 X, 동일한 / 정상적으로 작동 >> 인터페이스 활용 못함
//		Television television = new Television();
//		
//		television.turnOn();
//		television.turnOff();
		
		//인터페이스를 구현하여 활용1
		RemoteControl television = new Television(); //Television 대신 인터페이스 이름인 RemoteControl을 붙임
		television.turnOn();
		television.turnOff();
		
		//인터페이스를 구현하여 활용 2
		RemoteControl remoteControl = new Radio();
		remoteControl.turnOn();
		remoteControl.turnOff();
			
		RemoteControl remoteControl1 = new Television();
		remoteControl1.turnOn();
		remoteControl1.turnOff();
		
		//문법상 문제 X, 동일한 / 정상적으로 작동 
//		Radio radio = new Radio();
//		
//		radio.turnOn();
//		radio.turnOff();

		//인터페이스 구현하여 활용함
		RemoteControl radio = new Radio();
		radio.turnOn();
		radio.turnOff();
		
	}
	
}
