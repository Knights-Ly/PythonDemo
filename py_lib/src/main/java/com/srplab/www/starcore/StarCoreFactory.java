//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Iterator;

public class StarCoreFactory {
    private long m_Handle;
    private static StarCoreFactory m_Factory = null;
    public StarServiceClass _StarCurrentService;
    public StarObjectClass _StarCurrentObject;

    public native void _InitObject(Object var1, Object[] var2);

    public native void _WrapObject(Object var1, Object var2);

    public native void _TermObject(Object var1);

    public static boolean IsMethodDefinedInStarObjectExtends(Method var0) {
        Class var1 = var0.getDeclaringClass();
        if (!var1.equals(Object.class) && !var1.equals(StarObjectClass.class)) {
            var1 = null;
            return true;
        } else {
            var1 = null;
            return false;
        }
    }

    public static boolean IsFieldDefinedInStarObjectExtends(Field var0) {
        Class var1 = var0.getDeclaringClass();
        if (!var1.equals(Object.class) && !var1.equals(StarObjectClass.class)) {
            var1 = null;
            return true;
        } else {
            var1 = null;
            return false;
        }
    }

    public static int GetStarClassType(Class var0) {
        if (var0.equals(Boolean.TYPE)) {
            return 1;
        } else if (var0.equals(Integer.TYPE)) {
            return 2;
        } else if (var0.equals(Float.TYPE)) {
            return 3;
        } else if (var0.equals(Double.TYPE)) {
            return 4;
        } else if (var0.equals(String.class)) {
            return 5;
        } else if (var0.equals(Boolean.class)) {
            return 6;
        } else if (var0.equals(Integer.class)) {
            return 7;
        } else if (var0.equals(Float.class)) {
            return 8;
        } else if (var0.equals(Double.class)) {
            return 9;
        } else if (var0.equals(StarBinBufClass.class)) {
            return 10;
        } else if (var0.equals(StarCommInterfaceClass.class)) {
            return 11;
        } else if (var0.equals(StarCoreFactory.class)) {
            return 12;
        } else if (var0.equals(StarFontClass.class)) {
            return 13;
        } else if (var0.equals(StarFunctionParaClass.class)) {
            return 14;
        } else if (var0.equals(StarObjectClass.class)) {
            return 15;
        } else if (var0.equals(StarParaPkgClass.class)) {
            return 16;
        } else if (var0.equals(StarQueryRecordClass.class)) {
            return 17;
        } else if (var0.equals(StarRectClass.class)) {
            return 18;
        } else if (var0.equals(StarServiceClass.class)) {
            return 19;
        } else if (var0.equals(StarServiceItemClass.class)) {
            return 20;
        } else if (var0.equals(StarSrvGroupClass.class)) {
            return 21;
        } else if (var0.equals(StarStructClass.class)) {
            return 22;
        } else if (var0.equals(StarSXmlClass.class)) {
            return 23;
        } else if (var0.equals(StarTimeClass.class)) {
            return 24;
        } else if (var0.equals(Hashtable.class)) {
            return 26;
        } else if (var0.equals(Object.class)) {
            return 27;
        } else if (var0.equals(Void.TYPE)) {
            return 28;
        } else if (var0.equals(Long.TYPE)) {
            return 29;
        } else if (var0.equals(boolean[].class)) {
            return 65;
        } else if (var0.equals(int[].class)) {
            return 66;
        } else if (var0.equals(long[].class)) {
            return 67;
        } else if (var0.equals(float[].class)) {
            return 68;
        } else if (var0.equals(double[].class)) {
            return 69;
        } else if (var0.equals(String[].class)) {
            return 70;
        } else if (var0.equals(byte[].class)) {
            return 71;
        } else if (var0.equals(short[].class)) {
            return 72;
        } else if (var0.equals(char[].class)) {
            return 73;
        } else if (var0.equals(Byte.TYPE)) {
            return 74;
        } else if (var0.equals(Short.TYPE)) {
            return 75;
        } else if (var0.equals(Character.TYPE)) {
            return 76;
        } else {
            return var0.equals(Object[].class) ? 25 : 27;
        }
    }

    public static void StarCoreGC() {
        System.gc();
    }

    private StarCoreFactory() {
        if (StarCoreFactoryPath.StarCoreShareLibraryPath == null) {
            this._InitObject(this, (Object[])null);
        } else {
            this._InitObject(this, new String[]{StarCoreFactoryPath.StarCoreShareLibraryPath, StarCoreFactoryPath.StarCoreCoreLibraryPath, StarCoreFactoryPath.StarCoreOperationPath});
        }

    }

    public static StarCoreFactory GetFactory() {
        if (m_Factory != null) {
            return m_Factory;
        } else {
            m_Factory = new StarCoreFactory();
            return m_Factory;
        }
    }

    protected void finalize() {
        this._TermObject(this);
        m_Factory = null;
    }

    public native Integer _GetInt(String var1);

    public native Boolean _GetBool(String var1);

    public native Double _GetDouble(String var1);

    public native int _Getint(String var1);

    public native boolean _Getbool(String var1);

    public native double _Getdouble(String var1);

    public native int _Toint(Object var1);

    public native boolean _Tobool(Object var1);

    public native double _Todouble(Object var1);

    public native String _GetStr(String var1);

    public native Object _Get(String var1);

    public native void _Set(String var1, Object var2);

    public native int _InitCore(boolean var1, boolean var2, boolean var3, boolean var4, String var5, int var6, String var7, int var8);

    public native StarServiceClass _InitSimple(String var1, String var2, int var3, int var4, String... var5);

    public native StarServiceClass _InitSimple1(String var1, String var2, String var3, int var4, int var5, String... var6);

    public native StarSrvGroupClass _InitSimpleEx(int var1, int var2, String... var3);

    public native void _ModuleExit();

    public native void _ModuleClear();

    public native long _FindWindow(String var1);

    public native StarSrvGroupClass _CreateSrvGroup(int var1, int var2);

    public native void _DeleteSrvGroup(int var1);

    public native void _SrvGroupInfo();

    public native int _FirstSrvGroup();

    public native int _NextSrvGroup();

    public native StarSrvGroupClass _GetSrvGroup(Object var1);

    public native int _GetOsType();

    public native StarTimeClass _Time();

    public native String _GetRegStr(String var1, String var2, String var3);

    public native int _GetRegInt(String var1, String var2, int var3);

    public native int _shl32(int var1, int var2);

    public native int _shr32(int var1, int var2);

    public native int _and32(int var1, int var2);

    public native int _or32(int var1, int var2);

    public native int _xor32(int var1, int var2);

    public native Object[] _FindFirstFile(String var1);

    public native Object[] _FindNextFile(Object var1);

    public native void _FindClose(Object var1);

    public native int _htonl(int var1);

    public native short _htons(short var1);

    public native int _ntohl(int var1);

    public native short _ntohs(short var1);

    public native void _RegMsgCallBack(Object var1, String var2);

    public native void _RegMsgCallBack_P(StarMsgCallBackInterface var1);

    public native boolean _SRPDispatch(boolean var1);

    public native boolean _SRPIdle();

    public native boolean _MsgLoop(Object var1, Object var2);

    public native boolean _MsgLoop_P(StarMsgLoopInterface var1);

    public native boolean _WinMsgDispatch();

    public native int _KeyPress();

    public native void _SRPLock();

    public native void _SRPUnLock();

    public native void _ReleaseScriptGIL();

    public native void _CaptureScriptGIL();

    public native void _RegDispatchRequest_P(StarDispatchRequestCallBackInterface var1);

    public native void _RegServiceClearCallBack_P(StarServiceClearCallBackInterface var1);

    public native void _ShellExecute(long var1, String var3, String var4, String var5, String var6, int var7);

    public native boolean _GetKeyState(int var1);

    public native int _IntComp(int var1, int var2);

    public native int _UIntComp(int var1, int var2);

    public native String _UuidCreate();

    public native String _GetUrl();

    public native String _GetRootUrl();

    public native void _SetProgramType(int var1);

    public native int _GetProgramType();

    public native int _strchr(String var1, String var2);

    public native int _strrchr(String var1, String var2);

    public native String _IDToMD5(String var1);

    public native String _GetSysPath();

    public native void _SetLogFile(String var1, boolean var2);

    public native String _GetSystemRegCode();

    public native boolean _SetRegisterCode(String var1, boolean var2);

    public native boolean _IsRegistered();

    public native boolean _PreAuthorize(String var1, String var2, String var3, boolean var4);

    public native void _SetLocale(String var1);

    public native String _GetLocale();

    public native int[] _Version();

    public native int _GetScriptIndex(String var1);

