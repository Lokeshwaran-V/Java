package day12;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class AttendanceTracker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		Add all students and their attendance status using put().
		HashMap <String, String> students = new HashMap<>();
		String [] names = {"Arun", "Priya", "Rahul", "Karthik", "Sneha"};
		String [] status = {"Present", "Absent", "Present", "Present", "Absent"};
		
		for(int i = 0; i < names.length; i++) {
			students.put(names[i], status[i]);
		}
		
//		Display the complete attendance Map.
		System.out.println();
		System.out.println("Students List");
		System.out.println(students.entrySet());
		
//		Ask the user to enter a student's name and display their attendance status.
		System.out.println();
		System.out.println("Enter a student name");
		String stname = scn.nextLine();
		System.out.println(students.get(stname));
		
//		Check whether a particular student exists using containsKey().
		System.out.println();
		System.out.println("Enter a student name to check if exists");
		String stContain = scn.nextLine();
		boolean stContains = students.containsKey(stContain);
		if(stContains) {
			System.out.println("The student " + stContain + " exist in the map.");
		}else {
			System.out.println("The student " + stContain + " does not exist in the map.");
		}
		
//		Check whether anyone is marked "Absent" using containsValue().
		System.out.println();
		boolean stAbsent = students.containsValue("Absent");
		if(stAbsent)
			System.out.println("Someone is absent.");
		

//		Display the total number of students using size().
		System.out.println();
		System.out.println("Total no of students exists : " + students.size());
		
//		Display only the student names using keySet().
		System.out.println();
		System.out.println("Students Names");
		System.out.println(students.keySet());
		
//		Display only the attendance statuses using values().
		System.out.println();
		System.out.println("Students Status");
		System.out.println(students.values());
		
//		Display each student along with their attendance using entrySet().
		System.out.println();
		for(Map.Entry<String, String> student : students.entrySet()) {
			String key = student.getKey();
			String value = student.getValue();
			System.out.println(key + " : " + value);
		}
		
//		Try adding a new student using putIfAbsent() so that an existing student's attendance is not accidentally overwritten.
		System.out.println();
		System.out.println("Enter a student name to add if not exist.");
		String newStname = scn.nextLine();
		
		System.out.println("Enter a student status");
		String newStvalue = scn.nextLine();
		
		students.putIfAbsent(newStname, newStvalue);
		
//		Bonus Challenge, Ask the user to enter a student name.
		System.out.println();
		System.out.println("Enter a student Name");
		String SN = scn.nextLine();
		boolean snContains = students.containsKey(SN);
		if(snContains) {
			System.out.println("Student : " + SN);
			System.out.println("Attendance : " + students.get(SN));
			
		}else {
			System.out.println("Student not found");
		}
		
//		Extra Challenge - Calculate and display:
		System.out.println();
		int present = 0;
		int absent = 0;
		
		for(Map.Entry<String, String> student : students.entrySet()) {
			String value = student.getValue();
			if(value == "Present") {
				present++;
			}else {
				absent++;
			}
		}
		
		System.out.println("Total Students : " + students.size());
		System.out.println("Present : " + present);
		System.out.println("Absent : " + absent);
		
		
		
		
		
	}

}
