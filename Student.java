package com.telran.org.homeworknighteen.taskthree;

public class Student {

    private String name;
    private double rate;
    private boolean finished;



    private ClassType type;

    public Student(String name, double rate, boolean finished) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
    public ClassType getType() {
        return type;
    }

    public void setType(ClassType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", finished=" + finished +
                ", type=" + type +
                '}';
    }
}
