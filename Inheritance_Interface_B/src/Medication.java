import java.util.Collections;
import java.util.List;

public class Medication {
    private String MedicationName;
    public List<String> allergens;

    public Medication(String MedicationName){
        this.MedicationName=MedicationName;
        //this.allergens = new List<>();
    }

    public String getMedicationName() {
        return MedicationName;
    }

    public void setMedicationName(String medicationName) {
        MedicationName = medicationName;
    }

    public void addAllergen(String a) {
        allergens = Collections.singletonList(a);
    }

    public List<String> getAllergens() {
        return allergens;
    }
}
