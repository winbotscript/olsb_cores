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
public partial class MessageOperation : TBase
{
  private long _revision;
  private long _createdTime;
  private MessageOperationType _type;
  private int _reqSeq;
  private OpStatus _status;
  private string _param1;
  private string _param2;
  private string _param3;
  private Message _message;

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public long CreatedTime
  {
    get
    {
      return _createdTime;
    }
    set
    {
      __isset.createdTime = true;
      this._createdTime = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="MessageOperationType"/>
  /// </summary>
  public MessageOperationType Type
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

  public int ReqSeq
  {
    get
    {
      return _reqSeq;
    }
    set
    {
      __isset.reqSeq = true;
      this._reqSeq = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="OpStatus"/>
  /// </summary>
  public OpStatus Status
  {
    get
    {
      return _status;
    }
    set
    {
      __isset.status = true;
      this._status = value;
    }
  }

  public string Param1
  {
    get
    {
      return _param1;
    }
    set
    {
      __isset.param1 = true;
      this._param1 = value;
    }
  }

  public string Param2
  {
    get
    {
      return _param2;
    }
    set
    {
      __isset.param2 = true;
      this._param2 = value;
    }
  }

  public string Param3
  {
    get
    {
      return _param3;
    }
    set
    {
      __isset.param3 = true;
      this._param3 = value;
    }
  }

  public Message Message
  {
    get
    {
      return _message;
    }
    set
    {
      __isset.message = true;
      this._message = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool revision;
    public bool createdTime;
    public bool type;
    public bool reqSeq;
    public bool status;
    public bool param1;
    public bool param2;
    public bool param3;
    public bool message;
  }

  public MessageOperation() {
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
            if (field.Type == TType.I64) {
              Revision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              CreatedTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Type = (MessageOperationType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              ReqSeq = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              Status = (OpStatus)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              Param1 = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.String) {
              Param2 = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              Param3 = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.Struct) {
              Message = new Message();
              Message.Read(iprot);
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
      TStruct struc = new TStruct("MessageOperation");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.revision) {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Revision);
        oprot.WriteFieldEnd();
      }
      if (__isset.createdTime) {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreatedTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Type);
        oprot.WriteFieldEnd();
      }
      if (__isset.reqSeq) {
        field.Name = "reqSeq";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ReqSeq);
        oprot.WriteFieldEnd();
      }
      if (__isset.status) {
        field.Name = "status";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Status);
        oprot.WriteFieldEnd();
      }
      if (Param1 != null && __isset.param1) {
        field.Name = "param1";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Param1);
        oprot.WriteFieldEnd();
      }
      if (Param2 != null && __isset.param2) {
        field.Name = "param2";
        field.Type = TType.String;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Param2);
        oprot.WriteFieldEnd();
      }
      if (Param3 != null && __isset.param3) {
        field.Name = "param3";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Param3);
        oprot.WriteFieldEnd();
      }
      if (Message != null && __isset.message) {
        field.Name = "message";
        field.Type = TType.Struct;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        Message.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("MessageOperation(");
    bool __first = true;
    if (__isset.revision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Revision: ");
      __sb.Append(Revision);
    }
    if (__isset.createdTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedTime: ");
      __sb.Append(CreatedTime);
    }
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    if (__isset.reqSeq) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReqSeq: ");
      __sb.Append(ReqSeq);
    }
    if (__isset.status) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Status: ");
      __sb.Append(Status);
    }
    if (Param1 != null && __isset.param1) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Param1: ");
      __sb.Append(Param1);
    }
    if (Param2 != null && __isset.param2) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Param2: ");
      __sb.Append(Param2);
    }
    if (Param3 != null && __isset.param3) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Param3: ");
      __sb.Append(Param3);
    }
    if (Message != null && __isset.message) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Message: ");
      __sb.Append(Message== null ? "<null>" : Message.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

