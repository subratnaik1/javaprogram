package com.subrat.blc;

public class Manager {
private int managerId;
private String managerName;
private double basicSalary;
private double HRAper ;
private double DAPer;
private double projectAllowence;

public Manager(int managerId, String managerName, double basicSalary, double hRAper, double dAPer,
		double projectAllowence) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.basicSalary = basicSalary;
	HRAper = hRAper;
	DAPer = dAPer;
	this.projectAllowence = projectAllowence;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}

public double getHRAper() {
	return HRAper;
}

public void setHRAper(double hRAper) {
	HRAper = hRAper;
}

public double getDAPer() {
	return DAPer;
}

public void setDAPer(double dAPer) {
	DAPer = dAPer;
}

public double getProjectAllowence() {
	return projectAllowence;
}

public void setProjectAllowence(double projectAllowence) {
	this.projectAllowence = projectAllowence;
}

public double calculateGrossSalary() {
	return this.basicSalary+this.HRAper+this.DAPer+this.projectAllowence;
}

}
