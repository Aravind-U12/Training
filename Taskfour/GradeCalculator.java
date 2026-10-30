class GradeCalculator {

    public String calculateGrade(Student student) {

        int marks = student.getMarks();

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else {
            return "C";
        }
    }
}