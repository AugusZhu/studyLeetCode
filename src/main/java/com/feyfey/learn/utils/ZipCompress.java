package com.feyfey.learn.utils;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 文件压缩方法
 */

public class ZipCompress {
    /**
     * @param files
     * @param baseFolder
     * @param zos
     */

    private static final Logger logger = Logger.getLogger(AES.class);


    private static void zip(File[] files, String baseFolder, ZipOutputStream zos) {
        try {
            // buffer
            byte[] buffer = new byte[2048];
            // input
            FileInputStream fis = null;
            // count
            ZipEntry entry = null;
            // num
            int count = 0;
            for (File file : files) {
                if (file.isDirectory()) {
                    // 递归
                    zip(file.listFiles(), file.getName() + File.separator, zos);
                    continue;
                }
                entry = new ZipEntry(baseFolder + file.getName());
                // 加入
                zos.putNextEntry(entry);
                fis = new FileInputStream(file);
                // 读取
                while ((count = fis.read(buffer, 0, buffer.length)) != -1)
                    // 写入
                    zos.write(buffer, 0, count);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void compress(String filePath, String baseFolder) {
        try {
            // 来源
            File inputDir = new File(filePath);
            // 目标
            FileOutputStream fos = new FileOutputStream(baseFolder);
            // 过滤
            ZipOutputStream zos = new ZipOutputStream(fos);
            // 压缩
            zip(inputDir.listFiles(), "", zos);
            // 关闭
            zos.close();
        } catch (Exception e) {
            logger.info("压缩文件夹失败");
            e.printStackTrace();
        }
    }
}
