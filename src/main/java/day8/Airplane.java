package day8;

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

    @Override
    public String toString() {
        return "Airplane{" +
                producer + '\'' +
                year + " " +
                length + " " +
                weight + " " +
                '}';
    }
}