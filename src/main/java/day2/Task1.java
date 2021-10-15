package day2;
/*
    Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
    соответствующее количеству этажей в здании. Используя условный оператор if, необходимо вывести в консоль
    сообщение о типе такого дома.
    Условия: если этажей 1-4 - “Малоэтажный дом”,
    5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
    Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите какое нибудь число");
        int x = scanner.nextInt();
            if (x >=1 && x <= 4){
                System.out.println("Малоэтажный дом");
            } else if(x > 4 && x <= 8){
                System.out.println("Среднеэтажный дом");
            } else if(x >= 9) {
                System.out.println("Многоэтажный дом");
            } else {
                System.out.println("Ошибка ввода");
            }
    }
}