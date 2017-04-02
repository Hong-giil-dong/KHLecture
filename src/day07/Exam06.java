package day07;
/**
 * 밑면과 높이 정부를 저장할 수 있는 클래스를 정의 한다.
 * 생성과 동시에 초기화가 가능한 생성자도 정의 한다.
 * 밑변과 높이 정보를 변경시킬 수 있는 메소드와 삼각형의 넓이를 
 * 계산해서 반환하는 메소드도 정의 한다.
 *
 */
		
class Triangle{
	double bottom;
	double height;
	public Triangle(double bt, double ht){
		bottom = bt;
		height = ht;
	}
	
	public void setBottom(double bt){
		bottom = bt;
	}
	
	public void setHeight(double ht){
		height = ht;
	}
	
	public double getArea(){
		return bottom*height/2;
	}
	
}
public class Exam06 {
	public static void main(String[] ar){
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("삼각형 넓이 : " + tr.getArea());
		
		tr.setBottom(7.5);
		tr.setHeight(9.2);
		System.out.println("삼각형 넓이 : " + tr.getArea());
	}
}
