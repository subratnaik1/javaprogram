package com.subrat.blc;

public class Sourcing {
private int sourceID;
private String sourceName;
private double basicSalary;
private double HRAper;
private double DAPer;
private int  enrollmentTarget;
private int enrollmentReached;
private double perkPerEnrollment;

public Sourcing(int sourceID, String sourceName, double basicSalary, double hRAper, double dAPer, int enrollmentTarget,
		int enrollmentReached, double perkPerEnrollment) {
	super();
	this.sourceID = sourceID;
	this.sourceName = sourceName;
	this.basicSalary = basicSalary;
	HRAper = hRAper;
	DAPer = dAPer;
	this.enrollmentTarget = enrollmentTarget;
	this.enrollmentReached = enrollmentReached;
	this.perkPerEnrollment = perkPerEnrollment;
}

public int getSourceID() {
	return sourceID;
}

public void setSourceID(int sourceID) {
	this.sourceID = sourceID;
}

public String getSourceName() {
	return sourceName;
}

public void setSourceName(String sourceName) {
	this.sourceName = sourceName;
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

public int getEnrollmentTarget() {
	return enrollmentTarget;
}

public void setEnrollmentTarget(int enrollmentTarget) {
	this.enrollmentTarget = enrollmentTarget;
}

public int getEnrollmentReached() {
	return enrollmentReached;
}

public void setEnrollmentReached(int enrollmentReached) {
	this.enrollmentReached = enrollmentReached;
}

public double getPerkPerEnrollment() {
	return perkPerEnrollment;
}

public void setPerkPerEnrollment(double perkPerEnrollment) {
	this.perkPerEnrollment = perkPerEnrollment;
}

public double calculateGrossSalary()
{
	return this.basicSalary+this.HRAper+this.DAPer+(((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment);
}

}
