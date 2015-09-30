import java.io.*;

public class InOut {
    public String input() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
        return "";
    }

    public void writeFile(String file, String str) throws IOException {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(new File(file))));
            writer.println(str);
            writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
