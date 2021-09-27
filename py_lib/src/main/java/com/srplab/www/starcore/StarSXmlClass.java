//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarSXmlClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarSXmlClass(StarCoreFactory var1, Object[] var2) {
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

    public Object[] _LoadFromFile(String var1) {
        return this.StarCore.StarSXml_LoadFromFile(this, var1);
    }

    public Object[] _LoadFromBuf(StarBinBufClass var1) {
        return this.StarCore.StarSXml_LoadFromBuf(this, var1);
    }

    public Object[] _LoadFromBufEx(String var1) {
        return this.StarCore.StarSXml_LoadFromBufEx(this, var1);
    }

    public boolean _SaveToFile(String var1) {
        return this.StarCore.StarSXml_SaveToFile(this, var1);
    }

    public boolean _SaveToBuf(StarBinBufClass var1) {
        return this.StarCore.StarSXml_SaveToBuf(this, var1);
    }

    public String _GetStandalone() {
        return this.StarCore.StarSXml_GetStandalone(this);
    }

    public String _GetVersion() {
        return this.StarCore.StarSXml_GetVersion(this);
    }

    public String _GetEncoding() {
        return this.StarCore.StarSXml_GetEncoding(this);
    }

    public long _FindElement(String var1) {
        return this.StarCore.StarSXml_FindElement(this, var1);
    }

    public long _FindElementEx(long var1, String var3) {
        return this.StarCore.StarSXml_FindElementEx(this, var1, var3);
    }

    public long _FirstElement(long var1) {
        return this.StarCore.StarSXml_FirstElement(this, var1);
    }

    public long _NextElement(long var1) {
        return this.StarCore.StarSXml_NextElement(this, var1);
    }

    public long _ParentElement(long var1) {
        return this.StarCore.StarSXml_ParentElement(this, var1);
    }

    public String _GetElement(long var1) {
        return this.StarCore.StarSXml_GetElement(this, var1);
    }

    public String _GetElementEx(long var1) {
        return this.StarCore.StarSXml_GetElementEx(this, var1);
    }

    public Object[] _GetNs(long var1) {
        return this.StarCore.StarSXml_GetNs(this, var1);
    }

    public String _GetNsValue(long var1, String var3) {
        return this.StarCore.StarSXml_GetNsValue(this, var1, var3);
    }

    public long _FindAttribute(long var1, String var3) {
        return this.StarCore.StarSXml_FindAttribute(this, var1, var3);
    }

    public long _FirstAttribute(long var1) {
        return this.StarCore.StarSXml_FirstAttribute(this, var1);
    }

    public long _NextAttribute(long var1) {
        return this.StarCore.StarSXml_NextAttribute(this, var1);
    }

    public String _GetAttributeName(long var1) {
        return this.StarCore.StarSXml_GetAttributeName(this, var1);
    }

    public String _GetAttributeValue(long var1) {
        return this.StarCore.StarSXml_GetAttributeValue(this, var1);
    }

    public String _GetSingleText(long var1) {
        return this.StarCore.StarSXml_GetSingleText(this, var1);
    }

    public long _FirstText(long var1) {
        return this.StarCore.StarSXml_FirstText(this, var1);
    }

    public long _NextText(long var1) {
        return this.StarCore.StarSXml_NextText(this, var1);
    }

    public String _GetText(long var1) {
        return this.StarCore.StarSXml_GetText(this, var1);
    }

    public void _SetDeclaration(String var1, String var2, String var3) {
        this.StarCore.StarSXml_SetDeclaration(this, var1, var2, var3);
    }

    public void _RemoveDeclaration() {
        this.StarCore.StarSXml_RemoveDeclaration(this);
    }

    public long _InsertElementBefore(long var1, long var3, String var5) {
        return this.StarCore.StarSXml_InsertElementBefore(this, var1, var3, var5);
    }

    public long _InsertElementAfter(long var1, long var3, String var5) {
        return this.StarCore.StarSXml_InsertElementAfter(this, var1, var3, var5);
    }

    public void _RemoveElement(long var1) {
        this.StarCore.StarSXml_RemoveElement(this, var1);
    }

    public void _SetElement(long var1, String var3) {
        this.StarCore.StarSXml_SetElement(this, var1, var3);
    }

    public void _SetNs(long var1, String var3, String var4) {
        this.StarCore.StarSXml_SetNs(this, var1, var3, var4);
    }

    public long _InsertTextBefore(long var1, long var3, String var5, boolean var6) {
        return this.StarCore.StarSXml_InsertTextBefore(this, var1, var3, var5, var6);
    }

    public long _InsertTextAfter(long var1, long var3, String var5, boolean var6) {
        return this.StarCore.StarSXml_InsertTextAfter(this, var1, var3, var5, var6);
    }

    public void _RemoveText(long var1) {
        this.StarCore.StarSXml_RemoveText(this, var1);
    }

    public void _SetText(long var1, String var3, boolean var4) {
        this.StarCore.StarSXml_SetText(this, var1, var3, var4);
    }

    public long _InsertCommentBefore(long var1, long var3, String var5) {
        return this.StarCore.StarSXml_InsertCommentBefore(this, var1, var3, var5);
    }

    public long _InsertCommentAfter(long var1, long var3, String var5) {
        return this.StarCore.StarSXml_InsertCommentAfter(this, var1, var3, var5);
    }

    public void _RemoveComment(long var1) {
        this.StarCore.StarSXml_RemoveComment(this, var1);
    }

    public void _SetComment(long var1, String var3) {
        this.StarCore.StarSXml_SetComment(this, var1, var3);
    }

    public void _SetAttribute(long var1, String var3, String var4) {
        this.StarCore.StarSXml_SetAttribute(this, var1, var3, var4);
    }

    public void _RemoveAttribute(long var1, String var3) {
        this.StarCore.StarSXml_RemoveAttribute(this, var1, var3);
    }

    public long _CopyElementBefore(long var1, long var3, long var5) {
        return this.StarCore.StarSXml_CopyElementBefore(this, var1, var3, var5);
    }

    public long _CopyElementAfter(long var1, long var3, long var5) {
        return this.StarCore.StarSXml_CopyElementAfter(this, var1, var3, var5);
    }

    public boolean _CopyChild(long var1, long var3) {
        return this.StarCore.StarSXml_CopyChild(this, var1, var3);
    }

    public boolean _Dup(StarSXmlClass var1) {
        return this.StarCore.StarSXml_Dup(this, var1);
    }

    public void _Free() {
        this.StarCore.StarSXml_Free(this);
    }

    public void _ReleaseOwner() {
        this.StarCore.StarSXml_ReleaseOwner(this);
    }

    public void _Dispose() {
        this.StarCore.StarSXml_Dispose(this);
    }
}
