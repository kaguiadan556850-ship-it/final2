package final_;

public class Patient implements Comparable<Patient> {
    String name;
    int priority;
    String condition;
    String arrivalTime;

    public Patient(String name, int priority, String condition, String arrivalTime) {
        this.name = name;
        this.priority = priority;
        this.condition = condition;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int compareTo(Patient other) {
        
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        } else {
            
            return this.arrivalTime.compareTo(other.arrivalTime);
        }
    }

    @Override
    public String toString() {
        String priorityCode = "";
        if (priority == 1) priorityCode = "P1";
        else if (priority == 2) priorityCode = "P2";
        else if (priority == 3) priorityCode = "P3";
        else if (priority == 4) priorityCode = "P4";

        return String.format("[%s] %s - %s (%s)", priorityCode, name, condition, arrivalTime);
    }
}


