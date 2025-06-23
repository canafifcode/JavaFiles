import java.util.Collections;
import java.util.List;

public class Patient extends Person{
    private final String patientID;
    private List<String> allergies;
    private List<Medication> medications;
    private List<MedicalProcedure> medicalProcedures;

    public Patient(String name, int age, String gender, String contactInfo,String patientID){
        super(name, age, gender, contactInfo);
        //this.allergies=allergies;
       // this.medicalProcedures=medicalProcedures;
        this.patientID=patientID;
       // this.medications=medications;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public List<MedicalProcedure> getMedicalProcedures() {
        return medicalProcedures;
    }

    public String getPatientID() {
        return patientID;
    }

    public void addAllergies(String allergies) {
        this.allergies = Collections.singletonList(allergies);
    }

    public void addMedicalProcedures(MedicalProcedure medicalprocedures) {
        this.medicalProcedures = Collections.singletonList(medicalprocedures);
    }

    public void setMedications(Medication m) {
        this.medications = Collections.singletonList(m);
    }

    @Override
    public void showInfo() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Email: " + getContactInfo());

        System.out.println("Allergies' List:");
        if(allergies != null && !allergies.isEmpty()){
            for(String a: allergies){
                System.out.println("->"+a);
            }
        }
        else {
            System.out.println("None");
        }

        System.out.println("Medications' List:");
        if(medications != null && !medications.isEmpty()){
            for(Medication a: medications){
                System.out.println("->"+a);
            }
        }
        else {
            System.out.println("None");
        }
        System.out.println("Medical Procedures' List:");
        if(medicalProcedures!= null && !medicalProcedures.isEmpty()){
            for(MedicalProcedure a: medicalProcedures){
                System.out.println("->"+a);
            }
        }
        else {
            System.out.println("None");
        }
    }

    public void addAllergy(String salicylate) {
        allergies = Collections.singletonList(salicylate);
    }

    public void addMedicalProcedure(MedicalProcedure procedure) {
        medicalProcedures.add(procedure);
    }
}
