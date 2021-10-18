package day6;

class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void setModel (String Model){this.model = Model;}
    public String getModel(){return model;}
    public void setColor(String Color){this.color = Color;}
    public String getColor() {return color;}
    public void setYear (int Year){this.year = Year;}
    public int getYear(){return Math.abs(year);}

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }
}