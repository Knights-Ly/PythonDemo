//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.util.Hashtable;
import java.util.Iterator;

public class StarParaPkgClass implements Iterable {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarParaPkgClass(StarCoreFactory var1, Object[] var2) {
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

    public int _Getint(int var1) {
        return this.StarCore.Common_Toint(this, this.StarCore.StarParaPkg_Get(this, var1));
    }

    public long _Getlong(int var1) {
        return this.StarCore.Common_Tolong(this, this.StarCore.StarParaPkg_Get(this, var1));
    }

    public boolean _Getbool(int var1) {
        return this.StarCore.Common_Tobool(this, this.StarCore.StarParaPkg_Get(this, var1));
    }

    public double _Getdouble(int var1) {
        return this.StarCore.Common_Todouble(this, this.StarCore.StarParaPkg_Get(this, var1));
    }

    public String _GetStr(int var1) {
        return (String)this.StarCore.StarParaPkg_Get(this, var1);
    }

    public StarBinBufClass _GetBinBuf(int var1) {
        return (StarBinBufClass)this.StarCore.StarParaPkg_Get(this, var1);
    }

    public StarObjectClass _Getobject(int var1) {
        return (StarObjectClass)this.StarCore.StarParaPkg_Get(this, var1);
    }

    public StarParaPkgClass _GetParaPkg(int var1) {
        return (StarParaPkgClass)this.StarCore.StarParaPkg_Get(this, var1);
    }

    public void _Set(String var1, Object var2) {
        this.StarCore.Common_Set(this, var1, var2);
    }

    public String toString() {
        return this.StarCore.Common_toString(this);
    }

    public boolean _InsertEmpty(int var1) {
        return this.StarCore.StarParaPkg_InsertEmpty(this, var1);
    }

    public int _T(int var1) {
        return this.StarCore.StarParaPkg_T(this, var1);
    }

    public StarParaPkgClass _Clear() {
        return this.StarCore.StarParaPkg_Clear(this);
    }

    public boolean _Exchange(int var1, int var2) {
        return this.StarCore.StarParaPkg_Exchange(this, var1, var2);
    }

    public void _Del(int var1) {
        this.StarCore.StarParaPkg_Del(this, var1);
    }

    public boolean _AppendFrom(StarParaPkgClass var1) {
        return this.StarCore.StarParaPkg_AppendFrom(this, var1);
    }

    public String _GetUUID(int var1) {
        return this.StarCore.StarParaPkg_GetUUID(this, var1);
    }

    public int _GetHash(int var1) {
        return this.StarCore.StarParaPkg_GetHash(this, var1);
    }

    public boolean _SaveToFile(int var1, String var2) {
        return this.StarCore.StarParaPkg_SaveToFile(this, var1, var2);
    }

    public boolean _LoadFromFile(int var1, String var2) {
        return this.StarCore.StarParaPkg_LoadFromFile(this, var1, var2);
    }

    public boolean _CopyBin(int var1, StarParaPkgClass var2, int var3) {
        return this.StarCore.StarParaPkg_CopyBin(this, var1, var2, var3);
    }

    public Object _Get(int var1) {
        return this.StarCore.StarParaPkg_Get(this, var1);
    }

    public StarParaPkgClass _Set(int var1, Object var2) {
        return this.StarCore.StarParaPkg_Set(this, var1, var2);
    }

    public StarTimeClass _GetTime(int var1) {
        return this.StarCore.StarParaPkg_GetTime(this, var1);
    }

    public boolean _SetTime(int var1, StarTimeClass var2) {
        return this.StarCore.StarParaPkg_SetTime(this, var1, var2);
    }

    public void _SetChangeFlag(int var1) {
        this.StarCore.StarParaPkg_SetChangeFlag(this, var1);
    }

    public void _SetChangeFlagEx() {
        this.StarCore.StarParaPkg_SetChangeFlagEx(this);
    }

