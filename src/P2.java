import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

public class P2 {
	public static int  window_size=20;
	public static String[] host_port;
    public static LinkedList<Integer> data= new LinkedList<Integer>();
    public static Socket echoSocket;
    public static BufferedReader in;
	public static void main(String[] args) {
		String hostportpair="";
		Thread t1 = new Thread(new Inputstream());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
		hostportpair = input.readLine();
		}catch (IOException io) {
			System.out.println(io.getMessage());
		}
		host_port = hostportpair.split(":");
		try{
			echoSocket = new Socket(host_port[0], Integer.parseInt(host_port[1]));
			in = new BufferedReader(
			            new InputStreamReader(echoSocket.getInputStream()));
		}catch (Exception e) {
			// TODO: handle exception
		}
		t1.start();
		try{
		Thread.sleep(1);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Program Ended");
	}

}
