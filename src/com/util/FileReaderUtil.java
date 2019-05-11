package com.util;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileReaderUtil {
	public static void main(String[] args) throws IOException {

        try {

            File f = new File("/home/prime/Downloads/STUDY_AW0VTH_L3W07G.txt");

            System.out.println("Reading files using Apache IO:");

            List<String> lines = FileUtils.readLines(f, "UTF-8");

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
