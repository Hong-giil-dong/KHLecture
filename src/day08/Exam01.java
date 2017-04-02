package day08;

public class Exam01 {
	//멤버 필드
	int[] sub = new int[14];
	float avg;
	
	//메소드
	void calc(){
		int tot=0;
		for(int i = 0;i<sub.length;i++){
			tot+=sub[i];
		}
		avg = tot / sub.length;
	}
}
