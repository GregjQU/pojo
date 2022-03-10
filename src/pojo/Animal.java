package pojo;
import java.time.LocalDate;
import java.time.Period;

//import org.ietf.jgss.Oid;
public class Animal {

	private String name;
	private String group;
	private int lifeSpan;
	private String location;
	private boolean endangered;
	private String diet;
	
	public Animal(String name, String group, int lifeSpan, String location,boolean endangered, String diet) {
		this.name = name;
		this.group = group;
		this.lifeSpan = lifeSpan;
		this.location = location;
		this.endangered = endangered;
		this.diet = diet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location= location;
	}
	
	public boolean getEndangered() {
		return endangered;
	}
	public void setEndangered( boolean endangered) {
		this.endangered = endangered; 
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Group: " + group);
		System.out.println("LifeSpan: " + lifeSpan + " year(s)");
		System.out.println("Location: " + location);
		System.out.println("Endangered: " + endangered);
		System.out.println("Diet: " + diet);
	}
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	*/
}
