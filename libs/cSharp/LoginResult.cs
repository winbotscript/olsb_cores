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
public partial class LoginResult : TBase
{
  private string _authToken;
  private string _certificate;
  private string _verifier;
  private string _pinCode;
  private LoginResultType _type;

  public string AuthToken
  {
    get
    {
      return _authToken;
    }
    set
    {
      __isset.authToken = true;
      this._authToken = value;
    }
  }

  public string Certificate
  {
    get
    {
      return _certificate;
    }
    set
    {
      __isset.certificate = true;
      this._certificate = value;
    }
  }

  public string Verifier
  {
    get
    {
      return _verifier;
    }
    set
    {
      __isset.verifier = true;
      this._verifier = value;
    }
  }

  public string PinCode
  {
    get
    {
      return _pinCode;
    }
    set
    {
      __isset.pinCode = true;
      this._pinCode = value;
    }
  }

  public LoginResultType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool authToken;
    public bool certificate;
    public bool verifier;
    public bool pinCode;
    public bool type;
  }

  public LoginResult() {
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
              AuthToken = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Certificate = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Verifier = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              PinCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              Type = (LoginResultType)iprot.ReadI32();
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
      TStruct struc = new TStruct("LoginResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (AuthToken != null && __isset.authToken) {
        field.Name = "authToken";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AuthToken);
        oprot.WriteFieldEnd();
      }
      if (Certificate != null && __isset.certificate) {
        field.Name = "certificate";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Certificate);
        oprot.WriteFieldEnd();
      }
      if (Verifier != null && __isset.verifier) {
        field.Name = "verifier";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Verifier);
        oprot.WriteFieldEnd();
      }
      if (PinCode != null && __isset.pinCode) {
        field.Name = "pinCode";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(PinCode);
        oprot.WriteFieldEnd();
      }
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Type);
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
    StringBuilder __sb = new StringBuilder("LoginResult(");
    bool __first = true;
    if (AuthToken != null && __isset.authToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AuthToken: ");
      __sb.Append(AuthToken);
    }
    if (Certificate != null && __isset.certificate) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Certificate: ");
      __sb.Append(Certificate);
    }
    if (Verifier != null && __isset.verifier) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Verifier: ");
      __sb.Append(Verifier);
    }
    if (PinCode != null && __isset.pinCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PinCode: ");
      __sb.Append(PinCode);
    }
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

