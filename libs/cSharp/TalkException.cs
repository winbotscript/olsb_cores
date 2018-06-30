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
public partial class TalkException : TException, TBase
{
  private ErrorCode _code;
  private string _reason;
  private Dictionary<string, string> _parameterMap;

  /// <summary>
  /// 
  /// <seealso cref="ErrorCode"/>
  /// </summary>
  public ErrorCode Code
  {
    get
    {
      return _code;
    }
    set
    {
      __isset.code = true;
      this._code = value;
    }
  }

  public string Reason
  {
    get
    {
      return _reason;
    }
    set
    {
      __isset.reason = true;
      this._reason = value;
    }
  }

  public Dictionary<string, string> ParameterMap
  {
    get
    {
      return _parameterMap;
    }
    set
    {
      __isset.parameterMap = true;
      this._parameterMap = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool code;
    public bool reason;
    public bool parameterMap;
  }

  public TalkException() {
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
              Code = (ErrorCode)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Reason = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Map) {
              {
                ParameterMap = new Dictionary<string, string>();
                TMap _map25 = iprot.ReadMapBegin();
                for( int _i26 = 0; _i26 < _map25.Count; ++_i26)
                {
                  string _key27;
                  string _val28;
                  _key27 = iprot.ReadString();
                  _val28 = iprot.ReadString();
                  ParameterMap[_key27] = _val28;
                }
                iprot.ReadMapEnd();
              }
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
      TStruct struc = new TStruct("TalkException");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.code) {
        field.Name = "code";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Code);
        oprot.WriteFieldEnd();
      }
      if (Reason != null && __isset.reason) {
        field.Name = "reason";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Reason);
        oprot.WriteFieldEnd();
      }
      if (ParameterMap != null && __isset.parameterMap) {
        field.Name = "parameterMap";
        field.Type = TType.Map;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, ParameterMap.Count));
          foreach (string _iter29 in ParameterMap.Keys)
          {
            oprot.WriteString(_iter29);
            oprot.WriteString(ParameterMap[_iter29]);
          }
          oprot.WriteMapEnd();
        }
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
    StringBuilder __sb = new StringBuilder("TalkException(");
    bool __first = true;
    if (__isset.code) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Code: ");
      __sb.Append(Code);
    }
    if (Reason != null && __isset.reason) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Reason: ");
      __sb.Append(Reason);
    }
    if (ParameterMap != null && __isset.parameterMap) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ParameterMap: ");
      __sb.Append(ParameterMap);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

