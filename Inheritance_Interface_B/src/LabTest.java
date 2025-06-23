import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LabTest extends MedicalProcedure {
    private String location; // e.g., "clinic", "hospitalPremise", "outside"

    public LabTest(String procedureId, String procedureName, String scheduledTime, Doctor performedBy, String location)
    {
        super(procedureId, procedureName, parseTime(scheduledTime), performedBy);
        this.location = location;
    }

    private static LocalDateTime parseTime(String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mma");
        return LocalDateTime.parse(timeStr, formatter);
    }
    @Override
    public boolean validate() {
        return location.equalsIgnoreCase("clinic") || location.equalsIgnoreCase("hospitalPremise");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Location: " + location);
        System.out.println("Is Valid: " + validate());
    }
}
