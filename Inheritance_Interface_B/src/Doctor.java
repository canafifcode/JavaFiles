import java.util.Collections;
import java.util.List;

public class Doctor extends Person implements Prescribable_Interface {

    public int doctorID;
    public List<String> Specialization;

    public Doctor(String name, int age, String gender, String contactInfo, int doctorID) {
        super(name, age, gender, contactInfo);
        //this.Specialization = Specialization;
        this.doctorID = doctorID;
    }

    public boolean isCertifiedFor(String procedureName) {
        for (String a : Specialization) {
            if (a.equals(procedureName)) {
                return true;
            }
        }
        return false;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public List<String> getSpecialization() {
        return Specialization;
    }

    public void addSpecialization(String specialization) {
        Specialization = Collections.singletonList(specialization);
    }

    @Override
    public void showInfo() {
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Email: " + getContactInfo());

        System.out.println("Specialization List:");
        if (Specialization != null && !Specialization.isEmpty()) {
            for (String a : Specialization) {
                System.out.println("->" + a);
            }
        } else {
            System.out.println("None");
        }
    }

    public void prescribe(Patient patient, Medication medication) throws AllergyException {
        for (String medAllergen : medication.getAllergens()) {
            for (String patientAllergy : patient.getAllergies()) {
                if (medAllergen.equalsIgnoreCase(patientAllergy)) {
                    throw new AllergyException("Error: Patient is allergic to '" + medAllergen + "' in " + medication.getMedicationName());
                }
            }
        }
    }
}