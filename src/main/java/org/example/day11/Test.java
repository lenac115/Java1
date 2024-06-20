package org.example.day11;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("일반인", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));


        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);

        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);


        System.out.println("===================");
        System.out.println("===================");
        System.out.println("===================");

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);

    }

    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
    }

    public static <T extends Number> int compare(T a, T b) {
        double a1 = a.doubleValue();
        double b1 = b.doubleValue();

        return Double.compare(a1, b1);
    }

    public static <T extends String> void compareString(T t1, T t2) {
        System.out.println(t1.equals(t2) ? "okay" : "no");
    }
}