    public native boolean _SetEnv(String var1, String var2);

    public native String _GetEnv(String var1);

    public native boolean _SetScript(String var1, String var2, String var3);

    public native void _DetachCurrentThread();

    public native String _SetCoreOperationPath(String var1);

    public native boolean _iconv(String var1, String var2, StarBinBufClass var3, StarBinBufClass var4);

    public native long _CoreHandle();

    public native void _InjectClass(String var1, Class var2);

    public native String _SetShareLibraryPath(String var1);

    public native Integer Common_GetInt(Object var1, Object var2);

    public native Boolean Common_GetBool(Object var1, Object var2);

    public native Double Common_GetDouble(Object var1, Object var2);

    public native int Common_Getint(Object var1, Object var2);

    public native boolean Common_Getbool(Object var1, Object var2);

    public native double Common_Getdouble(Object var1, Object var2);

    public native int Common_Toint(Object var1, Object var2);

    public native long Common_Tolong(Object var1, Object var2);

    public native boolean Common_Tobool(Object var1, Object var2);

    public native double Common_Todouble(Object var1, Object var2);

    public native String Common_GetStr(Object var1, Object var2);

    public native Object Common_Get(Object var1, Object var2);

    public native void Common_Set(Object var1, Object var2, Object var3);

    public native String Common_toString(Object var1);

    public native StarServiceClass SrvGroup_GetService(Object var1, String var2, String var3);

    public native StarServiceClass SrvGroup_GetServiceEx(Object var1, String var2, String var3, String var4);

    public native void SrvGroup_MessageBox(Object var1, String var2, String var3);

    public native void SrvGroup_Print(Object var1, String var2);

    public native void SrvGroup_PrintError(Object var1, int var2, String var3);

    public native int SrvGroup_ID(Object var1);

    public native boolean SrvGroup_IsServer(Object var1);

    public native boolean SrvGroup_IsClient(Object var1);

    public native boolean SrvGroup_IsDebug(Object var1);

    public native boolean SrvGroup_IsServerClient(Object var1);

    public native boolean SrvGroup_IsObject(Object var1, Object var2);

    public native boolean SrvGroup_IsParaPkg(Object var1, Object var2);

    public native boolean SrvGroup_IsQueryRecord(Object var1, Object var2);

    public native boolean SrvGroup_IsBinBuf(Object var1, Object var2);

    public native boolean SrvGroup_IsSXml(Object var1, Object var2);

    public native boolean SrvGroup_IsFunctionPara(Object var1, Object var2);

    public native boolean SrvGroup_IsCommInterface(Object var1, Object var2);

    public native long SrvGroup_TickCount(Object var1);

    public native long SrvGroup_TickCountUs(Object var1);

    public native String SrvGroup_MD5(Object var1, String var2);

    public native boolean SrvGroup_SetDataServerAddr(Object var1, boolean var2, String var3, String var4, int var5, String var6, int var7);

    public native void SrvGroup_SetServerPara(Object var1, int var2, int var3, int var4);

    public native Object[] SrvGroup_QuyeryStatistic(Object var1, int var2);

    public native int SrvGroup_Hash(Object var1, String var2);

    public native String SrvGroup_GetModulePath(Object var1);

    public native String SrvGroup_GetServicePath(Object var1);

    public native void SrvGroup_SetServicePath(Object var1, String var2);

    public native boolean SrvGroup_ServicePathIsSet(Object var1);

    public native String SrvGroup_GetCurrentPath(Object var1);

    public native void SrvGroup_SetCurrentPath(Object var1, String var2);

    public native String SrvGroup_GetSRPTempPath(Object var1);

    public native String SrvGroup_GetSRPConfigPath(Object var1);

    public native boolean SrvGroup_IsInSync(Object var1);

    public native boolean SrvGroup_IsServiceSync(Object var1);

    public native boolean SrvGroup_WaitServiceSync(Object var1, int var2);

    public native boolean SrvGroup_ImportServiceEx(Object var1, String var2, boolean var3);

    public native boolean SrvGroup_ImportServiceWithPath(Object var1, String var2, String var3, boolean var4);

    public native boolean SrvGroup_ImportService(Object var1, String var2, boolean var3);

    public native String SrvGroup_ImportDynaService(Object var1, String var2);

    public native boolean SrvGroup_ImportServiceFromXmlBuf(Object var1, String var2, boolean var3);

    public native StarServiceClass SrvGroup_CreateService(Object var1, String var2, String var3, String var4, int var5, int var6, int var7, int var8, int var9, int var10, String var11);

    public native StarServiceClass SrvGroup_CreateServiceEx(Object var1, String var2, String var3, String var4, int var5, int var6, int var7, int var8, int var9, int var10, String var11);

    public native StarServiceClass SrvGroup_LoadServiceEx(Object var1, String var2, String var3, String var4, boolean var5);

    public native StarServiceClass SrvGroup_LoadServiceWithPath(Object var1, String var2, String var3, String var4, String var5, boolean var6);

    public native StarServiceClass SrvGroup_LoadService(Object var1, String var2, String var3, String var4, boolean var5);

    public native void SrvGroup_ClearService(Object var1);

    public native void SrvGroup_ClearServiceEx(Object var1);

    public native void SrvGroup_ClearLuaGlobal(Object var1);

    public native boolean SrvGroup_ExportServiceHeader(Object var1, String var2, String var3);

    public native boolean SrvGroup_XmlToService(Object var1, StarSXmlClass var2, String var3, String var4, String var5);

    public native boolean SrvGroup_XmlToService_P(Object var1, StarSXmlClass var2, String var3, String var4, StarSrvGroupInfoInterface var5);

    public native boolean SrvGroup_XmlToServiceEx(Object var1, String var2, String var3);

    public native boolean SrvGroup_XmlToServiceEx_P(Object var1, String var2, StarSrvGroupInfoInterface var3);

    public native int SrvGroup_Connect(Object var1, String var2, String var3, int var4, int var5, String var6, String var7, StarParaPkgClass var8, String var9);

    public native int SrvGroup_Connect_P(Object var1, String var2, String var3, int var4, int var5, String var6, String var7, StarParaPkgClass var8, StarSrvGroupConnectInterface var9);

    public native int SrvGroup_ConnectEx(Object var1, String var2, int var3, String var4, String var5, StarParaPkgClass var6, String var7);

    public native int SrvGroup_ConnectEx_P(Object var1, String var2, int var3, String var4, String var5, StarParaPkgClass var6, StarSrvGroupConnectInterface var7);

    public native int SrvGroup_SConnect(Object var1, String var2, String var3, int var4, String var5, String var6, StarParaPkgClass var7);

    public native int SrvGroup_SConnectEx(Object var1, String var2, String var3, String var4, StarParaPkgClass var5);

    public native StarServiceClass SrvGroup_Connect2(Object var1, String var2, String var3, int var4, String var5, String var6, String var7, StarParaPkgClass var8);

    public native StarServiceClass SrvGroup_Connect2Ex(Object var1, String var2, String var3, String var4, String var5, StarParaPkgClass var6);

    public native void SrvGroup_DisConnect(Object var1);

    public native boolean SrvGroup_IsConnect(Object var1);

    public native void SrvGroup_HyperLink(Object var1, String var2, boolean var3);

    public native void SrvGroup_AppEvent(Object var1, int var2, String var3);

    public native StarQueryRecordClass SrvGroup_NewQueryRecord(Object var1);

    public native StarParaPkgClass SrvGroup_NewParaPkg(Object var1, Object... var2);

    public native StarBinBufClass SrvGroup_NewBinBuf(Object var1);

    public native StarSXmlClass SrvGroup_NewSXml(Object var1);

    public native StarFunctionParaClass SrvGroup_NewFunctionPara(Object var1);

    public native StarCommInterfaceClass SrvGroup_NewCommInterface(Object var1);

    public native boolean SrvGroup_RunScript(Object var1, String var2, String var3, String var4);

    public native boolean SrvGroup_RunScriptEx(Object var1, String var2, StarBinBufClass var3, String var4);

    public native boolean SrvGroup_DoFile(Object var1, String var2, String var3);

    public native boolean SrvGroup_DoFileEx(Object var1, String var2, String var3, String var4);

    public native boolean SrvGroup_IsDefaultServer(Object var1);

    public native boolean SrvGroup_IsWindowVisible(Object var1);

    public native void SrvGroup_HideWindow(Object var1);

    public native void SrvGroup_ShowWindow(Object var1);

    public native void SrvGroup_SetCaption(Object var1, String var2);

    public native void SrvGroup_ExitVSSystem(Object var1, String var2);

    public native void SrvGroup_StartVSService(Object var1, String var2);

