package appliances;

import java.util.ArrayList;

public class House {
    ArrayList<Appliance> applicances = new ArrayList<>();

    void add(Appliance appliance) {
        System.out.printf("Elektrogerät %s wird hinzugefügt%n", appliance);
        applicances.add(appliance);
    }

    int numberOfActiveAppliances() {
        int result = 0;
        for (Appliance appliance : applicances) {
            if (appliance.isOn())
                result++;
        }
        return result;
    }

    public void off() {
        for (Appliance appliance : applicances) {
            appliance.setOn(false);
        }
    }

    @Override
    public String toString() {
        return "House{" + "applicances=" + applicances + '}';
    }
}
