package Exercise1;

import Server;

public class Pool {
    private Server serverPool[];

    public Pool() {

    }

    public addServer(Server server) {
        this.serverPool.add(server);
    }

    public Server getServerPool() {
        return this.serverPool;
    }
}