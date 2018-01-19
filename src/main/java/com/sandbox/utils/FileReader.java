package com.sandbox.utils;
import java.io.File;
import java.io.IOException;

public class FileReader {
    private String content;
    private String path;

    public FileReader() {

    }

    public FileReader(File source) {
        // TBD: Implement reading
        this.content = "This is a mock string.";
    }

    public FileReader(String path) {
        // TBD: Implement reading
        this.content = "This is a mock string.";
    }


    /**
     * Getter for the file content
     *
     * @return A string with the file content
     */
    public String getFileContent() {
        return this.content;
    }

}
