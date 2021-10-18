package day6;

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel (String userModel){
        model = userModel;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String userColor){
        color = userColor;
    }
    public String getColor() {return color;}
    public void setYear (int userYear){
        year = userYear;
    }
    public int getYear(){return Math.abs( year);}

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }
}
