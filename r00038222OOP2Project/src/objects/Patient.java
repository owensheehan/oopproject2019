package objects;

import java.time.LocalDate;

import list.AppointmentList;

public class Patient extends Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String AddLine1;
	String AddLine2;
	String AddLine3;
	String City;
	String County;
	LocalDate dob;
	String phone;
	AppointmentList appointments;

	public AppointmentList getAppointments() {
		return appointments;
	}

	public void setAppointments(AppointmentList appointments) {
		this.appointments = appointments;
	}

	public Patient() {
		this.appointments = new AppointmentList();

	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCounty() {
		return County;
	}

	public void setCounty(String county) {
		County = county;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String string) {
		this.phone = string;
	}

	public String getAddLine1() {
		return AddLine1;
	}

	public void setAddLine1(String addLine1) {
		AddLine1 = addLine1;
	}

	public String getAddLine2() {
		return AddLine2;
	}

	public void setAddLine2(String addLine2) {
		AddLine2 = addLine2;
	}

	public String getAddLine3() {
		return AddLine3;
	}

	public void setAddLine3(String addLine3) {
		AddLine3 = addLine3;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate localDob) {
		this.dob = localDob;
	}

}
