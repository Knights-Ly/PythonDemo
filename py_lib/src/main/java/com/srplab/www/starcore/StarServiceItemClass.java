//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarServiceItemClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarServiceItemClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
    }

    public StarServiceItemClass(StarServiceItemClass var1) {
        this.StarCore = var1.StarCore;
        this.StarCore._WrapObject(this, var1);
    }

    public StarServiceItemClass() {
    }

    protected void finalize() {
        this.StarCore._TermObject(this);
    }

    public Integer _GetInt(String var1) {
        return this.StarCore.Common_GetInt(this, var1);
    }

    public Boolean _GetBool(String var1) {
        return this.StarCore.Common_GetBool(this, var1);
    }

    public Double _GetDouble(String var1) {
        return this.StarCore.Common_GetDouble(this, var1);
    }

    public int _Getint(String var1) {
        return this.StarCore.Common_Getint(this, var1);
    }

    public boolean _Getbool(String var1) {
        return this.StarCore.Common_Getbool(this, var1);
    }

    public double _Getdouble(String var1) {
        return this.StarCore.Common_Getdouble(this, var1);
    }

    public int _Toint(Object var1) {
        return this.StarCore.Common_Toint(this, var1);
    }

    public long _Tolong(Object var1) {
        return this.StarCore.Common_Tolong(this, var1);
    }

    public boolean _Tobool(Object var1) {
        return this.StarCore.Common_Tobool(this, var1);
    }

    public double _Todouble(Object var1) {
        return this.StarCore.Common_Todouble(this, var1);
    }

    public String _GetStr(String var1) {
        return this.StarCore.Common_GetStr(this, var1);
    }

    public StarServiceClass _GetService() {
        return (StarServiceClass)this.StarCore.Common_Get(this, "_Service");
    }

    public Object _Get(String var1) {
        return this.StarCore.Common_Get(this, var1);
    }

    public void _Set(String var1, Object var2) {
        this.StarCore.Common_Set(this, var1, var2);
    }

    public String toString() {
        return this.StarCore.Common_toString(this);
    }

    public void _RegClientToSync(String var1) {
        this.StarCore.StarServiceItem_RegClientToSync(this, var1);
    }

    public void _RegClientToSync_P(StarServiceItemClientToSyncInterface var1) {
        this.StarCore.StarServiceItem_RegClientToSync_P(this, var1);
    }

    public boolean _IsSync() {
        return this.StarCore.StarServiceItem_IsSync(this);
    }

    public boolean _WaitSync() {
        return this.StarCore.StarServiceItem_WaitSync(this);
    }

    public int _GetGroupSyncStatus(int var1) {
        return this.StarCore.StarServiceItem_GetGroupSyncStatus(this, var1);
    }

    public Object[] _GetActiveSet() {
        return this.StarCore.StarServiceItem_GetActiveSet(this);
    }

    public void _SetActiveSet(Object... var1) {
        this.StarCore.StarServiceItem_SetActiveSet(this, var1);
    }

    public void _SetClientActiveSet(int var1, Object... var2) {
        this.StarCore.StarServiceItem_SetClientActiveSet(this, var1, var2);
    }

    public StarObjectClass _QueryFirstGroupObject(int var1) {
        return this.StarCore.StarServiceItem_QueryFirstGroupObject(this, var1);
    }

    public StarObjectClass _QueryNextGroupObject() {
        return this.StarCore.StarServiceItem_QueryNextGroupObject(this);
    }

    public StarServiceItemClass _Assign(StarServiceItemClass var1) {
        var1.StarCore = this.StarCore;
        this.StarCore._WrapObject(var1, this);
        return var1;
    }
}
