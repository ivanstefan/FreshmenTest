package com.ivanstefan;

/**
 * This class emulates first lecture of some group of students
 * Professor asks students to select a prefect and does a roll call
 *
 * @author IvanStefan
 */
public class FirstLecture {
    public static void main(String[] args) {
        Group group = new Group();
        System.out.println("Welcome to your first lecture, group" + group.getGroupId() + ".");
        System.out.println();
        System.out.println("Your lecturer is " + group.getProfessor() + ".");
        System.out.println();
        System.out.println(group.getProfessor() + " wants to see the list of students.");
        System.out.println();
        group.printStudentList();
        System.out.println();
        System.out.println(group.getProfessor() + " wants group" + group.getGroupId() + " to select the prefect.");
        System.out.println();
        group.selectPrefect();
        System.out.println();
        System.out.println(group.getProfessor() + " takes list of students to do a rollcall.");
        System.out.println();
        group.getProfessor().rollcall(group.getStudentsList());
    }
}
