package final_;

import java.util.PriorityQueue;

public class ERQueue {
    private PriorityQueue<Patient> patientQueue;

    public ERQueue() {
        
        patientQueue = new PriorityQueue<>();
    }

    public void arrive(String name, int priority, String condition, String time) {
        Patient newPatient = new Patient(name, priority, condition, time);
        patientQueue.add(newPatient);
        System.out.println(name + " has arrived.");
    }

    public void treatNext() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients in the queue to treat.");
            return;
        }
        Patient nextPatient = patientQueue.poll(); 
        System.out.println(" Treating patient now...");
        System.out.println("Treated: " + nextPatient.toString());
    }

    public void displayQueue() {
        System.out.println("---- UPDATED QUEUE ----");
        if (patientQueue.isEmpty()) {
            System.out.println("No patients waiting.");
            return;
        }

        System.out.println("Patients Waiting: " + patientQueue.size());
        int count = 1;
        
        for (Patient patient : patientQueue) {
            System.out.println(count++ + ". " + patient.toString());
        }
    }
}
