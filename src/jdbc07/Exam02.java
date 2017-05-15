package jdbc07;

class Numbercompare{
	public static <T extends Comparable<T>> String compare(T t1, T t2){
		if(t1.compareTo(t2) > 0)
			return "t1(" + t1 +")이 t2("+ t2 + ")보다 큽니다";
		else if(t1.compareTo(t2)< 0)
			return "t1(" + t1 +")이 t2("+ t2 + ")보다 작습니다";
		else
			return "t1(" + t1 +")이 t2("+ t2 + ")는 같습니다.";
	}
}
public class Exam02 {
	public static void main(String[] ar){
		Integer t1 = 100;
		Integer t2 = 200;
		String result = Numbercompare.compare(t1, t2);
		System.out.println("결과 : " + result);
	}
}
