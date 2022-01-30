package paul.ciciovean.gps.model;

import java.sql.Date;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double latitude;
	private double longitude;
	private Long terminalId;
	private Instant dateTime;
	
	public Position() {}
	
	public Long getId()
	{
		return this.id;
	}
	public void setId(Long id)
	{
		this.id=id;
	}
	
	public double getLatitude()
	{
		return latitude;
	}
	public void setLatitude(double lat)
	{
		this.latitude=lat;
	}
	public double getLongitude()
	{
		return longitude;
	}
	public void setLongitude(double longitude)
	{
		this.longitude=longitude;
	}
	
	public Long terminalId()
	{
		return terminalId;
	}
	public void setTerminalId(Long terminalid)
	{
		this.terminalId=terminalid;
	}
	public Instant getDateTime()
	{
		return this.dateTime;
	}
	
	public void setDateTime(Instant datetime)
	{
		this.dateTime=datetime;
	}
}
