package observerPattern.ex1;

public interface Subject {

    void addObserver (MyObserver observer);
    void removeObserver (MyObserver observer);
    void notifyObserver (PatientMonitoring.Problem problem);

}
