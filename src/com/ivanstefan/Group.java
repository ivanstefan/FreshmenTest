package com.ivanstefan;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to create a group of students(they can select a prefect) and their first lecturer
 *
 * @author IvanStefan
 */
class Group {

    private final int groupId;
    private final Professor professor;
    private final List<Student> studentsList;

    /**
     * Constructor creates a group that has:
     * random groupId from 1 to 5(assume that we have only 5 groups of students)
     * random first lecturer(assume that we have only 5 professors)
     * list of 30 students, each has id, we don't specify their names
     * supposed that student has a soft skills rating from 50 to 100 and is present/absent at the lecture
     * we expect almost all students would visit their first lecture, so we use 0.9 in random expression for present parameter
     */
     Group() {
        groupId = (int) (Math.random() * 5 + 1);
        professor = new Professor((int) (Math.random() * 5 + 1));
        studentsList = new ArrayList<>();
        for (int i = 1; i < 31; i++)
            studentsList.add(new Student(i, (int) (Math.random() * 51 + 50), Math.random() < 0.9));

    }

    /**
     * this method just prints to the console list of students
     */
    void printStudentList() {
        studentsList.forEach(System.out::println);
    }

    /**
     * this method selects a prefect
     * supposed that prefect is a student with the highest soft skills rating and student must be present at the lecture
     * if we have more than 1 student with the highest rating we choose one with the lowest id
     *
     * @return Student which was selected as a prefect
     */
    Student selectPrefect() {
        List<Student> selectList = new ArrayList<>(studentsList);
        int maxSoftSkills = 0;
        int tempId = 0;
        for (Student student : selectList) {
            if (student.getSoftskills() > maxSoftSkills && student.isPresent()) {
                maxSoftSkills = student.getSoftskills();
                tempId = student.getId();
            }
        }

        System.out.println("The prefect of group " + groupId + " is " + selectList.get(tempId - 1));
        return selectList.get(tempId - 1);
    }

     int getGroupId() {
        return groupId;
    }

     Professor getProfessor() {
        return professor;
    }

     List<Student> getStudentsList() {
        return studentsList;
    }

}