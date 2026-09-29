public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip (String name, int yearBuilt, int cargoCapacity){
        super(name, yearBuilt);
        setCargoCapacity(cargoCapacity);
    }

    public int getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity){
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print(){
        System.out.println("Ship name: " + super.getName() + ", cargo capacity: " + getCargoCapacity());
    }
}