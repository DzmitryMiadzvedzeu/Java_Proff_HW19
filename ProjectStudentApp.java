package com.telran.org.homeworknighteen.taskthree;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectStudentApp {
    public static void main(String[] args) {

        List<Student> backEndStudents = Arrays.asList(
                new Student("Michal", 4.3, true),
                new Student("Eve", 4.7, true),
                new Student("Dave", 4.2, false),
                new Student("Russel", 4.4, true),
                new Student("George", 4.6, true));

        List<Student> frontEndStudents = Arrays.asList(
                new Student("Stephen", 4.8, true),
                new Student("Tiffany", 4.9, true),
                new Student("Margaret", 4.2, true),
                new Student("Travis", 4.4, false),
                new Student("John", 4.1, false));

        List<Student> qaEndStudents = Arrays.asList(
                new Student("Serge", 4.9, false),
                new Student("Valery", 4.8, true),
                new Student("Suzan", 4.1, true),
                new Student("Amanda", 4.2, false),
                new Student("Victory", 4.5, true));

        List<List<Student>> allStudents = Arrays.asList( backEndStudents, frontEndStudents, qaEndStudents);

        List<ProjectStudent> projectStudents = allStudents.stream()
                .flatMap(List::stream)
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .peek(student -> {
                    if (student instanceof BackEndStudent) {
                        student.setType(ClassType.BE);
                    } else if (student instanceof FrontEndStudent) {
                        student.setType(ClassType.FE);
                    } else if (student instanceof QAStudent) {
                        student.setType(ClassType.QA);
                    }
                })
                .map(student -> new ProjectStudent(student.getName(), student.getRate(), student.getType()))
                .collect(Collectors.toList());
        System.out.println(projectStudents);
    }
}
// программа выводит не корректно, испробовал всё, лекции, форумы, гуглёж,
// и чат гпт......... проблема в том что программа не знает какой брать setType
// мне нужно, чтобы она брала его из соответствующих классов, а она берёт из
// родителя. Пробовал прописывать классы - программа не работает вообще(((((

