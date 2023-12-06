package com.telran.org.homeworknighteen.taskthree;

public class QAStudent extends Student{
    public QAStudent(String name, double rate, boolean finished) {
        super(name, rate, finished);
        this.setType(ClassType.QA);
    }
}
