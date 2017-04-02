package day03;
import java.io.*;

/**
 * ���� �޷�
 * 2006�� 1�� 1���� ����(�Ͽ���)
 *
 */
public class Exam06 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(
						new InputStreamReader(System.in));
		int year=0, month=0;
		int start=0, end=0;
		int base=2006; 			//�⵵�� ���س�
		boolean bool=false; 	//���� üũ
		int pos=0;
		
		do{
			System.out.print("�⵵ �Է�(2017) : ");
			year = Integer.parseInt(in.readLine());
		}while(year<0 || year>9999);
		System.out.println();
		do{
			System.out.print("�� �Է�(3) : ");
			month = Integer.parseInt(in.readLine());
		}while(month<1 || month>12);
		
		//�ش� ������ ���� üũ
		if(year%4 == 0 && year%100!=0 ||year%400==0)
			bool=true;
		
		//�Էµ� �� �� �ϼ�
		switch(month){
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12: end=31; break;
		
		case 4: case 6: case 9: case 11:
			end=30; break;
		case 2:
			if(bool) end=29; else end=28;
			break;
		}
		
		if(year < base){
			start = base - year;
			for(int i=year;i<base;i++)
				if(year%4 == 0 && year%100!=0 ||year%400==0)
					start ++;
			start = 7 - start%7;
			if(start==7) start=0;			
		}else{
			start = year - base;
			for(int i=base;i<year;i++)
				if(year%4 == 0 && year%100!=0 ||year%400==0)
					start++;
			start%=7;
		}
		
		for(int i=1;i<month;i++){
			switch(i){
			case 1: case 3: case 5: case 7: case 8: 
			case 10: case 12: start+=31; break;
			
			case 4: case 6: case 9: case 11:
				start+=30; break;
			case 2:
				if(bool) start+=29; else start+=28;
				break;
			}
		}
		start%=7;
		
		System.out.print(year + "�� ");
		System.out.println(month + "��");
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i=0;i<start;i++,pos++)
			System.out.print("\t");
		//  1
		//10
		
		for(int i=1;i<=end;i++){
			if(i<10) System.out.print(' ');
			System.out.print(i);
			++pos;
			if(pos%7 ==0)
				System.out.println();
			else
				System.out.print("\t");
				
		}
		if(pos%7!=0)
			System.out.println();
		System.out.println("=========================");
		
		
		
	}

}












