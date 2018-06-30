/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class RSAKey : TBase
{
  private string _keynm;
  private string _nvalue;
  private string _evalue;
  private string _sessionKey;

  public string Keynm
  {
    get
    {
      return _keynm;
    }
    set
    {
      __isset.keynm = true;
      this._keynm = value;
    }
  }

  public string Nvalue
  {
    get
    {
      return _nvalue;
    }
    set
    {
      __isset.nvalue = true;
      this._nvalue = value;
    }
  }

  public string Evalue
  {
    get
    {
      return _evalue;
    }
    set
    {
      __isset.evalue = true;
      this._evalue = value;
    }
  }

  public string SessionKey
  {
    get
    {
      return _sessionKey;
    }
    set
    {
      __isset.sessionKey = true;
      this._sessionKey = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool keynm;
    public bool nvalue;
    public bool evalue;
    public bool sessionKey;
  }

  public RSAKey() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              Keynm = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Nvalue = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Evalue = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              SessionKey = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("RSAKey");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Keynm != null && __isset.keynm) {
        field.Name = "keynm";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Keynm);
        oprot.WriteFieldEnd();
      }
      if (Nvalue != null && __isset.nvalue) {
        field.Name = "nvalue";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Nvalue);
        oprot.WriteFieldEnd();
      }
      if (Evalue != null && __isset.evalue) {
        field.Name = "evalue";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Evalue);
        oprot.WriteFieldEnd();
      }
      if (SessionKey != null && __isset.sessionKey) {
        field.Name = "sessionKey";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SessionKey);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("RSAKey(");
    bool __first = true;
    if (Keynm != null && __isset.keynm) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Keynm: ");
      __sb.Append(Keynm);
    }
    if (Nvalue != null && __isset.nvalue) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Nvalue: ");
      __sb.Append(Nvalue);
    }
    if (Evalue != null && __isset.evalue) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Evalue: ");
      __sb.Append(Evalue);
    }
    if (SessionKey != null && __isset.sessionKey) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SessionKey: ");
      __sb.Append(SessionKey);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

