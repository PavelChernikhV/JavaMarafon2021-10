package day5;
/*
    2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”.
    Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
    Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
    Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Чоппер", "Black", 2020);
        System.out.println(motorbike.getModel() + " " + motorbike.getColor() + " " + motorbike.getYear());
    }
}

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
}
