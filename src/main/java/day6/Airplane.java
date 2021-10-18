package day6;
/*
    fillUp(int n)
    “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”

 */
class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year +", длина: " +this.length+
                ", вес: "+ this.weight + ", количество топлива в баке: "+ this.fuel);
    }

    public void fillUp (int n){
         fuel = fuel + n;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
