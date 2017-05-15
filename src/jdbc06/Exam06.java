package jdbc06;

//제네릭 타입 작성 예
class CommonData<T>{
	private T data;
	public void set(T data){
		this.data = data;
	}
	
	public T get(){
		return data;
	}
}
public class Exam06 {
	public static void main(String[] ar){
		CommonData<String> str_data = new CommonData<String>();
		CommonData<StringBuilder> str_build_data = 
				new CommonData<StringBuilder>();
		System.out.println("str_data : "+str_data.get());
		System.out.println("str_build_data : "+str_build_data.get());
	}
}
