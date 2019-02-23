import javafx.scene.paint.Color;


public class BMWCar implements Car  {

    private BMWEngine engine = new BMWEngine();

    private boolean started = false;
    private boolean startNow = false;
    private boolean stopNow = false;
    private double left = 0;
    private double right = 0;
    private String plate;
    private Color carCol;


    @Override
    public boolean isStarted() {
        return false;
    }

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public boolean stop() {
        return false;
    }

    @Override
    public double steerLeft() {
        return 0;
    }

    @Override
    public double steerRight() {
        return 0;
    }

    @Override
    public double driveForward(int power) {
        return 0;
    }

    @Override
    public double driveBackwards(int power) {
        return 0;
    }

    @Override
    public String getLicensePlate() {
        return null;
    }

    @Override
    public Color getColor() {
        return null;
    }
}
