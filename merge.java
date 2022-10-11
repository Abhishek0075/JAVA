import java.io.*;
public class merge{
    	public static void main(String[] args) throws IOException{
    		PrintWriter pw = new PrintWriter("final.txt");
    		BufferedReader bf = new BufferedReader(new FileReader("f1.txt"));
    		String line = bf.readLine();
    		while (line != null){
        			pw.println(line);
        			line = bf.readLine();
    		}
    		bf = new BufferedReader(new FileReader("f2.txt"));
    		line = bf.readLine();
    		while(line != null){
        			pw.println(line);
        			line = bf.readLine();
    		}
    		pw.flush();
    		bf.close();
    		pw.close();
    	}
}