package testing;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Exercise2_ArrayListOfTrainees {

	//member variables
	private String name;
	private String address;
	private LocalDate birthay;

	//constructors
	public Exercise2_ArrayListOfTrainees() {

	}
	public Exercise2_ArrayListOfTrainees(String name, String address, LocalDate birthay) {
		super();
		this.name = name;
		this.address = address;
		this.birthay = birthay;
	}

	//methods, setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBirthay() {
		return birthay;
	}
	public void setBirthay(LocalDate birthay) {
		this.birthay = birthay;
	}

	//toString
	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "\nTrainee:"+ 
				"\nname = " + name + 
				"\naddress = " + address + 
				"\nbirthay = " + birthay.format(format);
	}

	public static void main(String[] args) {
		Exercise2_ArrayListOfTrainees trainee1 = new Exercise2_ArrayListOfTrainees("Mary Jones", "Finglas Training Centre",
				LocalDate.of(1984, Month.APRIL, 01));
		Exercise2_ArrayListOfTrainees trainees2 = new Exercise2_ArrayListOfTrainees("John Lennon", "1 Grafton street",
				LocalDate.of(1977, Month.DECEMBER, 24));
		Exercise2_ArrayListOfTrainees trainee3 = new Exercise2_ArrayListOfTrainees("Agnes Brown", "Finglas, Main Street",
				LocalDate.of(1957, Month.MAY, 17));
		
		ArrayList<Exercise2_ArrayListOfTrainees> trList = new ArrayList<>();
		trList.add(trainee1);
		trList.add(trainees2);
		trList.add(trainee3);
		System.out.println(trList);
	}
}
