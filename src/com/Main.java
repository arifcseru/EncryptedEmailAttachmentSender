package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;


//A class to represent a student.
class Student
{
	Integer rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name,
							String address)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name +
						" " + this.address;
	}
}

class SortByRoll implements Comparator<Student>
{
String order;
SortByRoll(String order){
 this.order = order;
}
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b)
	{   if (this.order.equals("ASC")) 
		return a.rollno.compareTo(b.rollno);
		else return b.rollno.compareTo(a.rollno);
	}
}
class SortByName implements Comparator<Student>
{
String order;
SortByName(String order){
 this.order = order;
}
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b)
	{   if (this.order.equals("ASC")) 
		return a.name.compareTo(b.name);
		else return b.name.compareTo(a.name);
	}
}
class SortByAddress implements Comparator<Student>
{
String order;
SortByAddress(String order){
 this.order = order;
}
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b)
	{   if (this.order.equals("ASC")) 
		return a.address.compareTo(b.address);
		else return b.address.compareTo(a.address);
	}
}

//Driver class
class Main
{
	public static void mainTest (String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(131, "aaaa", "nyc"));
		ar.add(new Student(121, "cccc", "jaipur"));

		System.out.println("Unsorted");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));

		//Collections.sort(ar, new SortByRoll("ASC"));
		//Collections.sort(ar, new SortByName("ASC"));
		//Collections.sort(ar, new SortByAddress("ASC"));
		Collections.sort(ar, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});

		System.out.println("\nSorted by address");
		for (int i=0; i<ar.size(); i++)
			System.out.println(ar.get(i));
	}
}

class LocaleExample {
	public static void mainTest(String[] args) {
		Locale locale = Locale.getDefault();
		String[] countries = Locale.getISOCountries();
		for (String string : countries) {
			System.out.println(string);
		}
		// Locale locale=new Locale("fr","fr");//for the specific locale

		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());

	}
}