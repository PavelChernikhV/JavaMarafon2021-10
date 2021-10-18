package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String grade;

    public Teacher(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void evaluate (Student student){

        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = "";

        switch (randomValue){
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценила студента с именем " + student.getName() + " по предмету "
                            + this.grade + " на оценку " + evaluation);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
