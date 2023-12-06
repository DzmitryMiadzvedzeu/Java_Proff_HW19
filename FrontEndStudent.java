package com.telran.org.homeworknighteen.taskthree;

public class FrontEndStudent extends Student{
    public FrontEndStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.setType(ClassType.FE);
    }
}
