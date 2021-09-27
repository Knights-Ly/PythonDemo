//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

public class StarCoreClassLoader extends URLClassLoader {
    public static StarCoreClassLoader loader = new StarCoreClassLoader(StarCoreClassLoader.class.getClassLoader());

    public StarCoreClassLoader(ClassLoader var1) {
        super(new URL[0], var1);
    }

    public void addURL(URL var1) {
        synchronized(this) {
            super.addURL(var1);
        }
    }

    public static Class FindClass(String var0) {
        String var1 = var0.replaceAll("/", ".");

        try {
            Class var2 = Class.forName(var1);
            return var2;
        } catch (Exception var7) {
            try {
                synchronized(loader) {
                    Class var3 = Class.forName(var1, true, loader);
                    return var3;
                }
            } catch (Exception var6) {
                return null;
            }
        }
    }

    public static StarCoreClassLoader getLoader() {
        return loader;
    }

    public static void addURLString(String var0) {
        try {
            File var1 = new File(var0);
            loader.addURL(var1.toURI().toURL());
        } catch (Exception var2) {
        }

    }
}
