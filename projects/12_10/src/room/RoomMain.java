package room;

public class RoomMain {
    public static void main(String[] args) {
        Room room1 = new Room(2.4, 3.3, 6.6);
        Room room2 = new Room(3.3, 6.6);
        System.out.println(room1.countArea());
        double sumOfRoomsAreas = room1.countArea() + room2.countArea();
        double room1Area = room1.countArea();
        room1.setHeight(2.2);

        Room[] rooms = new Room[] {room1, room2};
        for (Room room:rooms) {
            System.out.println("height, width, length, area, volume");
            System.out.println(room.getHeight() + ", " + room.getWidth() + ", " + room.getLength()
                    + ", " + room.countArea() + ", " + room.countVolume());
        }
    }
}
