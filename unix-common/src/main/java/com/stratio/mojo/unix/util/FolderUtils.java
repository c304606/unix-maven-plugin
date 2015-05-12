package com.stratio.mojo.unix.util;

import java.io.File;

public class FolderUtils {

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }
}
