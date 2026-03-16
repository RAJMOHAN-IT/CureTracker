import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("CureTrack Hospital");

        while (true) {
            System.out.println("\n===== CureTrack Hospital =====");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. Book Appointment");
            System.out.println("4. View All Doctors");
            System.out.println("5. View All Patients");
            System.out.println("6. View All Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Name: ");           String dName   = scanner.nextLine();
                        System.out.print("Age: ");            int dAge       = Integer.parseInt(scanner.nextLine());
                        System.out.print("ID: ");             String dId     = scanner.nextLine();
                        System.out.print("Specialization: "); String dSpec   = scanner.nextLine();
                        hospital.addDoctor(new Doctor(dName, dAge, dId, dSpec));
                        break;

                    case 2:
                        System.out.print("Name: ");        String pName  = scanner.nextLine();
                        System.out.print("Age: ");         int pAge      = Integer.parseInt(scanner.nextLine());
                        System.out.print("ID: ");          String pId    = scanner.nextLine();
                        System.out.print("Disease: ");     String pDis   = scanner.nextLine();
                        System.out.print("Blood Group: "); String pBlood = scanner.nextLine();
                        hospital.addPatient(new Patient(pName, pAge, pId, pDis, pBlood));
                        break;

                    case 3:
                        System.out.print("Doctor Name: ");  String aDoc  = scanner.nextLine();
                        System.out.print("Patient Name: "); String aPat  = scanner.nextLine();
                        System.out.print("Date: ");         String aDate = scanner.nextLine();
                        hospital.bookAppointment(new Appointment(aDoc, aPat, aDate));
                        break;

                    case 4: hospital.viewAllDoctors();       break;
                    case 5: hospital.viewAllPatients();      break;
                    case 6: hospital.viewAllAppointments();  break;
                    case 0:
                        System.out.println("Thank you for using CureTrack. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
    }
}