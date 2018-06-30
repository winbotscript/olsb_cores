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
public partial class Profile : TBase
{
  private string _mid;
  private string _userid;
  private string _phone;
  private string _email;
  private string _regionCode;
  private string _displayName;
  private string _phoneticName;
  private string _pictureStatus;
  private string _thumbnailUrl;
  private string _statusMessage;
  private bool _allowSearchByUserid;
  private bool _allowSearchByEmail;
  private string _picturePath;
  private string _musicProfile;

  public string Mid
  {
    get
    {
      return _mid;
    }
    set
    {
      __isset.mid = true;
      this._mid = value;
    }
  }

  public string Userid
  {
    get
    {
      return _userid;
    }
    set
    {
      __isset.userid = true;
      this._userid = value;
    }
  }

  public string Phone
  {
    get
    {
      return _phone;
    }
    set
    {
      __isset.phone = true;
      this._phone = value;
    }
  }

  public string Email
  {
    get
    {
      return _email;
    }
    set
    {
      __isset.email = true;
      this._email = value;
    }
  }

  public string RegionCode
  {
    get
    {
      return _regionCode;
    }
    set
    {
      __isset.regionCode = true;
      this._regionCode = value;
    }
  }

  public string DisplayName
  {
    get
    {
      return _displayName;
    }
    set
    {
      __isset.displayName = true;
      this._displayName = value;
    }
  }

  public string PhoneticName
  {
    get
    {
      return _phoneticName;
    }
    set
    {
      __isset.phoneticName = true;
      this._phoneticName = value;
    }
  }

  public string PictureStatus
  {
    get
    {
      return _pictureStatus;
    }
    set
    {
      __isset.pictureStatus = true;
      this._pictureStatus = value;
    }
  }

  public string ThumbnailUrl
  {
    get
    {
      return _thumbnailUrl;
    }
    set
    {
      __isset.thumbnailUrl = true;
      this._thumbnailUrl = value;
    }
  }

  public string StatusMessage
  {
    get
    {
      return _statusMessage;
    }
    set
    {
      __isset.statusMessage = true;
      this._statusMessage = value;
    }
  }

  public bool AllowSearchByUserid
  {
    get
    {
      return _allowSearchByUserid;
    }
    set
    {
      __isset.allowSearchByUserid = true;
      this._allowSearchByUserid = value;
    }
  }

  public bool AllowSearchByEmail
  {
    get
    {
      return _allowSearchByEmail;
    }
    set
    {
      __isset.allowSearchByEmail = true;
      this._allowSearchByEmail = value;
    }
  }

  public string PicturePath
  {
    get
    {
      return _picturePath;
    }
    set
    {
      __isset.picturePath = true;
      this._picturePath = value;
    }
  }

