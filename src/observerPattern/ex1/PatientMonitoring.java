package observerPattern.ex1;

import java.util.ArrayList;

public class PatientMonitoring implements Subject {

    private int bloodPressure;
    private int electroCardioGram;
    private int position;
    private int pulseOximetry;

    private ArrayList<MyObserver> observerArrayList = new ArrayList<MyObserver>();

    public enum Problem {
        noProblem,
        bloodPressure,
        ECG,
        oximetry;
    }

    public PatientMonitoring(int bloodPressure, int electroCardioGram, int position, int pulseOximetry) {
        this.bloodPressure = bloodPressure;
        this.electroCardioGram = electroCardioGram;
        this.position = position;
        this.pulseOximetry = pulseOximetry;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        notifyObserver(Problem.bloodPressure);
    }

    public int getElectroCardioGram() {
        return electroCardioGram;
    }

    public void setElectroCardioGram(int electroCardioGram) {
        this.electroCardioGram = electroCardioGram;
        notifyObserver(Problem.ECG);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
        notifyObserver(Problem.noProblem);
    }

    public int getPulseOximetry() {
        return pulseOximetry;
    }

    public void setPulseOximetry(int pulseOximetry) {
        this.pulseOximetry = pulseOximetry;
        notifyObserver(Problem.oximetry);
    }

    @Override
    public void addObserver(MyObserver observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observerArrayList.remove(observer);

    }

    @Override
    public void notifyObserver(Problem problem) {
        for (MyObserver obs: observerArrayList) {
            obs.update(problem);
        }
    }
}
