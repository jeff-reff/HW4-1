public class Driver{
    public static void main(String[] args){
        Course c1 = new Course();

        Instructor c1Instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook c1Textbook = new Textbook("CLean Code", "Robert Cecil Martin", "Pearson");
    
        c1.setName("CS3560");
        c1.setInstructors(c1Instructor);
        c1.setTextbooks(c1Textbook);
        c1.print();

        Course c2 = new Course();

        Instructor c2Instructor = new Instructor("Dave", "Matthews", "4-5532");
        Textbook c2Textbook = new Textbook("Coding 101", "John Computer Science", "McGraw Hill");
    
        c2.setName("CS2000");
        c2.setInstructors(c2Instructor);
        c2.setTextbooks(c2Textbook);
        c2.print();

        Course c3 = new Course();

        Instructor c3Instructor = new Instructor("Gordan", "Hayword", "1-1982");
        Textbook c3Textbook = new Textbook("Hoopology 101", "Mr smarty pants", "Math");
    
        c3.setName("H1000");
        c3.setInstructors(c3Instructor);
        c3.setTextbooks(c3Textbook);
        c3.print();
    }
}