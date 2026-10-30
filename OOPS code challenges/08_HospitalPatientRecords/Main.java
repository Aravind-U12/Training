import java.util.LinkedHashMap;
import java.util.Map;

class Patient {
    private final int id;
    private final String name;
    private final int age;
    private final String diagnosis;

    public Patient(int id, String name, int age, String diagnosis) {
        if (id <= 0 || age < 0) throw new IllegalArgumentException("Invalid patient data");
        this.id = id;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getId() { return id; }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Age: %d | Diagnosis: %s%n",
                id, name, age, diagnosis);
    }
}

class PatientRegistry {
    private final Map<Integer, Patient> patients = new LinkedHashMap<>();

    public void register(Patient patient) {
        if (patients.containsKey(patient.getId())) {
            throw new IllegalArgumentException("Patient ID already exists");
        }
        patients.put(patient.getId(), patient);
    }

    public Patient find(int id) {
        return patients.get(id);
    }

    public void listAll() {
        if (patients.isEmpty()) {
            System.out.println("No patient records.");
            return;
        }
        patients.values().forEach(Patient::display);
    }
}

public class Main {
    public static void main(String[] args) {
        PatientRegistry registry = new PatientRegistry();
        registry.register(new Patient(501, "Meera", 32, "Seasonal flu"));
        registry.register(new Patient(502, "Rohan", 45, "Routine check-up"));
        System.out.println("PATIENT RECORDS");
        registry.listAll();

        Patient found = registry.find(501);
        System.out.println("Search result:");
        if (found != null) found.display();
    }
}
