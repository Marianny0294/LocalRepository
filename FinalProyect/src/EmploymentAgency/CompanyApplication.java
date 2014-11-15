package EmploymentAgency;

public class CompanyApplication {
	
	public enum WorkingDay{Fijo,Temporal,Parcial};
	public int EmployeeCant;
	public String WorkPosition;
	public String Area;
	public GradeLevel level;
	public int getEmployeeCant() {
		return EmployeeCant;
	}
	public void setEmployeeCant(int employeeCant) {
		EmployeeCant = employeeCant;
	}
	public String getWorkPosition() {
		return WorkPosition;
	}
	public void setWorkPosition(String workPosition) {
		WorkPosition = workPosition;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public GradeLevel getLevel() {
		return level;
	}
	public void setLevel(GradeLevel level) {
		this.level = level;
	}
	
	
}
