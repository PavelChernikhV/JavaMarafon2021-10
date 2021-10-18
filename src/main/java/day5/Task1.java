package day5;
/*
    1. Создать класс Автомобиль (англ. Car) с полями “Модель”, “Цвет”, “Год выпуска”.
    Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
    Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей,
    используя get методы.
    Созданный вами класс должен отвечать принципам инкапсуляции.
 */


public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
            car1.setModel("Жигули");
            car1.setColor("Белый");
            car1.setYear(1988);
        System.out.println(car1.getModel()+" "+car1.getColor()+" "+car1.getYear());

        Car car2 = new Car();
            car2.setModel("Nexia");
            car2.setColor("Бежевый");
            car2.setYear(2000);
        System.out.println(car2.getModel()+" "+car2.getColor()+" "+car2.getYear());
    }
}

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

}
