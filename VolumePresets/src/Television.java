/*
 * sets class to model workings of a tv, no main method here
 *
 */
class Television {
    //sets attributes of tv, known as fields
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED; //default is always null for enums unless otherwise specified

    //for muting
    private boolean isMuted; //provide getter only
    private int oldVolume;  //no getter/setter

    //statics
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    //ctor
    public Television(){
        instanceCount++;
    }

    public Television(String brand) {
        this.brand = brand;
    }

    public Television(String brand, int volume) {
        this(brand);
        this.volume = volume;
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        this.display = display;
    }

    //functions/operations aka business methods what do tv's do?

    public boolean isMuted(){
        return false;
    }

    public void mute(){
        if(!isMuted()){ //not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else{   //currently muted, restore oldVolume
            setVolume(oldVolume);
            isMuted = false;
        }
    }

   public void turnOn() {
       boolean isConnected = verifyInternetConnection();

       System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume() + ".");
   }

   public void turnOff() {
       System.out.println("Shutting down...goodbye");
   }
   private boolean verifyInternetConnection(){
        return true; //fake implementation
   }


    //accessor methods

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Toshiba")){
            this.brand = brand;
        }
        else{
            System.out.println("Error brand must be Samsung or LG or Toshiba" );
        }
    }

    public int getVolume() {
       return volume;
    }

    public void setVolume(int volume) {
        if(MIN_VOLUME <= volume && volume <= MAX_VOLUME){
            this.volume = volume;
            isMuted = false;
        }
        else{
            System.out.println("Error, volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }

    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    //toString
    @Override
    public String toString() {
        String volumeString = isMuted() ?  "<muted>" : String.valueOf(getVolume());

        return ("Television brand = " + getBrand() +
                ", volume= " + volumeString +
                " Display = " + getDisplay());
                }

}
