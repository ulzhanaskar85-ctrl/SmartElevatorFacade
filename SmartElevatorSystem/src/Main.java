public class Main{
    public static void main(String[] args) {
        ElevatorFacade elevator = new ElevatorFacade();
        System.out.println("==SMART ELEVATOR SYSTEM==");
        elevator.displayCurrentFloor();
        elevator.goToFloor(5);
        elevator.goToFloor(2);
        elevator.goToFloor(15);
        elevator.goToFloor(2);
    }
}
