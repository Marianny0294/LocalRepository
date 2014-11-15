package EmploymentAgency;

public class Academic extends Person{
	
	public String Title;
	public GradeLevel gradelevel;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public GradeLevel getGradelevel() {
		return gradelevel;
	}
	public void setGradelevel(GradeLevel gradelevel) {
		this.gradelevel = gradelevel;
	}

}
