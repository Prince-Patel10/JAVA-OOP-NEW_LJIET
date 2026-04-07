import java.io.*;

class IO3 {
    public static void main(String[] args) throws IOException {
        // READING SECTION
        FileInputStream fi = new FileInputStream("C:\\Users\\princ\\OneDrive\\Desktop\\Java\\file.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);
        int i; 
        while((i = bi.read()) != -1) {
            System.out.print((char)i); // Changed to .print() so it doesn't spam new lines
        }
        bi.close(); // Good practice to close the reader before opening the writer

        // WRITING SECTION (Fixed)
        FileOutputStream fo = new FileOutputStream("C:\\Users\\princ\\OneDrive\\Desktop\\Java\\file2.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        
        String data = "hello";
        byte[] b = data.getBytes();
        
        bo.write(b);
        bo.flush(); // Ensures all buffered data is pushed to the file
        bo.close();
        fo.close();
    }
}