    public native boolean SrvGroup_IsAppActive(Object var1);

    public native void SrvGroup_SetIdleActive(Object var1, boolean var2);

    public native Object[] SrvGroup_GetVersion(Object var1);

    public native String SrvGroup_GetVersionInfo(Object var1);

    public native void SrvGroup_SetColor(Object var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public native void SrvGroup_SetBkColor(Object var1, int var2);

    public native void SrvGroup_SetClientBkColor(Object var1, int var2);

    public native void SrvGroup_ShowStatusMenu(Object var1, boolean var2, boolean var3);

    public native void SrvGroup_SetWindowStyle(Object var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6);

    public native void SrvGroup_MoveWindow(Object var1, int var2, int var3, int var4, int var5, boolean var6);

    public native Object[] SrvGroup_GetWindowPos(Object var1);

    public native void SrvGroup_SetWindowStatus(Object var1, int var2);

    public native void SrvGroup_ClearClientWnd(Object var1);

    public native void SrvGroup_HideClientWnd(Object var1);

    public native void SrvGroup_ShowClientWnd(Object var1);

    public native void SrvGroup_SetClientSize(Object var1, int var2, int var3);

    public native Object[] SrvGroup_GetClientSize(Object var1);

    public native Object[] SrvGroup_MemorySize(Object var1);

    public native int SrvGroup_SetupSocketServer(Object var1, String var2, int var3, String var4);

    public native int SrvGroup_SetupSocketServer_P(Object var1, String var2, int var3, StarSrvGroupAcceptFuncInterface var4);

    public native int SrvGroup_SetupSocketClient(Object var1, String var2, String var3, int var4, String var5);

    public native int SrvGroup_SetupSocketClient_P(Object var1, String var2, String var3, int var4, StarSrvGroupClientFuncInterface var5);

    public native void SrvGroup_CloseSocketConnect(Object var1, int var2);

    public native boolean SrvGroup_SocketSend(Object var1, int var2, StarParaPkgClass var3, boolean var4);

    public native int SrvGroup_SetTimer(Object var1, int var2, String var3, int var4, int var5);

    public native int SrvGroup_SetTimer_P(Object var1, int var2, int var3, int var4, StarSrvGroupTimerInterface var5);

    public native void SrvGroup_KillTimer(Object var1, int var2);

    public native void SrvGroup_ProgramRestart(Object var1);

    public native void SrvGroup_HttpDownLoad(Object var1, String var2, String var3, String var4);

    public native void SrvGroup_HttpDownLoadAbort(Object var1);

    public native void SrvGroup_RegWebDownFunction(Object var1, String var2);

    public native void SrvGroup_RegWebDownFunction_P(Object var1, StarSrvGroupWebDownInterface var2);

    public native void SrvGroup_SetEnvCurrentUrl(Object var1, String var2);

    public native void SrvGroup_SetEnvPara(Object var1, StarParaPkgClass var2);

    public native boolean SrvGroup_OpenLuaEdit(Object var1, String var2, int var3, boolean var4);

    public native void SrvGroup_LuaEditDisp(Object var1, String var2);

    public native void SrvGroup_LuaEditHelp(Object var1, int var2, String var3);

    public native void SrvGroup_CloseLuaEdit(Object var1);

    public native void SrvGroup_InsertSearchPath(Object var1, String var2);

    public native void SrvGroup_ClearSearchPath(Object var1);

    public native String SrvGroup_FirstSearchPath(Object var1, StarQueryRecordClass var2);

    public native String SrvGroup_NextSearchPath(Object var1, StarQueryRecordClass var2);

    public native Object[] SrvGroup_FirstDoc(Object var1, StarQueryRecordClass var2);

    public native Object[] SrvGroup_NextDoc(Object var1, StarQueryRecordClass var2);

    public native void SrvGroup_RegisterDoc(Object var1, Object var2, String var3);

    public native void SrvGroup_UnRegisterDoc(Object var1, Object var2);

    public native String SrvGroup_GetStaticVersion(Object var1, Object var2);

    public native void SrvGroup_ToClipBoard(Object var1, String var2);

    public native String SrvGroup_FromClipBoard(Object var1);

    public native int SrvGroup_RunFromUrl(Object var1, String var2, int var3, boolean var4);

    public native boolean SrvGroup_SetClientPort(Object var1, String var2, int var3);

    public native boolean SrvGroup_SetDebugPort(Object var1, String var2, int var3);

    public native boolean SrvGroup_SetTelnetPort(Object var1, int var2);

    public native boolean SrvGroup_SetOutputPort(Object var1, String var2, int var3);

    public native boolean SrvGroup_SetWebServerPort(Object var1, String var2, int var3, int var4, int var5);

    public native boolean SrvGroup_RegisterServer(Object var1, String var2);

    public native void SrvGroup_AllocCooperator(Object var1, String var2);

    public native void SrvGroup_FreeCooperator(Object var1, String var2);

    public native Object[] SrvGroup_GetServerUrlInfo(Object var1);

    public native void SrvGroup_WebServiceRefresh(Object var1);

    public native boolean SrvGroup_GetWSDL(Object var1, int var2, String var3, StarBinBufClass var4);

    public native String SrvGroup_GetConfigEnvTag(Object var1);

    public native Object[] SrvGroup_GetConfigResult(Object var1);

    public native void SrvGroup_GetConfig(Object var1, StarSXmlClass var2);

    public native String SrvGroup_GetConfigHost(Object var1);

    public native long SrvGroup_RegFileReqCallBack(Object var1, String var2);

    public native long SrvGroup_RegFileReqCallBack_P(Object var1, StarSrvGroupFileReqInterface var2);

    public native void SrvGroup_UnRegFileReqCallBack(Object var1, long var2);

    public native void SrvGroup_RegDispatchCallBack(Object var1, String var2);

    public native void SrvGroup_RegDispatchCallBack_P(Object var1, StarSrvGroupDispatchInterface var2);

    public native boolean SrvGroup_LockLuaTable(Object var1);

    public native boolean SrvGroup_UnLockLuaTable(Object var1);

    public native boolean SrvGroup_InitRaw(Object var1, String var2, StarServiceClass var3);

    public native boolean SrvGroup_LoadRawModule(Object var1, String var2, String var3, String var4, boolean var5);

    public native boolean SrvGroup_LoadRawModuleEx(Object var1, String var2, String var3, StarObjectClass var4);

    public native boolean SrvGroup_DefScriptRawType(Object var1, String var2, String var3, String var4, boolean var5);

    public native int SrvGroup_RegScriptRawType(Object var1, String var2, String var3, int var4, String var5);

    public native int SrvGroup_GetScriptRawType(Object var1, String var2, String var3, String var4);

    public native String[] SrvGroup_GetScriptRawTypeEx(Object var1, int var2);

    public native int SrvGroup_GetLastError(Object var1);

    public native String SrvGroup_GetLastErrorInfo(Object var1);

    public native void SrvGroup_LogObjectFreeByUnLock(Object var1, boolean var2);

    public native void SrvGroup_SUnLockGC(Object var1);

    public native String SrvGroup_GetCorePath(Object var1);

    public native String SrvGroup_GetUserPath(Object var1);

    public native String SrvGroup_GetLocalIP(Object var1);

    public native String[] SrvGroup_GetLocalIPEx(Object var1);

    public native int SrvGroup_GetObjectNum(Object var1);

    public native boolean[] SrvGroup_ActiveScriptInterface(Object var1, String var2);

    public native Object[] SrvGroup_PreCompile(Object var1, String var2, String var3);

    public native void StarService_DeactiveAll(Object var1);

    public native StarObjectClass StarService_GetObject(Object var1, String var2);

    public native StarObjectClass StarService_GetObjectEx(Object var1, String var2);

    public native StarObjectClass StarService_GetObjectEx2(Object var1, String var2, String var3);

    public native void StarService_GetObjectEx3(Object var1, String var2, StarParaPkgClass var3);

    public native StarObjectClass StarService_GetStarSpace(Object var1, String var2);

    public native StarServiceItemClass StarService_GetSysRootItem(Object var1, String var2);

    public native void StarService_Exit(Object var1);

    public native void StarService_Save(Object var1, String var2);

    public native boolean StarService_IsChange(Object var1);

    public native boolean StarService_IsActive(Object var1);

    public native StarObjectClass StarService_QueryFirstFromSDT(Object var1);

    public native StarObjectClass StarService_QueryNextFromSDT(Object var1);

    public native void StarService_PrintInfo(Object var1);

    public native boolean StarService_CreateSysRootItem(Object var1, String var2, String var3, String var4, String var5);

    public native StarServiceItemClass StarService_CreateSysRootItemEx(Object var1, String var2, String var3, String var4, String var5);

    public native void StarService_ActiveSysRootItem(Object var1, String var2);

    public native void StarService_ActiveAllSysRootItem(Object var1);

    public native void StarService_DeactiveSysRootItem(Object var1, String var2);

    public native void StarService_ActiveCSysRootItem(Object var1, int var2, String var3);

    public native void StarService_DeactiveCSysRootItem(Object var1, int var2, String var3);

    public native String StarService_QueryFirstSysRootItem(Object var1);

    public native String StarService_QueryNextSysRootItem(Object var1);

    public native Object[] StarService_QueryFirstDepend(Object var1);

    public native Object[] StarService_QueryNextDepend(Object var1);

    public native boolean StarService_IsOsSupport(Object var1, int var2, int var3);

    public native boolean StarService_SetClientObject(Object var1, int var2, StarObjectClass var3);

    public native StarObjectClass StarService_GetClientObject(Object var1);

    public native void StarService_SetPrivateTag(Object var1, int var2);

    public native void StarService_RegMachineFunction(Object var1, String var2);

    public native void StarService_RegMachineFunction_P(Object var1, StarServiceMachineInterface var2);

    public native int StarService_GetOPPermission(Object var1);

    public native boolean StarService_AcceptClient(Object var1, int var2, boolean var3, boolean var4, String var5, String var6, int var7, int var8, int var9);

    public native Object[] StarService_GetClientInfo(Object var1, int var2);

    public native int StarService_GetClientNumber(Object var1);

    public native void StarService_PrintClientInfo(Object var1);

    public native void StarService_DelClient(Object var1, int var2);

    public native void StarService_RegClientOpFunction(Object var1, String var2);

    public native void StarService_RegClientOpFunction_P(Object var1, StarServiceClientOpInterface var2);

    public native void StarService_Redirect(Object var1, int var2, String var3, String var4, int var5, StarParaPkgClass var6, String var7);

    public native void StarService_Redirect_P(Object var1, int var2, String var3, String var4, int var5, StarParaPkgClass var6, StarServiceRedirectInterface var7);

    public native void StarService_DownLoad(Object var1, String var2, String var3, String var4);

    public native void StarService_HttpDownLoad(Object var1, String var2, String var3, String var4);

    public native void StarService_HttpDownLoadAbort(Object var1);

    public native void StarService_UpLoad(Object var1, String var2, String var3, String var4);

    public native long StarService_RegFileCallBack(Object var1, String var2);

    public native long StarService_RegFileCallBack_P(Object var1, StarServiceFileCallBackInterface var2);

    public native void StarService_UnRegFileCallBack(Object var1, long var2);

    public native StarObjectClass StarService_New(Object var1, Object... var2);

    public native StarObjectClass StarService_NewEx(Object var1, Object... var2);

    public native StarObjectClass StarService_NewGlobal(Object var1, Object... var2);

    public native StarObjectClass StarService_NewGlobalEx(Object var1, Object... var2);

    public native StarObjectClass StarService_NewClient(Object var1, Object... var2);

    public native StarObjectClass StarService_NewClientEx(Object var1, Object... var2);

    public native void StarService_PrintMacro(Object var1, String var2);

    public native boolean StarService_CreateUser(Object var1, String var2, String var3, int var4);

    public native void StarService_DeleteUser(Object var1, String var2);

    public native Object[] StarService_FirstUser(Object var1, StarQueryRecordClass var2);

    public native Object[] StarService_NextUser(Object var1, StarQueryRecordClass var2);

    public native Object[] StarService_RunScript(Object var1, String var2, String var3, String var4, String var5);

    public native Object[] StarService_RunScriptEx(Object var1, String var2, StarBinBufClass var3, String var4, String var5);

    public native Object[] StarService_DoFile(Object var1, String var2, String var3, String var4);

    public native Object[] StarService_DoFileEx(Object var1, String var2, String var3, String var4, String var5);

    public native String StarService_GetPeerIP(Object var1, int var2);

    public native int StarService_GetServerID(Object var1);

    public native void StarService_ForceToSaveStatic(Object var1);

    public native void StarService_ClearStatic(Object var1, int var2);

    public native void StarService_RegServerWebDownFunction(Object var1, String var2);

    public native void StarService_RegServerWebDownFunction_P(Object var1, StarServiceWebDownInterface var2);

    public native StarObjectClass StarService_GetObjectFromLua(Object var1, String var2);

    public native void StarService_PackStaticData(Object var1);

    public native boolean StarService_XmlToSysRootItem(Object var1, StarSXmlClass var2, String var3, String var4, String var5);

    public native boolean StarService_XmlToSysRootItem_P(Object var1, StarSXmlClass var2, String var3, String var4, StarServiceInfoInterface var5);

    public native boolean StarService_XmlToObject(Object var1, StarSXmlClass var2, Object var3, String var4, String var5, String var6, String var7);

    public native boolean StarService_XmlToObject_P(Object var1, StarSXmlClass var2, Object var3, String var4, String var5, String var6, StarServiceInfoInterface var7);

    public native boolean StarService_ServiceToXml(Object var1, StarSXmlClass var2, String var3, String var4, boolean var5, boolean var6, String var7);

    public native boolean StarService_ServiceToXml_P(Object var1, StarSXmlClass var2, String var3, String var4, boolean var5, boolean var6, StarServiceInfoInterface var7);

    public native boolean StarService_SysRootItemToXml(Object var1, StarSXmlClass var2, String var3, String var4, boolean var5, boolean var6, String var7);

    public native boolean StarService_SysRootItemToXml_P(Object var1, StarSXmlClass var2, String var3, String var4, boolean var5, boolean var6, StarServiceInfoInterface var7);

    public native boolean StarService_ObjectToXml(Object var1, StarSXmlClass var2, Object var3, String var4, boolean var5, boolean var6, String var7);

    public native boolean StarService_ObjectToXml_P(Object var1, StarSXmlClass var2, Object var3, String var4, boolean var5, boolean var6, StarServiceInfoInterface var7);

    public native long StarService_CreateAtomicDepend(Object var1, String var2);

    public native long StarService_CreateAtomicMacro(Object var1, String var2, int var3);

    public native long StarService_CreateAtomicMacroItem(Object var1, long var2, String var4, String var5);

    public native long StarService_CreateAtomicModule(Object var1, String var2, int var3, String var4);

    public native long StarService_CreateAtomicEditModule(Object var1, String var2, String var3);

    public native long StarService_CreateAtomicStruct(Object var1, String var2, String var3, String var4);

    public native long StarService_CreateAtomicSysRootItem(Object var1, String var2, String var3);

    public native long StarService_CreateAtomicObject(Object var1, long var2, String var4, long var5, String var7, String var8);

    public native long StarService_CreateAtomicAttachAttribute(Object var1, long var2, String var4, String var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, String var14, String var15);

    public native long StarService_CreateAtomicAttribute(Object var1, long var2, String var4, String var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, String var14, String var15);

    public native long StarService_CreateAtomicFuncRetAttribute(Object var1, long var2, int var4, String var5);

    public native long StarService_CreateAtomicFuncParaAttribute(Object var1, long var2, String var4, String var5, int var6, String var7);

    public native long StarService_CreateAtomicStructAttribute(Object var1, long var2, String var4, String var5, int var6, String var7);

    public native boolean StarService_SetAtomicAttributeLength(Object var1, long var2, int var4);

    public native boolean StarService_SetAtomicAttributeStruct(Object var1, long var2, long var4);

    public native boolean StarService_SetAtomicAttributeCombobox(Object var1, long var2, String var4);

    public native boolean StarService_SetAtomicAttributeSyncFlag(Object var1, long var2, int var4);

    public native boolean StarService_SetAtomicObjectSyncGroup(Object var1, long var2, int var4);

    public native boolean StarService_SetAtomicObjectAttribute(Object var1, long var2, boolean var4, int var5, int var6, int var7);

    public native long StarService_CreateAtomicScript(Object var1, long var2, String var4, String var5, String var6, String var7);

    public native long StarService_CreateAtomicFunction(Object var1, long var2, String var4, String var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10);

    public native Object[] StarService_CreateAtomicFunctionEx(Object var1, long var2, String var4, String var5, String var6, boolean var7, boolean var8, String var9, boolean var10, boolean var11);

    public native long StarService_CreateAtomicLuaFunction(Object var1, long var2, String var4, String var5, String var6);

    public native long StarService_CreateAtomicOvlFunction(Object var1, long var2, String var4, String var5, String var6, String var7, boolean var8);

    public native long StarService_CreateAtomicInEvent(Object var1, long var2, String var4, String var5, String var6);

    public native long StarService_CreateAtomicOutEvent(Object var1, long var2, String var4, String var5, String var6, boolean var7);

    public native long StarService_GetAtomicSysRootItem(Object var1, String var2);

    public native long StarService_GetAtomicObjectEx(Object var1, long var2, String var4);

    public native String StarService_GetAtomicID(Object var1, long var2);

    public native long StarService_ObjectToAtomic(Object var1, StarObjectClass var2);

    public native StarObjectClass StarService_AtomicToObject(Object var1, long var2);

    public native Object[] StarService_CreateAtomicObjectSimple(Object var1, String var2, String var3, String var4, String var5);

    public native Object[] StarService_CreateAtomicStructSimple(Object var1, String var2, String var3, String var4);

    public native Object[] StarService_CreateAtomicObjectAttributeSimple(Object var1, long var2, String var4);

    public native Object[] StarService_CreateAtomicFunctionSimple(Object var1, long var2, String var4, String var5, String var6, boolean var7, boolean var8);

    public native boolean StarService_AtomicAttach(Object var1, long var2, String var4);

    public native Object[] StarService_ExportModule(Object var1, String var2);

    public native void StarService_SetLog(Object var1, Object var2, boolean var3);

    public native void StarService_SetLogFile(Object var1, String var2);

    public native String StarService_GetLogFile(Object var1);

    public native void StarService_ClearLog(Object var1);

    public native boolean StarService_ApplyLog(Object var1);

    public native boolean StarService_IsServiceRegistered(Object var1);

    public native void StarService_CheckPassword(Object var1, boolean var2);

    public native String StarService_FirstShareLib(Object var1);

    public native String StarService_NextShareLib(Object var1);

    public native long StarService_GetShareLib(Object var1, String var2);

    public native void StarService_FreeShareLib(Object var1, long var2);

    public native int StarService_NewGroup(Object var1);

    public native void StarService_FreeGroup(Object var1, int var2);

    public native int StarService_GroupAdd(Object var1, int var2, StarObjectClass var3);

    public native StarObjectClass StarService_GroupGet(Object var1, int var2, int var3);

    public native void StarService_GroupRemove(Object var1, int var2, int var3);

    public native void StarService_GroupRemoveEx(Object var1, int var2, StarObjectClass var3);

    public native void StarService_GroupClear(Object var1, int var2, boolean var3);

    public native StarServiceClass StarService_GetControlService(Object var1);

    public native boolean StarService_LoadRawModule(Object var1, String var2, String var3, String var4, boolean var5);

    public native boolean StarService_LoadRawModuleEx(Object var1, String var2, String var3, StarObjectClass var4);

    public native Object StarService_NewScriptRawType(Object var1, int var2);

    public native StarObjectClass StarService_NewRawProxy(Object var1, String var2, Object var3, String var4, String var5, int var6);

    public native String StarService_CreateRawProxyCode(Object var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8);

    public native StarObjectClass StarService_ImportRawContext(Object var1, String var2, String var3, boolean var4, String var5);

    public native StarObjectClass StarService_ImportRawObject(Object var1, Object var2, boolean var3);

    public native int StarService_GetLastError(Object var1);

    public native String StarService_GetLastErrorInfo(Object var1);

    public native Object[] StarService_RestfulCall(Object var1, String var2, String var3, String var4);

    public native StarParaPkgClass StarService_AllObject(Object var1);

    public native void StarService_DispatchCall(Object var1, Object var2, StarObjectClass var3, boolean var4);

    public native void StarService_DispatchCall(Object var1, Object var2, StarObjectScriptProcInterface var3, boolean var4);

    public native void StarServiceItem_RegClientToSync(Object var1, String var2);

    public native void StarServiceItem_RegClientToSync_P(Object var1, StarServiceItemClientToSyncInterface var2);

    public native boolean StarServiceItem_IsSync(Object var1);

    public native boolean StarServiceItem_WaitSync(Object var1);

    public native int StarServiceItem_GetGroupSyncStatus(Object var1, int var2);

    public native Object[] StarServiceItem_GetActiveSet(Object var1);

    public native void StarServiceItem_SetActiveSet(Object var1, Object... var2);

    public native void StarServiceItem_SetClientActiveSet(Object var1, int var2, Object... var3);

    public native StarObjectClass StarServiceItem_QueryFirstGroupObject(Object var1, int var2);

    public native StarObjectClass StarServiceItem_QueryNextGroupObject(Object var1);

    public native boolean StarParaPkg_InsertEmpty(Object var1, int var2);

    public native int StarParaPkg_T(Object var1, int var2);

    public native StarParaPkgClass StarParaPkg_Clear(Object var1);

    public native boolean StarParaPkg_Exchange(Object var1, int var2, int var3);

    public native void StarParaPkg_Del(Object var1, int var2);

    public native boolean StarParaPkg_AppendFrom(Object var1, StarParaPkgClass var2);

    public native String StarParaPkg_GetUUID(Object var1, int var2);

    public native int StarParaPkg_GetHash(Object var1, int var2);

    public native boolean StarParaPkg_SaveToFile(Object var1, int var2, String var3);

    public native boolean StarParaPkg_LoadFromFile(Object var1, int var2, String var3);

    public native boolean StarParaPkg_CopyBin(Object var1, int var2, StarParaPkgClass var3, int var4);

    public native Object StarParaPkg_Get(Object var1, int var2);

    public native StarParaPkgClass StarParaPkg_Set(Object var1, int var2, Object var3);

    public native StarTimeClass StarParaPkg_GetTime(Object var1, int var2);

    public native boolean StarParaPkg_SetTime(Object var1, int var2, StarTimeClass var3);

    public native void StarParaPkg_SetChangeFlag(Object var1, int var2);

    public native void StarParaPkg_SetChangeFlagEx(Object var1);

    public native void StarParaPkg_ClearChangeFlag(Object var1, int var2);

    public native void StarParaPkg_ClearChangeFlagEx(Object var1);

    public native boolean StarParaPkg_IsChangeFlag(Object var1, int var2);

    public native boolean StarParaPkg_IsChangeFlagEx(Object var1);

    public native boolean StarParaPkg_SaveChangeToBuf(Object var1, StarBinBufClass var2);

    public native boolean StarParaPkg_SaveChangeToBufEx(Object var1, StarBinBufClass var2);

    public native boolean StarParaPkg_LoadChangeFromBuf(Object var1, StarBinBufClass var2);

    public native StarParaPkgClass StarParaPkg_FromDict(Object var1, Hashtable var2);

    public native Hashtable StarParaPkg_ToDict(Object var1);

    public native StarParaPkgClass StarParaPkg_FromTuple(Object var1, Object... var2);

    public native Object[] StarParaPkg_ToTuple(Object var1);

    public native void StarParaPkg_SetScriptRawType(Object var1, int var2);

    public native int StarParaPkg_GetScriptRawType(Object var1);

    public native void StarParaPkg_Free(Object var1);

    public native StarParaPkgClass StarParaPkg_AsDict(Object var1, boolean var2);

    public native boolean StarParaPkg_IsDict(Object var1);

    public native int StarParaPkg_FindDict(Object var1, String var2);

    public native int StarParaPkg_FindDictEx(Object var1, int var2);

    public native boolean StarParaPkg_FromJSon(Object var1, String var2);

    public native String StarParaPkg_ToJSon(Object var1);

    public native boolean StarParaPkg_Equals(Object var1, StarParaPkgClass var2);

    public native boolean StarParaPkg_SetReadOnly(Object var1, String var2, boolean var3);

    public native boolean StarParaPkg_IsReadOnly(Object var1);

    public native boolean StarParaPkg_MoveLastTo(Object var1, int var2);

    public native boolean StarParaPkg_Copy(Object var1, int var2, StarParaPkgClass var3, int var4);

    public native void StarParaPkg_ReleaseOwner(Object var1);

    public native void StarParaPkg_Dispose(Object var1);

    public native void StarBinBuf_Init(Object var1, int var2);

    public native void StarBinBuf_Clear(Object var1);

    public native void StarBinBuf_ClearEx(Object var1, int var2, int var3);

    public native int StarBinBuf_Set(Object var1, int var2, int var3, String var4, Object var5);

    public native Object StarBinBuf_Get(Object var1, int var2, int var3, String var4);

    public native boolean StarBinBuf_SaveToFile(Object var1, String var2, boolean var3);

    public native boolean StarBinBuf_LoadFromFile(Object var1, String var2, boolean var3);

    public native boolean StarBinBuf_SetOffset(Object var1, int var2);

    public native boolean StarBinBuf_Expand(Object var1, int var2);

    public native boolean StarBinBuf_Fill(Object var1, int var2, int var3, String var4);

    public native boolean StarBinBuf_PackObject(Object var1, StarObjectClass var2);

    public native boolean StarBinBuf_UnPackObject(Object var1, StarObjectClass var2);

    public native boolean StarBinBuf_ToUTF8(Object var1);

    public native boolean StarBinBuf_ToAnsi(Object var1);

    public native void StarBinBuf_InsertStr(Object var1, int var2, String var3);

    public native int StarBinBuf_FindStr(Object var1, int var2, String var3);

    public native int StarBinBuf_FindStri(Object var1, int var2, String var3);

    public native void StarBinBuf_Print(Object var1, String var2);

    public native long StarBinBuf_OpenFile(Object var1, String var2, String var3);

    public native int StarBinBuf_GetFileSize(Object var1, long var2);

    public native int StarBinBuf_ReadFile(Object var1, long var2, int var4, int var5);

    public native int StarBinBuf_WriteFile(Object var1, long var2, int var4, int var5);

    public native void StarBinBuf_CloseFile(Object var1, long var2);

    public native boolean StarBinBuf_IsLightBuf(Object var1);

    public native boolean StarBinBuf_AnsiToUnicode(Object var1, String var2, int var3);

    public native boolean StarBinBuf_UnicodeToAnsi(Object var1, String var2, int var3);

    public native int StarBinBuf_Read(Object var1, byte[] var2, int var3, int var4);

    public native int StarBinBuf_Write(Object var1, int var2, byte[] var3, int var4);

    public native int StarBinBuf_Read2(Object var1, short[] var2, int var3, int var4, int var5, int var6);

    public native int StarBinBuf_Write2(Object var1, int var2, short[] var3, int var4, int var5, int var6);

    public native int StarBinBuf_Read4(Object var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8);

    public native int StarBinBuf_Write4(Object var1, int var2, int[] var3, int var4, int var5, int var6, int var7, int var8);

    public native int StarBinBuf_WriteFromMemoryFile(Object var1, StarServiceClass var2, int var3, String var4);

    public native int StarBinBuf_GetHash(Object var1);

    public native String StarBinBuf_GetMD5(Object var1);

    public native void StarBinBuf_Free(Object var1);

    public native void StarBinBuf_ReleaseOwner(Object var1);

    public native void StarBinBuf_Dispose(Object var1);

    public native Object[] StarSXml_LoadFromFile(Object var1, String var2);

    public native Object[] StarSXml_LoadFromBuf(Object var1, StarBinBufClass var2);

    public native Object[] StarSXml_LoadFromBufEx(Object var1, String var2);

    public native boolean StarSXml_SaveToFile(Object var1, String var2);

    public native boolean StarSXml_SaveToBuf(Object var1, StarBinBufClass var2);

    public native String StarSXml_GetStandalone(Object var1);

    public native String StarSXml_GetVersion(Object var1);

    public native String StarSXml_GetEncoding(Object var1);

    public native long StarSXml_FindElement(Object var1, String var2);

    public native long StarSXml_FindElementEx(Object var1, long var2, String var4);

    public native long StarSXml_FirstElement(Object var1, long var2);

    public native long StarSXml_NextElement(Object var1, long var2);

    public native long StarSXml_ParentElement(Object var1, long var2);

    public native String StarSXml_GetElement(Object var1, long var2);

    public native String StarSXml_GetElementEx(Object var1, long var2);

    public native Object[] StarSXml_GetNs(Object var1, long var2);

    public native String StarSXml_GetNsValue(Object var1, long var2, String var4);

    public native long StarSXml_FindAttribute(Object var1, long var2, String var4);

    public native long StarSXml_FirstAttribute(Object var1, long var2);

    public native long StarSXml_NextAttribute(Object var1, long var2);

    public native String StarSXml_GetAttributeName(Object var1, long var2);

    public native String StarSXml_GetAttributeValue(Object var1, long var2);

    public native String StarSXml_GetSingleText(Object var1, long var2);

    public native long StarSXml_FirstText(Object var1, long var2);

    public native long StarSXml_NextText(Object var1, long var2);

    public native String StarSXml_GetText(Object var1, long var2);

    public native void StarSXml_SetDeclaration(Object var1, String var2, String var3, String var4);

    public native void StarSXml_RemoveDeclaration(Object var1);

    public native long StarSXml_InsertElementBefore(Object var1, long var2, long var4, String var6);

    public native long StarSXml_InsertElementAfter(Object var1, long var2, long var4, String var6);

    public native void StarSXml_RemoveElement(Object var1, long var2);

    public native void StarSXml_SetElement(Object var1, long var2, String var4);

    public native void StarSXml_SetNs(Object var1, long var2, String var4, String var5);

    public native long StarSXml_InsertTextBefore(Object var1, long var2, long var4, String var6, boolean var7);

    public native long StarSXml_InsertTextAfter(Object var1, long var2, long var4, String var6, boolean var7);

    public native void StarSXml_RemoveText(Object var1, long var2);

    public native void StarSXml_SetText(Object var1, long var2, String var4, boolean var5);

    public native long StarSXml_InsertCommentBefore(Object var1, long var2, long var4, String var6);

    public native long StarSXml_InsertCommentAfter(Object var1, long var2, long var4, String var6);

    public native void StarSXml_RemoveComment(Object var1, long var2);

    public native void StarSXml_SetComment(Object var1, long var2, String var4);

    public native void StarSXml_SetAttribute(Object var1, long var2, String var4, String var5);

    public native void StarSXml_RemoveAttribute(Object var1, long var2, String var4);

    public native long StarSXml_CopyElementBefore(Object var1, long var2, long var4, long var6);

    public native long StarSXml_CopyElementAfter(Object var1, long var2, long var4, long var6);

    public native boolean StarSXml_CopyChild(Object var1, long var2, long var4);

    public native boolean StarSXml_Dup(Object var1, StarSXmlClass var2);

    public native void StarSXml_Free(Object var1);

    public native void StarSXml_ReleaseOwner(Object var1);

    public native void StarSXml_Dispose(Object var1);

    public native int StarFunctionPara_GetNumber(Object var1);

    public native Object StarFunctionPara_GetValue(Object var1, int var2);

    public native void StarFunctionPara_Clear(Object var1);

    public native boolean StarFunctionPara_SetValue(Object var1, int var2, Object var3);

    public native Object StarFunctionPara_Call(Object var1, StarObjectClass var2, String var3);

    public native void StarFunctionPara_Free(Object var1);

    public native void StarFunctionPara_ReleaseOwner(Object var1);

    public native void StarFunctionPara_Dispose(Object var1);

    public native int StarFunctionPara_GetType(Object var1, int var2);

    public native void StarCommInterface_RegMsgProc(Object var1, String var2);

    public native void StarCommInterface_RegMsgProc_P(Object var1, StarCommMsgInterface var2);

    public native void StarCommInterface_RegWebServerProc(Object var1, String var2);

    public native void StarCommInterface_RegWebServerProc_P(Object var1, StarCommWebServerInterface var2);

    public native int StarCommInterface_TCPSetupServer(Object var1, int var2, String var3, int var4);

    public native int StarCommInterface_TCPSetupClient(Object var1, int var2, String var3, int var4);

    public native int StarCommInterface_TCPSend(Object var1, int var2, StarBinBufClass var3, int var4, boolean var5);

    public native int StarCommInterface_TCPRecv(Object var1, int var2, StarBinBufClass var3, int var4);

    public native int StarCommInterface_TCPRecvLine(Object var1, int var2, StarBinBufClass var3);

    public native void StarCommInterface_TCPRelease(Object var1, int var2);

    public native int StarCommInterface_UDPSetupServer(Object var1, int var2, String var3, int var4);

    public native int StarCommInterface_UDPSetupClient(Object var1, int var2);

    public native int StarCommInterface_UDPSend(Object var1, int var2, StarBinBufClass var3, StarBinBufClass var4);

    public native int StarCommInterface_UDPRecv(Object var1, int var2, StarBinBufClass var3, StarBinBufClass var4);

    public native void StarCommInterface_UDPRelease(Object var1, int var2);

    public native boolean StarCommInterface_UDPSetSockAddr(Object var1, String var2, int var3, StarBinBufClass var4);

    public native String StarCommInterface_GetIP(Object var1, StarBinBufClass var2);

    public native int StarCommInterface_GetPort(Object var1, StarBinBufClass var2);

    public native int StarCommInterface_HttpDownLoad(Object var1, String var2, String var3);

    public native int StarCommInterface_HttpUpLoad(Object var1, String var2, String var3, long var4, String var6, boolean var7, String var8);

    public native int StarCommInterface_HttpDownLoadEx(Object var1, String var2, String var3, String var4);

    public native int StarCommInterface_HttpUpLoadEx(Object var1, String var2, String var3, long var4, String var6);

    public native int StarCommInterface_HttpSend(Object var1, int var2, StarBinBufClass var3, int var4, boolean var5);

    public native int StarCommInterface_HttpRecv(Object var1, int var2, StarBinBufClass var3, int var4);

    public native void StarCommInterface_HttpRelease(Object var1, int var2);

    public native int StarCommInterface_HttpServer(Object var1, String var2, int var3, int var4);

    public native String StarCommInterface_FormatRspHeader(Object var1, String var2, String var3, String var4, String var5, long var6);

    public native String StarCommInterface_ParsePara(Object var1, String var2, String var3);

    public native Object[] StarCommInterface_GetResponseCode(Object var1, StarBinBufClass var2);

    public native String StarCommInterface_GetResponseStr(Object var1, StarBinBufClass var2, String var3);

    public native int StarCommInterface_GetResponseLength(Object var1, StarBinBufClass var2);

    public native boolean StarCommInterface_GetResponseBody(Object var1, StarBinBufClass var2, StarBinBufClass var3);

    public native int StarCommInterface_HttpLocalRequest(Object var1, int var2, String var3, String var4, String var5, StarBinBufClass var6);

    public native int StarCommInterface_HttpLocalRequestEx(Object var1, String var2);

    public native int StarCommInterface_SetupTimer(Object var1, int var2, int var3);

    public native void StarCommInterface_KillTimer(Object var1, int var2);

    public native void StarCommInterface_WebServerRelease(Object var1, int var2);

    public native String StarCommInterface_FormatRspHeaderEx(Object var1, String var2, String var3, String var4, String var5, long var6, String var8);

    public native String StarCommInterface_HttpGetHeaderItem(Object var1, String var2, int var3, String var4);

    public native String StarCommInterface_HttpGetHeaderSubItem(Object var1, String var2, int var3, String var4);

    public native String StarCommInterface_HttpGetNVValue(Object var1, String var2, String var3);

    public native String StarCommInterface_TimeToHttpTime(Object var1, StarTimeClass var2);

    public native StarTimeClass StarCommInterface_HttpTimeToTime(Object var1, String var2);

    public native void StarCommInterface_HttpSetCookie(Object var1, String var2, String var3, String var4, boolean var5);

    public native void StarCommInterface_HttpClearCookie(Object var1, String var2, String var3, String var4);

    public native String StarCommInterface_HttpGetMediaType(Object var1, String var2);

    public native void StarCommInterface_HttpSetMaxPostSize(Object var1, int var2, int var3);

    public native Object[] StarCommInterface_HttpGetMultiPart(Object var1, StarBinBufClass var2, int var3, int var4, StarBinBufClass var5);

    public native boolean StarCommInterface_IsTCPConnect(Object var1, int var2);

    public native boolean StarCommInterface_IsHttpConnect(Object var1, int var2);

    public native boolean StarCommInterface_FileDownLoad(Object var1, String var2, String var3, boolean var4, String var5);

    public native boolean StarCommInterface_FileDownLoad_P(Object var1, String var2, String var3, boolean var4, StarCommCallbackInterface var5);

    public native boolean StarCommInterface_BufDownLoad(Object var1, String var2, StarBinBufClass var3, boolean var4, String var5);

    public native boolean StarCommInterface_BufDownLoad_P(Object var1, String var2, StarBinBufClass var3, boolean var4, StarCommCallbackInterface var5);

    public native boolean StarCommInterface_FileUpLoad(Object var1, String var2, String var3, String var4, StarBinBufClass var5, boolean var6, String var7, boolean var8, String var9);

    public native boolean StarCommInterface_FileUpLoad_P(Object var1, String var2, String var3, String var4, StarBinBufClass var5, boolean var6, String var7, boolean var8, StarCommCallbackInterface var9);

    public native boolean StarCommInterface_BufUpLoad(Object var1, String var2, StarBinBufClass var3, String var4, StarBinBufClass var5, boolean var6, String var7, boolean var8, String var9);

    public native boolean StarCommInterface_BufUpLoad_P(Object var1, String var2, StarBinBufClass var3, String var4, StarBinBufClass var5, boolean var6, String var7, boolean var8, StarCommCallbackInterface var9);

    public native void StarCommInterface_Free(Object var1);

    public native void StarCommInterface_ReleaseOwner(Object var1);

    public native void StarCommInterface_Dispose(Object var1);

    public native void StarObject_RegOnNameValueChange(Object var1, String var2);

    public native void StarObject_RegOnNameValueChange_P(Object var1, StarObjectOnNameValueChangeInterface var2);

    public native void StarObject_RegOnChange(Object var1, String var2);

    public native void StarObject_RegOnChange_P(Object var1, StarObjectOnChangeInterface var2);

    public native void StarObject_V(Object var1, String var2);

    public native void StarObject_F(Object var1, String var2);

    public native void StarObject_E(Object var1);

    public native void StarObject_S(Object var1, String var2);

    public native void StarObject_NV(Object var1);

    public native StarObjectClass StarObject_GetChild(Object var1, String var2);

    public native StarObjectClass StarObject_GetChildByID(Object var1, String var2, int var3);

    public native StarObjectClass StarObject_FirstInst(Object var1, StarQueryRecordClass var2);

    public native StarObjectClass StarObject_NextInst(Object var1, StarQueryRecordClass var2);

    public native void StarObject_QueryClose(Object var1, StarQueryRecordClass var2);

    public native Object[] StarObject_FirstActiveChild(Object var1);

    public native Object[] StarObject_NextActiveChild(Object var1, long var2);

    public native boolean StarObject_IsInActiveSet(Object var1);

    public native boolean StarObject_IsInst(Object var1, StarObjectClass var2);

    public native boolean StarObject_IsDirectInst(Object var1, StarObjectClass var2);

    public native boolean StarObject_IsChild(Object var1, StarObjectClass var2);

    public native boolean StarObject_IsThisClient(Object var1);

    public native void StarObject_SetPrivateValue(Object var1, int var2, int var3, Object var4);

    public native Object StarObject_GetPrivateValue(Object var1, int var2, int var3);

    public native void StarObject_InsertToSDT(Object var1);

    public native void StarObject_DelFromSDT(Object var1);

    public native StarObjectClass StarObject_QueryFirstInstFromSDT(Object var1, StarQueryRecordClass var2);

    public native StarObjectClass StarObject_QueryNextInstFromSDT(Object var1, StarQueryRecordClass var2);

    public native void StarObject_ChangeParent(Object var1, StarObjectClass var2, String var3);

    public native void StarObject_ChangeParentEx(Object var1, StarObjectClass var2, String var3);

    public native boolean StarObject_ActiveCmd(Object var1, int var2);

    public native int StarObject_GetActiveCmd(Object var1);

    public native boolean StarObject_ActiveClient(Object var1, int var2);

    public native void StarObject_DeactiveClient(Object var1, int var2);

    public native boolean StarObject_Active(Object var1);

    public native void StarObject_Deactive(Object var1);

    public native boolean StarObject_IsActive(Object var1);

    public native StarObjectClass StarObject_QueryFirstActiveInst(Object var1, StarQueryRecordClass var2);

    public native StarObjectClass StarObject_QueryNextActiveInst(Object var1, StarQueryRecordClass var2);

    public native long StarObject_RegEventFunction(Object var1, StarObjectClass var2, String var3, String var4);

    public native long StarObject_RegEventFunction_P(Object var1, StarObjectClass var2, String var3, StarObjectEventProcInterface var4);

    public native void StarObject_UnRegEventFunction(Object var1, StarObjectClass var2, String var3, long var4);

    public native Object[] StarObject_ProcessEvent(Object var1, String var2, Object... var3);

    public native void StarObject_PostProcessEvent(Object var1, String var2, Object... var3);

    public native String StarObject_EventID(Object var1, String var2);

    public native int StarObject_SetTimer(Object var1, int var2, String var3, int var4, int var5);

    public native int StarObject_SetTimer_P(Object var1, int var2, int var3, int var4, StarObjectTimerInterface var5);

    public native void StarObject_KillTimer(Object var1, int var2);

    public native StarObjectClass StarObject_New(Object var1, Object... var2);

    public native StarObjectClass StarObject_NewEx(Object var1, Object... var2);

    public native StarObjectClass StarObject_NewGlobal(Object var1, Object... var2);

    public native StarObjectClass StarObject_NewGlobalEx(Object var1, Object... var2);

    public native StarObjectClass StarObject_NewClient(Object var1, Object... var2);

    public native StarObjectClass StarObject_NewClientEx(Object var1, Object... var2);

    public native void StarObject_Change(Object var1, String var2, Object var3);

    public native void StarObject_MarkChange(Object var1, String var2);

    public native boolean StarObject_WaitMalloc(Object var1);

    public native void StarObject_Copy(Object var1, StarObjectClass var2);

    public native void StarObject_Free(Object var1);

    public native void StarObject_DeferFree(Object var1);

    public native boolean StarObject_IsInFree(Object var1);

    public native long StarObject_RegFileCallBack(Object var1, String var2);

    public native long StarObject_RegFileCallBack_P(Object var1, StarObjectFileCallBackInterface var2);

    public native void StarObject_UnRegFileCallBack(Object var1, long var2);

    public native Object StarObject_Call(Object var1, String var2, Object... var3);

    public native Object StarObject_RawCall(Object var1, Class var2, String var3, Object... var4);

    public native Object StarObject_SyncCall(Object var1, String var2, Object... var3);

    public native Object StarObject_SyncRawCall(Object var1, Class var2, String var3, Object... var4);

    public native void StarObject_RemoteCall(Object var1, int var2, String var3, Object... var4);

    public native void StarObject_RemoteCallEx(Object var1, int var2, String var3, Object... var4);

    public native Object[] StarObject_SRemoteCall(Object var1, int var2, int var3, String var4, Object... var5);

    public native void StarObject_ARemoteCall(Object var1, int var2, int var3, String var4, String var5, int var6, Object... var7);

    public native void StarObject_ARemoteCall_P(Object var1, int var2, int var3, StarObjectARemoteCallInterface var4, String var5, int var6, Object... var7);

    public native Object StarObject_GetRemoteAttach(Object var1, String var2);

    public native void StarObject_SetDeferRspFlag(Object var1);

    public native void StarObject_SetRetCode(Object var1, int var2);

    public native void StarObject_SetRemoteRspAttach(Object var1, Object... var2);

    public native void StarObject_RemoteCallRsp(Object var1, int var2, int var3, String var4, int var5, int var6, Object[] var7, int var8, Object var9);

    public native boolean StarObject_FillSoapRspHeader(Object var1, StarSXmlClass var2);

    public native boolean StarObject_CreateFunc(Object var1, String var2, String var3);

    public native boolean StarObject_CreateFuncEx(Object var1, String var2, String var3);

    public native void StarObject_DelFunc(Object var1, String var2);

    public native boolean StarObject_SaveToFile(Object var1, String var2, String var3, int var4, boolean var5);

    public native boolean StarObject_LoadFromFile(Object var1, String var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7);

    public native boolean StarObject_LoadFromBuf(Object var1, StarBinBufClass var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7);

    public native void StarObject_DeferLoadFromFile(Object var1, String var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7);

    public native void StarObject_ResetLoad(Object var1);

    public native boolean StarObject_SetNameInt(Object var1, String var2, int var3, boolean var4);

    public native int StarObject_GetNameInt(Object var1, String var2, int var3);

    public native boolean StarObject_SetNameFloat(Object var1, String var2, double var3, boolean var5);

    public native double StarObject_GetNameFloat(Object var1, String var2, double var3);

    public native boolean StarObject_SetNameStr(Object var1, String var2, String var3, boolean var4);

    public native String StarObject_GetNameStr(Object var1, String var2, String var3);

    public native boolean StarObject_SetNameTime(Object var1, String var2, StarTimeClass var3, boolean var4);

    public native StarTimeClass StarObject_GetNameTime(Object var1, String var2, StarTimeClass var3);

    public native void StarObject_FreeNameValue(Object var1, String var2);

    public native int StarObject_GetNameValueType(Object var1, String var2);

    public native boolean StarObject_CanSetStaticData(Object var1, int var2);

    public native String StarObject_SetStaticData(Object var1, String var2, StarBinBufClass var3);

    public native String StarObject_SetStaticDataEx(Object var1, String var2, int var3, int var4, String var5);

    public native String StarObject_GetStaticData(Object var1, String var2, StarBinBufClass var3, String var4, boolean var5);

    public native boolean StarObject_WaitGetStaticData(Object var1, String var2, String var3, boolean var4);

    public native boolean StarObject_WaitGetStaticData_P(Object var1, String var2, boolean var3, StarObjectGetStaticDataInterface var4);

    public native boolean StarObject_WaitSetStaticData(Object var1, String var2, String var3, boolean var4);

    public native boolean StarObject_WaitSetStaticData_P(Object var1, String var2, boolean var3, StarObjectSetStaticDataInterface var4);

    public native boolean StarObject_SaveToLuaFunc(Object var1, String var2, String var3);

    public native void StarObject_Init(Object var1, String var2);

    public native boolean StarObject_RemoteSend(Object var1, int var2, StarParaPkgClass var3);

    public native void StarObject_LockGC(Object var1);

    public native void StarObject_SLockGC(Object var1);

    public native void StarObject_UnLockGC(Object var1);

    public native void StarObject_SUnLockGC(Object var1);

    public native int StarObject_GetSourceScript(Object var1);

    public native StarObjectClass StarObject_DefinedClass(Object var1, String var2);

    public native StarObjectClass StarObject_IsFunctionDefined(Object var1, String var2, boolean var3);

    public native StarObjectClass StarObject_FromTuple(Object var1, int var2, Object[] var3);

    public native Object[] StarObject_ToTuple(Object var1, int var2, int var3);

    public native boolean StarObject_AttachRawContext(Object var1, String var2, String var3, boolean var4, String var5);

    public native void StarObject_DetachRawContext(Object var1, boolean var2);

    public native String StarObject_GetRawContextType(Object var1);

    public native StarObjectClass StarObject_AttachRawObject(Object var1, Object var2, boolean var3);

    public native StarObjectClass StarObject_AttachRawObjectEx(Object var1, Object var2, boolean var3);

    public native Object StarObject_GetRawObject(Object var1);

    public native boolean StarObject_HasRawContext(Object var1);

    public native StarObjectClass StarObject_AssignRawObject(Object var1, StarObjectClass var2);

    public native StarObjectClass StarObject_NewRawProxyEx(Object var1, String var2, String var3, String var4);

    public native StarParaPkgClass StarObject_GetInitPara(Object var1);

    public native boolean StarObject_Equals(Object var1, StarObjectClass var2);

    public native boolean StarObject_SetScriptRawType(Object var1, int var2);

    public native int StarObject_GetScriptRawType(Object var1);

    public native int StarObject_GetRefEx(Object var1);

    public native String StarObject_GetRefInfo(Object var1);

    public native boolean StarObject_IsValid(Object var1);

    public native int StarObject_GetLastError(Object var1);

    public native String StarObject_GetLastErrorInfo(Object var1);

    public native void StarObject_RegSysEventProc(Object var1, String var2, String var3);

    public native void StarObject_RegSysEventProc_P(Object var1, String var2, StarObjectSysEventProcInterface var3);

    public native void StarObject_RegScriptProc_P(Object var1, String var2, StarObjectScriptProcInterface var3);

    public native Iterator StarObject_Iterator(Object var1);

    public native boolean StarObject_ReleaseOwnerEx(Object var1);

    public native boolean StarObject_IsSLock(Object var1);

    public native Object StarObject_R(Object var1, Object var2);

    public native void StarObject_Dispose(Object var1);

    public native StarParaPkgClass StarObject_RawToParaPkg(Object var1);

    public native String StarObject_JSonCall(Object var1, String var2);

    public native int StarObject_InstNumber(Object var1);

    static {
        try {
            if (StarCoreFactoryPath.StarCoreCoreLibraryPath == null) {
                if (StarCoreFactoryPath.StarCoreShareLibraryPath == null) {
                    System.load("/data/data/com.srplab.starcore/lib/libstar_java.so");
                } else {
                    File var0 = new File(StarCoreFactoryPath.StarCoreShareLibraryPath + "/libstar_java.so");
                    if (var0.exists()) {
                        System.load(StarCoreFactoryPath.StarCoreShareLibraryPath + "/libstar_java.so");
                    } else {
                        System.load("/data/data/com.srplab.starcore/lib/libstar_java.so");
                    }
                }
            } else {
                System.load(StarCoreFactoryPath.StarCoreCoreLibraryPath + "/libstar_java.so");
            }
        } catch (UnsatisfiedLinkError var1) {
            System.out.println(var1);
            throw new ExceptionInInitializerError(var1);
        }
    }
}
