//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarFunctionParaClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarFunctionParaClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
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

    public Object _Get(String var1) {
        return this.StarCore.Common_Get(this, var1);
    }

    public void _Set(String var1, Object var2) {
        this.StarCore.Common_Set(this, var1, var2);
    }

    public String toString() {
        return this.StarCore.Common_toString(this);
    }

    public int _GetNumber() {
        return this.StarCore.StarFunctionPara_GetNumber(this);
    }

    public int _Number() {
        return this.StarCore.StarFunctionPara_GetNumber(this);
    }

    public Object _GetValue(int var1) {
        return this.StarCore.StarFunctionPara_GetValue(this, var1);
    }

    public Object _Get(int var1) {
        return this.StarCore.StarFunctionPara_GetValue(this, var1);
    }

    public void _Clear() {
        this.StarCore.StarFunctionPara_Clear(this);
    }

    public boolean _SetValue(int var1, Object var2) {
        return this.StarCore.StarFunctionPara_SetValue(this, var1, var2);
    }

    public boolean _Set(int var1, Object var2) {
        return this.StarCore.StarFunctionPara_SetValue(this, var1, var2);
    }

    public Object _Call(StarObjectClass var1, String var2) {
        return this.StarCore.StarFunctionPara_Call(this, var1, var2);
    }

    public int _Type(int var1) {
        return this.StarCore.StarFunctionPara_GetType(this, var1);
    }

    public void _Free() {
        this.StarCore.StarFunctionPara_Free(this);
    }

    public void _ReleaseOwner() {
        this.StarCore.StarFunctionPara_ReleaseOwner(this);
    }

    public void _Dispose() {
        this.StarCore.StarFunctionPara_Dispose(this);
    }
}
