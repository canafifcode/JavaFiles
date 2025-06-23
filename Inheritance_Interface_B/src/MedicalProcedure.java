import java.time.LocalDateTime;

public abstract class MedicalProcedure {
    protected String procedureId;
    protected String procedureName;
    protected LocalDateTime scheduledTime;
    protected Doctor performedBy;

    public MedicalProcedure(String procedureId, String procedureName,
                            LocalDateTime scheduledTime, Doctor performedBy) {
        this.procedureId = procedureId;
        this.procedureName = procedureName;
        this.scheduledTime = scheduledTime;
        this.performedBy = performedBy;
    }

    public abstract boolean validate();

    public void showInfo() {
        System.out.println("Procedure ID: " + procedureId);
        System.out.println("Procedure Name: " + procedureName);
        System.out.println("Scheduled Time: " + scheduledTime);
        System.out.println("Performed By: Dr. " + performedBy.getName());
    }

}
