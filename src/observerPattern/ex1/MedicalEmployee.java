package observerPattern.ex1;

public class MedicalEmployee implements MyObserver {

    private String name;
    private PatientMonitoring patientMonitoring;

    public MedicalEmployee(String name, PatientMonitoring patientMonitoring) {
        this.name = name;
        this.patientMonitoring = patientMonitoring;
        patientMonitoring.addObserver(this);
    }

    @Override
    public void update(PatientMonitoring.Problem problem) {
        System.out.print("Employeename: " + name + " ");
        switch (problem){
            case noProblem:
                System.out.println("new Position: " + patientMonitoring.getPosition());
                break;
            case ECG:
                System.out.println("new ECG: " + patientMonitoring.getElectroCardioGram());
                break;
            case oximetry:
                System.out.println("new Oximetry: " + patientMonitoring.getPulseOximetry());
                break;
            case bloodPressure:
                System.out.println("new blood pressure: " + patientMonitoring.getBloodPressure());
                break;
        }
    }
}
