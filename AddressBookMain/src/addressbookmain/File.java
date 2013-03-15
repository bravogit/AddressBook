package addressbookmain;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    private String filename;
    private String path;
    private BufferedWriter bw;
    

    public File(String f,String p) throws IOException {
        filename=f;
        path=p;
        java.io.File file = new java.io.File(path+ "\\" +filename);
        // C:\\Users\\Eddy\\Documents\\NetBeansProjects\\out.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
    }

    public void scrivi(String string) throws IOException {
        bw.write(string);
    }
    
    public void chiudi() throws IOException {
        bw.close();
    }
}