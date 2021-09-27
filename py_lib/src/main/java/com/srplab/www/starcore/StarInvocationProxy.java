//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.lang.reflect.Proxy;
import java.util.StringTokenizer;

public class StarInvocationProxy {
    public StarInvocationProxy() {
    }

    public Object createProxy(String var1, StarServiceClass var2, StarObjectClass var3, int var4) throws ClassNotFoundException {
        StringTokenizer var5 = new StringTokenizer(var1, ",");
        Class[] var6 = new Class[var5.countTokens()];

        for(int var7 = 0; var5.hasMoreTokens(); ++var7) {
            var6[var7] = Class.forName(var5.nextToken());
        }

        StarInvocationHandler var8 = new StarInvocationHandler(var2, var3, var4);
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), var6, var8);
    }
}
