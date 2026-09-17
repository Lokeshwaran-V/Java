package day7;
import java.util.Scanner;

public class employeePerformance {
	static class Employee{
		
		String empId;
		String empName;
		String department;
		int basicSalary;
		
		float average;
		float attendance;
		int deductionpercent;
		int bonus;
		
		int development = 0;		
		int testing = 0;		
		int data = 0;		
		int hr = 0;
		
		int highPerformer = 0;		
		int reliablePerformer = 0;		
		int needsAttention = 0;		
		int critical = 0;
		
		float highestAverage = 0;
		float lowestAverage = Float.POSITIVE_INFINITY;
		int highestNetSalary = 0;
		
		int bonusAmount;
		int netSalary;
		String performanceScore;
		
//		TOP PERFORMER
		String tpEmpId;
		String tpEmpName;
		String tpDepartment;
		float tpAverage = 0;
		float tpAttendance = 0;
		String tpPerformanceScore;
		int tpBonusAmount;
		int tpNetSalary;
		
		void employeeDetails() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter employee ID : ");
			empId = scn.nextLine(); 
			
			System.out.println("Enter employee name : ");
			empName = scn.nextLine();
			
			System.out.println("Enter department : ");
			department = scn.nextLine();
			
			switch (department) {
				case "Development", "development" :
					development += 1;
					break;
					
				case "Testing", "testing":
					testing += 1;
					break;
					
				case "Data", "data" :
					data += 1;
					break;
					
				case "HR", "hr" :
					hr += 1;
					break;
			}
			
			System.out.println("Enter basic salary : ");
			basicSalary  = scn.nextInt(); 
			
			System.out.println("Enter workinig days : ");
			int workingDays  = scn.nextInt();
			
			int daysPresent;
			while(true) {
				System.out.println("Enter days present : ");
				int presentdays  = scn.nextInt();
			
				if(workingDays >= presentdays) {
					daysPresent = presentdays;
					break;
					
				}else {
					System.out.println("Days present cannot be more than Working days");
					continue;
				}
			}

			attendance = (daysPresent * 100 / workingDays);
			
		}
		
		void performance() {
			Scanner scn = new Scanner(System.in);
			int total = 0;
			
			for(int i = 1; i <= 5; i++) {
				while (true) {
					System.out.println("Enter your performance " + i + " score between 0 and 100");
					int tScore = scn.nextInt();
					if(tScore >=0 && tScore <=100) {
						total = total + tScore;
						break;
					}else {
						System.out.println("Kindly provide performance score between 0 and 100");
						continue;
					}
				}
			}
			average = total / 5;
			
			if(highestAverage < average) {
				highestAverage = average;	
			}
			
			if(lowestAverage > average) {
				lowestAverage = average;
			}
			
			if(average >= 90) {
				performanceScore = "Outstanding";
				deductionpercent = 2;
				
			}else if(average >= 80) {
				performanceScore = "Excellent";
				deductionpercent = 4;
				
			}else if(average >= 70) {
				performanceScore = "Good";
				deductionpercent = 6;
				
			}else if(average >= 60) {
				performanceScore = "Average";
				deductionpercent = 8;
				
			}else {
				performanceScore = "Needs Improvement";
				deductionpercent = 10;
				
			}
		}
	
		void performanceBonus() {
			float pb = (average + attendance)/2;
			 
			if(pb >= 95) {
				bonus = 20;
				
			}else if(pb >= 90) {
				bonus = 15;
				
			}else if(pb >= 85) {
				bonus = 10;
				
			}else if(pb >= 80) {
				bonus = 5;
				
			}else {
				bonus = 0;
				
			}
		}
		
		void salaryClaculation() {
			
			bonusAmount = basicSalary * bonus / 100;
			int grossSalary = basicSalary + bonusAmount;
			int deduction =  grossSalary * deductionpercent / 100;
			netSalary = grossSalary - deduction;
			if(highestNetSalary < netSalary) {
				highestNetSalary = netSalary;
			}
		}
		
		void performanceLevel() {
			if(average >= 85 && attendance >= 90) {
				System.out.println("High Performer");
				highPerformer += 1;
				if(tpAverage <= average && tpAttendance <= attendance) {
					 tpEmpId = empId;
					 tpEmpName = empName;
					 tpDepartment = department;
					 tpAverage = average;
					 tpAttendance = attendance;
					 tpPerformanceScore = performanceScore;
					 tpBonusAmount = bonusAmount;
					 tpNetSalary = netSalary;
					
				}
				
			}else if(average >= 70 && attendance >= 85) {
				System.out.println("Reliable Performer");
				reliablePerformer += 1;
				
			}else if(average >= 60 && attendance >= 75) {
				System.out.println("Need Attention");
				needsAttention += 1;
				
			}else {
				System.out.println("Critical");
				critical += 1;
				
			}
		}
		
		void report(int empCount) {
			System.out.println("\n \n========================================");
			System.out.println("EMPLOYEE PERFORMANCE REPORT");
			System.out.println("======================================== \n");

			System.out.println("Total Employees : " + empCount + "\n");
			
			System.out.println("Development Employees : " + development );
			System.out.println("Testing Employees : " + testing );
			System.out.println("Data Employees : " + data );
			System.out.println("HR Employees : " + hr );
			
			System.out.println();
			System.out.println("High Performer : " + highPerformer );
			System.out.println("Reliable Performer : " + reliablePerformer );
			System.out.println("Need Attention : " + needsAttention );
			System.out.println("Critical : " + critical );
			
			System.out.println();
			System.out.println("Highest Average : " + highestAverage );
			System.out.println("Lowest Average : " + lowestAverage);
			
			System.out.println();
			System.out.println("Highest Net Salary : " + highestNetSalary);
			
			System.out.println("\n========================================");
			
			System.out.println("\nTOP PERFORMER");
			System.out.println("Employee ID : " + tpEmpId);
			System.out.println("Employee Name : " + tpEmpName);
			System.out.println("Department : " + tpDepartment);
			System.out.println("Average Score : " + tpAverage);
			System.out.println("Attendance : " + tpAttendance + " %");
			System.out.println("Performance : " + tpPerformanceScore);
			System.out.println("Bonus : " + tpBonusAmount);
			System.out.println("Net Salary : " + tpNetSalary);

		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Employee obj = new Employee();
		
		System.out.println("Enter the number of employees");
		int empCount = scn.nextInt();
		
		for(int i = 1; i <= empCount; i++) {
			System.out.println("Enter the employee " + i + " details");
			obj.employeeDetails();
			obj.performance();
			obj.performanceBonus();
			obj.salaryClaculation();
			obj.performanceLevel();
			
		}
		obj.report(empCount);
		

	}

}
