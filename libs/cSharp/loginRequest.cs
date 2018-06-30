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
public partial class loginRequest : TBase
{
  private int _type;
  private int _identityProvider;
  private string _identifier;
  private string _password;
  private bool _keepLoggedIn;
  private string _accessLocation;
  private string _systemName;
  private string _certificate;
  private string _verifier;
  private string _secret;
  private int _e2eeVersion;

  public int Type
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

  public int IdentityProvider
  {
    get
    {
      return _identityProvider;
    }
    set
    {
      __isset.identityProvider = true;
      this._identityProvider = value;
    }
  }

  public string Identifier
  {
    get
    {
      return _identifier;
    }
    set
    {
      __isset.identifier = true;
      this._identifier = value;
    }
  }

  public string Password
  {
    get
    {
      return _password;
    }
    set
    {
      __isset.password = true;
      this._password = value;
    }
  }

  public bool KeepLoggedIn
  {
    get
    {
      return _keepLoggedIn;
    }
    set
    {
      __isset.keepLoggedIn = true;
      this._keepLoggedIn = value;
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

  public string Secret
  {
    get
    {
      return _secret;
    }
    set
    {
      __isset.secret = true;
      this._secret = value;
    }
  }

  public int E2eeVersion
  {
    get
    {
      return _e2eeVersion;
    }
    set
    {
      __isset.e2eeVersion = true;
      this._e2eeVersion = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool type;
    public bool identityProvider;
    public bool identifier;
    public bool password;
    public bool keepLoggedIn;
    public bool accessLocation;
    public bool systemName;
    public bool certificate;
    public bool verifier;
    public bool secret;
    public bool e2eeVersion;
  }

  public loginRequest() {
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
            if (field.Type == TType.I32) {
              Type = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              IdentityProvider = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Identifier = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Password = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Bool) {
              KeepLoggedIn = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              AccessLocation = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.String) {
              SystemName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              Certificate = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              Verifier = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              Secret = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.I32) {
              E2eeVersion = iprot.ReadI32();
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
      TStruct struc = new TStruct("loginRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Type);
        oprot.WriteFieldEnd();
      }
      if (__isset.identityProvider) {
        field.Name = "identityProvider";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(IdentityProvider);
        oprot.WriteFieldEnd();
      }
      if (Identifier != null && __isset.identifier) {
        field.Name = "identifier";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Identifier);
        oprot.WriteFieldEnd();
      }
      if (Password != null && __isset.password) {
        field.Name = "password";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Password);
        oprot.WriteFieldEnd();
      }
      if (__isset.keepLoggedIn) {
        field.Name = "keepLoggedIn";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(KeepLoggedIn);
        oprot.WriteFieldEnd();
      }
      if (AccessLocation != null && __isset.accessLocation) {
        field.Name = "accessLocation";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AccessLocation);
        oprot.WriteFieldEnd();
      }
      if (SystemName != null && __isset.systemName) {
        field.Name = "systemName";
        field.Type = TType.String;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SystemName);
        oprot.WriteFieldEnd();
      }
      if (Certificate != null && __isset.certificate) {
        field.Name = "certificate";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Certificate);
        oprot.WriteFieldEnd();
      }
      if (Verifier != null && __isset.verifier) {
        field.Name = "verifier";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Verifier);
        oprot.WriteFieldEnd();
      }
      if (Secret != null && __isset.secret) {
        field.Name = "secret";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Secret);
        oprot.WriteFieldEnd();
      }
      if (__isset.e2eeVersion) {
        field.Name = "e2eeVersion";
        field.Type = TType.I32;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(E2eeVersion);
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
    StringBuilder __sb = new StringBuilder("loginRequest(");
    bool __first = true;
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    if (__isset.identityProvider) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("IdentityProvider: ");
      __sb.Append(IdentityProvider);
    }
    if (Identifier != null && __isset.identifier) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Identifier: ");
      __sb.Append(Identifier);
    }
    if (Password != null && __isset.password) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Password: ");
      __sb.Append(Password);
    }
    if (__isset.keepLoggedIn) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("KeepLoggedIn: ");
      __sb.Append(KeepLoggedIn);
    }
    if (AccessLocation != null && __isset.accessLocation) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AccessLocation: ");
      __sb.Append(AccessLocation);
    }
    if (SystemName != null && __isset.systemName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SystemName: ");
      __sb.Append(SystemName);
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
    if (Secret != null && __isset.secret) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Secret: ");
      __sb.Append(Secret);
    }
    if (__isset.e2eeVersion) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("E2eeVersion: ");
      __sb.Append(E2eeVersion);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

