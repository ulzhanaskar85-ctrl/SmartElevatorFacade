public class FloorSensor {
    private int currentFloor = 1;
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int floor) {
        currentFloor = floor;
        System.out.println("Floor sensor: Elevator is now on floor" + currentFloor + ".");
    }
}
