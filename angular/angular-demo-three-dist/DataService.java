import java.io.*;
class DataService {
    public static void main(String... args) {
        String data = readFile("C://Users//lokeshwar.tailor//Downloads//git//tutorials//angular//angular-demo-three//src//assets//data.csv");
        String newData = data.trim().replaceAll("\r","").replaceAll("\n","|");
        String mainjs = "C://Users//lokeshwar.tailor//Downloads//git//tutorials//angular//angular-demo-three//dist//angular-demo-three//main.bddf648c0fd9d75cffa4.js";
        String a = readFile(mainjs);
        System.out.println(newData);
        a = a.replace("{csv.data}", newData);
        write(mainjs, a);
        System.out.println("done");
        
    }

    public static String readFile(final String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
    
            while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
            }
            br.close();
            return sb.toString();
    
        } catch (Exception e) {
    
        }
        return null;
        }

        public static void write(String path, String content) {
	try {
	    File file = new File(path);
	    // If file doesn't exists, then create it
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    // Write in file
	    bw.write(content);
	    // Close connection
	    bw.close();
	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}