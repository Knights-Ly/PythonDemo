//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

public class StarCommInterfaceClass {
    private StarCoreFactory StarCore;
    private long m_Handle;

    private StarCommInterfaceClass(StarCoreFactory var1, Object[] var2) {
        this.StarCore = var1;
        this.StarCore._InitObject(this, var2);
    }

    public StarCommInterfaceClass(StarCommInterfaceClass var1) {
        this.StarCore = var1.StarCore;
        this.StarCore._WrapObject(this, var1);
    }

    public StarCommInterfaceClass() {
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

    public void _RegMsgProc(String var1) {
        this.StarCore.StarCommInterface_RegMsgProc(this, var1);
    }

    public void _RegMsgProc_P(StarCommMsgInterface var1) {
        this.StarCore.StarCommInterface_RegMsgProc_P(this, var1);
    }

    public void _RegWebServerProc(String var1) {
        this.StarCore.StarCommInterface_RegWebServerProc(this, var1);
    }

    public void _RegWebServerProc_P(StarCommWebServerInterface var1) {
        this.StarCore.StarCommInterface_RegWebServerProc_P(this, var1);
    }

    public int _TCPSetupServer(int var1, String var2, int var3) {
        return this.StarCore.StarCommInterface_TCPSetupServer(this, var1, var2, var3);
    }

    public int _TCPSetupClient(int var1, String var2, int var3) {
        return this.StarCore.StarCommInterface_TCPSetupClient(this, var1, var2, var3);
    }

    public int _TCPSend(int var1, StarBinBufClass var2, int var3, boolean var4) {
        return this.StarCore.StarCommInterface_TCPSend(this, var1, var2, var3, var4);
    }

    public int _TCPRecv(int var1, StarBinBufClass var2, int var3) {
        return this.StarCore.StarCommInterface_TCPRecv(this, var1, var2, var3);
    }

    public int _TCPRecvLine(int var1, StarBinBufClass var2) {
        return this.StarCore.StarCommInterface_TCPRecvLine(this, var1, var2);
    }

    public void _TCPRelease(int var1) {
        this.StarCore.StarCommInterface_TCPRelease(this, var1);
    }

    public int _UDPSetupServer(int var1, String var2, int var3) {
        return this.StarCore.StarCommInterface_UDPSetupServer(this, var1, var2, var3);
    }

    public int _UDPSetupClient(int var1) {
        return this.StarCore.StarCommInterface_UDPSetupClient(this, var1);
    }

    public int _UDPSend(int var1, StarBinBufClass var2, StarBinBufClass var3) {
        return this.StarCore.StarCommInterface_UDPSend(this, var1, var2, var3);
    }

    public int _UDPRecv(int var1, StarBinBufClass var2, StarBinBufClass var3) {
        return this.StarCore.StarCommInterface_UDPRecv(this, var1, var2, var3);
    }

    public void _UDPRelease(int var1) {
        this.StarCore.StarCommInterface_UDPRelease(this, var1);
    }

    public boolean _UDPSetSockAddr(String var1, int var2, StarBinBufClass var3) {
        return this.StarCore.StarCommInterface_UDPSetSockAddr(this, var1, var2, var3);
    }

    public String _GetIP(StarBinBufClass var1) {
        return this.StarCore.StarCommInterface_GetIP(this, var1);
    }

    public int _GetPort(StarBinBufClass var1) {
        return this.StarCore.StarCommInterface_GetPort(this, var1);
    }

    public int _HttpDownLoad(String var1, String var2) {
        return this.StarCore.StarCommInterface_HttpDownLoad(this, var1, var2);
    }

    public int _HttpUpLoad(String var1, String var2, long var3, String var5, boolean var6, String var7) {
        return this.StarCore.StarCommInterface_HttpUpLoad(this, var1, var2, var3, var5, var6, var7);
    }

    public int _HttpDownLoadEx(String var1, String var2, String var3) {
        return this.StarCore.StarCommInterface_HttpDownLoadEx(this, var1, var2, var3);
    }

    public int _HttpUpLoadEx(String var1, String var2, long var3, String var5) {
        return this.StarCore.StarCommInterface_HttpUpLoadEx(this, var1, var2, var3, var5);
    }

    public int _HttpSend(int var1, StarBinBufClass var2, int var3, boolean var4) {
        return this.StarCore.StarCommInterface_HttpSend(this, var1, var2, var3, var4);
    }

    public int _HttpRecv(int var1, StarBinBufClass var2, int var3) {
        return this.StarCore.StarCommInterface_HttpRecv(this, var1, var2, var3);
    }

    public void _HttpRelease(int var1) {
        this.StarCore.StarCommInterface_HttpRelease(this, var1);
    }

    public int _HttpServer(String var1, int var2, int var3) {
        return this.StarCore.StarCommInterface_HttpServer(this, var1, var2, var3);
    }

    public String _FormatRspHeader(String var1, String var2, String var3, String var4, long var5) {
        return this.StarCore.StarCommInterface_FormatRspHeader(this, var1, var2, var3, var4, var5);
    }

    public String _ParsePara(String var1, String var2) {
        return this.StarCore.StarCommInterface_ParsePara(this, var1, var2);
    }

    public Object[] _GetResponseCode(StarBinBufClass var1) {
        return this.StarCore.StarCommInterface_GetResponseCode(this, var1);
    }

    public String _GetResponseStr(StarBinBufClass var1, String var2) {
        return this.StarCore.StarCommInterface_GetResponseStr(this, var1, var2);
    }

    public int _GetResponseLength(StarBinBufClass var1) {
        return this.StarCore.StarCommInterface_GetResponseLength(this, var1);
    }

    public boolean _GetResponseBody(StarBinBufClass var1, StarBinBufClass var2) {
        return this.StarCore.StarCommInterface_GetResponseBody(this, var1, var2);
    }

    public int _HttpLocalRequest(int var1, String var2, String var3, String var4, StarBinBufClass var5) {
        return this.StarCore.StarCommInterface_HttpLocalRequest(this, var1, var2, var3, var4, var5);
    }

    public int _HttpLocalRequestEx(String var1) {
        return this.StarCore.StarCommInterface_HttpLocalRequestEx(this, var1);
    }

    public int _SetupTimer(int var1, int var2) {
        return this.StarCore.StarCommInterface_SetupTimer(this, var1, var2);
    }

    public void _KillTimer(int var1) {
        this.StarCore.StarCommInterface_KillTimer(this, var1);
    }

    public void _WebServerRelease(int var1) {
        this.StarCore.StarCommInterface_WebServerRelease(this, var1);
    }

    public String _FormatRspHeaderEx(String var1, String var2, String var3, String var4, long var5, String var7) {
        return this.StarCore.StarCommInterface_FormatRspHeaderEx(this, var1, var2, var3, var4, var5, var7);
    }

    public String _HttpGetHeaderItem(String var1, int var2, String var3) {
        return this.StarCore.StarCommInterface_HttpGetHeaderItem(this, var1, var2, var3);
    }

    public String _HttpGetHeaderSubItem(String var1, int var2, String var3) {
        return this.StarCore.StarCommInterface_HttpGetHeaderSubItem(this, var1, var2, var3);
    }

    public String _HttpGetNVValue(String var1, String var2) {
        return this.StarCore.StarCommInterface_HttpGetNVValue(this, var1, var2);
    }

    public String _TimeToHttpTime(StarTimeClass var1) {
        return this.StarCore.StarCommInterface_TimeToHttpTime(this, var1);
    }

    public StarTimeClass _HttpTimeToTime(String var1) {
        return this.StarCore.StarCommInterface_HttpTimeToTime(this, var1);
    }

    public void _HttpSetCookie(String var1, String var2, String var3, boolean var4) {
        this.StarCore.StarCommInterface_HttpSetCookie(this, var1, var2, var3, var4);
    }

    public void _HttpClearCookie(String var1, String var2, String var3) {
        this.StarCore.StarCommInterface_HttpClearCookie(this, var1, var2, var3);
    }

    public String _HttpGetMediaType(String var1) {
        return this.StarCore.StarCommInterface_HttpGetMediaType(this, var1);
    }

    public void _HttpSetMaxPostSize(int var1, int var2) {
        this.StarCore.StarCommInterface_HttpSetMaxPostSize(this, var1, var2);
    }

    public Object[] _HttpGetMultiPart(StarBinBufClass var1, int var2, int var3, StarBinBufClass var4) {
        return this.StarCore.StarCommInterface_HttpGetMultiPart(this, var1, var2, var3, var4);
    }

    public boolean _IsTCPConnect(int var1) {
        return this.StarCore.StarCommInterface_IsTCPConnect(this, var1);
    }

    public boolean _IsHttpConnect(int var1) {
        return this.StarCore.StarCommInterface_IsHttpConnect(this, var1);
    }

    public boolean _FileDownLoad(String var1, String var2, boolean var3, String var4) {
        return this.StarCore.StarCommInterface_FileDownLoad(this, var1, var2, var3, var4);
    }

    public boolean _FileDownLoad_P(String var1, String var2, boolean var3, StarCommCallbackInterface var4) {
        return this.StarCore.StarCommInterface_FileDownLoad_P(this, var1, var2, var3, var4);
    }

    public boolean _BufDownLoad(String var1, StarBinBufClass var2, boolean var3, String var4) {
        return this.StarCore.StarCommInterface_BufDownLoad(this, var1, var2, var3, var4);
    }

    public boolean _BufDownLoad_P(String var1, StarBinBufClass var2, boolean var3, StarCommCallbackInterface var4) {
        return this.StarCore.StarCommInterface_BufDownLoad_P(this, var1, var2, var3, var4);
    }

    public boolean _FileUpLoad(String var1, String var2, String var3, StarBinBufClass var4, boolean var5, String var6, boolean var7, String var8) {
        return this.StarCore.StarCommInterface_FileUpLoad(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public boolean _FileUpLoad_P(String var1, String var2, String var3, StarBinBufClass var4, boolean var5, String var6, boolean var7, StarCommCallbackInterface var8) {
        return this.StarCore.StarCommInterface_FileUpLoad_P(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public boolean _BufUpLoad(String var1, StarBinBufClass var2, String var3, StarBinBufClass var4, boolean var5, String var6, boolean var7, String var8) {
        return this.StarCore.StarCommInterface_BufUpLoad(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public boolean _BufUpLoad_P(String var1, StarBinBufClass var2, String var3, StarBinBufClass var4, boolean var5, String var6, boolean var7, StarCommCallbackInterface var8) {
        return this.StarCore.StarCommInterface_BufUpLoad_P(this, var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public StarCommInterfaceClass _Assign(StarCommInterfaceClass var1) {
        var1.StarCore = this.StarCore;
        this.StarCore._WrapObject(var1, this);
        return var1;
    }

    public void _Free() {
        this.StarCore.StarCommInterface_Free(this);
    }

    public void _ReleaseOwner() {
        this.StarCore.StarCommInterface_ReleaseOwner(this);
    }

    public void _Dispose() {
        this.StarCore.StarCommInterface_Dispose(this);
    }
}
