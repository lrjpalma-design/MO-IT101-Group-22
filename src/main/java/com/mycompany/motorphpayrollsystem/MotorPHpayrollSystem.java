
package com.mycompany.motorphpayrollsystem;

import java.util.Scanner;
import java.io.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class MotorPHpayrollSystem {

    static Scanner scanner = new Scanner (System.in);
   
    public static void main(String[] args) {
     
        System.out.println("********** MotorPH Payroll System **********");
        login();
        
    }
    
    public static void login() {
        
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
       
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        if (username.equals("employee") && password.equals("12345")) {
            employeeOption();
            
        } else if (username.equals("payroll_staff") && password.equals("12345")) {
            payrollStaffOption();
   
        } else {
            System.out.println("Incorrect username and/or password.");
            System.out.println("Program Terminated.");
        
        }
    }
    
    public static void employeeOption() {
        
        System.out.println("Employee Login");
        System.out.println("Select an option: ");
        System.out.println("1. Enter your Employee Number");
        System.out.println("2. Exit the program");
        
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();
        
        if (choice.equals("1")) {
            findEmployee();
        } else if (choice.equals("2")) {
            System.out.println("Exiting the program.");
        } else {
            System.out.println("Invalid choice, program terminated");
        }
    }
    
    public static void payrollStaffOption() {
        System.out.println("Payroll Staff Login");
        System.out.println("Select an option: ");
        System.out.println("1. Process Payroll");
        System.out.println("2. Exit the program");
        
        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            processPayroll();

        } else if (choice.equals("2")) {
            System.out.println("Exiting the program.");

        } else {
            System.out.println("Invalid choice, program terminated.");
        }
    }
    
    public static void processPayroll() {
        System.out.println("Process Payroll:");
        System.out.println("1. One Employee");
        System.out.println("2. All Employees");
        System.out.println("3. Exit the program");

        System.out.print("Your choice: ");
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            oneEmployee(); 

        } else if (choice.equals("2")) {
            allEmployees();

        } else if (choice.equals("3")) {
            System.out.println("Exiting the program.");
            
        } else {
            System.out.println("Invalid choice, program terminated.");
        }
}
    
    public static void findEmployee() {
        
        System.out.print("Enter your Employee Number: ");
        String empNum = scanner.nextLine();
        
        switch (empNum) {
            
            case "10001":
                System.out.println("Employee Number: 10001");
                System.out.println("Employee Name  : Manuel Garcia III");
                System.out.println("Birthday       : 10/11/1983");
                break;
                
            case "10002":
                System.out.println("Employee Number: 10002");
                System.out.println("Employee Name  : Antonio Lim");
                System.out.println("Birthday       : 06/19/1988");
                break;
                
            case "10003":
                System.out.println("Employee Number: 10003");
                System.out.println("Employee Name  : Bianca Sofia Aquino");
                System.out.println("Birthday       : 8/04/1989");
                break;
                
            case "10004":
                System.out.println("Employee Number: 10004");
                System.out.println("Employee Name  : Isabella Reyes");
                System.out.println("Birthday       : 06/16/1994");    
                break;
                
            case "10005":
                System.out.println("Employee Number: 10005");
                System.out.println("Employee Name  : Eduard Hernandez");
                System.out.println("Birthday       : 09/23/1989");    
                break;
                
            case "10006":
                System.out.println("Employee Number: 10006");
                System.out.println("Employee Name  : Andrea Mae Villanueva");
                System.out.println("Birthday       : 02/14/1988");    
                break;    
                
            case "10007":
                System.out.println("Employee Number: 10007");
                System.out.println("Employee Name  : Brad San Jose");
                System.out.println("Birthday       : 03/15/1996");    
                break;    
                
            case "10008":
                System.out.println("Employee Number: 10008");
                System.out.println("Employee Name  : Alice Romualdez");
                System.out.println("Birthday       : 05/14/1992");    
                break;    
                
            case "10009":
                System.out.println("Employee Number: 10009");
                System.out.println("Employee Name  : Rosie Atienza");
                System.out.println("Birthday       : 05/14/1992");    
                break; 
                
            case "10010":
                System.out.println("Employee Number : 10010");
                System.out.println("Employee Name   : Roderick Alvaro");
                System.out.println("Birthday        : 03/30/1988");
                break;

            case "10011":
                System.out.println("Employee Number : 10011");
                System.out.println("Employee Name   : Anthony Salcedo");
                System.out.println("Birthday        : 09/14/1993");
                break;

            case "10012":
                System.out.println("Employee Number : 10012");
                System.out.println("Employee Name   : Josie Lopez");
                System.out.println("Birthday        : 01/14/1987");
                break;

            case "10013":
                System.out.println("Employee Number : 10013");
                System.out.println("Employee Name   : Martha Farala");
                System.out.println("Birthday        : 01/11/1942");
                break;

            case "10014":
                System.out.println("Employee Number : 10014");
                System.out.println("Employee Name   : Leila Martinez");
                System.out.println("Birthday        : 07/11/1970");
                break;

            case "10015":
                System.out.println("Employee Number : 10015");
                System.out.println("Employee Name   : Fredrick Romualdez");
                System.out.println("Birthday        : 03/10/1985");
                break;

            case "10016":
                System.out.println("Employee Number : 10016");
                System.out.println("Employee Name   : Christian Mata");
                System.out.println("Birthday        : 10/21/1987");
                break;

            case "10017":
                System.out.println("Employee Number : 10017");
                System.out.println("Employee Name   : Selena De Leon");
                System.out.println("Birthday        : 02/20/1975");
                break;

            case "10018":
                System.out.println("Employee Number : 10018");
                System.out.println("Employee Name   : Allison San Jose");
                System.out.println("Birthday        : 06/24/1986");
                break;

            case "10019":
                System.out.println("Employee Number : 10019");
                System.out.println("Employee Name   : Cydney Rosario");
                System.out.println("Birthday        : 10/06/1996");
                break;

            case "10020":
                System.out.println("Employee Number : 10020");
                System.out.println("Employee Name   : Mark Bautista");
                System.out.println("Birthday        : 02/12/1991");
                break;

            case "10021":
                System.out.println("Employee Number : 10021");
                System.out.println("Employee Name   : Darlene Lazaro");
                System.out.println("Birthday        : 11/25/1985");
                break;

            case "10022":
                System.out.println("Employee Number : 10022");
                System.out.println("Employee Name   : Kolby Delos Santos");
                System.out.println("Birthday        : 02/26/1980");
                break;

            case "10023":
                System.out.println("Employee Number : 10023");
                System.out.println("Employee Name   : Vella Santos");
                System.out.println("Birthday        : 12/31/1983");
                break;

            case "10024":
                System.out.println("Employee Number : 10024");
                System.out.println("Employee Name   : Tomas Del Rosario");
                System.out.println("Birthday        : 12/18/1978");
                break;

            case "10025":
                System.out.println("Employee Number : 10025");
                System.out.println("Employee Name   : Jacklyn Tolentino");
                System.out.println("Birthday        : 05/19/1984");
                break;

            case "10026":
                System.out.println("Employee Number : 10026");
                System.out.println("Employee Name   : Percival Gutierrez");
                System.out.println("Birthday        : 12/18/1970");
                break;

            case "10027":
                System.out.println("Employee Number : 10027");
                System.out.println("Employee Name   : Garfield Manalaysay");
                System.out.println("Birthday        : 08/28/1986");
                break;

            case "10028":
                System.out.println("Employe e Number : 10028");
                System.out.println("Employee Name   : Lizeth Villegas");
                System.out.println("Birthday        : 12/12/1981");
                break;

            case "10029":
                System.out.println("Employee Number : 10029");
                System.out.println("Employee Name   : Carol Ramos");
                System.out.println("Birthday        : 08/20/1978");
                break;

            case "10030":
                System.out.println("Employee Number : 10030");
                System.out.println("Employee Name   : Emelia Maceda");
                System.out.println("Birthday        : 04/14/1973");
                break;

            case "10031":
                System.out.println("Employee Number : 10031");
                System.out.println("Employee Name   : Delia Aguilar");
                System.out.println("Birthday        : 01/27/1989");
                break;

            case "10032":
                System.out.println("Employee Number : 10032");
                System.out.println("Employee Name   : John Rafael Castro");
                System.out.println("Birthday        : 02/09/1992");
                break;

            case "10033":
                System.out.println("Employee Number : 10033");
                System.out.println("Employee Name   : Carlos Ian Martinez");
                System.out.println("Birthday        : 11/16/1990");
                break;

            case "10034":
                System.out.println("Employee Number : 10034");
                System.out.println("Employee Name   : Beatriz Santos");
                System.out.println("Birthday        : 08/07/1990");
                break;

            default:
                System.out.println("Employee number does not exist.");
                System.out.println("Program terminated.");
                break;    
                    
                
        }
    }
    
    public static void oneEmployee() {
        System.out.print("Enter Employee Number: ");
        String empNum = scanner.nextLine();

        try {
            File employeeFile  = new File ("Employee Details.csv");
            BufferedReader br = new BufferedReader(new FileReader(employeeFile));

            String line;
            boolean found = false;

            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] col = splitCSVLine(line);

                if (col[0].trim().equals(empNum)) {

                    found = true;

                    String empNumber = col[0].trim();
                    String empName = col[2].trim() + " " + col[1].trim(); 
                    String empBday = col[3].trim();

                    double hourlyRate = Double.parseDouble(col[18].trim());

                    
                    displayPayroll(empNumber, empName, empBday, hourlyRate);

                    break; 
                }
            }

            br.close(); 

            if (!found) {
                System.out.println("Employee number does not exist.");
                System.out.println("Program terminated.");
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void allEmployees() {
        
        try {
            File employeeFile  = new File ("Employee Details.csv");
            BufferedReader br = new BufferedReader(new FileReader(employeeFile));
 
            String line;
 
            br.readLine(); 
 
           
            while ((line = br.readLine()) != null) {
 
                String[] col = splitCSVLine(line);
 
              
                String empNumber  = col[0].trim();
                String empName    = col[2].trim() + " " + col[1].trim();
                String empBday    = col[3].trim();
                double hourlyRate = Double.parseDouble(col[18].trim());
          
                displayPayroll(empNumber, empName, empBday, hourlyRate);
            }
 
            br.close(); 
 
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void displayPayroll(String empNum, String empName, String empBday, double hourlyRate) {
 
        
        
        System.out.println("Employee Number : " + empNum);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Birthday        : " + empBday);
     
 
       
        int[]    months     = {6,      7,      8,        9,           10,        11,          12};
        String[] monthNames = {"June", "July", "August", "September", "October", "November",  "December"};
        int[]    lastDay    = {30,     31,      31,       30,          31,        30,           31};
 
       
        for (int i = 0; i < months.length; i++) {
 
            int    month = months[i];     
            String mName = monthNames[i]; 
            int    last  = lastDay[i];    
 
      
            double hours1st = getTotalHours(empNum, month, 1, 15);
            double hours2nd = getTotalHours(empNum, month, 16, last);
            double gross1st = hours1st * hourlyRate;
            double gross2nd = hours2nd * hourlyRate;
            double monthlySalary = gross1st + gross2nd;
 
        
            double sss        = computeSSS(monthlySalary);
            double philhealth = computePhilHealth(monthlySalary);
            double pagibig    = computePagIbig(monthlySalary);
            double tax        = computeTax(monthlySalary);
 
       
            double totalDeductions = sss + philhealth + pagibig + tax;
            double net1st = gross1st;
            double net2nd = gross2nd - totalDeductions;
 
         
        
    
            System.out.println("--- " + mName + " 1st Cutoff (" + mName + " 1 - 15) ---");
            System.out.println("Total Hours Worked : " + String.format("%.2f", hours1st));
            System.out.println("Gross Salary       : " + String.format("%.2f", gross1st));
            System.out.println("Net Salary         : " + String.format("%.2f", net1st));

            System.out.println("--- " + mName + " 2nd Cutoff (" + mName + " 16 - " + last + ") ---");
            System.out.println("Total Hours Worked : " + String.format("%.2f", hours2nd));
            System.out.println("Gross Salary       : " + String.format("%.2f", gross2nd));
            System.out.println("SSS                : " + String.format("%.2f", sss));
            System.out.println("PhilHealth         : " + String.format("%.2f", philhealth));
            System.out.println("Pag-IBIG           : " + String.format("%.2f", pagibig));
            System.out.println("Tax                : " + String.format("%.2f", tax));
            System.out.println("Total Deductions   : " + String.format("%.2f", totalDeductions));
            System.out.println("Net Salary         : " + String.format("%.2f", net2nd));
        }

    }
    
    public static double getTotalHours(String empNum, int month, int startDay, int endDay) {

        double totalHours = 0;

        try {
            
            File attendanceFile = new File("AttendanceRecord.csv");
            BufferedReader br = new BufferedReader(new FileReader(attendanceFile));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] col = line.split(",");

                if (!col[0].trim().equals(empNum)) {
                    continue;
                }

                String date = col[3].trim();
                String[] dateParts = date.split("/");
                int recMonth = Integer.parseInt(dateParts[0]);
                int recDay = Integer.parseInt(dateParts[1]);

                if (recMonth != month) {
                    continue;
                }
                if (recDay < startDay || recDay > endDay) {
                    continue;
                }

               
                LocalTime login = LocalTime.parse(col[4].trim(), DateTimeFormatter.ofPattern("H:mm"));
                LocalTime logout = LocalTime.parse(col[5].trim(), DateTimeFormatter.ofPattern("H:mm"));
                LocalTime graceEnd = LocalTime.of(8, 5);   
                LocalTime workStart = LocalTime.of(8, 0);  
                LocalTime cutoff = LocalTime.of(17, 0); 

               
                if (!login.isAfter(graceEnd)) {
                    login = workStart;
                }

            
                if (logout.isAfter(cutoff)) {
                    logout = cutoff;
                }

               
                long minutesWorked = Duration.between(login, logout).toMinutes();

            
                double hoursWorked = minutesWorked / 60.0;

             
                if (hoursWorked >= 8.0) {
                    hoursWorked = 8.0;
                } else {
                    hoursWorked = 7.5;
                }

                totalHours = totalHours + hoursWorked;
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading attendance file: " + e.getMessage());
        }

        return totalHours;
    }
    
    public static double parseTimeToMinutes(String time) {

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0].trim());
        int minutes = Integer.parseInt(parts[1].trim());
        return (hours * 60) + minutes;
    }
    public static double computeSSS(double monthlySalary){
        
        if (monthlySalary < 3250) {
            return 135.00;
        } else if (monthlySalary < 3750) {
            return 157.50;
        } else if (monthlySalary < 4250) {
            return 180.00;
        } else if (monthlySalary < 4750) {
            return 202.50;
        } else if (monthlySalary < 5250) {
            return 225.00;
        } else if (monthlySalary < 5750) {
            return 247.50;
        } else if (monthlySalary < 6250) {
            return 270.00;
        } else if (monthlySalary < 6750) {
            return 292.50;
        } else if (monthlySalary < 7250) {
            return 315.00;
        } else if (monthlySalary < 7750) {
            return 337.50;
        } else if (monthlySalary < 8250) {
            return 360.00;
        } else if (monthlySalary < 8750) {
            return 382.50;
        } else if (monthlySalary < 9250) {
            return 405.00;
        } else if (monthlySalary < 9750) {
            return 427.50;
        } else if (monthlySalary < 10250) {
            return 450.00;
        } else if (monthlySalary < 10750) {
            return 472.50;
        } else if (monthlySalary < 11250) {
            return 495.00;
        } else if (monthlySalary < 11750) {
            return 517.50;
        } else if (monthlySalary < 12250) {
            return 540.00;
        } else if (monthlySalary < 12750) {
            return 562.50;
        } else if (monthlySalary < 13250) {
            return 585.00;
        } else if (monthlySalary < 13750) {
            return 607.50;
        } else if (monthlySalary < 14250) {
            return 630.00;
        } else if (monthlySalary < 14750) {
            return 652.50;
        } else if (monthlySalary < 15250) {
            return 675.00;
        } else if (monthlySalary < 15750) {
            return 697.50;
        } else if (monthlySalary < 16250) {
            return 720.00;
        } else if (monthlySalary < 16750) {
            return 742.50;
        } else if (monthlySalary < 17250) {
            return 765.00;
        } else if (monthlySalary < 17750) {
            return 787.50;
        } else if (monthlySalary < 18250) {
            return 810.00;
        } else if (monthlySalary < 18750) {
            return 832.50;
        } else if (monthlySalary < 19250) {
            return 855.00;
        } else if (monthlySalary < 19750) {
            return 877.50;
        } else if (monthlySalary < 20250) {
            return 900.00;
        } else if (monthlySalary < 20750) {
            return 922.50;
        } else if (monthlySalary < 21250) {
            return 945.00;
        } else if (monthlySalary < 21750) {
            return 967.50;
        } else if (monthlySalary < 22250) {
            return 990.00;
        } else if (monthlySalary < 22750) {
            return 1012.50;
        } else if (monthlySalary < 23250) {
            return 1035.00;
        } else if (monthlySalary < 23750) {
            return 1057.50;
        } else if (monthlySalary < 24250) {
            return 1080.00;
        } else if (monthlySalary < 24750) {
            return 1102.50;
        } else {
            return 1125.00;
        }
    
    }
    public static double computePhilHealth(double monthlySalary) {

        double monthlyPremium;

        if (monthlySalary <= 10000) {
            monthlyPremium = 300; 

        } else if (monthlySalary < 60000) {
            monthlyPremium = monthlySalary * 0.03; 

        } else {
            monthlyPremium = 1800; 
        }

        
        return monthlyPremium / 2;
    }
    
    public static double computePagIbig(double monthlySalary) {

        if (monthlySalary >= 1000 && monthlySalary <= 1500) {
            return monthlySalary * 0.01;  

        } else {
            return monthlySalary * 0.02; 
}
    }
    
    public static double computeTax(double monthlySalary) {

        if (monthlySalary <= 20832) {
            return 0; 

        } else if (monthlySalary <= 33332) {
            return (monthlySalary - 20833) * 0.20;

        } else if (monthlySalary <= 66666) {
            return 2500 + (monthlySalary - 33333) * 0.25;

        } else if (monthlySalary <= 166666) {
            return 10833 + (monthlySalary - 66667) * 0.30;

        } else if (monthlySalary <= 666666) {
            return 40833.33 + (monthlySalary - 166667) * 0.32;

        } else {
            return 200833.33 + (monthlySalary - 666667) * 0.35;
        }
    }
    public static String[] splitCSVLine(String line) {

        String[] result = new String[19]; 
        int colIndex = 0;              
        boolean insideQuotes = false;          
        StringBuilder current = new StringBuilder(); 

        
        for (int i = 0; i < line.length(); i++) {

            char c = line.charAt(i); 

            if (c == '"') {
                insideQuotes = !insideQuotes;

            } else if (c == ',' && !insideQuotes) {
                if (colIndex < 19) {
                    result[colIndex] = current.toString();
                    colIndex++;
                    current = new StringBuilder(); 
                }

            } else {
                current.append(c);
            }
        }
        if (colIndex < 19) {
            result[colIndex] = current.toString();
        }

        return result; 
    }

}
