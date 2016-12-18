import java.net.*;
import java.io.*;

/*
	This program makes a connection to port 80 of www.cs.sjsu.edu
	Then makes a HTTP GETS request to a path and prints out the web server's response
*/
public class PollettWebPageClient {
	public static void main(String[] args) {
		try {
			//connection to port 80 of www.cs.sjsu.edu
			Socket WebpageClient = new Socket("www.cs.sjsu.edu", 80);
			System.out.println("Just connected to " + WebpageClient.getRemoteSocketAddress());

			String path = "/faculty/pollett/" + args[0];

			//uses outputStream to make an HTTP/1.1 GET request 
			//with hostname www.cs.sjsu.edu
			OutputStream ClientOutputStream = WebpageClient.getOutputStream();
			PrintWriter out = new PrintWriter(ClientOutputStream);
			out.println("GET " + path + " HTTP/1.1");
			out.println("Host:www.cs.sjsu.edu\n");
			out.flush();
			
			//uses inputStream to read back from the server
			InputStream ClientInputStream = WebpageClient.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(ClientInputStream));
			String response;
			while((response = in.readLine()) != null) {
				System.out.println(response);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
