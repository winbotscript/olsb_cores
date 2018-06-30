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
public partial class Message : TBase
{
  private string __from;
  private string _to;
  private MIDType _toType;
  private string _id;
  private long _createdTime;
  private long _deliveredTime;
  private string _text;
  private Location _location;
  private bool _hasContent;
  private ContentType _contentType;
  private byte[] _contentPreview;
  private Dictionary<string, string> _contentMetadata;
  private long _sessionId;
  private List<string> _chunks;
  private string _relatedMessageId;
  private long _messageRelationType;
  private long _readCount;
  private long _relatedMessageServiceCode;

  public string _from
  {
    get
    {
      return __from;
    }
    set
    {
      __isset._from = true;
      this.__from = value;
    }
  }

  public string To
  {
    get
    {
      return _to;
    }
    set
    {
      __isset.to = true;
      this._to = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="MIDType"/>
  /// </summary>
  public MIDType ToType
  {
    get
    {
      return _toType;
    }
    set
    {
      __isset.toType = true;
      this._toType = value;
    }
  }

  public string Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
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

  public long DeliveredTime
  {
    get
    {
      return _deliveredTime;
    }
    set
    {
      __isset.deliveredTime = true;
      this._deliveredTime = value;
    }
  }

  public string Text
  {
    get
    {
      return _text;
    }
    set
    {
      __isset.text = true;
      this._text = value;
    }
  }

  public Location Location
  {
    get
    {
      return _location;
    }
    set
    {
      __isset.location = true;
      this._location = value;
    }
  }

  public bool HasContent
  {
    get
    {
      return _hasContent;
    }
    set
    {
      __isset.hasContent = true;
      this._hasContent = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ContentType"/>
  /// </summary>
  public ContentType ContentType
  {
    get
    {
      return _contentType;
    }
    set
    {
      __isset.contentType = true;
      this._contentType = value;
    }
  }

  public byte[] ContentPreview
  {
    get
    {
      return _contentPreview;
    }
    set
    {
      __isset.contentPreview = true;
      this._contentPreview = value;
    }
  }

  public Dictionary<string, string> ContentMetadata
  {
    get
    {
      return _contentMetadata;
    }
    set
    {
      __isset.contentMetadata = true;
      this._contentMetadata = value;
    }
  }

  public long SessionId
  {
    get
    {
      return _sessionId;
    }
    set
    {
      __isset.sessionId = true;
      this._sessionId = value;
    }
  }

  public List<string> Chunks
  {
    get
    {
      return _chunks;
    }
    set
    {
      __isset.chunks = true;
      this._chunks = value;
    }
  }

  public string RelatedMessageId
  {
    get
    {
      return _relatedMessageId;
    }
    set
    {
      __isset.relatedMessageId = true;
      this._relatedMessageId = value;
    }
  }

  public long MessageRelationType
  {
    get
    {
      return _messageRelationType;
    }
    set
    {
      __isset.messageRelationType = true;
      this._messageRelationType = value;
    }
  }

  public long ReadCount
  {
    get
    {
      return _readCount;
    }
    set
    {
      __isset.readCount = true;
      this._readCount = value;
    }
  }

  public long RelatedMessageServiceCode
  {
    get
    {
      return _relatedMessageServiceCode;
    }
    set
    {
      __isset.relatedMessageServiceCode = true;
      this._relatedMessageServiceCode = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool _from;
    public bool to;
    public bool toType;
    public bool id;
    public bool createdTime;
    public bool deliveredTime;
    public bool text;
    public bool location;
    public bool hasContent;
    public bool contentType;
    public bool contentPreview;
    public bool contentMetadata;
    public bool sessionId;
    public bool chunks;
    public bool relatedMessageId;
    public bool messageRelationType;
    public bool readCount;
    public bool relatedMessageServiceCode;
  }

  public Message() {
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
              _from = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              To = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              ToType = (MIDType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Id = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I64) {
              CreatedTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I64) {
              DeliveredTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              Text = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.Struct) {
              Location = new Location();
              Location.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 14:
            if (field.Type == TType.Bool) {
              HasContent = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 15:
            if (field.Type == TType.I32) {
              ContentType = (ContentType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 17:
            if (field.Type == TType.String) {
              ContentPreview = iprot.ReadBinary();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 18:
            if (field.Type == TType.Map) {
              {
                ContentMetadata = new Dictionary<string, string>();
                TMap _map8 = iprot.ReadMapBegin();
                for( int _i9 = 0; _i9 < _map8.Count; ++_i9)
                {
                  string _key10;
                  string _val11;
                  _key10 = iprot.ReadString();
                  _val11 = iprot.ReadString();
                  ContentMetadata[_key10] = _val11;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 19:
            if (field.Type == TType.I64) {
              SessionId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.List) {
              {
                Chunks = new List<string>();
                TList _list12 = iprot.ReadListBegin();
                for( int _i13 = 0; _i13 < _list12.Count; ++_i13)
                {
                  string _elem14;
                  _elem14 = iprot.ReadString();
                  Chunks.Add(_elem14);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 21:
            if (field.Type == TType.String) {
              RelatedMessageId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.I64) {
              MessageRelationType = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 23:
            if (field.Type == TType.I64) {
              ReadCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 24:
            if (field.Type == TType.I64) {
              RelatedMessageServiceCode = iprot.ReadI64();
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
      TStruct struc = new TStruct("Message");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (_from != null && __isset._from) {
        field.Name = "_from";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(_from);
        oprot.WriteFieldEnd();
      }
      if (To != null && __isset.to) {
        field.Name = "to";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(To);
        oprot.WriteFieldEnd();
      }
      if (__isset.toType) {
        field.Name = "toType";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ToType);
        oprot.WriteFieldEnd();
      }
      if (Id != null && __isset.id) {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.createdTime) {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreatedTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.deliveredTime) {
        field.Name = "deliveredTime";
        field.Type = TType.I64;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(DeliveredTime);
        oprot.WriteFieldEnd();
      }
      if (Text != null && __isset.text) {
        field.Name = "text";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Text);
        oprot.WriteFieldEnd();
      }
      if (Location != null && __isset.location) {
        field.Name = "location";
        field.Type = TType.Struct;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        Location.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.hasContent) {
        field.Name = "hasContent";
        field.Type = TType.Bool;
        field.ID = 14;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasContent);
        oprot.WriteFieldEnd();
      }
      if (__isset.contentType) {
        field.Name = "contentType";
        field.Type = TType.I32;
        field.ID = 15;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ContentType);
        oprot.WriteFieldEnd();
      }
      if (ContentPreview != null && __isset.contentPreview) {
        field.Name = "contentPreview";
        field.Type = TType.String;
        field.ID = 17;
        oprot.WriteFieldBegin(field);
        oprot.WriteBinary(ContentPreview);
        oprot.WriteFieldEnd();
      }
      if (ContentMetadata != null && __isset.contentMetadata) {
        field.Name = "contentMetadata";
        field.Type = TType.Map;
        field.ID = 18;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, ContentMetadata.Count));
          foreach (string _iter15 in ContentMetadata.Keys)
          {
            oprot.WriteString(_iter15);
            oprot.WriteString(ContentMetadata[_iter15]);
          }
          oprot.WriteMapEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (__isset.sessionId) {
        field.Name = "sessionId";
        field.Type = TType.I64;
        field.ID = 19;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(SessionId);
        oprot.WriteFieldEnd();
      }
      if (Chunks != null && __isset.chunks) {
        field.Name = "chunks";
        field.Type = TType.List;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, Chunks.Count));
          foreach (string _iter16 in Chunks)
          {
            oprot.WriteString(_iter16);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (RelatedMessageId != null && __isset.relatedMessageId) {
        field.Name = "relatedMessageId";
        field.Type = TType.String;
        field.ID = 21;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RelatedMessageId);
        oprot.WriteFieldEnd();
      }
      if (__isset.messageRelationType) {
        field.Name = "messageRelationType";
        field.Type = TType.I64;
        field.ID = 22;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(MessageRelationType);
        oprot.WriteFieldEnd();
      }
      if (__isset.readCount) {
        field.Name = "readCount";
        field.Type = TType.I64;
        field.ID = 23;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ReadCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.relatedMessageServiceCode) {
        field.Name = "relatedMessageServiceCode";
        field.Type = TType.I64;
        field.ID = 24;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(RelatedMessageServiceCode);
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
    StringBuilder __sb = new StringBuilder("Message(");
    bool __first = true;
    if (_from != null && __isset._from) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("_from: ");
      __sb.Append(_from);
    }
    if (To != null && __isset.to) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("To: ");
      __sb.Append(To);
    }
    if (__isset.toType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ToType: ");
      __sb.Append(ToType);
    }
    if (Id != null && __isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id);
    }
    if (__isset.createdTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedTime: ");
      __sb.Append(CreatedTime);
    }
    if (__isset.deliveredTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DeliveredTime: ");
      __sb.Append(DeliveredTime);
    }
    if (Text != null && __isset.text) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Text: ");
      __sb.Append(Text);
    }
    if (Location != null && __isset.location) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Location: ");
      __sb.Append(Location== null ? "<null>" : Location.ToString());
    }
    if (__isset.hasContent) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasContent: ");
      __sb.Append(HasContent);
    }
    if (__isset.contentType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ContentType: ");
      __sb.Append(ContentType);
    }
    if (ContentPreview != null && __isset.contentPreview) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ContentPreview: ");
      __sb.Append(ContentPreview);
    }
    if (ContentMetadata != null && __isset.contentMetadata) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ContentMetadata: ");
      __sb.Append(ContentMetadata);
    }
    if (__isset.sessionId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SessionId: ");
      __sb.Append(SessionId);
    }
    if (Chunks != null && __isset.chunks) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Chunks: ");
      __sb.Append(Chunks);
    }
    if (RelatedMessageId != null && __isset.relatedMessageId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RelatedMessageId: ");
      __sb.Append(RelatedMessageId);
    }
    if (__isset.messageRelationType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MessageRelationType: ");
      __sb.Append(MessageRelationType);
    }
    if (__isset.readCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReadCount: ");
      __sb.Append(ReadCount);
    }
    if (__isset.relatedMessageServiceCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RelatedMessageServiceCode: ");
      __sb.Append(RelatedMessageServiceCode);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

