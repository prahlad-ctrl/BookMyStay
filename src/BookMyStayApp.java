public class BookMyStayApp {
    public static void main(String[] args) {
        System.out.println("Initializing Room Data...");
        System.out.println("--------------------------------------------------");

        // Room Initialization
        Room singleRoom = new SingleRoom(101, 100.0, true);
        Room doubleRoom = new DoubleRoom(102, 150.0, true);
        Room suiteRoom = new SuiteRoom(103, 300.0, true);

        // Static Availability Variables
        boolean isSingleRoomAvailable = true;
        boolean isDoubleRoomAvailable = false;
        boolean isSuiteRoomAvailable = true;

        // Display Room Details
        System.out.println("Room Details:");
        singleRoom.displayDetails();
        doubleRoom.displayDetails();
        suiteRoom.displayDetails();
        System.out.println();

        // Display Availability
        System.out.println("Availability Status:");
        System.out.println("Room 101 Available: " + isSingleRoomAvailable);
        System.out.println("Room 102 Available: " + isDoubleRoomAvailable);
        System.out.println("Room 103 Available: " + isSuiteRoomAvailable);

        System.out.println("--------------------------------------------------");
        System.out.println("Initialization complete.");
    }
}