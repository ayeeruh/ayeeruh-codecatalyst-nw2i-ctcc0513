package codecatalystui;

public class Jobs {
	private String id;
	private String position;
	private String location;
	private double salary;
	private String contact_number;
	
	public Jobs (String id, String position, String location, double salary, String contact_number) {
		this.id = id;
		this.position = position;
		this.location = location;
		this.salary = salary;
		this.contact_number = contact_number;
        }

	public String getId() { return id; }
	public String getTitle() { return position; }
	public String getLocation() { return location; }
	public double getSalary() { return salary; }
	public String getContact() { return contact_number; }
}
