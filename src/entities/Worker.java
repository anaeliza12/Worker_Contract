package entities;

import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
	@Override
	public String toString() {
		return "Worker [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + ", departament="
				+ departament + ", contracts=" + contracts + "]";
	}
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private Department departament;
	
	ArrayList<HourContract> contracts = new  ArrayList<HourContract>();
	
	
	public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = department;
	}
	
	public  ArrayList<HourContract> getContract() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double total = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract h : contracts) {
			cal.setTime(h.getDate());
			int cal_year = cal.get(Calendar.YEAR);
			int cal_month = cal.get(Calendar.MONTH);
			if(year == cal_year && month == cal_month) {
				total += h.totalValue();
				
			}
		}
		
		return total;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return departament;
	}
	
	
	
	

}
