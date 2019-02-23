import javafx.scene.paint.Color;

public interface Car {

    boolean isStarted();
    /**
     * This method tells you whether the car is started or not
     * @return true if the car is started
     */
    boolean start();

    /**
     * stop the engine
     * @return true if it was turned on
     */
    boolean stop();


    double steerLeft();
    double steerRight();

    /**
     * Use the engine to drive the car forward
     * @param power how much power in percentage
     * @return speed in km/h
     */
    double driveForward(int power);

    /**
     * Use the engine to drive the car backwards
     * @param power how much power in percentage
     * @return speed in km/h
     */
    double driveBackwards(int power);

    /**
     * get the car's licenseplate
     * @return licensplate
     */
    String getLicensePlate();

    /**
     * The color of the car
     * @return the color of the car
     */
    Color getColor();


}