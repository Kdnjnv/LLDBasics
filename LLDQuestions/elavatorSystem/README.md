# Requirements:
## By Me
1. It should be multiple elevator system.
2. Every floor will have panel to show the current floor on elevator as well as its direction.
3. Elevator cart should have buttons to select floor.
4. In one time, only one card will come and it will pick every floor wherever it was called.
5. The wait time should be minimized.

## By course
1. Multiple elevator cart and floors
2. Maxm 15 floors and 3 elevator
3. elevator car can go up and down, and can be idle as well.
4. elevator car can open when it is in idle condition
5. Every elevator car should pass through each floors.
6. The panel inside elevator car should have buttons to go to all floors, and open and close button.
7. The panel outside should have button to call the elevator and select the direction as well.
7. There should be display inside and outside to show the floor and direction of the elevator car.
8. Each floor will have seperate panel and display for each elavator car.
9. display inside the car should also show the capacity of the car.
10. Multiple passenger can go in same or differect floor or differect direction.
11. Elevator system should control the elevator car movement, door functioning and monitor elevator car
12. The elevator system should be able to send most appropriate car to passenger.
13. The elevator can carry maxm of 8 people or 750KG.

## Use case diagram
* System:
  * elevator is our system
* Actors:
  * Primary Actors: 
    * passenger request car
  * Secondary Actor: 
    * system(open/close elevator, display floor level and moving direction)
* Use Cases:
  * Passenger:
    * press elevator panel button to select destination floor, open/close elevator
  * System:
    * move/stop elevator car
    * display inside/outside
    * Dispatcher Algo to select best algo as per use case
    * open/close door
  * Other use cases:
    * Request for elevator:
    * Floor request
    * Call Emergency
* Relationships:
  * Generalization:
    * **Press Panel Button** has generalization relation with **Floor Request**, **Door Open/close request**, **Call Emergency**
  * Associations:
    * .
## Class Diagram:
* Button: bool status, pressDown(), isPressed()
  * ElevatorButton: destinationFloor()
  * HallButton: Direction buttonSign, int sourceFloorNum;
* Panels:
  * ElevatorPanel: ElevatorButton floorButtons[], openButton, closeButton;
  * HallPanel: upButton, downButton
* Display: int capacity, int currentDirection, int floor
  * ElevatorDisplay: showDisplay()
  * HallDisplay: showDisplay()
* Door: state DoorState, isOpen()
* ElevatorCar: id, door, elevatorPanel, elevatorDisplay, currentFloor, openDoor(), closeDoor(), move(), stop()
* Floor: displays[], hallPanels[], isBottomMost(), isTopMost() //to disable up button
* Building: floors[], elvatorCars[], 
* ElevatorSystem: building, monitor(), selectBestElevatorCar()
* Enumeration:
  * Direction: UP, DOWN
  * ElevatorState: UP, DOWN, IDLE
  * DoorState: OPEN, CLOSED

### Relationship between classes:
* Aggregation:
  * ELevatorSystem has aggregation relationship with building as building can exit independenly and is consiste din elecatorSystem as well.
* Composition:
  * Building -> floors and elevatorCars
  * ElevatorCar -> door, panel, display
  * Floor -> display, panels
  * HallPanel -> HallButton
  * ElevatorPanel -> ElevatorButton
* Inheritance:
  * Button -> HallButton, ElevatorButton

## Design Patterns:
* Strategy Pattern: The algo can have multiple implementation which can use strategy pattern
* State and delegation pattern: Depending on the state of the elevator, the system will decice which method to invoke

## Additional Requirements:
### types of additional requirements
* Minimize wait time of system
* Mimimize wait time of passsenger
* Minimize power usages or cost
* Maximize throuput

### Types of dispatching algorithms
* FCFS: 
  * 4 scenarios:
    * The elevator car is in an idle state.
    * The elevator car is moving towards the passenger and in the same direction the passenger wants to go. 
    * An elevator car is moving towards the passenger but in the opposite direction the passenger wants to go. 
    * The elevator car is moving away from the passenger.
  * In this algorithm, the dispatcher will try to find elevators that are in either of the first two states and ignore those elevators which are in either of the last two states.
  * implementation: using queue to keep track which customer comes first
  * disadvantages: more lift movement, cost high
* SSTF(Shortest seek time first):
* SCAN: 
  * also called **Elavator Algorithm**
  * Advantages: multiple request filled once
  * DisAdv: lift change direction only at top or bottom
  * Implementation:
    * The implementation of SCAN can be done using two boolean arrays or a single HashMap, or two priority queues data structures to track the floor where the elevator should stop.
* LOOK(Look ahead scan algo):
  * elevator can change direction if there is no further requests
  * Implementation: 
    * This algorithm can be implemented using a HashMap, TreeMap, or binary search tree data structure.

# Sequence Diagram
## Elevator Call:
Actors: passenger
Objects: HallPanel, ElevatorCar, HallButton, ElevatorSystem, Dispatcher, Door

Steps:
* Passenger presses the HallButton to call the elevator
* HallButton signals elevatorSystem to call ElevatorCar to passengers floors
* elevatorSystem calls dispatcher to select best ElevatorCar
* ....
* ...

