public class videogames extends rentableitems {
    private String name;
    private String condition;
    private double rentFee;
    private int returnBy;

    public videogames(String name, String condition, double rentFee, int returnBy){
        this.name = name;
        this.condition = condition;
        this.rentFee= rentFee;
        this.returnBy = returnBy;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public int getReturnBy() {
        return returnBy;
    }

    public void setReturnBy(int returnBy) {
        this.returnBy = returnBy;
    }

    
    
}
