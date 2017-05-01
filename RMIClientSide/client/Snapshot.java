package client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Snapshot {
	
	static int count = 0;
	int snapshotID;
	Client client;
	String noise; 	// holding extra noise to increase the size of the snapshot

	
	public Snapshot(Client client)
	{
		this.snapshotID = count++;
		this.client = client;
		this.noise = "This is just some noise";
	}
	
//	public void takeSnapShot() throws IOException
//	{
//		BufferedWriter out = null;
//		try  
//		{
//		    FileWriter fstream = new FileWriter("snapshots.txt", true); //true tells to append data.
//		    out = new BufferedWriter(fstream);
//		    out.write(snapshotID + ", " + client.getName() + ", " + client.getAmount() + "\n");
//		}
//		catch (IOException e)
//		{
//		    System.err.println("Error: " + e.getMessage());
//		}
//		finally
//		{
//		    if(out != null) {
//		        out.close();
//		    }
//		}
//	}
	

}