    public void _ClearChangeFlag(int var1) {
        this.StarCore.StarParaPkg_ClearChangeFlag(this, var1);
    }

    public void _ClearChangeFlagEx() {
        this.StarCore.StarParaPkg_ClearChangeFlagEx(this);
    }

    public boolean _IsChangeFlag(int var1) {
        return this.StarCore.StarParaPkg_IsChangeFlag(this, var1);
    }

    public boolean _IsChangeFlagEx() {
        return this.StarCore.StarParaPkg_IsChangeFlagEx(this);
    }

    public boolean _SaveChangeToBuf(StarBinBufClass var1) {
        return this.StarCore.StarParaPkg_SaveChangeToBuf(this, var1);
    }

    public boolean _SaveChangeToBufEx(StarBinBufClass var1) {
        return this.StarCore.StarParaPkg_SaveChangeToBufEx(this, var1);
    }

    public boolean _LoadChangeFromBuf(StarBinBufClass var1) {
        return this.StarCore.StarParaPkg_LoadChangeFromBuf(this, var1);
    }

    public StarParaPkgClass _FromDict(Hashtable var1) {
        return this.StarCore.StarParaPkg_FromDict(this, var1);
    }

    public Hashtable _ToDict() {
        return this.StarCore.StarParaPkg_ToDict(this);
    }

    public StarParaPkgClass _FromTuple(Object... var1) {
        return this.StarCore.StarParaPkg_FromTuple(this, var1);
    }

    public Object[] _ToTuple() {
        return this.StarCore.StarParaPkg_ToTuple(this);
    }

    public void _SetScriptRawType(int var1) {
        this.StarCore.StarParaPkg_SetScriptRawType(this, var1);
    }

    public int _GetScriptRawType() {
        return this.StarCore.StarParaPkg_GetScriptRawType(this);
    }

    public Iterator _Iterator() {
        return new StarParaPkgIteratorClass(this);
    }

    public StarParaPkgClass _Build(Object... var1) {
        return this.StarCore.StarParaPkg_FromTuple(this, var1);
    }

    public Iterator iterator() {
        return this._Iterator();
    }

    public void _Free() {
        this.StarCore.StarParaPkg_Free(this);
    }

    public StarParaPkgClass _AsDict(boolean var1) {
        return this.StarCore.StarParaPkg_AsDict(this, var1);
    }

    public boolean _IsDict() {
        return this.StarCore.StarParaPkg_IsDict(this);
    }

    public int _FindDict(String var1) {
        return this.StarCore.StarParaPkg_FindDict(this, var1);
    }

    public int _FindDictEx(int var1) {
        return this.StarCore.StarParaPkg_FindDictEx(this, var1);
    }

    public boolean _FromJSon(String var1) {
        return this.StarCore.StarParaPkg_FromJSon(this, var1);
    }

    public String _ToJSon() {
        return this.StarCore.StarParaPkg_ToJSon(this);
    }

    public boolean _Equals(StarParaPkgClass var1) {
        return this.StarCore.StarParaPkg_Equals(this, var1);
    }

    public boolean _SetReadOnly(String var1, boolean var2) {
        return this.StarCore.StarParaPkg_SetReadOnly(this, var1, var2);
    }

    public boolean _IsReadOnly() {
        return this.StarCore.StarParaPkg_IsReadOnly(this);
    }

    public boolean _MoveLastTo(int var1) {
        return this.StarCore.StarParaPkg_MoveLastTo(this, var1);
    }

    public boolean _Copy(int var1, StarParaPkgClass var2, int var3) {
        return this.StarCore.StarParaPkg_Copy(this, var1, var2, var3);
    }

    public void _ReleaseOwner() {
        this.StarCore.StarParaPkg_ReleaseOwner(this);
    }

    public void _Dispose() {
        this.StarCore.StarParaPkg_Dispose(this);
    }
}
