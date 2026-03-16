public class Doctor extends Person implements Treatable {
    private String specialization;

    public Doctor(String name, int age, String id, String specialization) {
        super(name, age, id);
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        System.out.println("Doctor  : " + getName());
        System.out.println("ID      : " + getId());
        System.out.println("Age     : " + getAge());
        System.out.println("Special : " + specialization);
    }

    @Override
    public void diagnose() {
        System.out.println("Dr." + getName() + " is diagnosing the patient...");
    }

    @Override
    public void prescribe() {
        System.out.println("Dr." + getName() + " has prescribed the medicine.");
    }
}