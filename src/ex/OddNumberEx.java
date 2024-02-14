package ex;

public class OddNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6; //a에 0이 들어갔을 경우, a가 음수일 경우도 대비할 수 있는 코드가 필요
		
		
		if (a%2 == 0) { // 비교 연산자에서 '='을 사용하고 싶을 시, ==으로 입력해야 함
			System.out.println(a+"은(는) 짝수");
		}
		else  {
			System.out.println(a+"은(는) 홀수");
		}
	}
}
	
