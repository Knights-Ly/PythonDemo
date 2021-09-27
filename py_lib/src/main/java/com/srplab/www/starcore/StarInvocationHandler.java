//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarInvocationHandler implements InvocationHandler {
    private StarServiceClass Service;
    private String ObjectID;
    private int ProxyType;

    public StarInvocationHandler(StarServiceClass var1, StarObjectClass var2, int var3) {
        this.Service = var1;
        this.ObjectID = var2._GetStr("_ID");
        this.ProxyType = var3;
        var2._LockGC();
    }

    protected void finalize() {
        StarObjectClass var1 = this.Service._GetObjectEx(this.ObjectID);
        if (var1 != null) {
            var1._UnLockGC();
        }
    }

    public Object invoke(Object var1, Method var2, Object[] var3) {
        String var4 = var2.getName();
        Class var5 = var2.getReturnType();
        StarCoreFactory var6 = StarCoreFactory.GetFactory();
        var6._SRPLock();
        StarObjectClass var7 = this.Service._GetObjectEx(this.ObjectID);
        if (var7 == null) {
            var6._SRPUnLock();
            return null;
        } else if (var7._DefinedClass(var4) == null) {
            var6._SRPUnLock();
            return null;
        } else if (!var5.equals(Void.class) && !var5.equals(Void.TYPE)) {
            Object var8;
            if (this.ProxyType != 1) {
                var8 = var7._RawCall(var5, var4, var3);
            } else {
                var8 = var7._SyncRawCall(var5, var4, var3);
            }

            var6._SRPUnLock();
            return var8;
        } else {
            if (this.ProxyType != 1) {
                var7._RawCall(var5, var4, var3);
            } else {
                var7._SyncRawCall(var5, var4, var3);
            }

            var6._SRPUnLock();
            return null;
        }
    }
}
