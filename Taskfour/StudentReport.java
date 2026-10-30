class StudentReport {

    public void generateReport(Student student, String grade) {

        System.out.println("Student Report");
        System.out.println("----------------");

        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + grade);
    }
}