package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
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

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
    public void addContract(HourContract contract) {
    	contracts.add(contract);
    }
    public void removeContract(HourContract contract) {
    	if (contracts.contains(contract)) {
    		for(int i=0; i<=contracts.size();i++) {
    			if(contracts.equals(contract)) contracts.remove(i);
    		}
    	}
    	else{
    		System.out.println("Esse contrato não existe");
    	}
    }
    public double income(int year, int month) {
    	double sum = baseSalary;
    	Calendar cal = Calendar.getInstance();
    	for(int i=0; i<contracts.size();i++) {
    		cal.setTime(contracts.get(i).getDate());
    		int yearContract=cal.get(Calendar.YEAR);
    		int monthContract=cal.get(Calendar.MONTH)+1;
    		if((year == yearContract) && (month == monthContract)) {
    			sum += contracts.get(i).totalValue();
    		}
    	}
    	return sum;
    }
    public String getNameDepartment() {
    	return department.getName();
    }
}
