package day08;
import java.io.*;
public class Exam02 extends Object implements Serializable{
	private int[] sub; //Field
	private float avg;
	private String str;
	public Exam02(){ //Construct
		sub = new int[14];
		avg = 0.0f;
	}
	
	public void calc(){ //Method
		int tot=0;
		for(int i=0;i<sub.length;i++)
			tot += sub[i];
		avg = tot / sub.length;
	}
	
	public static class Exam02_sub{ //Nested class
		private String[] subname = {"국어", "영어","수학"};
		public String getSubname(int x){
			return subname[x];
		}
	}

}











