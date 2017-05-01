package client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;

import com.jcraft.jsch.JSch;

public class Snapshot {
	
	static int count = 0;
	int snapshotID;
	Client client;
	String filename;
	String noise; 	// holding extra noise to increase the size of the snapshot
	
	
	public Snapshot(Client client)
	{
		this.snapshotID = count++;
		this.client = client;
		this.noise = "This is just some noise";
		try {
			this.filename = "snapshots" + client.getName();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public void takeSnapShot() {
		// TODO Auto-generated method stub
		
		BufferedWriter out = null;
		try  
		{
		    FileWriter fstream = new FileWriter(filename, true); //true tells to append data.
		    out = new BufferedWriter(fstream);
		    out.write(snapshotID + ", " + client.getName() + ", " + client.getAmount() + "\n");
		}
		catch (IOException e)
		{
		    System.err.println("Error: " + e.getMessage());
		}
		finally
		{
		    if(out != null) {
		        try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}
		
		RemoteWriteToNVM();
	}
	
	public void RemoteWriteToNVM() {
		
	}
	

}
