package Test;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  >> Enter File Name: ");
        String file = input.nextLine();
        System.out.print("\n (1) Create File ?" + "\n (2) Delete File ?" +
                "\n (3) Read From File ?" + "\n (4) Write To File ?" +
                "\n (0) Exit!!\n" + "\n  >> Enter Your Choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 0:
                break;
            case 1:
                CreateDeleteFile.createFile(file);
                break;
            case 2:
                CreateDeleteFile.deleteFile(file);
                break;
            case 3:
                System.out.println(ReadWriteFiles.ReadFile(file));
                break;
            case 4:
                ReadWriteFiles.WriteFile(file);
                break;
            default:
                System.out.println("  >> Invalid Choice!!");
                break;
        }
    }
}