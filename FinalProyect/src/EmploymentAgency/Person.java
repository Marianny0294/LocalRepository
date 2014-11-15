package EmploymentAgency;

import java.util.Date;

public class Person {
	
	public String Name;
	public String LastName;
	public String ID;
	public String Phone;
	public String Mobile;
	public String Email;
	public enum sex {F,M};
	public Date Birth;
	public Address Address;
	public String Nationality;
	public int Age;
	public enum CivilState {Soltero,Casado,Viudo};
	public enum AcademicLevel{Universitario,Tecnico,Oficio};
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	};
	
	
	
	
	

}
