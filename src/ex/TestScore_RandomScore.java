package ex;

public class TestScore_RandomScore {

	    String Tony;
	    String Tiffany;
	    String Jennifer;

	    public TestScore_RandomScore(String Tony, String Tiffany, String Jennifer){
	        this.Tony =Tony;
	        this.Tiffany = Tiffany;
	        this.Jennifer = Jennifer;

	    }

	    //난수 선언을 통한 점수 산출
	    public void printScore() {

	        int[][] score = new int[3][3];

	        for (int i = 0; i < score.length; i++) {
	        
	            for (int j = 0; j < score[i].length; j++) {
	              
	                score[i][j] = (int)(Math.random() * (100 - 60 + 1) + 60);
	            }
	        }

	        //총합
	        int[] sum = new int[3];
	     
	        for (int i = 0; i < score.length; i++) {
	      
	            for (int j = 0; j < score[i].length; j++) {
	             
	                sum[i] += score[i][j];
	            }
	        }

	        //평균
	        double[] average = new double[3];
	        
	        for (int i = 0; i < average.length; i++) {
	         
	            average[i] = Math.round((double) (sum[i] / 3.0) * 100.0) / 100.0;
	        }

	        //등수
	        int[] rank = new int[3];
	      
	        for (int i = 0; i < rank.length; i++) {
	          
	            int temp = 1;
	            for (int j = 0; j < rank.length; j++) {
	            
	                if (sum[j] > sum[i]) {
	                    temp++;
	                }
	            }
	            rank[i] = temp;
	        }
	        
	        //결괏값 출력 가이드
	        System.out.println("이름 국어 영어 수학 합계 평균 등수");
	        System.out.println("========================================");
	        System.out.println(this.Tony + "\t" + score[0][0] + "\t" + score[0][1] + "\t" + score[0][2] + "\t" + sum[0] + "\t" + average[0] + "\t" + rank[0]);
	        System.out.println(this.Tiffany + "\t" + score[1][0] + "\t" + score[1][1] + "\t" + score[1][2] + "\t" + sum[1] + "\t" + average[1] + "\t" + rank[1]);
	        System.out.println(this.Jennifer + "\t" + score[2][0] + "\t" + score[2][1] + "\t" + score[2][2] + "\t" + sum[2] + "\t" + average[2] + "\t" + rank[2]);

	    

	    }
	    
	    public static void main(String[] args) {

	    	//학생 이름 대입하여 결괏값 출력
	        TestScore_RandomScore testScore = new TestScore_RandomScore("Tony", "Tiffany", "Jennifer");

	        testScore.printScore();
	
	    }
}

	    
