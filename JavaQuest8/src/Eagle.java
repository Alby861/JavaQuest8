public class Eagle extends Bird implements Fly {

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }
    @Override
    public void takeOff() {
        System.out.println(getName() + " take off in the sky.");
    }
    @Override
    public int  ascend(int meters) {
        System.out.println(getName() + " flies upward, altitude: " + meters);
        return meters;
    }
    @Override
    public int descend(int meters) {
        System.out.println(getName() + " it's going down, now it is at " + meters);
        return meters;
    }
    @Override
    public void land() {
        System.out.println(getName() + " lands on the ground.");
    }

    private boolean flying;
    private int altitude;



    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}