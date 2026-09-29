import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Instructor> instructors;
    private ArrayList<Textbook> textbooks;

    public Course(){
        instructors = new ArrayList<Instructor>();
        textbooks = new ArrayList<Textbook>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Instructor> getInstructors(){
        return instructors;
    }

    public void setInstructors(Instructor instructor){
        instructors.add(instructor);
    }

    public ArrayList<Textbook> getTextbooks(){
        return textbooks;
    }

    public void setTextbooks(Textbook textbook){
        textbooks.add(textbook);
    }

    @Override 
    public String toString(){
        return "Course name: " + name + ", Instructors: " + instructors.toString() + ", Textbooks: " + textbooks.toString();
    }

    public void print(){
        System.out.println(this.toString());
    }
}