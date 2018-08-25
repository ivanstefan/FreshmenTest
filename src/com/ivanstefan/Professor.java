package com.ivanstefan;


import java.util.ArrayList;
import java.util.List;

/**
 * This class describes a professor
 *
 * @author IvanStefan
 */
class Professor {

    private final int id;

    /**
     * @param id identification number of professor
     */
     Professor(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Professor" + this.id;
    }

    /**
     * This method is used to do a rollcall. It prints number and list of present/absent students
     *
     * @param list list of all students in the group
     */
    void rollcall(List<Student> list) {
        List<Student> present = new ArrayList<>();
        List<Student> absent = new ArrayList<>();
        for (Student student : list) {
            if (student.isPresent())
                present.add(student);
            else
                absent.add(student);
        }
        System.out.println("Present: " + present.size() + " students" + "\n" + present);
        System.out.println("Absent: " + absent.size() + " students" + "\n" + absent);

    }
}
