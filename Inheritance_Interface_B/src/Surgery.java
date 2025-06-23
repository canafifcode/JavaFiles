import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Surgery extends MedicalProcedure {
    private final boolean anesthesiaGiven;

    public Surgery(String procedureId, String procedureName, String timeStr, Doctor performedBy, boolean anesthesiaGiven) {
        super(procedureId, procedureName, parseTime(timeStr), performedBy);
        this.anesthesiaGiven = anesthesiaGiven;
    }

    private static LocalDateTime parseTime(String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mma");
        return LocalDateTime.parse(timeStr, formatter);
    }

    @Override
    public boolean validate() {
        return anesthesiaGiven && performedBy.isCertifiedFor(procedureName);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Anesthesia Given: " + (anesthesiaGiven ? "Yes" : "No"));
        System.out.println("Is Valid: " + validate());
    }
}
