import java.util.Calendar;
import java.util.Scanner;

public class D_day {
	
	//문제
	//입력을 어떤 방식으로 받을 것 인가? = 스캐너로 입력받음

	public static void main(String[] args) {
		
		////현재날짜 입력
		//1.스캐너로 20220117 형식으로 값을 입력받는다.
		Scanner scan = new Scanner(System.in);
		System.out.println("기준년월일을 입력하세요. ex)20220117");
		String input1 = scan.nextLine();
		
		//2.입력받은 값을 2022 / 01 / 17로 분리시킨다.
		String stryear1 = input1.substring(0, 4);
		String strmonth1 = input1.substring(4, 6);
		String strday1 = input1.substring(6, 8);
		
		//3.분리한 값을 int형으로 변환시킨다. 
		int year1 = Integer.parseInt(stryear1);
		int month1 = Integer.parseInt(strmonth1);
		int day1 = Integer.parseInt(strday1);
		
		//4.분리한 값을 Calendar.set()에 넣는다.
		Calendar referenceDay = Calendar.getInstance();
		referenceDay.set(year1, month1 +1 , day1);
		
		//5.입력한 날짜를  단위로 바꾸기.
		long ref = referenceDay.getTimeInMillis() / (24*60*60*1000);
		
		////최종날짜 입력
		//1.스캐너로 20220117 형식으로 값을 입력받는다.
		System.out.println("디데이를 알고싶은 날짜를 입력하세요. ex)20220117");
		String input2 = scan.nextLine();
		
		//2.입력받은 값을 2022 / 01 / 17로 분리시킨다.
		String stryear2 = input2.substring(0, 4);
		String strmonth2 = input2.substring(4, 6);
		String strday2 = input2.substring(6, 8);
		
		//3.분리한 값을 int형으로 변환시킨다.
		int year2 = Integer.parseInt(stryear2);
		int month2 = Integer.parseInt(strmonth2);
		int day2 = Integer.parseInt(strday2);
		
		//4.분리한 값을 Calendar.set()에 넣는다.
		Calendar targetDay = Calendar.getInstance();
		targetDay.set(year2, month2 +1 , day2);
		
		//5.입력한 날짜를  단위로 바꾸기.
		long tar = targetDay.getTimeInMillis() / (24*60*60*1000);
		
		////디데이 계산
		//1.초 단위로 되어있는 날짜를 일 단위로 바꾸고 두 날짜의 차이를 구한다.
		long d_day = tar - ref;
		System.out.println(d_day);
		
		scan.close();
	}

}
