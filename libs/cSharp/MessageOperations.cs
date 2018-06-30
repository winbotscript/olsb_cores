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
public partial class MessageOperations : TBase
{
  private List<MessageOperation> _operations;
  private bool _endFlag;

  public List<MessageOperation> Operations
  {
    get
    {
      return _operations;
    }
    set
    {
      __isset.operations = true;
      this._operations = value;
    }
  }

  public bool EndFlag
  {
    get
    {
      return _endFlag;
    }
    set
    {
      __isset.endFlag = true;
      this._endFlag = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool operations;
    public bool endFlag;
  }

  public MessageOperations() {
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
            if (field.Type == TType.List) {
              {
                Operations = new List<MessageOperation>();
                TList _list17 = iprot.ReadListBegin();
                for( int _i18 = 0; _i18 < _list17.Count; ++_i18)
                {
                  MessageOperation _elem19;
                  _elem19 = new MessageOperation();
                  _elem19.Read(iprot);
                  Operations.Add(_elem19);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Bool) {
              EndFlag = iprot.ReadBool();
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
      TStruct struc = new TStruct("MessageOperations");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Operations != null && __isset.operations) {
        field.Name = "operations";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Operations.Count));
          foreach (MessageOperation _iter20 in Operations)
          {
            _iter20.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.endFlag) {
        field.Name = "endFlag";
        field.Type = TType.Bool;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(EndFlag);
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
    StringBuilder __sb = new StringBuilder("MessageOperations(");
    bool __first = true;
    if (Operations != null && __isset.operations) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Operations: ");
      __sb.Append(Operations);
    }
    if (__isset.endFlag) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("EndFlag: ");
      __sb.Append(EndFlag);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

