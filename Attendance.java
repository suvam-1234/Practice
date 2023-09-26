/*Write a Java switch case program to take the students names and attendance % of 10 students as input and display their grades according to the below conditions:
 * If attendance above 90 then “A” 
 * If attendance between 90-80 then “B” 
 * If attendance between 80-70 then “C” 
 * If attendance between 70-60 then “D” 
 * If attendance between 45-60 then “E”
 */
package Java;
import java.util.*;

public class Attendance {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
        	//Taking the student name
            System.out.println("Enter the name of student " + i + ":");
            String name = scanner.nextLine();
            
            //Taking the attendance Percentage
            System.out.println("Enter the attendance percentage of student " + i + ":");
            double attendance = scanner.nextDouble();
            scanner.nextLine(); 
            
            char grade;
            
            int attendancePercentage = (int) attendance;
            switch (attendancePercentage / 10) { //using switch case
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                case 5:
                case 4:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
            }
            
            System.out.println(name + "'s grade is " + grade);
        }
        
        scanner.close();
    }}

