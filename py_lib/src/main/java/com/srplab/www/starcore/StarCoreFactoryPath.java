//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class StarCoreFactoryPath {
    public static String StarCoreShareLibraryPath = null;
    public static String StarCoreCoreLibraryPath = null;
    public static String StarCoreOperationPath = null;
    public static String SRPMODULE = null;
    public static Object ActivityObject = null;

    public StarCoreFactoryPath() {
    }

    public static void SetPath(String var0, String var1) {
        StarCoreShareLibraryPath = var0;
        StarCoreOperationPath = var1;
    }

    public static void SetPath(String var0, String var1, String var2) {
        StarCoreCoreLibraryPath = var0;
        StarCoreShareLibraryPath = var1;
        StarCoreOperationPath = var2;
    }

    public static boolean CreatePath(Runtime var0, String var1) {
        File var2 = new File(var1);
        if (!var2.exists()) {
            var2.mkdirs();

            try {
                Process var3 = Runtime.getRuntime().exec("chmod 777 " + var2);
                int var4 = var3.waitFor();
                if (var4 != 0) {
                    var2.delete();
                    return false;
                } else {
                    return true;
                }
            } catch (Exception var6) {
                var2.delete();
                return false;
            }
        } else {
            return true;
        }
    }

    private static boolean CreatePath(String var0) {
        File var1 = new File(var0);
        if (!var1.exists()) {
            int var2 = var0.lastIndexOf(File.separator.charAt(0));
            if (var2 < 0) {
                if (!var1.mkdirs()) {
                    return false;
                }
            } else {
                String var3 = var0.substring(0, var2);
                if (!CreatePath(var3)) {
                    return false;
                }

                if (!var1.mkdirs()) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean unzip(InputStream var0, String var1, Boolean var2) {
        try {
            ZipInputStream var3 = new ZipInputStream(var0);
            ZipEntry var4 = var3.getNextEntry();

            for(byte[] var5 = new byte[1024]; var4 != null; var4 = var3.getNextEntry()) {
                File var6 = new File(var1);
                var6.mkdir();
                String var7;
                if (var4.isDirectory()) {
                    var7 = var4.getName();
                    var7 = var7.substring(0, var7.length() - 1);
                    if (!CreatePath(var1 + File.separator + var7)) {
                        return false;
                    }
                } else {
                    var7 = var1 + File.separator + var4.getName();
                    int var8 = var7.lastIndexOf(File.separator.charAt(0));
                    if (var8 < 0) {
                        var6 = new File(var1 + File.separator + var4.getName());
                    } else {
                        String var9 = var7.substring(0, var8);
                        if (!CreatePath(var9)) {
                            return false;
                        }

                        var6 = new File(var1 + File.separator + var4.getName());
                    }

                    if (!var6.exists() || var2) {
                        var6.createNewFile();
                        FileOutputStream var13 = new FileOutputStream(var6);
                        boolean var10 = false;

                        int var14;
                        while((var14 = var3.read(var5)) != -1) {
                            var13.write(var5, 0, var14);
                        }

                        var13.close();
                    }
                }
            }

            var3.close();
            return true;
        } catch (FileNotFoundException var11) {
            var11.printStackTrace();
            return false;
        } catch (IOException var12) {
            var12.printStackTrace();
            return false;
        }
    }

    public static boolean Install(InputStream var0, String var1, Boolean var2) {
        return unzip(var0, var1, var2);
    }

    public static void InitDefault(Runtime var0, String var1) {
        SetPath(var1 + "/lib", var1 + "/files");
        CreatePath(var0, var1 + "/files/srplab");
        CreatePath(var0, var1 + "/files/sdcard");
    }

    public static boolean InstallDefault(InputStream var0, Boolean var1) {
        return unzip(var0, StarCoreOperationPath, var1);
    }
}
