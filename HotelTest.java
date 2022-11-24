import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

class Customer {
	private String name;
	private int phoneNum;
}
class Date {
	private int year;
	private int month;
	private int day;
}
class Room {
	private Customer customers;
	private int Status;
	private boolean type;
	private int roomNum;
	
	
	public Customer getCustomers() {
		return customers;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
}
class HotelProgram {
	Scanner scan = new Scanner(System.in);
	private Room[][] rooms = new Room[4][20]; // 1층 로비 , 2~5층 객실 존재, 층마다 20객실
	// 홀수면 true == 싱글룸, 짝수면 false == 더블룸
	private Date Date;
	// Date가 상위 클래스에 그 안에 rooms가 있어야 될듯함.
	
	
	
	
	public Room[][] getRooms() {
		return rooms;
	}




	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}




	public Date getDate() {
		return Date;
	}




	public void setDate(Date date) {
		Date = date;
	}
	// (i - 2) == 200 ~ 520호실을 표현하려면 i가 2부터 시작해야함, ex) rooms[0 ... 3]
	// (j - 1) == 각 층의 첫 객실이 1호실인 것을 표현하기위해 j는 1부터 시작함.
	// if (rooms[i - 2][j - 1] == null) 이 문장을 컴파일러가 if (rooms[0][0] == null) 이렇게 인식하도록.
	// if (j == 20) 20은 10으로 나누어떨어져서 표현이 힘들어서 따로 if문을 주었음.
	public void emptyRooms() {
		int count = 0;
		for (int i = 2; i < rooms.length + 2; i++) {
			System.out.printf("[%d층]\n", i);
			for (int j = 1; j <= rooms[i - 2].length; j++) {
				if (rooms[i - 2][j - 1] == null) {
					if (j == 20) {
						System.out.printf("<%d%d호> ", i, 20);
					} else {
						System.out.printf("<%d%d%d호> ", i, j / 10, j % 10);
					}
				} else {
					if (j == 20) {
						System.out.printf("♥%d%d호♥ ", i, 20);
					}
					System.out.printf("♥%d%d%d호♥ ", i, j / 10, j % 10);
				}
				count++;
			}
			System.out.println();
		}
		System.out.printf("현재 빈객실은 %d객실입니다.\n", count);
	}

	public void printStatus() {
//		for (int i = 0; i < this.rooms.length; i++) {
//			for (int j = 0; j < this.rooms[i].length; j++) {
//				System.out.println(this.rooms[i][j].toString());
//			}
//		}
//		return "[" + Arrays.deepToString(rooms) + "]";
	}




	public HotelProgram() {
//		boolean onOff = true;
//		while (onOff) {
//			System.out.println("환영합니다.");
//			howManyDays();
//			System.out.println("싱글룸으로 예약하시겠습니까? 1번. 더블룸으로 예약하시겠습니까? 2번.");
//			System.out.println("날짜를 다시 입력하고 싶다면 1,2번 외 다른 숫자를 입력하세요.");
//			switch(scan.nextInt()) {
//			case 1:
//				System.out.println(singleRoom());
//				onOff = false;
//			case 2:
//				System.out.println(doubleRoom());
//				onOff = false;
//			default:
//				continue;
//			}
//		}
	}
			
	// roomNum == 방번호가 201이상 이고 520이하이며, 20호실을 넘어가지 않도록 설정.
	public int randomRoomNum() {
		while (true) {
			int roomNum = (int)(Math.random() * 1000) + 1;
			boolean trueRoomNum = roomNum <= 520 && roomNum > 200 && roomNum % 100 <= 20 && roomNum % 100 != 0;
			if (trueRoomNum) {
				return roomNum;
				}
			}
	}
	public int singleRoom() {
		while (true) {
			int num = randomRoomNum();
			if (num % 2 == 1) {
				return num;
			}
		}
	}
	public int doubleRoom() {
		while (true) {
			int num = randomRoomNum();
			if (num % 2 == 0) {
				return num;
			}
		}
	}
	
	public void howManyDays() {
		System.out.println("체크인을 원하는 년/ 월/ 일을 순서대로 입력해주세요.");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		Calendar checkIn = new GregorianCalendar(year, month - 1, day);
		System.out.println("체크아웃을 원하는 년/ 월/ 일을 순서대로 입력해주세요.");
		int year2 = scan.nextInt();
		int month2 = scan.nextInt();
		int day2 = scan.nextInt();
		Calendar checkOut = new GregorianCalendar(year2, month2 - 1, day2);
		long diffSec = (checkOut.getTimeInMillis() - checkIn.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24 * 60 * 60);
		System.out.printf("체크인 : %d/%d/%d\n", year, month, day);
		System.out.printf("체크아웃 : %d/%d/%d\n", year2, month2, day2);
		System.out.printf("총 %d박%d일\n", diffDays, diffDays + 1);
	}
}

public class HotelTest{
	public static void main(String[] args) {
		HotelProgram hp = new HotelProgram();
		System.out.println(hp.randomRoomNum());
		System.out.println(hp.singleRoom());
		System.out.println(hp.doubleRoom());
		hp.emptyRooms();
		hp.howManyDays();
		
		
	}
}