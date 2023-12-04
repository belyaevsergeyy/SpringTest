package by.it;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String group;
    private Double ball;

    public Student(){
        name = "";
        group = "";
        ball = 4.4;
    }
    public Student(String name, String group, Double ball){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Double getBall() {
        return ball;
    }

    public void setBall(Double ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", ball=" + ball +
                '}';
    }
}
