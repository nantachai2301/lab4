
public class Person {
	private Job job;
	
	public Person(){
		job = new Job();
		job.setSalary(12000);
	}
	
	public long getSalary(){
		return job.getSalary();	
	}
	
	public void setRole(String roleName){
		job.setRole(roleName);
	}
	
	public String getRole(){
		return job.getRole();
	}
	
	public String toString(){
		return "Role : "+getRole()+" Salary : "+getSalary();
		
	}
}
