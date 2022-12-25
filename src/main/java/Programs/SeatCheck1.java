package programs;
class SeatCheck1
{
	public static void main(String[] args) 
	{
		String booked_seat = "B3 C9 N7 N16 ";
		String split[] = booked_seat.split(" ");
		System.out.println(split.length);
	}
}
