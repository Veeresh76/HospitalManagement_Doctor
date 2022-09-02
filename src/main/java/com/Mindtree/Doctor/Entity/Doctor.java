package com.Mindtree.Doctor.Entity;




import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Doctor {
	
@Id
	private int id;
	
private	String name;
	
private	int age;
	
private	String gender;
	
private	String specalist;
	
private	int norPatientsAttended;
	
 

	public Doctor() {
		super();
		
	}

	public Doctor(int id, String name, int age, String gender, String specalist, int norPatientsAttended) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specalist = specalist;
		this.norPatientsAttended = norPatientsAttended;
		
	}


	public Doctor( String name, int age, String gender, String specalist, int norPatientsAttended) {
		super();
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specalist = specalist;
		this.norPatientsAttended = norPatientsAttended;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecalist() {
		return specalist;
	}

	public void setSpecalist(String specalist) {
		this.specalist = specalist;
	}

	public int getNorPatientsAttended() {
		return norPatientsAttended;
	}

	public void setNorPatientsAttended(int norPatientsAttended) {
		this.norPatientsAttended = norPatientsAttended;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", specalist="
				+ specalist + ", norPatientsAttended=" + norPatientsAttended + "]";
	}

	

	

	
	
	
	
	
	
	
	

}
