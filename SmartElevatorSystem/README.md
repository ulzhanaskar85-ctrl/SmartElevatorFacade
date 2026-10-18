Smart Elevator System — Facade Pattern

Project Description

Smart Elevator System is a Java console application that simulates elevator operations using the Facade design pattern.

The application allows a client to request a floor without directly interacting with multiple subsystem classes.

Design Pattern

The Facade pattern provides a simplified interface to a complex subsystem.

In this project, ElevatorFacade coordinates five subsystems and provides simple methods for controlling the elevator.

Project Structure

* Main.java — client that runs the application.
* ElevatorFacade.java — coordinates the elevator subsystems.
* ElevatorMotor.java — simulates elevator movement.
* DoorSystem.java — manages elevator doors.
* FloorSensor.java — tracks the current floor.
* SafetySystem.java — checks whether movement is safe.
* FloorIndicator.java — displays the current floor.

How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure a Java JDK is configured.
3. Open Main.java.
4. Run the main() method.

Example

The application demonstrates moving between floors, opening and closing doors, checking safety, displaying the current floor, and handling invalid floor requests.

Clean Code Principles

1. Meaningful Names

Class and method names describe their responsibilities, such as ElevatorMotor and goToFloor().

2. Single Responsibility Principle

Each subsystem has a focused responsibility. For example, DoorSystem manages doors, while FloorSensor tracks the current floor.

3. Encapsulation

Subsystem objects are stored in private fields inside the facade. The client does not need to access them directly.

4. Separation of Concerns

Elevator movement, door control, safety checks, and floor indication are implemented in separate classes.

5. Low Coupling

The client interacts with the system through ElevatorFacade rather than coordinating the individual subsystems itself.

Limitations

This is an educational console simulation. It does not control a physical elevator or model real-time movement and hardware failures.