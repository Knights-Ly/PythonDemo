//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.util.Iterator;

public class StarObjectClass implements Iterable {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarObjectClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
    }

    public StarObjectClass(StarObjectClass var1) {
        this.StarCore = var1.StarCore;
        this.StarCore._WrapObject(this, var1);
    }

    public StarObjectClass() {
    }

    protected void finalize() {
        this.StarCore._TermObject(this);
    }

    public Integer _GetInt(Object var1) {
        return this.StarCore.Common_GetInt(this, var1);
    }

    public Boolean _GetBool(Object var1) {
        return this.StarCore.Common_GetBool(this, var1);
    }

    public Double _GetDouble(Object var1) {
        return this.StarCore.Common_GetDouble(this, var1);
    }

    public int _Getint(Object var1) {
        return this.StarCore.Common_Getint(this, var1);
    }

    public boolean _Getbool(Object var1) {
        return this.StarCore.Common_Getbool(this, var1);
    }

    public double _Getdouble(Object var1) {
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

    public String _GetStr(Object var1) {
        return this.StarCore.Common_GetStr(this, var1);
    }

    public StarStructClass _GetStruct(Object var1) {
        return (StarStructClass)this.StarCore.Common_Get(this, var1);
    }

    public StarObjectClass _GetObject(Object var1) {
        return (StarObjectClass)this.StarCore.Common_Get(this, var1);
    }

    public StarServiceClass _GetService() {
        return (StarServiceClass)this.StarCore.Common_Get(this, "_Service");
    }

    public StarObjectClass _GetParent() {
        return (StarObjectClass)this.StarCore.Common_Get(this, "_Parent");
    }

    public StarObjectClass _GetClass() {
        return (StarObjectClass)this.StarCore.Common_Get(this, "_Class");
    }

    public StarObjectClass _GetSuper() {
        return (StarObjectClass)this.StarCore.Common_Get(this, "_Super");
    }

    public Object _Get(Object var1) {
        return this.StarCore.Common_Get(this, var1);
    }

    public void _Set(Object var1, Object var2) {
        this.StarCore.Common_Set(this, var1, var2);
    }

    public String toString() {
        return this.StarCore.Common_toString(this);
    }

    public void _RegOnNameValueChange(String var1) {
        this.StarCore.StarObject_RegOnNameValueChange(this, var1);
    }

    public void _RegOnNameValueChange_P(StarObjectOnNameValueChangeInterface var1) {
        this.StarCore.StarObject_RegOnNameValueChange_P(this, var1);
    }

    public void _RegOnChange(String var1) {
        this.StarCore.StarObject_RegOnChange(this, var1);
    }

    public void _RegOnChange_P(StarObjectOnChangeInterface var1) {
        this.StarCore.StarObject_RegOnChange_P(this, var1);
    }

    public void _V(String var1) {
        this.StarCore.StarObject_V(this, var1);
    }

    public void _F(String var1) {
        this.StarCore.StarObject_F(this, var1);
    }

    public void _E() {
        this.StarCore.StarObject_E(this);
    }

    public void _S(String var1) {
        this.StarCore.StarObject_S(this, var1);
    }

    public void _NV() {
        this.StarCore.StarObject_NV(this);
    }

    public StarObjectClass _GetChild(String var1) {
        return this.StarCore.StarObject_GetChild(this, var1);
    }

    public StarObjectClass _GetChildByID(String var1, int var2) {
        return this.StarCore.StarObject_GetChildByID(this, var1, var2);
    }

    public StarObjectClass _FirstInst(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_FirstInst(this, var1);
    }

    public StarObjectClass _NextInst(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_NextInst(this, var1);
    }

    public void _QueryClose(StarQueryRecordClass var1) {
        this.StarCore.StarObject_QueryClose(this, var1);
    }

    public Object[] _FirstActiveChild() {
        return this.StarCore.StarObject_FirstActiveChild(this);
    }

    public Object[] _NextActiveChild(long var1) {
        return this.StarCore.StarObject_NextActiveChild(this, var1);
    }

    public boolean _IsInActiveSet() {
        return this.StarCore.StarObject_IsInActiveSet(this);
    }

    public boolean _IsInst(StarObjectClass var1) {
        return this.StarCore.StarObject_IsInst(this, var1);
    }

    public boolean _IsDirectInst(StarObjectClass var1) {
        return this.StarCore.StarObject_IsDirectInst(this, var1);
    }

    public boolean _IsChild(StarObjectClass var1) {
        return this.StarCore.StarObject_IsChild(this, var1);
    }

    public boolean _IsThisClient() {
        return this.StarCore.StarObject_IsThisClient(this);
    }

    public void _SetPrivateValue(int var1, int var2, Object var3) {
        this.StarCore.StarObject_SetPrivateValue(this, var1, var2, var3);
    }

    public Object _GetPrivateValue(int var1, int var2) {
        return this.StarCore.StarObject_GetPrivateValue(this, var1, var2);
    }

    public void _InsertToSDT() {
        this.StarCore.StarObject_InsertToSDT(this);
    }

    public void _DelFromSDT() {
        this.StarCore.StarObject_DelFromSDT(this);
    }

    public StarObjectClass _QueryFirstInstFromSDT(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_QueryFirstInstFromSDT(this, var1);
    }

    public StarObjectClass _QueryNextInstFromSDT(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_QueryNextInstFromSDT(this, var1);
    }

    public void _ChangeParent(StarObjectClass var1, String var2) {
        this.StarCore.StarObject_ChangeParent(this, var1, var2);
    }

    public void _ChangeParentEx(StarObjectClass var1, String var2) {
        this.StarCore.StarObject_ChangeParentEx(this, var1, var2);
    }

    public boolean _ActiveCmd(int var1) {
        return this.StarCore.StarObject_ActiveCmd(this, var1);
    }

    public int _GetActiveCmd() {
        return this.StarCore.StarObject_GetActiveCmd(this);
    }

    public boolean _ActiveClient(int var1) {
        return this.StarCore.StarObject_ActiveClient(this, var1);
    }

    public void _DeactiveClient(int var1) {
        this.StarCore.StarObject_DeactiveClient(this, var1);
    }

    public boolean _Active() {
        return this.StarCore.StarObject_Active(this);
    }

    public void _Deactive() {
        this.StarCore.StarObject_Deactive(this);
    }

    public boolean _IsActive() {
        return this.StarCore.StarObject_IsActive(this);
    }

    public StarObjectClass _QueryFirstActiveInst(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_QueryFirstActiveInst(this, var1);
    }

    public StarObjectClass _QueryNextActiveInst(StarQueryRecordClass var1) {
        return this.StarCore.StarObject_QueryNextActiveInst(this, var1);
    }

    public long _RegEventFunction(StarObjectClass var1, String var2, String var3) {
        return this.StarCore.StarObject_RegEventFunction(this, var1, var2, var3);
    }

    public long _RegEventFunction_P(StarObjectClass var1, String var2, StarObjectEventProcInterface var3) {
        return this.StarCore.StarObject_RegEventFunction_P(this, var1, var2, var3);
    }

    public void _UnRegEventFunction(StarObjectClass var1, String var2, long var3) {
        this.StarCore.StarObject_UnRegEventFunction(this, var1, var2, var3);
    }

    public Object[] _ProcessEvent(String var1, Object... var2) {
        return this.StarCore.StarObject_ProcessEvent(this, var1, var2);
    }

    public void _PostProcessEvent(String var1, Object... var2) {
        this.StarCore.StarObject_PostProcessEvent(this, var1, var2);
    }

    public String _EventID(String var1) {
        return this.StarCore.StarObject_EventID(this, var1);
    }

    public int _SetTimer(int var1, String var2, int var3, int var4) {
        return this.StarCore.StarObject_SetTimer(this, var1, var2, var3, var4);
    }

    public int _SetTimer_P(int var1, int var2, int var3, StarObjectTimerInterface var4) {
        return this.StarCore.StarObject_SetTimer_P(this, var1, var2, var3, var4);
    }

    public void _KillTimer(int var1) {
        this.StarCore.StarObject_KillTimer(this, var1);
    }

    public StarObjectClass _New(Object... var1) {
        return this.StarCore.StarObject_New(this, var1);
    }

    public StarObjectClass _NewEx(Object... var1) {
        return this.StarCore.StarObject_NewEx(this, var1);
    }

    public StarObjectClass _NewGlobal(Object... var1) {
        return this.StarCore.StarObject_NewGlobal(this, var1);
    }

    public StarObjectClass _NewGlobalEx(Object... var1) {
        return this.StarCore.StarObject_NewGlobalEx(this, var1);
    }

    public StarObjectClass _NewClient(Object... var1) {
        return this.StarCore.StarObject_NewClient(this, var1);
    }

    public StarObjectClass _NewClientEx(Object... var1) {
        return this.StarCore.StarObject_NewClientEx(this, var1);
    }

    public void _Change(String var1, Object var2) {
        this.StarCore.StarObject_Change(this, var1, var2);
    }

    public void _MarkChange(String var1) {
        this.StarCore.StarObject_MarkChange(this, var1);
    }

    public boolean _WaitMalloc() {
        return this.StarCore.StarObject_WaitMalloc(this);
    }

    public void _Copy(StarObjectClass var1) {
        this.StarCore.StarObject_Copy(this, var1);
    }

    public void _Free() {
        this.StarCore.StarObject_Free(this);
    }

    public void _DeferFree() {
        this.StarCore.StarObject_DeferFree(this);
    }

    public boolean _IsInFree() {
        return this.StarCore.StarObject_IsInFree(this);
    }

    public long _RegFileCallBack(String var1) {
        return this.StarCore.StarObject_RegFileCallBack(this, var1);
    }

    public long _RegFileCallBack_P(StarObjectFileCallBackInterface var1) {
        return this.StarCore.StarObject_RegFileCallBack_P(this, var1);
    }

    public void _UnRegFileCallBack(long var1) {
        this.StarCore.StarObject_UnRegFileCallBack(this, var1);
    }

    public Object _Call(String var1, Object... var2) {
        return this.StarCore.StarObject_Call(this, var1, var2);
    }

    public Object _RawCall(Class var1, String var2, Object... var3) {
        return this.StarCore.StarObject_RawCall(this, var1, var2, var3);
    }

    public boolean _Callbool(String var1, Object... var2) {
        return this.StarCore.Common_Tobool(this, this.StarCore.StarObject_Call(this, var1, var2));
    }

    public int _Callint(String var1, Object... var2) {
        return this.StarCore.Common_Toint(this, this.StarCore.StarObject_Call(this, var1, var2));
    }

    public long _Calllong(String var1, Object... var2) {
        return this.StarCore.Common_Tolong(this, this.StarCore.StarObject_Call(this, var1, var2));
    }

    public double _Calldouble(String var1, Object... var2) {
        return this.StarCore.Common_Todouble(this, this.StarCore.StarObject_Call(this, var1, var2));
    }

    public StarObjectClass _Callobject(String var1, Object... var2) {
        return (StarObjectClass)this.StarCore.StarObject_Call(this, var1, var2);
    }

    public Object _SyncCall(String var1, Object... var2) {
        return this.StarCore.StarObject_SyncCall(this, var1, var2);
    }

    public Object _SyncRawCall(Class var1, String var2, Object... var3) {
        return this.StarCore.StarObject_SyncRawCall(this, var1, var2, var3);
    }

    public boolean _SyncCallbool(String var1, Object... var2) {
        return this.StarCore.Common_Tobool(this, this.StarCore.StarObject_SyncCall(this, var1, var2));
    }

    public int _SyncCallint(String var1, Object... var2) {
        return this.StarCore.Common_Toint(this, this.StarCore.StarObject_SyncCall(this, var1, var2));
    }

    public long _SyncCalllong(String var1, Object... var2) {
        return this.StarCore.Common_Tolong(this, this.StarCore.StarObject_SyncCall(this, var1, var2));
    }

    public double _SyncCalldouble(String var1, Object... var2) {
        return this.StarCore.Common_Todouble(this, this.StarCore.StarObject_SyncCall(this, var1, var2));
    }

    public StarObjectClass _SyncCallobject(String var1, Object... var2) {
        return (StarObjectClass)this.StarCore.StarObject_SyncCall(this, var1, var2);
    }

    public void _RemoteCall(int var1, String var2, Object... var3) {
        this.StarCore.StarObject_RemoteCall(this, var1, var2, var3);
    }

    public void _RemoteCallEx(int var1, String var2, Object... var3) {
        this.StarCore.StarObject_RemoteCallEx(this, var1, var2, var3);
    }

    public Object[] _SRemoteCall(int var1, int var2, String var3, Object... var4) {
        return this.StarCore.StarObject_SRemoteCall(this, var1, var2, var3, var4);
    }

    public void _ARemoteCall(int var1, int var2, String var3, String var4, int var5, Object... var6) {
        this.StarCore.StarObject_ARemoteCall(this, var1, var2, var3, var4, var5, var6);
    }

    public void _ARemoteCall_P(int var1, int var2, StarObjectARemoteCallInterface var3, String var4, int var5, Object... var6) {
        this.StarCore.StarObject_ARemoteCall_P(this, var1, var2, var3, var4, var5, var6);
    }

    public Object _GetRemoteAttach(String var1) {
        return this.StarCore.StarObject_GetRemoteAttach(this, var1);
    }

    public void _SetDeferRspFlag() {
        this.StarCore.StarObject_SetDeferRspFlag(this);
    }

    public void _SetRetCode(int var1) {
        this.StarCore.StarObject_SetRetCode(this, var1);
    }

    public void _SetRemoteRspAttach(Object... var1) {
        this.StarCore.StarObject_SetRemoteRspAttach(this, var1);
    }

    public void _RemoteCallRsp(int var1, int var2, String var3, int var4, int var5, Object[] var6, int var7, Object var8) {
        this.StarCore.StarObject_RemoteCallRsp(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public boolean _FillSoapRspHeader(StarSXmlClass var1) {
        return this.StarCore.StarObject_FillSoapRspHeader(this, var1);
    }

    public boolean _CreateFunc(String var1, String var2) {
        return this.StarCore.StarObject_CreateFunc(this, var1, var2);
    }

    public boolean _CreateFuncEx(String var1, String var2) {
        return this.StarCore.StarObject_CreateFuncEx(this, var1, var2);
    }

    public void _DelFunc(String var1) {
        this.StarCore.StarObject_DelFunc(this, var1);
    }

    public boolean _SaveToFile(String var1, String var2, int var3, boolean var4) {
        return this.StarCore.StarObject_SaveToFile(this, var1, var2, var3, var4);
    }

    public boolean _LoadFromFile(String var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6) {
        return this.StarCore.StarObject_LoadFromFile(this, var1, var2, var3, var4, var5, var6);
    }

    public boolean _LoadFromBuf(StarBinBufClass var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6) {
        return this.StarCore.StarObject_LoadFromBuf(this, var1, var2, var3, var4, var5, var6);
    }

    public void _DeferLoadFromFile(String var1, String var2, boolean var3, boolean var4, boolean var5, boolean var6) {
        this.StarCore.StarObject_DeferLoadFromFile(this, var1, var2, var3, var4, var5, var6);
    }

    public void _ResetLoad() {
        this.StarCore.StarObject_ResetLoad(this);
    }

    public boolean _SetNameInt(String var1, int var2, boolean var3) {
        return this.StarCore.StarObject_SetNameInt(this, var1, var2, var3);
    }

    public int _GetNameInt(String var1, int var2) {
        return this.StarCore.StarObject_GetNameInt(this, var1, var2);
    }

    public boolean _SetNameFloat(String var1, double var2, boolean var4) {
        return this.StarCore.StarObject_SetNameFloat(this, var1, var2, var4);
    }

    public double _GetNameFloat(String var1, double var2) {
        return this.StarCore.StarObject_GetNameFloat(this, var1, var2);
    }

    public boolean _SetNameStr(String var1, String var2, boolean var3) {
        return this.StarCore.StarObject_SetNameStr(this, var1, var2, var3);
    }

    public String _GetNameStr(String var1, String var2) {
        return this.StarCore.StarObject_GetNameStr(this, var1, var2);
    }

    public boolean _SetNameTime(String var1, StarTimeClass var2, boolean var3) {
        return this.StarCore.StarObject_SetNameTime(this, var1, var2, var3);
    }

    public StarTimeClass _GetNameTime(String var1, StarTimeClass var2) {
        return this.StarCore.StarObject_GetNameTime(this, var1, var2);
    }

    public void _FreeNameValue(String var1) {
        this.StarCore.StarObject_FreeNameValue(this, var1);
    }

    public int _GetNameValueType(String var1) {
        return this.StarCore.StarObject_GetNameValueType(this, var1);
    }

    public boolean _CanSetStaticData(int var1) {
        return this.StarCore.StarObject_CanSetStaticData(this, var1);
    }

    public String _SetStaticData(String var1, StarBinBufClass var2) {
        return this.StarCore.StarObject_SetStaticData(this, var1, var2);
    }

    public String _SetStaticDataEx(String var1, int var2, int var3, String var4) {
        return this.StarCore.StarObject_SetStaticDataEx(this, var1, var2, var3, var4);
    }

    public String _GetStaticData(String var1, StarBinBufClass var2, String var3, boolean var4) {
        return this.StarCore.StarObject_GetStaticData(this, var1, var2, var3, var4);
    }

    public boolean _WaitGetStaticData(String var1, String var2, boolean var3) {
        return this.StarCore.StarObject_WaitGetStaticData(this, var1, var2, var3);
    }

    public boolean _WaitGetStaticData_P(String var1, boolean var2, StarObjectGetStaticDataInterface var3) {
        return this.StarCore.StarObject_WaitGetStaticData_P(this, var1, var2, var3);
    }

    public boolean _WaitSetStaticData(String var1, String var2, boolean var3) {
        return this.StarCore.StarObject_WaitSetStaticData(this, var1, var2, var3);
    }

    public boolean _WaitSetStaticData_P(String var1, boolean var2, StarObjectSetStaticDataInterface var3) {
        return this.StarCore.StarObject_WaitSetStaticData_P(this, var1, var2, var3);
    }

    public boolean _SaveToLuaFunc(String var1, String var2) {
        return this.StarCore.StarObject_SaveToLuaFunc(this, var1, var2);
    }

    public void _Init(String var1) {
        this.StarCore.StarObject_Init(this, var1);
    }

    public boolean _RemoteSend(int var1, StarParaPkgClass var2) {
        return this.StarCore.StarObject_RemoteSend(this, var1, var2);
    }

    public void _LockGC() {
        this.StarCore.StarObject_LockGC(this);
    }

    public void _SLockGC() {
        this.StarCore.StarObject_SLockGC(this);
    }

    public void _UnLockGC() {
        this.StarCore.StarObject_UnLockGC(this);
    }

    public void _SUnLockGC() {
        this.StarCore.StarObject_SUnLockGC(this);
    }

    public StarObjectClass _Assign(StarObjectClass var1) {
        var1.StarCore = this.StarCore;
        this.StarCore._WrapObject(var1, this);
        return var1;
    }

    public int _GetSourceScript() {
        return this.StarCore.StarObject_GetSourceScript(this);
    }

    public StarObjectClass _DefinedClass(String var1) {
        return this.StarCore.StarObject_DefinedClass(this, var1);
    }

    public StarObjectClass _IsFunctionDefined(String var1, boolean var2) {
        return this.StarCore.StarObject_IsFunctionDefined(this, var1, var2);
    }

    public StarObjectClass _FromTuple(int var1, Object[] var2) {
        return this.StarCore.StarObject_FromTuple(this, var1, var2);
    }

    public Object[] _ToTuple(int var1, int var2) {
        return this.StarCore.StarObject_ToTuple(this, var1, var2);
    }

    public boolean _AttachRawContext(String var1, String var2, boolean var3, String var4) {
        return this.StarCore.StarObject_AttachRawContext(this, var1, var2, var3, var4);
    }

    public void _DetachRawContext(boolean var1) {
        this.StarCore.StarObject_DetachRawContext(this, var1);
    }

    public String _GetRawContextType() {
        return this.StarCore.StarObject_GetRawContextType(this);
    }

    public StarObjectClass _AttachRawObject(Object var1, boolean var2) {
        return this.StarCore.StarObject_AttachRawObject(this, var1, var2);
    }

    public StarObjectClass _AttachRawObjectEx(Object var1, boolean var2) {
        return this.StarCore.StarObject_AttachRawObjectEx(this, var1, var2);
    }

    public Object _GetRawObject() {
        return this.StarCore.StarObject_GetRawObject(this);
    }

    public boolean _HasRawContext() {
        return this.StarCore.StarObject_HasRawContext(this);
    }

    public StarObjectClass _AssignRawObject(StarObjectClass var1) {
        return this.StarCore.StarObject_AssignRawObject(this, var1);
    }

    public StarObjectClass _NewRawProxyEx(String var1, String var2, String var3) {
        return this.StarCore.StarObject_NewRawProxyEx(this, var1, var2, var3);
    }

    public StarParaPkgClass _GetInitPara() {
        return this.StarCore.StarObject_GetInitPara(this);
    }

    public boolean _Equals(StarObjectClass var1) {
        return this.StarCore.StarObject_Equals(this, var1);
    }

    public boolean _SetScriptRawType(int var1) {
        return this.StarCore.StarObject_SetScriptRawType(this, var1);
    }

    public int _GetScriptRawType() {
        return this.StarCore.StarObject_GetScriptRawType(this);
    }

    public int _GetRefEx() {
        return this.StarCore.StarObject_GetRefEx(this);
    }

    public String _GetRefInfo() {
        return this.StarCore.StarObject_GetRefInfo(this);
    }

    public boolean _IsValid() {
        return this.StarCore.StarObject_IsValid(this);
    }

    public int _GetLastError() {
        return this.StarCore.StarObject_GetLastError(this);
    }

    public String _GetLastErrorInfo() {
        return this.StarCore.StarObject_GetLastErrorInfo(this);
    }

    public void _RegSysEventProc(String var1, String var2) {
        this.StarCore.StarObject_RegSysEventProc(this, var1, var2);
    }

    public void _RegSysEventProc_P(String var1, StarObjectSysEventProcInterface var2) {
        this.StarCore.StarObject_RegSysEventProc_P(this, var1, var2);
    }

    public void _RegScriptProc_P(String var1, StarObjectScriptProcInterface var2) {
        this.StarCore.StarObject_RegScriptProc_P(this, var1, var2);
    }

    public Iterator _Iterator() {
        return this.StarCore.StarObject_Iterator(this);
    }

    public Iterator iterator() {
        Iterator var1 = this._Iterator();
        return (Iterator)(var1 != null ? var1 : new StarObjectDefaultIteratorClass());
    }

    public boolean _ReleaseOwnerEx() {
        return this.StarCore.StarObject_ReleaseOwnerEx(this);
    }

    public boolean _IsSLock() {
        return this.StarCore.StarObject_IsSLock(this);
    }

    public Object _R(Object var1) {
        return this.StarCore.StarObject_R(this, var1);
    }

    public void _Dispose() {
        this.StarCore.StarObject_Dispose(this);
    }

    public StarParaPkgClass _RawToParaPkg() {
        return this.StarCore.StarObject_RawToParaPkg(this);
    }

    public String _JSonCall(String var1) {
        return this.StarCore.StarObject_JSonCall(this, var1);
    }

    public int _InstNumber() {
        return this.StarCore.StarObject_InstNumber(this);
    }
}
