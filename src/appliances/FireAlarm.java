package appliances;

public class FireAlarm extends Appliance {
    FireAlarm() {
//        super();
        System.out.println("FireAlarm");
        System.out.println(isOn());

    }

    @Override
    FireAlarm log() {
        System.out.println("Fire Alarm");
        return this;
    }

    public void setOn(boolean on) {
        if (!on)
            System.out.println("Kann nicht ausgeschaltet werd.");
    }

    @Override
    Type getType() {
        return Type.SMALL;
    }
}
