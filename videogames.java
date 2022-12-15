public class videogames extends rentableitems {
    private String gamingDevice;
    

    public videogames(String name, String condition, double rentFee, String returnBy, String gamingDevice){
        super(name, condition, rentFee, returnBy);
        this.gamingDevice = gamingDevice;
       

    }


    public String getGamingDevice() {
        return gamingDevice;
    }


    public void setGamingDevice(String gamingDevice) {
        this.gamingDevice = gamingDevice;
    }

}