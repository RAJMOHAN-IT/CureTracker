import java.util.ArrayList;

public class Hospital {
      private String hospitalName;
    private ArrayList<Doctor>      doctors;
    private ArrayList<Patient>     patients;
    private ArrayList<Appointment> appointments;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors      = new ArrayList<>();
        patients     = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added successfully!");
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added successfully!");
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment booked successfully!");
    }

    public void viewAllDoctors() {
         System.out.println("Hospital : " + hospitalName);
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }
        System.out.println("===== All Doctors =====");
        for (Doctor d : doctors) {
            d.getDetails();
            System.out.println("-----------------------");
        }
    }

    public void viewAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }
        System.out.println("===== All Patients =====");
        for (Patient p : patients) {
            p.getDetails();
            System.out.println("------------------------");
        }
    }

    public void viewAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        System.out.println("===== All Appointments =====");
        for (Appointment a : appointments) {
            a.viewAppointment();
            System.out.println("----------------------------");
        }
    }
}