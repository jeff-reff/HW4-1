public class Ship {
    private String name;
    private int yearBuilt;

    public Ship (String name, int yearBuilt){
        setName(name);
        setYearBuilt(yearBuilt);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYearBuilt(){
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt){
        this.yearBuilt = yearBuilt;
    }

    public void print(){
        System.out.println("Ship name: " + name + ", year built: " + yearBuilt);
    }
}