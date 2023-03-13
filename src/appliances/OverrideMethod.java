package appliances;

/**
 * Lernziel:
 * - Methoden überschreiben
 * - Annotation @Override
 * - super-Aufruf
 * - finale Methoden und finale Klassen
 * - kavariante Rükgabetypen
 */
public class OverrideMethod {
    public static void main(String[] args) {
        FireAlarm fireAlarm = new FireAlarm();
        fireAlarm.setOn(false);
        Appliance log = fireAlarm.log();

        System.out.println(new Radio().toString());

//        BadRadio badRadio = new BadRadio();
//        badRadio.setFrequency(-334444);
    }
}

//class BadRadio extends Radio {
//    @Override
//    void setFrequency(double newFrequency) {
//        frequency = newFrequency;
//    }
//}
