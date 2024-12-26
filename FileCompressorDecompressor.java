import java.io.*;
import java.util.zip.*;
import java.util.Scanner;

public class FileCompressorDecompressor {

    public static void compress(String inputFilePath, String outputFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(inputFilePath);
        FileOutputStream fos = new FileOutputStream(outputFilePath);
        DeflaterOutputStream deflater = new DeflaterOutputStream(fos);

        byte[] chunk = new byte[1024];
        int length;
        while ((length = fis.read(chunk)) != -1) {
            deflater.write(chunk, 0, length);
        }
        deflater.finish();

        fis.close();
        fos.close();
        deflater.close();

        System.out.println("File compressed successfully to: " + outputFilePath);
    }

    public static void decompress(String inputFilePath, String outputFilePath) throws IOException {
        FileInputStream fis = new FileInputStream(inputFilePath);
        InflaterInputStream inflater = new InflaterInputStream(fis);
        FileOutputStream fos = new FileOutputStream(outputFilePath);

        byte[] chunk = new byte[1024];
        int length;
        while ((length = inflater.read(chunk)) != -1) {
            fos.write(chunk, 0, length);
        }

        inflater.close();
        fis.close();
        fos.close();

        System.out.println("File decompressed successfully to: " + outputFilePath);
    }

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);

        System.out.println("Select operation: ");
        System.out.println("1. Compress");
        System.out.println("2. Decompress");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scn.nextInt();
        scn.nextLine(); 

        String inputFilePath;
        String outputFilePath;

        if (choice == 1) {
            System.out.print("Enter the path of the file to compress: ");
            inputFilePath = scn.nextLine();
            System.out.print("Enter the path where the compressed file should be saved: ");
            outputFilePath = scn.nextLine();
            compress(inputFilePath, outputFilePath);
        } else if (choice == 2) {
            System.out.print("Enter the path of the compressed file: ");
            inputFilePath = scn.nextLine();
            System.out.print("Enter the path where the decompressed file should be saved: ");
            outputFilePath = scn.nextLine();
            decompress(inputFilePath, outputFilePath);
        } else {
            System.out.println("Invalid choice. Please enter 1 for compress or 2 for decompress.");
        }

        scn.close();
    }
}
