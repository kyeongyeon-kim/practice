//interface reservation {
//	default void booking(int what, int when, String who) {
//		System.out.println("예약합니다.");
//	}
//}
//
//class Guest {
//	private String guestName;
//	private int guestPhoneNumber;
//	private int groupNum;
//	public Guest(String guestName, int guestPhoneNumber, int groupNum) {
//		super();
//		this.guestName = guestName;
//		this.guestPhoneNumber = guestPhoneNumber;
//		this.groupNum = groupNum;
//	}
//	public String getGuestName() {
//		return guestName;
//	}
//	public void setGuestName(String guestName) {
//		this.guestName = guestName;
//	}
//	public int getGuestPhoneNumber() {
//		return guestPhoneNumber;
//	}
//	public void setGuestPhoneNumber(int guestPhoneNumber) {
//		this.guestPhoneNumber = guestPhoneNumber;
//	}
//	public int getGroupNum() {
//		return groupNum;
//	}
//	public void setGroupNum(int groupNum) {
//		this.groupNum = groupNum;
//	}
//	
//}
//
//class Room implements reservation {
//	
//	private int roomNumber;
//	protected boolean condition = true;
//	public Room(int roomNumber, boolean condition) {
//		super();
//		this.roomNumber = roomNumber;
//		this.condition = condition;
//	}
//	
//	
//}
//
//class Hotel extends Room  {
//	
//	public Hotel(int roomNumber, boolean condition) {
//		super(roomNumber, condition);
//	}
//
//	public void booking(int roomNumber, int when, String guestName) {
//		if (condition == true) {
//		super.condition = false;
//		System.out.println(when + "의 날짜로 " + roomNumber + "예약되었습니다. ");
//		} else {
//			System.out.println(when + "의 날짜로 " + roomNumber + "예약이 불가능합니다. ");
//		}
//	}
//	
//	
//}
//
//public class HotelManager {
//	public static void main(String[] args) {
//		Hotel[] h = new Hotel();
//
//	}
//
//}
