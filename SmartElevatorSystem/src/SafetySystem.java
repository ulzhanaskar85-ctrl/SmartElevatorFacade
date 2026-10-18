public class SafetySystem {
    public boolean canMove(DoorSystem doors) {
        if (doors.areClosed()) {
            System.out.println("Safety system: Safety check passed.");
            return true;
        }
        System.out.println("Safety system: Movement denied. Doors are open.");
        return false;
    }
}
