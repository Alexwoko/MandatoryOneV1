public class BMWEngine implements Engine {

    private boolean started = false;
    private boolean stopped = false;
    private boolean accelBack = false;
    private boolean accelForward = false;

    /**
     * A boolean method to start the engine
     * @return started (false if the engine is already started)
     */

    @Override
    public boolean start() {
       if(!started){
           stopped = false;
           started = true;
            return true;
       }
       return false;
    }

    /**
     * A boolean  method to stop the engine
     * @return stopped ((false if the engine is already stopped))
     */

    @Override
    public boolean stop() {
        if(!stopped){
            started = false;
            stopped = true;
            return true;
        }
        return false;
    }

    /**
     * A boolean method to drive backwards
     * @return accelBack (false if the engine is already moving backwards)
     */


    @Override
    public boolean backwards() {
     if(!accelBack){
         accelForward = false;
         accelBack = true;
         return true;
     }
        return false;
    }

    /**
     * A boolean method to drive forwards
     * @return accelForward (false if the engine is already moving forwards)
     */

    @Override
    public boolean Forward() {
       if(!accelForward){
           accelBack = false;
           accelForward = true;
           return true;
       }
        return false;
    }

    /**
     *
     * @param power the amount of energy you give the engine. between 0 and 100
     * @return
     */

    @Override
    public double drive(int power) throws IllegalArgumentException {
        if (power > 0 && power < 100){
            return power;
        } else {throw new IllegalArgumentException("Invalid amount of power");
        }
    }
}
