import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Inputstream extends P2 implements Runnable  {
	public void run() {
		try {
			int temp1 ;
			while(true){
				int temp = (int) in.readLine().charAt(0);
				System.out.println(Character.getNumericValue(temp));
				if(data.size()<window_size)
					data.add(Character.getNumericValue(temp));
				else{
					data.removeFirst();
					data.add(Character.getNumericValue(temp));
				}
				System.out.println(data);
			}
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}