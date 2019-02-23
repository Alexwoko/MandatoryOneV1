import javafx.scene.paint.Color;


public class BMWCar implements Car  {

    private BMWEngine engine = new BMWEngine();

    private boolean started;
   // private boolean startNow = false;
   // private boolean stopNow = false;
    private double left;
    private double right;
    private String plate;
    private Color carCol;

    public BMWCar(Color carCol_){

        carCol = carCol_;
        started = false;
        left = 0;
        right = 0;
        plate = "Ride4Sale";

    }

    @Override
    public boolean isStarted() {
       return started;
    }

    @Override
    public boolean start() {

        if(!started){
            started = true;
            engine.start();
            return true;
        }
            return false;

    }

    @Override
    public boolean stop() {

        if(started){
            started = false;
            engine.stop();
            return true;
        }
        return false;
    }

    @Override
    public double steerLeft() {

        if(left < 100){
            left += 5;
            right -= 5;
        }
        return left;
    }

    @Override
    public double steerRight() {

        if(right < 100){
            right += 5;
            left -= 5;
        }
        return right;
    }

    @Override
    public double driveForward(int power) throws IllegalArgumentException {
        if (power > 0 && power < 100){
            engine.drive(power);
            engine.forward();
            return power;
        } else {
            throw new IllegalArgumentException("Invalid amount of power");
        }
    }

    @Override
    public double driveBackwards(int power) {

        if(power > 0 && power < 100){
            engine.drive(power);
            engine.backwards();
            return power;
        } else {
            throw new IllegalArgumentException("Invalid amount of power");
        }

    }

    @Override
    public String getLicensePlate() {
        return plate;
    }

    @Override
    public Color getColor() {
        return carCol;
    }
}
