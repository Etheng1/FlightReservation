import java.sql.Date;

/*
 * Created by: Leena Chaleunsouk
 * On: 12/03/16 @ 6:20
 */

public class Flight 
{
	String startPoint;
	String endPoint;
	Date startTime;
	Date endTime;
	int numOfPassengers;
	String [] passengers = new String [numOfPassengers];
	
	public Flight()
	{
		
	}
	
	public String getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public String[] getPassengers() {
		return passengers;
	}
	public void setPassengers(String[] passengers) {
		this.passengers = passengers;
	}
	
}
