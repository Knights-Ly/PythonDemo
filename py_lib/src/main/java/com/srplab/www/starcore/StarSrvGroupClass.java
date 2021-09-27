//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarSrvGroupClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarSrvGroupClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
    }

    public StarSrvGroupClass(StarSrvGroupClass var1) {
        this.StarCore = var1.StarCore;
        this.StarCore._WrapObject(this, var1);
    }

    public StarSrvGroupClass() {
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

    public StarServiceClass _GetService(String var1, String var2) {
        return this.StarCore.SrvGroup_GetService(this, var1, var2);
    }

    public StarServiceClass _GetServiceEx(String var1, String var2, String var3) {
        return this.StarCore.SrvGroup_GetServiceEx(this, var1, var2, var3);
    }

    public void _MessageBox(String var1, String var2) {
        this.StarCore.SrvGroup_MessageBox(this, var1, var2);
    }

    public void _Print(String var1) {
        this.StarCore.SrvGroup_Print(this, var1);
    }

    public void _PrintError(int var1, String var2) {
        this.StarCore.SrvGroup_PrintError(this, var1, var2);
    }

    public int _ID() {
        return this.StarCore.SrvGroup_ID(this);
    }

    public boolean _IsServer() {
        return this.StarCore.SrvGroup_IsServer(this);
    }

    public boolean _IsClient() {
        return this.StarCore.SrvGroup_IsClient(this);
    }

    public boolean _IsDebug() {
        return this.StarCore.SrvGroup_IsDebug(this);
    }

    public boolean _IsServerClient() {
        return this.StarCore.SrvGroup_IsServerClient(this);
    }

    public boolean _IsObject(Object var1) {
        return this.StarCore.SrvGroup_IsObject(this, var1);
    }

    public boolean _IsParaPkg(Object var1) {
        return this.StarCore.SrvGroup_IsParaPkg(this, var1);
    }

    public boolean _IsQueryRecord(Object var1) {
        return this.StarCore.SrvGroup_IsQueryRecord(this, var1);
    }

    public boolean _IsBinBuf(Object var1) {
        return this.StarCore.SrvGroup_IsBinBuf(this, var1);
    }

    public boolean _IsSXml(Object var1) {
        return this.StarCore.SrvGroup_IsSXml(this, var1);
    }

    public boolean _IsFunctionPara(Object var1) {
        return this.StarCore.SrvGroup_IsFunctionPara(this, var1);
    }

    public boolean _IsCommInterface(Object var1) {
        return this.StarCore.SrvGroup_IsCommInterface(this, var1);
    }

    public long _TickCount() {
        return this.StarCore.SrvGroup_TickCount(this);
    }

    public long _TickCountUs() {
        return this.StarCore.SrvGroup_TickCountUs(this);
    }

    public String _MD5(String var1) {
        return this.StarCore.SrvGroup_MD5(this, var1);
    }

    public boolean _SetDataServerAddr(boolean var1, String var2, String var3, int var4, String var5, int var6) {
        return this.StarCore.SrvGroup_SetDataServerAddr(this, var1, var2, var3, var4, var5, var6);
    }

    public void _SetServerPara(int var1, int var2, int var3) {
        this.StarCore.SrvGroup_SetServerPara(this, var1, var2, var3);
    }

    public Object[] _QuyeryStatistic(int var1) {
        return this.StarCore.SrvGroup_QuyeryStatistic(this, var1);
    }

    public int _Hash(String var1) {
        return this.StarCore.SrvGroup_Hash(this, var1);
    }

    public String _GetModulePath() {
        return this.StarCore.SrvGroup_GetModulePath(this);
    }

    public String _GetServicePath() {
        return this.StarCore.SrvGroup_GetServicePath(this);
    }

    public void _SetServicePath(String var1) {
        this.StarCore.SrvGroup_SetServicePath(this, var1);
    }

    public boolean _ServicePathIsSet() {
        return this.StarCore.SrvGroup_ServicePathIsSet(this);
    }

    public String _GetCurrentPath() {
        return this.StarCore.SrvGroup_GetCurrentPath(this);
    }

    public void _SetCurrentPath(String var1) {
        this.StarCore.SrvGroup_SetCurrentPath(this, var1);
    }

    public String _GetSRPTempPath() {
        return this.StarCore.SrvGroup_GetSRPTempPath(this);
    }

    public String _GetSRPConfigPath() {
        return this.StarCore.SrvGroup_GetSRPConfigPath(this);
    }

    public boolean _IsInSync() {
        return this.StarCore.SrvGroup_IsInSync(this);
    }

    public boolean _IsServiceSync() {
        return this.StarCore.SrvGroup_IsServiceSync(this);
    }

    public boolean _WaitServiceSync(int var1) {
        return this.StarCore.SrvGroup_WaitServiceSync(this, var1);
    }

    public boolean _ImportServiceEx(String var1, boolean var2) {
        return this.StarCore.SrvGroup_ImportServiceEx(this, var1, var2);
    }

    public boolean _ImportServiceWithPath(String var1, String var2, boolean var3) {
        return this.StarCore.SrvGroup_ImportServiceWithPath(this, var1, var2, var3);
    }

    public boolean _ImportService(String var1, boolean var2) {
        return this.StarCore.SrvGroup_ImportService(this, var1, var2);
    }

    public String _ImportDynaService(String var1) {
        return this.StarCore.SrvGroup_ImportDynaService(this, var1);
    }

    public boolean _ImportServiceFromXmlBuf(String var1, boolean var2) {
        return this.StarCore.SrvGroup_ImportServiceFromXmlBuf(this, var1, var2);
    }

    public StarServiceClass _CreateService(String var1, String var2, String var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10) {
        return this.StarCore.SrvGroup_CreateService(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    public StarServiceClass _CreateServiceEx(String var1, String var2, String var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10) {
        return this.StarCore.SrvGroup_CreateServiceEx(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    public StarServiceClass _LoadServiceEx(String var1, String var2, String var3, boolean var4) {
        return this.StarCore.SrvGroup_LoadServiceEx(this, var1, var2, var3, var4);
    }

    public StarServiceClass _LoadServiceWithPath(String var1, String var2, String var3, String var4, boolean var5) {
        return this.StarCore.SrvGroup_LoadServiceWithPath(this, var1, var2, var3, var4, var5);
    }

    public StarServiceClass _LoadService(String var1, String var2, String var3, boolean var4) {
        return this.StarCore.SrvGroup_LoadService(this, var1, var2, var3, var4);
    }

    public void _ClearService() {
        this.StarCore.SrvGroup_ClearService(this);
    }

    public void _ClearServiceEx() {
        this.StarCore.SrvGroup_ClearServiceEx(this);
    }

    public void _ClearLuaGlobal() {
        this.StarCore.SrvGroup_ClearLuaGlobal(this);
    }

    public boolean _ExportServiceHeader(String var1, String var2) {
        return this.StarCore.SrvGroup_ExportServiceHeader(this, var1, var2);
    }

    public boolean _XmlToService(StarSXmlClass var1, String var2, String var3, String var4) {
        return this.StarCore.SrvGroup_XmlToService(this, var1, var2, var3, var4);
    }

    public boolean _XmlToService_P(StarSXmlClass var1, String var2, String var3, StarSrvGroupInfoInterface var4) {
        return this.StarCore.SrvGroup_XmlToService_P(this, var1, var2, var3, var4);
    }

    public boolean _XmlToServiceEx(String var1, String var2) {
        return this.StarCore.SrvGroup_XmlToServiceEx(this, var1, var2);
    }

    public boolean _XmlToServiceEx_P(String var1, StarSrvGroupInfoInterface var2) {
        return this.StarCore.SrvGroup_XmlToServiceEx_P(this, var1, var2);
    }

    public int _Connect(String var1, String var2, int var3, int var4, String var5, String var6, StarParaPkgClass var7, String var8) {
        return this.StarCore.SrvGroup_Connect(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public int _Connect_P(String var1, String var2, int var3, int var4, String var5, String var6, StarParaPkgClass var7, StarSrvGroupConnectInterface var8) {
        return this.StarCore.SrvGroup_Connect_P(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public int _ConnectEx(String var1, int var2, String var3, String var4, StarParaPkgClass var5, String var6) {
        return this.StarCore.SrvGroup_ConnectEx(this, var1, var2, var3, var4, var5, var6);
    }

    public int _ConnectEx_P(String var1, int var2, String var3, String var4, StarParaPkgClass var5, StarSrvGroupConnectInterface var6) {
        return this.StarCore.SrvGroup_ConnectEx_P(this, var1, var2, var3, var4, var5, var6);
    }

    public int _SConnect(String var1, String var2, int var3, String var4, String var5, StarParaPkgClass var6) {
        return this.StarCore.SrvGroup_SConnect(this, var1, var2, var3, var4, var5, var6);
    }

    public int _SConnectEx(String var1, String var2, String var3, StarParaPkgClass var4) {
        return this.StarCore.SrvGroup_SConnectEx(this, var1, var2, var3, var4);
    }

    public StarServiceClass _Connect2(String var1, String var2, int var3, String var4, String var5, String var6, StarParaPkgClass var7) {
        return this.StarCore.SrvGroup_Connect2(this, var1, var2, var3, var4, var5, var6, var7);
    }

    public StarServiceClass _Connect2Ex(String var1, String var2, String var3, String var4, StarParaPkgClass var5) {
        return this.StarCore.SrvGroup_Connect2Ex(this, var1, var2, var3, var4, var5);
    }

    public void _DisConnect() {
        this.StarCore.SrvGroup_DisConnect(this);
    }

    public boolean _IsConnect() {
        return this.StarCore.SrvGroup_IsConnect(this);
    }

    public void _HyperLink(String var1, boolean var2) {
        this.StarCore.SrvGroup_HyperLink(this, var1, var2);
    }

    public void _AppEvent(int var1, String var2) {
        this.StarCore.SrvGroup_AppEvent(this, var1, var2);
    }

    public StarQueryRecordClass _NewQueryRecord() {
        return this.StarCore.SrvGroup_NewQueryRecord(this);
    }

    public StarParaPkgClass _NewParaPkg(Object... var1) {
        return this.StarCore.SrvGroup_NewParaPkg(this, var1);
    }

    public StarBinBufClass _NewBinBuf() {
        return this.StarCore.SrvGroup_NewBinBuf(this);
    }

    public StarSXmlClass _NewSXml() {
        return this.StarCore.SrvGroup_NewSXml(this);
    }

    public StarFunctionParaClass _NewFunctionPara() {
        return this.StarCore.SrvGroup_NewFunctionPara(this);
    }

    public StarCommInterfaceClass _NewCommInterface() {
        return this.StarCore.SrvGroup_NewCommInterface(this);
    }

    public boolean _RunScript(String var1, String var2, String var3) {
        return this.StarCore.SrvGroup_RunScript(this, var1, var2, var3);
    }

    public boolean _RunScriptEx(String var1, StarBinBufClass var2, String var3) {
        return this.StarCore.SrvGroup_RunScriptEx(this, var1, var2, var3);
    }

    public boolean _DoFile(String var1, String var2) {
        return this.StarCore.SrvGroup_DoFile(this, var1, var2);
    }

    public boolean _DoFileEx(String var1, String var2, String var3) {
        return this.StarCore.SrvGroup_DoFileEx(this, var1, var2, var3);
    }

    public boolean _IsDefaultServer() {
        return this.StarCore.SrvGroup_IsDefaultServer(this);
    }

    public boolean _IsWindowVisible() {
        return this.StarCore.SrvGroup_IsWindowVisible(this);
    }

    public void _HideWindow() {
        this.StarCore.SrvGroup_HideWindow(this);
    }

    public void _ShowWindow() {
        this.StarCore.SrvGroup_ShowWindow(this);
    }

    public void _SetCaption(String var1) {
        this.StarCore.SrvGroup_SetCaption(this, var1);
    }

    public void _ExitVSSystem(String var1) {
        this.StarCore.SrvGroup_ExitVSSystem(this, var1);
    }

    public void _StartVSService(String var1) {
        this.StarCore.SrvGroup_StartVSService(this, var1);
    }

    public boolean _IsAppActive() {
        return this.StarCore.SrvGroup_IsAppActive(this);
    }

    public void _SetIdleActive(boolean var1) {
        this.StarCore.SrvGroup_SetIdleActive(this, var1);
    }

    public Object[] _GetVersion() {
        return this.StarCore.SrvGroup_GetVersion(this);
    }

    public String _GetVersionInfo() {
        return this.StarCore.SrvGroup_GetVersionInfo(this);
    }

    public void _SetColor(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.StarCore.SrvGroup_SetColor(this, var1, var2, var3, var4, var5, var6);
    }

    public void _SetBkColor(int var1) {
        this.StarCore.SrvGroup_SetBkColor(this, var1);
    }

    public void _SetClientBkColor(int var1) {
        this.StarCore.SrvGroup_SetClientBkColor(this, var1);
    }

    public void _ShowStatusMenu(boolean var1, boolean var2) {
        this.StarCore.SrvGroup_ShowStatusMenu(this, var1, var2);
    }

    public void _SetWindowStyle(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
        this.StarCore.SrvGroup_SetWindowStyle(this, var1, var2, var3, var4, var5);
    }

    public void _MoveWindow(int var1, int var2, int var3, int var4, boolean var5) {
        this.StarCore.SrvGroup_MoveWindow(this, var1, var2, var3, var4, var5);
    }

    public Object[] _GetWindowPos() {
        return this.StarCore.SrvGroup_GetWindowPos(this);
    }

    public void _SetWindowStatus(int var1) {
        this.StarCore.SrvGroup_SetWindowStatus(this, var1);
    }

    public void _ClearClientWnd() {
        this.StarCore.SrvGroup_ClearClientWnd(this);
    }

    public void _HideClientWnd() {
        this.StarCore.SrvGroup_HideClientWnd(this);
    }

    public void _ShowClientWnd() {
        this.StarCore.SrvGroup_ShowClientWnd(this);
    }

    public void _SetClientSize(int var1, int var2) {
        this.StarCore.SrvGroup_SetClientSize(this, var1, var2);
    }

    public Object[] _GetClientSize() {
        return this.StarCore.SrvGroup_GetClientSize(this);
    }

    public Object[] _MemorySize() {
        return this.StarCore.SrvGroup_MemorySize(this);
    }

    public int _SetupSocketServer(String var1, int var2, String var3) {
        return this.StarCore.SrvGroup_SetupSocketServer(this, var1, var2, var3);
    }

    public int _SetupSocketServer_P(String var1, int var2, StarSrvGroupAcceptFuncInterface var3) {
        return this.StarCore.SrvGroup_SetupSocketServer_P(this, var1, var2, var3);
    }

    public int _SetupSocketClient(String var1, String var2, int var3, String var4) {
        return this.StarCore.SrvGroup_SetupSocketClient(this, var1, var2, var3, var4);
    }

    public int _SetupSocketClient_P(String var1, String var2, int var3, StarSrvGroupClientFuncInterface var4) {
        return this.StarCore.SrvGroup_SetupSocketClient_P(this, var1, var2, var3, var4);
    }

    public void _CloseSocketConnect(int var1) {
        this.StarCore.SrvGroup_CloseSocketConnect(this, var1);
    }

    public boolean _SocketSend(int var1, StarParaPkgClass var2, boolean var3) {
        return this.StarCore.SrvGroup_SocketSend(this, var1, var2, var3);
    }

    public int _SetTimer(int var1, String var2, int var3, int var4) {
        return this.StarCore.SrvGroup_SetTimer(this, var1, var2, var3, var4);
    }

    public int _SetTimer_P(int var1, int var2, int var3, StarSrvGroupTimerInterface var4) {
        return this.StarCore.SrvGroup_SetTimer_P(this, var1, var2, var3, var4);
    }

    public void _KillTimer(int var1) {
        this.StarCore.SrvGroup_KillTimer(this, var1);
    }

    public void _ProgramRestart() {
        this.StarCore.SrvGroup_ProgramRestart(this);
    }

    public void _HttpDownLoad(String var1, String var2, String var3) {
        this.StarCore.SrvGroup_HttpDownLoad(this, var1, var2, var3);
    }

    public void _HttpDownLoadAbort() {
        this.StarCore.SrvGroup_HttpDownLoadAbort(this);
    }

    public void _RegWebDownFunction(String var1) {
        this.StarCore.SrvGroup_RegWebDownFunction(this, var1);
    }

    public void _RegWebDownFunction_P(StarSrvGroupWebDownInterface var1) {
        this.StarCore.SrvGroup_RegWebDownFunction_P(this, var1);
    }

    public void _SetEnvCurrentUrl(String var1) {
        this.StarCore.SrvGroup_SetEnvCurrentUrl(this, var1);
    }

    public void _SetEnvPara(StarParaPkgClass var1) {
        this.StarCore.SrvGroup_SetEnvPara(this, var1);
    }

    public boolean _OpenLuaEdit(String var1, int var2, boolean var3) {
        return this.StarCore.SrvGroup_OpenLuaEdit(this, var1, var2, var3);
    }

    public void _LuaEditDisp(String var1) {
        this.StarCore.SrvGroup_LuaEditDisp(this, var1);
    }

    public void _LuaEditHelp(int var1, String var2) {
        this.StarCore.SrvGroup_LuaEditHelp(this, var1, var2);
    }

    public void _CloseLuaEdit() {
        this.StarCore.SrvGroup_CloseLuaEdit(this);
    }

    public void _InsertSearchPath(String var1) {
        this.StarCore.SrvGroup_InsertSearchPath(this, var1);
    }

    public void _ClearSearchPath() {
        this.StarCore.SrvGroup_ClearSearchPath(this);
    }

    public String _FirstSearchPath(StarQueryRecordClass var1) {
        return this.StarCore.SrvGroup_FirstSearchPath(this, var1);
    }

    public String _NextSearchPath(StarQueryRecordClass var1) {
        return this.StarCore.SrvGroup_NextSearchPath(this, var1);
    }

    public Object[] _FirstDoc(StarQueryRecordClass var1) {
        return this.StarCore.SrvGroup_FirstDoc(this, var1);
    }

    public Object[] _NextDoc(StarQueryRecordClass var1) {
        return this.StarCore.SrvGroup_NextDoc(this, var1);
    }

    public void _RegisterDoc(Object var1, String var2) {
        this.StarCore.SrvGroup_RegisterDoc(this, var1, var2);
    }

    public void _UnRegisterDoc(Object var1) {
        this.StarCore.SrvGroup_UnRegisterDoc(this, var1);
    }

    public String _GetStaticVersion(Object var1) {
        return this.StarCore.SrvGroup_GetStaticVersion(this, var1);
    }

    public void _ToClipBoard(String var1) {
        this.StarCore.SrvGroup_ToClipBoard(this, var1);
    }

    public String _FromClipBoard() {
        return this.StarCore.SrvGroup_FromClipBoard(this);
    }

    public int _RunFromUrl(String var1, int var2, boolean var3) {
        return this.StarCore.SrvGroup_RunFromUrl(this, var1, var2, var3);
    }

    public boolean _SetClientPort(String var1, int var2) {
        return this.StarCore.SrvGroup_SetClientPort(this, var1, var2);
    }

    public boolean _SetDebugPort(String var1, int var2) {
        return this.StarCore.SrvGroup_SetDebugPort(this, var1, var2);
    }

    public boolean _SetTelnetPort(int var1) {
        return this.StarCore.SrvGroup_SetTelnetPort(this, var1);
    }

    public boolean _SetOutputPort(String var1, int var2) {
        return this.StarCore.SrvGroup_SetOutputPort(this, var1, var2);
    }

    public boolean _SetWebServerPort(String var1, int var2, int var3, int var4) {
        return this.StarCore.SrvGroup_SetWebServerPort(this, var1, var2, var3, var4);
    }

    public boolean _RegisterServer(String var1) {
        return this.StarCore.SrvGroup_RegisterServer(this, var1);
    }

    public void _AllocCooperator(String var1) {
        this.StarCore.SrvGroup_AllocCooperator(this, var1);
    }

    public void _FreeCooperator(String var1) {
        this.StarCore.SrvGroup_FreeCooperator(this, var1);
    }

    public Object[] _GetServerUrlInfo() {
        return this.StarCore.SrvGroup_GetServerUrlInfo(this);
    }

    public void _WebServiceRefresh() {
        this.StarCore.SrvGroup_WebServiceRefresh(this);
    }

    public boolean _GetWSDL(int var1, String var2, StarBinBufClass var3) {
        return this.StarCore.SrvGroup_GetWSDL(this, var1, var2, var3);
    }

    public String _GetConfigEnvTag() {
        return this.StarCore.SrvGroup_GetConfigEnvTag(this);
    }

    public Object[] _GetConfigResult() {
        return this.StarCore.SrvGroup_GetConfigResult(this);
    }

    public void _GetConfig(StarSXmlClass var1) {
        this.StarCore.SrvGroup_GetConfig(this, var1);
    }

    public String _GetConfigHost() {
        return this.StarCore.SrvGroup_GetConfigHost(this);
    }

    public long _RegFileReqCallBack(String var1) {
        return this.StarCore.SrvGroup_RegFileReqCallBack(this, var1);
    }

    public long _RegFileReqCallBack_P(StarSrvGroupFileReqInterface var1) {
        return this.StarCore.SrvGroup_RegFileReqCallBack_P(this, var1);
    }

    public void _UnRegFileReqCallBack(long var1) {
        this.StarCore.SrvGroup_UnRegFileReqCallBack(this, var1);
    }

    public void _RegDispatchCallBack(String var1) {
        this.StarCore.SrvGroup_RegDispatchCallBack(this, var1);
    }

    public void _RegDispatchCallBack_P(StarSrvGroupDispatchInterface var1) {
        this.StarCore.SrvGroup_RegDispatchCallBack_P(this, var1);
    }

    public boolean _LockLuaTable() {
        return this.StarCore.SrvGroup_LockLuaTable(this);
    }

    public boolean _UnLockLuaTable() {
        return this.StarCore.SrvGroup_UnLockLuaTable(this);
    }

    public StarSrvGroupClass _Assign(StarSrvGroupClass var1) {
        var1.StarCore = this.StarCore;
        this.StarCore._WrapObject(var1, this);
        return var1;
    }

    public boolean _InitRaw(String var1, StarServiceClass var2) {
        return this.StarCore.SrvGroup_InitRaw(this, var1, var2);
    }

    public boolean _LoadRawModule(String var1, String var2, String var3, boolean var4) {
        return this.StarCore.SrvGroup_LoadRawModule(this, var1, var2, var3, var4);
    }

    public boolean _LoadRawModuleEx(String var1, String var2, StarObjectClass var3) {
        return this.StarCore.SrvGroup_LoadRawModuleEx(this, var1, var2, var3);
    }

    public boolean _DefScriptRawType(String var1, String var2, String var3, boolean var4) {
        return this.StarCore.SrvGroup_DefScriptRawType(this, var1, var2, var3, var4);
    }

    public int _RegScriptRawType(String var1, String var2, int var3, String var4) {
        return this.StarCore.SrvGroup_RegScriptRawType(this, var1, var2, var3, var4);
    }

    public int _GetScriptRawType(String var1, String var2, String var3) {
        return this.StarCore.SrvGroup_GetScriptRawType(this, var1, var2, var3);
    }

    public String[] _GetScriptRawTypeEx(int var1) {
        return this.StarCore.SrvGroup_GetScriptRawTypeEx(this, var1);
    }

    public int _GetLastError() {
        return this.StarCore.SrvGroup_GetLastError(this);
    }

    public String _GetLastErrorInfo() {
        return this.StarCore.SrvGroup_GetLastErrorInfo(this);
    }

    public void _LogObjectFreeByUnLock(boolean var1) {
        this.StarCore.SrvGroup_LogObjectFreeByUnLock(this, var1);
    }

    public void _SUnLockGC() {
        this.StarCore.SrvGroup_SUnLockGC(this);
    }

    public String _GetCorePath() {
        return this.StarCore.SrvGroup_GetCorePath(this);
    }

    public String _GetUserPath() {
        return this.StarCore.SrvGroup_GetUserPath(this);
    }

    public String _GetLocalIP() {
        return this.StarCore.SrvGroup_GetLocalIP(this);
    }

    public String[] _GetLocalIPEx() {
        return this.StarCore.SrvGroup_GetLocalIPEx(this);
    }

    public int _GetObjectNum() {
        return this.StarCore.SrvGroup_GetObjectNum(this);
    }

    public boolean[] _ActiveScriptInterface(String var1) {
        return this.StarCore.SrvGroup_ActiveScriptInterface(this, var1);
    }

    public Object[] _PreCompile(String var1, String var2) {
        return this.StarCore.SrvGroup_PreCompile(this, var1, var2);
    }
}
