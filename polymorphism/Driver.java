public class Driver {
    public static void main(String[] args){
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Titanic", 1917);
        ships[1] = new CruiseShip("My boat", 2005, 10);
        ships[2] = new CargoShip("Crate boat", 1977, 59);

        for (int i = 0; i < ships.length; i++){
            ships[i].print();
        }
        
    }
}