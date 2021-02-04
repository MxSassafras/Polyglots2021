package Exercise1;

public class ServerRoom {
    private boolean serverRoom[][];

    public ServerRoom(int rows, int slots) {
        this.serverRoom = new boolean[rows][slots];

        for (i = 0; i < rows; i++) {
            for (j = 0; j < slots; j++) {
                this.serverRoom[i][j] = false;
            }
        }
    }

    public void addToSlot(int rowIndex, int slotIndex) {
        this.serverRoom[rowIndex][slotIndex] = true;
    }

    public void addUnavailableSlots(int[][] unavailableSlots) {
        for (i = 0; i < unavailableSlots.length; i++) {
            int row = unavailableSlots[i][0];
            int slot = unavailableSlots[i][1];

            addToSlot(row, slot);
        }
    }

    public boolean[][] getServerRoom() {
        return serverRoom;
    }

    public void removeFromSlot(int rowIndex, int slotIndex) {
        this.serverRoom[rowIndex][slotIndex] = false;
    }
}