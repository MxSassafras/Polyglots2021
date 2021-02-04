package Exercise1;

public class Server {
    private int size;
    private int capacity;
    private int startingLocation[] = new int[2];

    public Server(size, capacity) {
        this.size = size;
        this.capacity = capacity;
    }

    public int[] getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(int[] startingLocation) {
        this.startingLocation = startingLocation;
    }
}