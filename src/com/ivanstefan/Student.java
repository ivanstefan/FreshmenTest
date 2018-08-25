package com.ivanstefan;

/**
 * This class describes a student
 *
 * @author IvanStefan
 */
class Student {

    private final int id;
    private final int softskills;
    private final boolean present;

    /**
     * @param id         identification number of student
     * @param softskills shows level of communication skills
     * @param present    boolean specifies whether student is present at lecture or not
     */
     Student(int id, int softskills, boolean present) {
        this.id = id;
        this.softskills = softskills;
        this.present = present;
    }

    @Override
    public String toString() {
        return "Student" + this.id;
    }

     int getId() {
        return id;
    }

     int getSoftskills() {
        return softskills;
    }

     boolean isPresent() {
        return present;
    }

}

