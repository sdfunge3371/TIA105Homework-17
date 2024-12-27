package work04;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Homework4_3 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個正整數");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();

		String strmonth = String.format("%02d", month);
		String strday = String.format("%02d", day);
		
		String strdate = year+"-"+strmonth+"-"+strday;
		String startdate = year+"-"+"01-01";
		if(isValidDate(strdate, "yyyy-MM-dd")) {
			LocalDate startDate = LocalDate.parse(startdate);
			LocalDate endDate = LocalDate.parse(strdate);
			long dayCount = ChronoUnit.DAYS.between(startDate, endDate);
		    System.out.printf("輸入的日期為該年第 %d 天", dayCount+1);
			
		}else {
			System.out.println("輸入錯誤");
		}
			
	}

	public static boolean isValidDate(String dateStr, String format) {
	
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(dateStr);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
