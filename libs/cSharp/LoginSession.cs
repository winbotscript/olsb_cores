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
public partial class LoginSession : TBase
{
  private string _tokenKey;
  private long _expirationTime;
  private ApplicationType _applicationType;
  private string _systemName;
  private string _accessLocation;

  public string TokenKey
  {
    get
    {
      return _tokenKey;
    }
    set
    {
      __isset.tokenKey = true;
      this._tokenKey = value;
    }
  }

  public long ExpirationTime
  {
    get
    {
      return _expirationTime;
    }
    set
    {
      __isset.expirationTime = true;
      this._expirationTime = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ApplicationType"/>
  /// </summary>
  public ApplicationType ApplicationType
  {
    get
    {
      return _applicationType;
    }
    set
    {
      __isset.applicationType = true;
      this._applicationType = value;
    }
  }

  public string SystemName
  {
    get
    {
      return _systemName;
    }
    set
    {
      __isset.systemName = true;
      this._systemName = value;
    }
  }

  public string AccessLocation
  {
    get
    {
      return _accessLocation;
    }
    set
    {
      __isset.accessLocation = true;
      this._accessLocation = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool tokenKey;
    public bool expirationTime;
    public bool applicationType;
    public bool systemName;
    public bool accessLocation;
  }

  public LoginSession() {
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
              TokenKey = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I64) {
              ExpirationTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.I32) {
              ApplicationType = (ApplicationType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              SystemName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.String) {
              AccessLocation = iprot.ReadString();
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
      TStruct struc = new TStruct("LoginSession");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (TokenKey != null && __isset.tokenKey) {
        field.Name = "tokenKey";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TokenKey);
        oprot.WriteFieldEnd();
      }
      if (__isset.expirationTime) {
        field.Name = "expirationTime";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ExpirationTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.applicationType) {
        field.Name = "applicationType";
        field.Type = TType.I32;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ApplicationType);
        oprot.WriteFieldEnd();
      }
      if (SystemName != null && __isset.systemName) {
        field.Name = "systemName";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SystemName);
        oprot.WriteFieldEnd();
      }
      if (AccessLocation != null && __isset.accessLocation) {
        field.Name = "accessLocation";
        field.Type = TType.String;
        field.ID = 22;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AccessLocation);
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
    StringBuilder __sb = new StringBuilder("LoginSession(");
    bool __first = true;
    if (TokenKey != null && __isset.tokenKey) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TokenKey: ");
      __sb.Append(TokenKey);
    }
    if (__isset.expirationTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ExpirationTime: ");
      __sb.Append(ExpirationTime);
    }
    if (__isset.applicationType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ApplicationType: ");
      __sb.Append(ApplicationType);
    }
    if (SystemName != null && __isset.systemName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SystemName: ");
      __sb.Append(SystemName);
    }
    if (AccessLocation != null && __isset.accessLocation) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AccessLocation: ");
      __sb.Append(AccessLocation);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

