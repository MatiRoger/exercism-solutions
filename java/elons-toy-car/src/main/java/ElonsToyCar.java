public class ElonsToyCar {

    public int distanceDriven = 0;
    public int batteryLeft = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryLeft <= 0) return "Battery empty";
        else return "Battery at " + this.batteryLeft + "%";
    }

    public void drive() {
        if (this.batteryLeft > 0) {
            this.batteryLeft -= 1;
            this.distanceDriven += 20;
        }
    }
}
