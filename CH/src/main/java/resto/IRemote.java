package resto;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Class2.RMI.Person;

public interface IRemote extends Remote{
	public String getWeather (String city) throws RemoteException;
	public Person changePerson (Person p, int age) throws RemoteException;
}
