package day12;
import java.io.*;

/**
 * 
 * 3������ ������ �Է¹޾� ���� ��� ������ ����ϴ� ���α׷��� 
 * Ŭ������ ������ ������ �ۼ� �Ͻÿ�.
 * �ִ� 10���� �л��� ������ �Է� ������ �ִ�.
 *
 */
public class Exam01 {
	public static void main(String[] ar) throws IOException{
		Sung[] sc = new Calc[10]; //������ ����	
		int[] rank = new int[10];
		
		
		for(int i=0;i<3;i++){
			
			sc[i] = new Calc();
			sc[i].calculation();
			
		}
		
		
		for(int i=0;i<3;i++){
			rank[i]=1;
			for(int j=0;j<3;j++){
				if(sc[i].tot<sc[j].tot){
					rank[i]++;
				}
			}
		}
		
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for(int i=0;i<3;i++){
			sc[i].disp();
			System.out.println("\t" + rank[i]);
		}
		
		
	}

}
