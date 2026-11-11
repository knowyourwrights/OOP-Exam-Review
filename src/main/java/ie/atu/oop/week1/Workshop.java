package ie.atu.oop.week1;

import java.util.HashSet;
import java.util.Set;

public class Workshop {

    HashSet<String> registrations = new HashSet<>();
    private String workshopName;
    private int capacity;

    public Workshop(String workshopName, int capacity)
    {
        this.workshopName = workshopName;
        this.capacity = capacity;
    }

    public Workshop()
    {
        this.workshopName = "";
        this.capacity = 0;
    }
}
