
// HelloServer.java
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(1099);
            HelloImpl obj = new HelloImpl();
            Naming.rebind("//localhost/HelloServer", obj);
            System.out.println("HelloServer bound in registry");
        } catch (Exception e) {
            System.err.println("HelloServer exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
