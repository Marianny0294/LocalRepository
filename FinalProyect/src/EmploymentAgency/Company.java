package EmploymentAgency;

public class Company {
	
	public String Name;
	public String WebPage;
	public CompanyType Sector;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getWebPage() {
		return WebPage;
	}
	public void setWebPage(String webPage) {
		WebPage = webPage;
	}
	public CompanyType getSector() {
		return Sector;
	}
	public void setSector(CompanyType sector) {
		Sector = sector;
	}
	

}