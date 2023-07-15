package entities;

import java.util.Date;

public class HourContract {
	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hour=" + hour + "]";
	}


	private Date date;
	private double valuePerHour;
	private int hour;
	
	public HourContract(Date date, double valuePerHour, int hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}



	
	public double totalValue() {
		return hour * valuePerHour;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}
}
