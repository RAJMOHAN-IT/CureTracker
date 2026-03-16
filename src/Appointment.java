public class Appointment {
    private String doctorName;
    private String patientName;
    private String date;
    private String status;

    public Appointment(String doctorName, String patientName, String date) {
        this.doctorName  = doctorName;
        this.patientName = patientName;
        this.date        = date;
        this.status      = "Confirmed";
    }

    public void viewAppointment() {
        System.out.println("Doctor  : " + doctorName);
        System.out.println("Patient : " + patientName);
        System.out.println("Date    : " + date);
        System.out.println("Status  : " + status);
    }
}