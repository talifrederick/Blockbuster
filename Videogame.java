public class Videogame extends rentableitems {
    private String gamingDevice;
    

    public Videogame(String name, String condition, double rentFee, String returnBy, String gamingDevice){
        super(name, condition, rentFee, returnBy);
        this.gamingDevice = gamingDevice;
       

    }


    public String getGamingDevice() {
        return gamingDevice;
    }


    public void setGamingDevice(String gamingDevice) {
        this.gamingDevice = gamingDevice;
    }

    public String toString(){
        return super.toString() + " Gaming platform: " + gamingDevice;
    }

}