public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Titanic Ship", "1956");
        ships[1] = new CruiseShip("Acteion Liner", "1965", 2500);
        ships[2] = new CargoShip("Liberty Vessel", "1978", 25000);

        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
    }
}
