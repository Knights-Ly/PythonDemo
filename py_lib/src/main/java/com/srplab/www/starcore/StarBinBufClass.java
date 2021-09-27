//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarBinBufClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    public StarBinBufClass(StarCoreFactory var1, Object[] var2) {
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

    public void _Init(int var1) {
        this.StarCore.StarBinBuf_Init(this, var1);
    }

    public void _Clear() {
        this.StarCore.StarBinBuf_Clear(this);
    }

    public void _ClearEx(int var1, int var2) {
        this.StarCore.StarBinBuf_ClearEx(this, var1, var2);
    }

    public int _Set(int var1, int var2, String var3, Object var4) {
        return this.StarCore.StarBinBuf_Set(this, var1, var2, var3, var4);
    }

    public Object _Get(int var1, int var2, String var3) {
        return this.StarCore.StarBinBuf_Get(this, var1, var2, var3);
    }

    public boolean _SaveToFile(String var1, boolean var2) {
        return this.StarCore.StarBinBuf_SaveToFile(this, var1, var2);
    }

    public boolean _LoadFromFile(String var1, boolean var2) {
        return this.StarCore.StarBinBuf_LoadFromFile(this, var1, var2);
    }

    public boolean _SetOffset(int var1) {
        return this.StarCore.StarBinBuf_SetOffset(this, var1);
    }

    public boolean _Expand(int var1) {
        return this.StarCore.StarBinBuf_Expand(this, var1);
    }

    public boolean _Fill(int var1, int var2, String var3) {
        return this.StarCore.StarBinBuf_Fill(this, var1, var2, var3);
    }

    public boolean _PackObject(StarObjectClass var1) {
        return this.StarCore.StarBinBuf_PackObject(this, var1);
    }

    public boolean _UnPackObject(StarObjectClass var1) {
        return this.StarCore.StarBinBuf_UnPackObject(this, var1);
    }

    public boolean _ToUTF8() {
        return this.StarCore.StarBinBuf_ToUTF8(this);
    }

    public boolean _ToAnsi() {
        return this.StarCore.StarBinBuf_ToAnsi(this);
    }

    public void _InsertStr(int var1, String var2) {
        this.StarCore.StarBinBuf_InsertStr(this, var1, var2);
    }

    public int _FindStr(int var1, String var2) {
        return this.StarCore.StarBinBuf_FindStr(this, var1, var2);
    }

    public int _FindStri(int var1, String var2) {
        return this.StarCore.StarBinBuf_FindStri(this, var1, var2);
    }

    public void _Print(String var1) {
        this.StarCore.StarBinBuf_Print(this, var1);
    }

    public long _OpenFile(String var1, String var2) {
        return this.StarCore.StarBinBuf_OpenFile(this, var1, var2);
    }

    public int _GetFileSize(long var1) {
        return this.StarCore.StarBinBuf_GetFileSize(this, var1);
    }

    public int _ReadFile(long var1, int var3, int var4) {
        return this.StarCore.StarBinBuf_ReadFile(this, var1, var3, var4);
    }

    public int _WriteFile(long var1, int var3, int var4) {
        return this.StarCore.StarBinBuf_WriteFile(this, var1, var3, var4);
    }

    public void _CloseFile(long var1) {
        this.StarCore.StarBinBuf_CloseFile(this, var1);
    }

    public boolean _IsLightBuf() {
        return this.StarCore.StarBinBuf_IsLightBuf(this);
    }

    public boolean _AnsiToUnicode(String var1, int var2) {
        return this.StarCore.StarBinBuf_AnsiToUnicode(this, var1, var2);
    }

    public boolean _UnicodeToAnsi(String var1, int var2) {
        return this.StarCore.StarBinBuf_UnicodeToAnsi(this, var1, var2);
    }

    public int _Read(byte[] var1, int var2, int var3) {
        return this.StarCore.StarBinBuf_Read(this, var1, var2, var3);
    }

    public int _Write(int var1, byte[] var2, int var3) {
        return this.StarCore.StarBinBuf_Write(this, var1, var2, var3);
    }

    public int _Read2(short[] var1, int var2, int var3, int var4, int var5) {
        return this.StarCore.StarBinBuf_Read2(this, var1, var2, var3, var4, var5);
    }

    public int _Write2(int var1, short[] var2, int var3, int var4, int var5) {
        return this.StarCore.StarBinBuf_Write2(this, var1, var2, var3, var4, var5);
    }

    public int _Read4(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return this.StarCore.StarBinBuf_Read4(this, var1, var2, var3, var4, var5, var6, var7);
    }

    public int _Write4(int var1, int[] var2, int var3, int var4, int var5, int var6, int var7) {
        return this.StarCore.StarBinBuf_Write4(this, var1, var2, var3, var4, var5, var6, var7);
    }

    public int _WriteFromMemoryFile(StarServiceClass var1, int var2, String var3) {
        return this.StarCore.StarBinBuf_WriteFromMemoryFile(this, var1, var2, var3);
    }

    public int _GetHash() {
        return this.StarCore.StarBinBuf_GetHash(this);
    }

    public String _GetMD5() {
        return this.StarCore.StarBinBuf_GetMD5(this);
    }

    public void _Free() {
        this.StarCore.StarBinBuf_Free(this);
    }

    public void _ReleaseOwner() {
        this.StarCore.StarBinBuf_ReleaseOwner(this);
    }

    public void _Dispose() {
        this.StarCore.StarBinBuf_Dispose(this);
    }

    public byte[] _ToBuf() {
        int var1 = this.StarCore.Common_Getint(this, "_Offset");
        byte[] var2 = new byte[var1];
        this.StarCore.StarBinBuf_Read(this, var2, 0, var1);
        return var2;
    }

    public StarBinBufClass _FromBuf(byte[] var1) {
        this.StarCore.StarBinBuf_Write(this, 0, var1, var1.length);
        return this;
    }
}
