package examale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	private String name;

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if ( getAge() > o.getAge()) {
            return 1;
        } else if ( getAge() < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    //重写toString() 用于输出
    public String toString() {
        return "[" + name + "," + age + "]";
    }

    public static void main(String args[]){
    	long round = Math.round(-1.5);
    	System.out.println(round);
        Student s1 = new Student("Tom", 12);
        Student s2 = new Student("Marry", 12);
        Student s3 = new Student("Json", 88);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        System.out.printf("Original  sort, list:%s\n", studentList);
    }

}
