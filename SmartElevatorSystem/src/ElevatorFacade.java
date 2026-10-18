public class ElevatorFacade{
private final ElevatorMotor motor;
private final DoorSystem doors;
private final FloorSensor sensor;
private final SafetySystem safety;
private final FloorIndicator indicator;

private boolean moving = false;

public ElevatorFacade() {
    motor = new ElevatorMotor();
    doors = new DoorSystem();
    sensor = new FloorSensor();
    safety = new SafetySystem();
    indicator = new FloorIndicator();
}
public void goToFloor(int targetFloor) {
    if (targetFloor < 1 || targetFloor > 10) {
        System.out.println("Elevator: Invalid floor. Choose floor 1- 10.");
        return;
    }
    int currentFloor = sensor.getCurrentFloor();
    if (targetFloor == currentFloor) {
        System.out.println("Elevator: You are already on floor" + currentFloor + ".");
        return;
    }
    System.out.println("\nRequest received: Go to floor" + targetFloor);
    doors.closeDoors();
    if (!safety.canMove(doors)) {
        System.out.println("Elevator: Movement cancelled for safety.");
        return;
    }
    moving = true;
    if (targetFloor > currentFloor) {
        motor.moveUp();
    } else {
        motor.moveDown();
    }
    sensor.setCurrentFloor(targetFloor);
    motor.stop();
    moving = false;

    indicator.displayFloor(sensor.getCurrentFloor());
    doors.openDoors();
    System.out.println("Elevator: Arrived successfully!\n");
}
public void openDoors() {
    if (moving) {
        System.out.println("Elevator: Cannot open doors while moving.");
        return;
    }
    doors.openDoors();
}
public void closeDoors() {
    doors.closeDoors();
}
public void displayCurrentFloor() {
    indicator.displayFloor(sensor.getCurrentFloor());
}
}
