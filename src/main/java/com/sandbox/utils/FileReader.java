package com.sandbox.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * Gets the content of a file
 */
public class FileReader {
    private String fileContent;

    public FileReader(String fileName) {
        StringBuilder fileContent = new StringBuilder();

        try {
            FileInputStream fileInput = new FileInputStream(fileName);
            Scanner scanner = new Scanner(fileInput, "UTF-8");

            try {
                while (scanner.hasNextLine()) {
                    fileContent.append(scanner.nextLine() + "\n");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                scanner.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        this.fileContent = fileContent.toString();
    }

    /**
     * Getter for the file content
     *
     * @return A string with the file content
     */
    public String getFileContent() {
        return this.fileContent;
    }

}
