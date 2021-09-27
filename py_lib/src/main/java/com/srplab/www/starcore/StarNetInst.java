//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class StarNetInst extends AsyncTask<Object, Integer, Long> {
    private static final int BUFFER_SIZE = 8192;
    private final URL mUrl;
    private final File mFile;
    private final ProgressDialog mDialog;
    private Activity m_context;
    private String m_outpath;
    private static String m_KeyFile;
    private static String m_Version;
    private static Handler mhandler;
    private Throwable mException;
    private OutputStream mProgressReportingOutputStream;

    private static int[] GetVersion(String var0) {
        int[] var1 = new int[4];
        byte var4 = 0;
        var1[0] = 0;
        var1[1] = 0;
        var1[2] = 0;
        var1[3] = 0;
        if (var0 == null) {
            return var1;
        } else {
            String var2;
            for(int var3 = var4; var3 < var0.length(); ++var3) {
                var2 = var0.substring(var3, var3 + 1);
                if (var2.equals(".")) {
                    var2 = var0.substring(var4, var3);
                    var1[0] = Integer.valueOf(var2);
                    int var5 = var3 + 1;

                    for(var3 = var5; var3 < var0.length(); ++var3) {
                        var2 = var0.substring(var3, var3 + 1);
                        if (var2.equals(".")) {
                            var2 = var0.substring(var5, var3);
                            var1[1] = Integer.valueOf(var2);
                            var5 = var3 + 1;

                            for(var3 = var5; var3 < var0.length(); ++var3) {
                                var2 = var0.substring(var3, var3 + 1);
                                if (var2.equals(".")) {
                                    var2 = var0.substring(var5, var3);
                                    var1[2] = Integer.valueOf(var2);
                                    var5 = var3 + 1;
                                    var2 = var0.substring(var5, var0.length());
                                    var1[3] = Integer.valueOf(var2);
                                    return var1;
                                }
                            }

                            var2 = var0.substring(var5, var0.length() + 1);
                            var1[2] = Integer.valueOf(var2);
                            return var1;
                        }
                    }

                    var2 = var0.substring(var5, var0.length() + 1);
                    var1[1] = Integer.valueOf(var2);
                    return var1;
                }
            }

            var2 = var0.substring(var4, var0.length() + 1);
            var1[0] = Integer.valueOf(var2);
            return var1;
        }
    }

    public static boolean IsCLEInstalled(String var0, String var1, String var2) {
        File var3 = new File(var0 + "/" + var1);
        if (!var3.exists()) {
            return false;
        } else {
            int[] var4 = GetVersion(var2);
            BufferedReader var6 = null;

            try {
                var6 = new BufferedReader(new FileReader(var3));
                String var7 = null;
                var7 = var6.readLine();
                var6.close();
                int[] var5 = GetVersion(var7);
                if (var4[0] > var5[0]) {
                    return false;
                } else if (var4[0] < var5[0]) {
                    return true;
                } else if (var4[1] > var5[1]) {
                    return false;
                } else if (var4[1] < var5[1]) {
                    return true;
                } else if (var4[2] > var5[2]) {
                    return false;
                } else if (var4[2] < var5[2]) {
                    return true;
                } else if (var4[3] > var5[3]) {
                    return false;
                } else {
                    return var4[3] < var5[3] ? true : true;
                }
            } catch (IOException var8) {
                return false;
            }
        }
    }

    public static void InstallZipFile(Activity var0, String var1, String var2, String var3, String var4) {
        if (IsCLEInstalled("/data/data/com.srplab.starcore/files", var1, var3)) {
            StarCoreFactoryPath.StarCoreCoreLibraryPath = "/data/data/com.srplab.starcore/lib";
            StarCoreFactoryPath.StarCoreShareLibraryPath = "/data/data/" + var0.getPackageName() + "/files";
            StarCoreFactoryPath.StarCoreOperationPath = "/data/data/" + var0.getPackageName() + "/files";
        } else {
            m_KeyFile = var1;
            m_Version = var3;
            if (IsCLEInstalled(var4, var1, var3)) {
                StarCoreFactoryPath.StarCoreShareLibraryPath = "/data/data/" + var0.getPackageName() + "/files";
                StarCoreFactoryPath.StarCoreOperationPath = "/data/data/" + var0.getPackageName() + "/files";
            } else {
                try {
                    StarNetInst var5 = new StarNetInst(var2, var4, var0);
                    var5.execute(new Object[0]);
                    Looper var6 = var0.getMainLooper();
                    Looper.loop();
                } catch (Exception var7) {
                }

            }
        }
    }

    public static void InstallZipFileDefault(Activity var0, String var1, String var2, String var3) {
        if (IsCLEInstalled("/data/data/com.srplab.starcore/files", var1, var3)) {
            StarCoreFactoryPath.StarCoreCoreLibraryPath = "/data/data/com.srplab.starcore/lib";
            StarCoreFactoryPath.StarCoreShareLibraryPath = "/data/data/" + var0.getPackageName() + "/files";
            StarCoreFactoryPath.StarCoreOperationPath = "/data/data/" + var0.getPackageName() + "/files";
        } else {
            String var5 = "/data/data/" + var0.getPackageName() + "/files";
            m_KeyFile = var1;
            m_Version = var3;
            if (IsCLEInstalled(var5, var1, var3)) {
                StarCoreFactoryPath.StarCoreShareLibraryPath = "/data/data/" + var0.getPackageName() + "/files";
                StarCoreFactoryPath.StarCoreOperationPath = "/data/data/" + var0.getPackageName() + "/files";
            } else {
                try {
                    StarNetInst var4 = new StarNetInst(var2, var5, var0);
                    var4.execute(new Object[0]);
                    Looper var6 = var0.getMainLooper();
                    Looper.loop();
                } catch (Exception var7) {
                }

            }
        }
    }

    public static boolean IsFileInstalled(String var0, String var1) {
        File var2 = new File(var0 + "/" + var1);
        return var2.exists();
    }

    public static boolean CreatePath(String var0) {
        File var1 = new File(var0);
        if (!var1.exists()) {
            var1.mkdirs();
            if (!var1.exists()) {
                return false;
            }
        }

        return true;
    }

    private static void unzip(InputStream var0, String var1, Boolean var2) throws IOException {
        try {
            ZipInputStream var3 = new ZipInputStream(var0);
            ZipEntry var4 = var3.getNextEntry();

            for(byte[] var5 = new byte[1024]; var4 != null; var4 = var3.getNextEntry()) {
                File var6 = new File(var1);
                var6.mkdir();
                if (var4.isDirectory()) {
                    String var11 = var4.getName();
                    var11 = var11.substring(0, var11.length() - 1);
                    var6 = new File(var1 + File.separator + var11);
                    var6.mkdir();
                } else {
                    var6 = new File(var1 + File.separator + var4.getName());
                    if (!var6.exists() || var2) {
                        var6.createNewFile();
                        FileOutputStream var7 = new FileOutputStream(var6);
                        boolean var8 = false;

                        int var12;
                        while((var12 = var3.read(var5)) != -1) {
                            var7.write(var5, 0, var12);
                        }

                        var7.close();
                    }
                }
            }

            var3.close();
        } catch (FileNotFoundException var9) {
            throw var9;
        } catch (IOException var10) {
            throw var10;
        }
    }

    public StarNetInst(String var1, String var2, Activity var3) throws MalformedURLException, IOException {
        this.m_context = var3;
        if (var3 != null) {
            this.mDialog = new ProgressDialog(var3);
        } else {
            this.mDialog = null;
        }

        this.mUrl = new URL(var1);
        String var4 = (new File(this.mUrl.getFile())).getName();
        this.m_outpath = var2;
        if (!CreatePath("/sdcard/srplab/tmp")) {
            throw new IOException("Cannot create directory /sdcard/srplab/tmp");
        } else if (!CreatePath(var2)) {
            throw new IOException("Cannot create directory " + var2);
        } else {
            this.mFile = new File("/sdcard/srplab/tmp", var4);
        }
    }

    protected void onPreExecute() {
        if (this.mDialog != null) {
            this.mDialog.setTitle("Installing");
            this.mDialog.setMessage(this.mFile.getName());
            this.mDialog.setProgressStyle(1);
            this.mDialog.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface var1) {
                    StarNetInst.this.cancel(true);
                }
            });
            this.mDialog.show();
        }

    }

    protected Long doInBackground(Object... var1) {
        try {
            return this.download();
        } catch (Exception var3) {
            if (this.mFile.exists()) {
                this.mFile.delete();
            }

            this.mException = var3;
            return null;
        }
    }

    protected void onProgressUpdate(Integer... var1) {
        if (this.mDialog != null) {
            if (var1.length > 1) {
                int var2 = var1[1];
                if (var2 == -1) {
                    this.mDialog.setIndeterminate(true);
                } else {
                    this.mDialog.setMax(var2);
                }
            } else {
                this.mDialog.setProgress(var1[0]);
            }

        }
    }

    protected void onPostExecute(Long var1) {
        if (this.mDialog != null && this.mDialog.isShowing()) {
            this.mDialog.dismiss();
        }

        if (!this.isCancelled()) {
            Builder var2;
            if (this.mException != null) {
                var2 = new Builder(this.m_context);
                var2.setIcon(17301543);
                var2.setTitle("Failed");
                var2.setMessage(this.mException.getMessage());
                var2.setPositiveButton("Quit", new OnClickListener() {
                    public void onClick(DialogInterface var1, int var2) {
                        System.exit(0);
                    }
                });
                var2.show();
            } else {
                try {
                    FileInputStream var5 = new FileInputStream(this.mFile);
                    unzip(var5, this.m_outpath, true);
                    var5.close();
                } catch (Exception var4) {
                    if (this.mFile.exists()) {
                        this.mFile.delete();
                    }

                    Builder var3 = new Builder(this.m_context);
                    var3.setIcon(17301543);
                    var3.setTitle("Failed");
                    var3.setMessage(var4.getMessage() + " " + this.m_outpath);
                    var3.setPositiveButton("Quit", new OnClickListener() {
                        public void onClick(DialogInterface var1, int var2) {
                            System.exit(0);
                        }
                    });
                    var3.show();
                }

                if (this.mFile.exists()) {
                    this.mFile.delete();
                }

                if (!IsCLEInstalled(this.m_outpath, m_KeyFile, m_Version)) {
                    var2 = new Builder(this.m_context);
                    var2.setIcon(17301543);
                    var2.setTitle("Failed");
                    var2.setMessage("Please sure zip package to match install path, or version is correct");
                    var2.setPositiveButton("Quit", new OnClickListener() {
                        public void onClick(DialogInterface var1, int var2) {
                            System.exit(0);
                        }
                    });
                    var2.show();
                } else {
                    Intent var6 = this.m_context.getIntent();
                    this.m_context.overridePendingTransition(0, 0);
                    var6.addFlags(65536);
                    this.m_context.finish();
                    this.m_context.overridePendingTransition(0, 0);
                    this.m_context.startActivity(var6);
                }
            }

        }
    }

    protected void onCancelled() {
        if (this.mDialog != null) {
            this.mDialog.setTitle("Download cancelled.");
        }

    }

    private static int copy(InputStream var0, OutputStream var1) throws Exception, IOException {
        byte[] var2 = new byte[8192];
        BufferedInputStream var3 = new BufferedInputStream(var0, 8192);
        BufferedOutputStream var4 = new BufferedOutputStream(var1, 8192);
        int var5 = 0;
        boolean var6 = false;

        try {
            int var18;
            while((var18 = var3.read(var2, 0, 8192)) != -1) {
                var4.write(var2, 0, var18);
                var5 += var18;
            }

            var4.flush();
        } finally {
            try {
                var4.close();
            } catch (IOException var16) {
            }

            try {
                var3.close();
            } catch (IOException var15) {
            }

        }

        return var5;
    }

    private long download() throws Exception {
        URLConnection var1 = null;

        try {
            var1 = this.mUrl.openConnection();
        } catch (IOException var5) {
            throw new Exception("Cannot open URL: " + this.mUrl, var5);
        }

        int var2 = var1.getContentLength();
        if (this.mFile.exists() && (long)var2 == this.mFile.length()) {
            return 0L;
        } else {
            try {
                this.mProgressReportingOutputStream = new StarNetInst.ProgressReportingOutputStream(this.mFile);
            } catch (FileNotFoundException var4) {
                throw new Exception(var4);
            }

            this.publishProgress(new Integer[]{0, var2});
            int var3 = copy(var1.getInputStream(), this.mProgressReportingOutputStream);
            if (var3 != var2 && var2 != -1) {
                throw new IOException("Download incomplete: " + var3 + " != " + var2);
            } else {
                this.mProgressReportingOutputStream.close();
                return (long)var3;
            }
        }
    }

    private final class ProgressReportingOutputStream extends FileOutputStream {
        private int mProgress;

        private ProgressReportingOutputStream(File var2) throws FileNotFoundException {
            super(var2);
            this.mProgress = 0;
        }

        public void write(byte[] var1, int var2, int var3) throws IOException {
            super.write(var1, var2, var3);
            this.mProgress += var3;
            StarNetInst.this.publishProgress(new Integer[]{this.mProgress});
        }
    }
}