  public string MusicProfile
  {
    get
    {
      return _musicProfile;
    }
    set
    {
      __isset.musicProfile = true;
      this._musicProfile = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool mid;
    public bool userid;
    public bool phone;
    public bool email;
    public bool regionCode;
    public bool displayName;
    public bool phoneticName;
    public bool pictureStatus;
    public bool thumbnailUrl;
    public bool statusMessage;
    public bool allowSearchByUserid;
    public bool allowSearchByEmail;
    public bool picturePath;
    public bool musicProfile;
  }

  public Profile() {
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
              Mid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Userid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              Phone = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.String) {
              Email = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              RegionCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.String) {
              DisplayName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 21:
            if (field.Type == TType.String) {
              PhoneticName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.String) {
              PictureStatus = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 23:
            if (field.Type == TType.String) {
              ThumbnailUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 24:
            if (field.Type == TType.String) {
              StatusMessage = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 31:
            if (field.Type == TType.Bool) {
              AllowSearchByUserid = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 32:
            if (field.Type == TType.Bool) {
              AllowSearchByEmail = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 33:
            if (field.Type == TType.String) {
              PicturePath = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 34:
            if (field.Type == TType.String) {
              MusicProfile = iprot.ReadString();
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
      TStruct struc = new TStruct("Profile");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Mid != null && __isset.mid) {
        field.Name = "mid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Mid);
        oprot.WriteFieldEnd();
      }
      if (Userid != null && __isset.userid) {
        field.Name = "userid";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Userid);
        oprot.WriteFieldEnd();
      }
      if (Phone != null && __isset.phone) {
        field.Name = "phone";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Phone);
        oprot.WriteFieldEnd();
      }
      if (Email != null && __isset.email) {
        field.Name = "email";
        field.Type = TType.String;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Email);
        oprot.WriteFieldEnd();
      }
      if (RegionCode != null && __isset.regionCode) {
        field.Name = "regionCode";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RegionCode);
        oprot.WriteFieldEnd();
      }
      if (DisplayName != null && __isset.displayName) {
        field.Name = "displayName";
        field.Type = TType.String;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DisplayName);
        oprot.WriteFieldEnd();
      }
      if (PhoneticName != null && __isset.phoneticName) {
        field.Name = "phoneticName";
        field.Type = TType.String;
        field.ID = 21;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(PhoneticName);
        oprot.WriteFieldEnd();
      }
      if (PictureStatus != null && __isset.pictureStatus) {
        field.Name = "pictureStatus";
        field.Type = TType.String;
        field.ID = 22;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(PictureStatus);
        oprot.WriteFieldEnd();
      }
      if (ThumbnailUrl != null && __isset.thumbnailUrl) {
        field.Name = "thumbnailUrl";
        field.Type = TType.String;
        field.ID = 23;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ThumbnailUrl);
        oprot.WriteFieldEnd();
      }
      if (StatusMessage != null && __isset.statusMessage) {
        field.Name = "statusMessage";
        field.Type = TType.String;
        field.ID = 24;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(StatusMessage);
        oprot.WriteFieldEnd();
      }
      if (__isset.allowSearchByUserid) {
        field.Name = "allowSearchByUserid";
        field.Type = TType.Bool;
        field.ID = 31;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(AllowSearchByUserid);
        oprot.WriteFieldEnd();
      }
      if (__isset.allowSearchByEmail) {
        field.Name = "allowSearchByEmail";
        field.Type = TType.Bool;
        field.ID = 32;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(AllowSearchByEmail);
        oprot.WriteFieldEnd();
      }
      if (PicturePath != null && __isset.picturePath) {
        field.Name = "picturePath";
        field.Type = TType.String;
        field.ID = 33;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(PicturePath);
        oprot.WriteFieldEnd();
      }
      if (MusicProfile != null && __isset.musicProfile) {
        field.Name = "musicProfile";
        field.Type = TType.String;
        field.ID = 34;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MusicProfile);
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
    StringBuilder __sb = new StringBuilder("Profile(");
    bool __first = true;
    if (Mid != null && __isset.mid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Mid: ");
      __sb.Append(Mid);
    }
    if (Userid != null && __isset.userid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Userid: ");
      __sb.Append(Userid);
    }
    if (Phone != null && __isset.phone) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Phone: ");
      __sb.Append(Phone);
    }
    if (Email != null && __isset.email) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Email: ");
      __sb.Append(Email);
    }
    if (RegionCode != null && __isset.regionCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RegionCode: ");
      __sb.Append(RegionCode);
    }
    if (DisplayName != null && __isset.displayName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DisplayName: ");
      __sb.Append(DisplayName);
    }
    if (PhoneticName != null && __isset.phoneticName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PhoneticName: ");
      __sb.Append(PhoneticName);
    }
    if (PictureStatus != null && __isset.pictureStatus) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PictureStatus: ");
      __sb.Append(PictureStatus);
    }
    if (ThumbnailUrl != null && __isset.thumbnailUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ThumbnailUrl: ");
      __sb.Append(ThumbnailUrl);
    }
    if (StatusMessage != null && __isset.statusMessage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("StatusMessage: ");
      __sb.Append(StatusMessage);
    }
    if (__isset.allowSearchByUserid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AllowSearchByUserid: ");
      __sb.Append(AllowSearchByUserid);
    }
    if (__isset.allowSearchByEmail) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AllowSearchByEmail: ");
      __sb.Append(AllowSearchByEmail);
    }
    if (PicturePath != null && __isset.picturePath) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PicturePath: ");
      __sb.Append(PicturePath);
    }
    if (MusicProfile != null && __isset.musicProfile) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MusicProfile: ");
      __sb.Append(MusicProfile);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

