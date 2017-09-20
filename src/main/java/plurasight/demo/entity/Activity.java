package plurasight.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Activity {
	//station1 RAHULTX 12-29-201709:30:00
	@Id
	private String stationId;
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String plate;
	private String date;



}
