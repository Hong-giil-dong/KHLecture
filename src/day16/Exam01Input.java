package day16;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exam01Input implements Serializable  {
	private String empNumber;
	private String empName;
	private String empDept;
	private String empJob;
	private String hireDate;
	private String brithDate;
	private String gender;
	private String basePay;
	
	public static void main(String[] ar){
		Vector vc = new Vector();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		SimpleDateFormat sdfYear = new SimpleDateFormat("YYYY");
		SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
		SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY?ÖÑMM?õîdd?ùº");
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYYMMdd");
		
		Calendar birth = Calendar.getInstance();
		
		
		try{
			File dir = new File("c:\\workspace\\data");
			File file = new File(dir, "employee.txt");
			FileReader fr = new FileReader(file);
			BufferedReader in = new BufferedReader(fr);
			
			File dir1 = new File("c:\\workspace\\data");
			File file1 = new File(dir, "data.txt");
			FileWriter fw = new FileWriter(file1, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			int i=0;
			String str;
			while((str = in.readLine()) != null){	
				System.out.println(str);
				String[] strArray = str.split(",");
				i=0;
				for(String obj : strArray){
					System.out.println(obj);
					if(i==4){
						String today = sdf3.format(new Date());
						Date beginDate = sdf3.parse(today);
						Date endDate = sdf3.parse(obj);
						
						Calendar yDay = Calendar.getInstance();
						Calendar toDay = Calendar.getInstance();
						int year = Integer.parseInt(sdfYear.format(obj));
						int month = Integer.parseInt(sdfMonth.format(obj));
						int day = Integer.parseInt(sdfDay.format(obj));
						
						yDay.set(year,  month+1, day);
						long diff = toDay.getTimeInMillis()-yDay.getTimeInMillis() /1000;
						long diffDay = diff/(60*60*24); //Í∏∞Í∞Ñ Ï∞®Ïù¥
						
						System.out.println("?ùº?ûê : " + diff);
					}
					bw.append(strArray[i]);
					i++;
				}
				bw.newLine();
			}
			bw.close();
		}catch(Exception e){}		
	}
}






