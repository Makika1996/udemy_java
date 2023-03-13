package appliances;

import java.util.Locale;

/**
 * Lernziel:
 * - Attribute deklarieren, Initialisierung
 * - Methoden schreiben
 * - Verdeckte Variablen, this
 * - Setter/Getter, JavaBeans
 */

public class Radio extends Appliance {
    public static final String SENDER_NAME_JAVA = "java";
    // Attribute
    private String name = "";
    protected double frequency;
    static private int volume;
    private Modulation modulation = Modulation.AM;

    // Statische Eigenschaften
    static double senderNameToFrequency(String name) {
        switch (name.toLowerCase(Locale.ROOT)) {
            case SENDER_NAME_JAVA:
                return 101;
            case "bestofjava":
                return 87;
            default:
                return 0;
        }
    }

    // Konstruktoren
    public Radio() {
        setOn(true);
    }

    public Radio(double frequency) {
        setFrequency(frequency);
    }

    public Radio(String senderName) {
        //this wäre eine Alternative
        setFrequency(senderNameToFrequency(senderName));
    }

    public Radio(double frequency, Modulation modulation) {
        setFrequency(frequency);
        setModulation(modulation);
    }

    // Setter/Getter
    int getVolume() {

        return volume;
    }

    final void setFrequency(double newFrequency) {

        if (newFrequency > 0)
            this.frequency = newFrequency;
    }

    double getFrequency() {

        return frequency;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        // Ref.
        this.name = name;
    }

    public Modulation getModulation() {
        return modulation;
    }

    public void setModulation(Modulation modulation) {
        if (modulation != null) this.modulation = modulation;
    }

    // Sonstiges
    public void volumeUp() {

        volume++;
    }

    public void volumeDown() {

        if (volume > 0)
            volume--;
    }

    @Override
    Type getType() {
        return Type.BROWN;
    }

    @Override
    public String toString() {
        return "Radio{" +
               super.toString() +
               ", name='" + name + '\'' +
               ", frequency=" + frequency +
               ", volume=" + volume +
               ", modulation=" + modulation +
               '}';
    }
}
