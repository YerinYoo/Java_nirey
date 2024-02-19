package ex;

public class TestScore_ConstantScore {
	
	public static void main(String args[]){
		String[] name={"Tony","Tiffany","Jennifer"};  // 이름 초기화
		
		int[][] score={
						{96,92,98}, // 학생 별 점수 설정
						{88,91,68},
						{97,83,75},
						
};
		
		//저장 공간 생성
		int[] sum = new int[3]; // 합계 저장 공간
		int[] sum_subject = new int[3]; // 과목별 합계 저장 공간
		int total_sum = 0; // 전체 합계 저장 공간
		float[] average = new float[3]; // 개개인의 평균이 저장될 공간
		float[] average_subject = new float[3]; // 과목별 평균이 저장될 공간
		float total_average = 0.0f; // 전체 평균의 합계가 저장될 공간 *float 사용하여 대입 데이터 옆에 f 붙임
		int[] rank = new int[3]; // 개인별 석차가 저장될 공간
		
		//평균 점수는 대게 소숫점까지 계산될 때가 많기 때문에 데이터 타입 float 사용
		
		// 개인별 점수 합계, 평균 계산 
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[1].length;j++){	
				sum[i]+=score[i][j]; // 개인별 점수의 합계가 sum의 i번째 요소에 저장됨
				average[i]=(int)sum[i]/score[1].length; // 점수 합계의 평균 산출-> average에 저장
			}
		}
		
		// 과목별 합계 및 평균 계산
		for(int i=0; i<score[1].length; i++){
			for(int j=0; j<score.length; j++){
				sum_subject[i]+=score[j][i]; // 과목별 점수 합계 계산(sum_subject에 저장)
				average_subject[i]=(int)sum_subject[i]/score.length; // 과목별 평균점수
			}
		}
		// 개인별 석차 계산
		for(int i=0; i<score.length; i++){
			int stat=1; // 초기값 1= 임시 변수 생성, 석차 결과에 대입될 예정
			for(int j=0; j<score.length; j++){
				if(sum[i] < sum[j]) //sum의 0번째요소와 0~4번째 요소를 비교(다른 것보다 작은지 검사)
					stat++; // 다른 것보다 작다면 1증가 >> 순위 매김
			}
			rank[i]=(int)stat; // stat에서 계산된 석차가 rank의 i번째 요소에 대입
		}
		
		//결과 테이블 표시
		System.out.println("이 름\t국어\t영어\t수학\t합계\t평균\t석차\n"+"===================================================");
		for(int i=0; i<score.length; i++){
			System.out.print(name[i]+"\t"); // 이름 출력
			for(int j=0; j<score[1].length; j++){
				System.out.print(score[i][j]+"\t"); // 개인별 점수 출력
			}
			System.out.print(sum[i]+"\t"); // 개인별 점수 합계 출력
			System.out.print(average[i]+"\t");
			//System.out.format("%.1f", average[i]); // 평균점수를 소수점 1자리까지 표시
			System.out.print("\t"+rank[i]); // 석차를 표시
			System.out.println(""); // 한 줄 띄우기
		}
		System.out.println("===================================================");
		System.out.println("타입\t국어\t영어\t수학\t전체 합계");
		System.out.println("===================================================");
		//합계 표시
		System.out.print("합계\t");
		for(int i=0; i<score[1].length; i++){
			System.out.print(sum_subject[i]+"\t"); // 각 과목의 합계를 표시
			total_sum+=sum_subject[i]; // 각 과목의 합계를 합함
		}
		System.out.println(total_sum); // 위에서 합한 과목 합계를 보여줌
		//평균 표시
		System.out.print("평균\t");
		for(int i=0; i<score[1].length; i++){
			System.out.print(average_subject[i]+"\t"); // 각 과목의 평균을 보여줌
			total_average+=average_subject[i]; // 모든 과목의 평균의 합
		}
		System.out.println(total_average); // 평균 총 합계
	}
}




