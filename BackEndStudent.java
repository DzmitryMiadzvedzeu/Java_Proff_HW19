package com.telran.org.homeworknighteen.taskthree;

public class BackEndStudent extends Student{

    public BackEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.setType(ClassType.BE);
    }
}
