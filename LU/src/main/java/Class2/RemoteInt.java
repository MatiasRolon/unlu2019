package Class2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInt extends Remote{
	public String getName(Person p) throws RemoteException;
}
