public class Patient extends Person {
    private String disease;
    private String bloodGroup;

    public Patient(String name, int age, String id, String disease, String bloodGroup) {
        super(name, age, id);
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public void getDetails() {
        System.out.println("Patient    : " + getName());
        System.out.println("ID         : " + getId());
        System.out.println("Age        : " + getAge());
        System.out.println("Disease    : " + disease);
        System.out.println("BloodGroup : " + bloodGroup);
    }
}