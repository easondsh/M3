package eco.data.m3.routing.simulations;

import java.io.IOException;
import java.net.InetAddress;

import eco.data.m3.routing.JKademliaNode;
import eco.data.m3.routing.message.SimpleMessage;
import eco.data.m3.routing.node.KademliaId;
import eco.data.m3.routing.node.Node;
import eco.data.m3.routing.message.SimpleReceiver;

/**
 * Test 1: Try sending a simple message between nodes
 *
 * @author Joshua Kissoon
 * @created 20140218
 */
public class SimpleBootStrapTest
{

	
    public static void main(String[] args)
    {
        try
        {
            JKademliaNode kad1 = new JKademliaNode("Joshua", new KademliaId("12345678901234567890"), 7574);

//            Node remoteNode = new Node(new KademliaId("12345678901234567891"), InetAddress.getByName("127.0.0.1") , 7572); 
            Node remoteNode = new Node(new KademliaId("12345678901234567891"), InetAddress.getByName("47.75.153.56") , 7572); 

            kad1.bootstrap(remoteNode);
            
            System.out.println("Boot Strap Done");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
    }
}
