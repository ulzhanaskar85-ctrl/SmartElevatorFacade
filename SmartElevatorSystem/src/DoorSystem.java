public class DoorSystem {
    private boolean open;
    public DoorSystem() {
        open = true;
    }
    public void openDoors() {
        if (!open) {
            open = true;
            System.out.println("Door system: Doors opened.");
        } else {
            System.out.println("Door system: Doors are already open.");
        }
    }
    public void closeDoors() {
        if (open) {
            open = false;
            System.out.println("Door system: Doors closed.");
        } else {
            System.out.println("Door system: Doors are already closed.");
        }
    }
    public boolean areClosed() {
        return !open;
    }
}
