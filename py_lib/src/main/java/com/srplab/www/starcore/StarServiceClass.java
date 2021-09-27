//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarServiceClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarServiceClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
    }

    public StarServiceClass(StarServiceClass var1) {
        this.StarCore = var1.StarCore;
        this.StarCore._WrapObject(this, var1);
    }

    public StarServiceClass() {
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

    public StarSrvGroupClass _GetSrvGroup() {
        return (StarSrvGroupClass)this.StarCore.Common_Get(this, "_ServiceGroup");
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

    public void _DeactiveAll() {
        this.StarCore.StarService_DeactiveAll(this);
    }

    public StarObjectClass _GetObject(String var1) {
        return this.StarCore.StarService_GetObject(this, var1);
    }

    public StarObjectClass _GetObjectEx(String var1) {
        return this.StarCore.StarService_GetObjectEx(this, var1);
    }

    public StarObjectClass _GetObjectEx2(String var1, String var2) {
        return this.StarCore.StarService_GetObjectEx2(this, var1, var2);
    }

    public void _GetObjectEx3(String var1, StarParaPkgClass var2) {
        this.StarCore.StarService_GetObjectEx3(this, var1, var2);
    }

    public StarObjectClass _GetStarSpace(String var1) {
        return this.StarCore.StarService_GetStarSpace(this, var1);
    }

    public StarServiceItemClass _GetSysRootItem(String var1) {
        return this.StarCore.StarService_GetSysRootItem(this, var1);
    }

    public void _Exit() {
        this.StarCore.StarService_Exit(this);
    }

    public void _Save(String var1) {
        this.StarCore.StarService_Save(this, var1);
    }

    public boolean _IsChange() {
        return this.StarCore.StarService_IsChange(this);
    }

    public boolean _IsActive() {
        return this.StarCore.StarService_IsActive(this);
    }

    public StarObjectClass _QueryFirstFromSDT() {
        return this.StarCore.StarService_QueryFirstFromSDT(this);
    }

    public StarObjectClass _QueryNextFromSDT() {
        return this.StarCore.StarService_QueryNextFromSDT(this);
    }

    public void _PrintInfo() {
        this.StarCore.StarService_PrintInfo(this);
    }

    public boolean _CreateSysRootItem(String var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_CreateSysRootItem(this, var1, var2, var3, var4);
    }

    public StarServiceItemClass _CreateSysRootItemEx(String var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_CreateSysRootItemEx(this, var1, var2, var3, var4);
    }

    public void _ActiveSysRootItem(String var1) {
        this.StarCore.StarService_ActiveSysRootItem(this, var1);
    }

    public void _ActiveAllSysRootItem() {
        this.StarCore.StarService_ActiveAllSysRootItem(this);
    }

    public void _DeactiveSysRootItem(String var1) {
        this.StarCore.StarService_DeactiveSysRootItem(this, var1);
    }

    public void _ActiveCSysRootItem(int var1, String var2) {
        this.StarCore.StarService_ActiveCSysRootItem(this, var1, var2);
    }

    public void _DeactiveCSysRootItem(int var1, String var2) {
        this.StarCore.StarService_DeactiveCSysRootItem(this, var1, var2);
    }

    public String _QueryFirstSysRootItem() {
        return this.StarCore.StarService_QueryFirstSysRootItem(this);
    }

    public String _QueryNextSysRootItem() {
        return this.StarCore.StarService_QueryNextSysRootItem(this);
    }

    public Object[] _QueryFirstDepend() {
        return this.StarCore.StarService_QueryFirstDepend(this);
    }

    public Object[] _QueryNextDepend() {
        return this.StarCore.StarService_QueryNextDepend(this);
    }

    public boolean _IsOsSupport(int var1, int var2) {
        return this.StarCore.StarService_IsOsSupport(this, var1, var2);
    }

    public boolean _SetClientObject(int var1, StarObjectClass var2) {
        return this.StarCore.StarService_SetClientObject(this, var1, var2);
    }

    public StarObjectClass _GetClientObject() {
        return this.StarCore.StarService_GetClientObject(this);
    }

    public void _SetPrivateTag(int var1) {
        this.StarCore.StarService_SetPrivateTag(this, var1);
    }

    public void _RegMachineFunction(String var1) {
        this.StarCore.StarService_RegMachineFunction(this, var1);
    }

    public void _RegMachineFunction_P(StarServiceMachineInterface var1) {
        this.StarCore.StarService_RegMachineFunction_P(this, var1);
    }

    public int _GetOPPermission() {
        return this.StarCore.StarService_GetOPPermission(this);
    }

    public boolean _AcceptClient(int var1, boolean var2, boolean var3, String var4, String var5, int var6, int var7, int var8) {
        return this.StarCore.StarService_AcceptClient(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public Object[] _GetClientInfo(int var1) {
        return this.StarCore.StarService_GetClientInfo(this, var1);
    }

    public int _GetClientNumber() {
        return this.StarCore.StarService_GetClientNumber(this);
    }

    public void _PrintClientInfo() {
        this.StarCore.StarService_PrintClientInfo(this);
    }

    public void _DelClient(int var1) {
        this.StarCore.StarService_DelClient(this, var1);
    }

    public void _RegClientOpFunction(String var1) {
        this.StarCore.StarService_RegClientOpFunction(this, var1);
    }

    public void _RegClientOpFunction_P(StarServiceClientOpInterface var1) {
        this.StarCore.StarService_RegClientOpFunction_P(this, var1);
    }

    public void _Redirect(int var1, String var2, String var3, int var4, StarParaPkgClass var5, String var6) {
        this.StarCore.StarService_Redirect(this, var1, var2, var3, var4, var5, var6);
    }

    public void _Redirect_P(int var1, String var2, String var3, int var4, StarParaPkgClass var5, StarServiceRedirectInterface var6) {
        this.StarCore.StarService_Redirect_P(this, var1, var2, var3, var4, var5, var6);
    }

    public void _DownLoad(String var1, String var2, String var3) {
        this.StarCore.StarService_DownLoad(this, var1, var2, var3);
    }

    public void _HttpDownLoad(String var1, String var2, String var3) {
        this.StarCore.StarService_HttpDownLoad(this, var1, var2, var3);
    }

    public void _HttpDownLoadAbort() {
        this.StarCore.StarService_HttpDownLoadAbort(this);
    }

    public void _UpLoad(String var1, String var2, String var3) {
        this.StarCore.StarService_UpLoad(this, var1, var2, var3);
    }

    public long _RegFileCallBack(String var1) {
        return this.StarCore.StarService_RegFileCallBack(this, var1);
    }

    public long _RegFileCallBack_P(StarServiceFileCallBackInterface var1) {
        return this.StarCore.StarService_RegFileCallBack_P(this, var1);
    }

    public void _UnRegFileCallBack(long var1) {
        this.StarCore.StarService_UnRegFileCallBack(this, var1);
    }

    public StarObjectClass _New(Object... var1) {
        return this.StarCore.StarService_New(this, var1);
    }

    public StarObjectClass _NewEx(Object... var1) {
        return this.StarCore.StarService_NewEx(this, var1);
    }

    public StarObjectClass _NewGlobal(Object... var1) {
        return this.StarCore.StarService_NewGlobal(this, var1);
    }

    public StarObjectClass _NewGlobalEx(Object... var1) {
        return this.StarCore.StarService_NewGlobalEx(this, var1);
    }

    public StarObjectClass _NewClient(Object... var1) {
        return this.StarCore.StarService_NewClient(this, var1);
    }

    public StarObjectClass _NewClientEx(Object... var1) {
        return this.StarCore.StarService_NewClientEx(this, var1);
    }

    public void _PrintMacro(String var1) {
        this.StarCore.StarService_PrintMacro(this, var1);
    }

    public boolean _CreateUser(String var1, String var2, int var3) {
        return this.StarCore.StarService_CreateUser(this, var1, var2, var3);
    }

    public void _DeleteUser(String var1) {
        this.StarCore.StarService_DeleteUser(this, var1);
    }

    public Object[] _FirstUser(StarQueryRecordClass var1) {
        return this.StarCore.StarService_FirstUser(this, var1);
    }

    public Object[] _NextUser(StarQueryRecordClass var1) {
        return this.StarCore.StarService_NextUser(this, var1);
    }

    public Object[] _RunScript(String var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_RunScript(this, var1, var2, var3, var4);
    }

    public Object[] _RunScriptEx(String var1, StarBinBufClass var2, String var3, String var4) {
        return this.StarCore.StarService_RunScriptEx(this, var1, var2, var3, var4);
    }

    public Object[] _DoFile(String var1, String var2, String var3) {
        return this.StarCore.StarService_DoFile(this, var1, var2, var3);
    }

    public Object[] _DoFileEx(String var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_DoFileEx(this, var1, var2, var3, var4);
    }

    public String _GetPeerIP(int var1) {
        return this.StarCore.StarService_GetPeerIP(this, var1);
    }

    public int _GetServerID() {
        return this.StarCore.StarService_GetServerID(this);
    }

    public void _ForceToSaveStatic() {
        this.StarCore.StarService_ForceToSaveStatic(this);
    }

    public void _ClearStatic(int var1) {
        this.StarCore.StarService_ClearStatic(this, var1);
    }

    public void _RegServerWebDownFunction(String var1) {
        this.StarCore.StarService_RegServerWebDownFunction(this, var1);
    }

    public void _RegServerWebDownFunction_P(StarServiceWebDownInterface var1) {
        this.StarCore.StarService_RegServerWebDownFunction_P(this, var1);
    }

    public StarObjectClass _GetObjectFromLua(String var1) {
        return this.StarCore.StarService_GetObjectFromLua(this, var1);
    }

    public void _PackStaticData() {
        this.StarCore.StarService_PackStaticData(this);
    }

    public boolean _XmlToSysRootItem(StarSXmlClass var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_XmlToSysRootItem(this, var1, var2, var3, var4);
    }

    public boolean _XmlToSysRootItem_P(StarSXmlClass var1, String var2, String var3, StarServiceInfoInterface var4) {
        return this.StarCore.StarService_XmlToSysRootItem_P(this, var1, var2, var3, var4);
    }

    public boolean _XmlToObject(StarSXmlClass var1, Object var2, String var3, String var4, String var5, String var6) {
        return this.StarCore.StarService_XmlToObject(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _XmlToObject_P(StarSXmlClass var1, Object var2, String var3, String var4, String var5, StarServiceInfoInterface var6) {
        return this.StarCore.StarService_XmlToObject_P(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _ServiceToXml(StarSXmlClass var1, String var2, String var3, boolean var4, boolean var5, String var6) {
        return this.StarCore.StarService_ServiceToXml(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _ServiceToXml_P(StarSXmlClass var1, String var2, String var3, boolean var4, boolean var5, StarServiceInfoInterface var6) {
        return this.StarCore.StarService_ServiceToXml_P(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _SysRootItemToXml(StarSXmlClass var1, String var2, String var3, boolean var4, boolean var5, String var6) {
        return this.StarCore.StarService_SysRootItemToXml(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _SysRootItemToXml_P(StarSXmlClass var1, String var2, String var3, boolean var4, boolean var5, StarServiceInfoInterface var6) {
        return this.StarCore.StarService_SysRootItemToXml_P(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _ObjectToXml(StarSXmlClass var1, Object var2, String var3, boolean var4, boolean var5, String var6) {
        return this.StarCore.StarService_ObjectToXml(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _ObjectToXml_P(StarSXmlClass var1, Object var2, String var3, boolean var4, boolean var5, StarServiceInfoInterface var6) {
        return this.StarCore.StarService_ObjectToXml_P(this, var1, var2, var3, var4, var5, var6);
    }

    public long _CreateAtomicDepend(String var1) {
        return this.StarCore.StarService_CreateAtomicDepend(this, var1);
    }

    public long _CreateAtomicMacro(String var1, int var2) {
        return this.StarCore.StarService_CreateAtomicMacro(this, var1, var2);
    }

    public long _CreateAtomicMacroItem(long var1, String var3, String var4) {
        return this.StarCore.StarService_CreateAtomicMacroItem(this, var1, var3, var4);
    }

    public long _CreateAtomicModule(String var1, int var2, String var3) {
        return this.StarCore.StarService_CreateAtomicModule(this, var1, var2, var3);
    }

    public long _CreateAtomicEditModule(String var1, String var2) {
        return this.StarCore.StarService_CreateAtomicEditModule(this, var1, var2);
    }

    public long _CreateAtomicStruct(String var1, String var2, String var3) {
        return this.StarCore.StarService_CreateAtomicStruct(this, var1, var2, var3);
    }

    public long _CreateAtomicSysRootItem(String var1, String var2) {
        return this.StarCore.StarService_CreateAtomicSysRootItem(this, var1, var2);
    }

    public long _CreateAtomicObject(long var1, String var3, long var4, String var6, String var7) {
        return this.StarCore.StarService_CreateAtomicObject(this, var1, var3, var4, var6, var7);
    }

    public long _CreateAtomicAttachAttribute(long var1, String var3, String var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, String var13, String var14) {
        return this.StarCore.StarService_CreateAtomicAttachAttribute(this, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    public long _CreateAtomicAttribute(long var1, String var3, String var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, String var13, String var14) {
        return this.StarCore.StarService_CreateAtomicAttribute(this, var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    public long _CreateAtomicFuncRetAttribute(long var1, int var3, String var4) {
        return this.StarCore.StarService_CreateAtomicFuncRetAttribute(this, var1, var3, var4);
    }

    public long _CreateAtomicFuncParaAttribute(long var1, String var3, String var4, int var5, String var6) {
        return this.StarCore.StarService_CreateAtomicFuncParaAttribute(this, var1, var3, var4, var5, var6);
    }

    public long _CreateAtomicStructAttribute(long var1, String var3, String var4, int var5, String var6) {
        return this.StarCore.StarService_CreateAtomicStructAttribute(this, var1, var3, var4, var5, var6);
    }

    public boolean _SetAtomicAttributeLength(long var1, int var3) {
        return this.StarCore.StarService_SetAtomicAttributeLength(this, var1, var3);
    }

    public boolean _SetAtomicAttributeStruct(long var1, long var3) {
        return this.StarCore.StarService_SetAtomicAttributeStruct(this, var1, var3);
    }

    public boolean _SetAtomicAttributeCombobox(long var1, String var3) {
        return this.StarCore.StarService_SetAtomicAttributeCombobox(this, var1, var3);
    }

    public boolean _SetAtomicAttributeSyncFlag(long var1, int var3) {
        return this.StarCore.StarService_SetAtomicAttributeSyncFlag(this, var1, var3);
    }

    public boolean _SetAtomicObjectSyncGroup(long var1, int var3) {
        return this.StarCore.StarService_SetAtomicObjectSyncGroup(this, var1, var3);
    }

    public boolean _SetAtomicObjectAttribute(long var1, boolean var3, int var4, int var5, int var6) {
        return this.StarCore.StarService_SetAtomicObjectAttribute(this, var1, var3, var4, var5, var6);
    }

    public long _CreateAtomicScript(long var1, String var3, String var4, String var5, String var6) {
        return this.StarCore.StarService_CreateAtomicScript(this, var1, var3, var4, var5, var6);
    }

    public long _CreateAtomicFunction(long var1, String var3, String var4, String var5, boolean var6, boolean var7, boolean var8, boolean var9) {
        return this.StarCore.StarService_CreateAtomicFunction(this, var1, var3, var4, var5, var6, var7, var8, var9);
    }

    public Object[] _CreateAtomicFunctionEx(long var1, String var3, String var4, String var5, boolean var6, boolean var7, String var8, boolean var9, boolean var10) {
        return this.StarCore.StarService_CreateAtomicFunctionEx(this, var1, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    public long _CreateAtomicLuaFunction(long var1, String var3, String var4, String var5) {
        return this.StarCore.StarService_CreateAtomicLuaFunction(this, var1, var3, var4, var5);
    }

    public long _CreateAtomicOvlFunction(long var1, String var3, String var4, String var5, String var6, boolean var7) {
        return this.StarCore.StarService_CreateAtomicOvlFunction(this, var1, var3, var4, var5, var6, var7);
    }

    public long _CreateAtomicInEvent(long var1, String var3, String var4, String var5) {
        return this.StarCore.StarService_CreateAtomicInEvent(this, var1, var3, var4, var5);
    }

    public long _CreateAtomicOutEvent(long var1, String var3, String var4, String var5, boolean var6) {
        return this.StarCore.StarService_CreateAtomicOutEvent(this, var1, var3, var4, var5, var6);
    }

    public long _GetAtomicSysRootItem(String var1) {
        return this.StarCore.StarService_GetAtomicSysRootItem(this, var1);
    }

    public long _GetAtomicObjectEx(long var1, String var3) {
        return this.StarCore.StarService_GetAtomicObjectEx(this, var1, var3);
    }

    public String _GetAtomicID(long var1) {
        return this.StarCore.StarService_GetAtomicID(this, var1);
    }

    public long _ObjectToAtomic(StarObjectClass var1) {
        return this.StarCore.StarService_ObjectToAtomic(this, var1);
    }

    public StarObjectClass _AtomicToObject(long var1) {
        return this.StarCore.StarService_AtomicToObject(this, var1);
    }

    public Object[] _CreateAtomicObjectSimple(String var1, String var2, String var3, String var4) {
        return this.StarCore.StarService_CreateAtomicObjectSimple(this, var1, var2, var3, var4);
    }

    public Object[] _CreateAtomicStructSimple(String var1, String var2, String var3) {
        return this.StarCore.StarService_CreateAtomicStructSimple(this, var1, var2, var3);
    }

    public Object[] _CreateAtomicObjectAttributeSimple(long var1, String var3) {
        return this.StarCore.StarService_CreateAtomicObjectAttributeSimple(this, var1, var3);
    }

    public Object[] _CreateAtomicFunctionSimple(long var1, String var3, String var4, String var5, boolean var6, boolean var7) {
        return this.StarCore.StarService_CreateAtomicFunctionSimple(this, var1, var3, var4, var5, var6, var7);
    }

    public boolean _AtomicAttach(long var1, String var3) {
        return this.StarCore.StarService_AtomicAttach(this, var1, var3);
    }

    public Object[] _ExportModule(String var1) {
        return this.StarCore.StarService_ExportModule(this, var1);
    }

    public void _SetLog(Object var1, boolean var2) {
        this.StarCore.StarService_SetLog(this, var1, var2);
    }

    public void _SetLogFile(String var1) {
        this.StarCore.StarService_SetLogFile(this, var1);
    }

    public String _GetLogFile() {
        return this.StarCore.StarService_GetLogFile(this);
    }

    public void _ClearLog() {
        this.StarCore.StarService_ClearLog(this);
    }

    public boolean _ApplyLog() {
        return this.StarCore.StarService_ApplyLog(this);
    }

    public boolean _IsServiceRegistered() {
        return this.StarCore.StarService_IsServiceRegistered(this);
    }

    public void _CheckPassword(boolean var1) {
        this.StarCore.StarService_CheckPassword(this, var1);
    }

    public String _FirstShareLib() {
        return this.StarCore.StarService_FirstShareLib(this);
    }

    public String _NextShareLib() {
        return this.StarCore.StarService_NextShareLib(this);
    }

    public long _GetShareLib(String var1) {
        return this.StarCore.StarService_GetShareLib(this, var1);
    }

    public void _FreeShareLib(long var1) {
        this.StarCore.StarService_FreeShareLib(this, var1);
    }

    public int _NewGroup() {
        return this.StarCore.StarService_NewGroup(this);
    }

    public void _FreeGroup(int var1) {
        this.StarCore.StarService_FreeGroup(this, var1);
    }

    public int _GroupAdd(int var1, StarObjectClass var2) {
        return this.StarCore.StarService_GroupAdd(this, var1, var2);
    }

    public StarObjectClass _GroupGet(int var1, int var2) {
        return this.StarCore.StarService_GroupGet(this, var1, var2);
    }

    public void _GroupRemove(int var1, int var2) {
        this.StarCore.StarService_GroupRemove(this, var1, var2);
    }

    public void _GroupRemoveEx(int var1, StarObjectClass var2) {
        this.StarCore.StarService_GroupRemoveEx(this, var1, var2);
    }

    public void _GroupClear(int var1, boolean var2) {
        this.StarCore.StarService_GroupClear(this, var1, var2);
    }

    public StarServiceClass _GetControlService() {
        return this.StarCore.StarService_GetControlService(this);
    }

    public StarServiceClass _Assign(StarServiceClass var1) {
        var1.StarCore = this.StarCore;
        this.StarCore._WrapObject(var1, this);
        return var1;
    }

    public boolean _LoadRawModule(String var1, String var2, String var3, boolean var4) {
        return this.StarCore.StarService_LoadRawModule(this, var1, var2, var3, var4);
    }

    public boolean _LoadRawModuleEx(String var1, String var2, StarObjectClass var3) {
        return this.StarCore.StarService_LoadRawModuleEx(this, var1, var2, var3);
    }

    public Object _NewScriptRawType(int var1) {
        return this.StarCore.StarService_NewScriptRawType(this, var1);
    }

    public StarObjectClass _NewRawProxy(String var1, Object var2, String var3, String var4, int var5) {
        return this.StarCore.StarService_NewRawProxy(this, var1, var2, var3, var4, var5);
    }

    public String _CreateRawProxyCode(String var1, String var2, String var3, String var4, String var5, String var6, String var7) {
        return this.StarCore.StarService_CreateRawProxyCode(this, var1, var2, var3, var4, var5, var6, var7);
    }

    public StarObjectClass _ImportRawContext(String var1, String var2, boolean var3, String var4) {
        return this.StarCore.StarService_ImportRawContext(this, var1, var2, var3, var4);
    }

    public StarObjectClass _ImportRawObject(Object var1, boolean var2) {
        return this.StarCore.StarService_ImportRawObject(this, var1, var2);
    }

    public int _GetLastError() {
        return this.StarCore.StarService_GetLastError(this);
    }

    public String _GetLastErrorInfo() {
        return this.StarCore.StarService_GetLastErrorInfo(this);
    }

    public Object[] _RestfulCall(String var1, String var2, String var3) {
        return this.StarCore.StarService_RestfulCall(this, var1, var2, var3);
    }

    public StarParaPkgClass _AllObject() {
        return this.StarCore.StarService_AllObject(this);
    }

    public void _DispatchCall(Object var1, StarObjectClass var2) {
        this.StarCore.StarService_DispatchCall(this, var1, var2, false);
    }

    public void _DispatchCall(Object var1, StarObjectScriptProcInterface var2) {
        this.StarCore.StarService_DispatchCall(this, var1, var2, false);
    }

    public void _MainDispatchCall(Object var1, StarObjectClass var2) {
        this.StarCore.StarService_DispatchCall(this, var1, var2, true);
    }

    public void _MainDispatchCall(Object var1, StarObjectScriptProcInterface var2) {
        this.StarCore.StarService_DispatchCall(this, var1, var2, true);
    }
}
