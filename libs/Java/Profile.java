/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class Profile implements org.apache.thrift.TBase<Profile, Profile._Fields>, java.io.Serializable, Cloneable, Comparable<Profile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Profile");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USERID_FIELD_DESC = new org.apache.thrift.protocol.TField("userid", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField REGION_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("regionCode", org.apache.thrift.protocol.TType.STRING, (short)12);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)20);
  private static final org.apache.thrift.protocol.TField PHONETIC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("phoneticName", org.apache.thrift.protocol.TType.STRING, (short)21);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)22);
  private static final org.apache.thrift.protocol.TField THUMBNAIL_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("thumbnailUrl", org.apache.thrift.protocol.TType.STRING, (short)23);
  private static final org.apache.thrift.protocol.TField STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusMessage", org.apache.thrift.protocol.TType.STRING, (short)24);
  private static final org.apache.thrift.protocol.TField ALLOW_SEARCH_BY_USERID_FIELD_DESC = new org.apache.thrift.protocol.TField("allowSearchByUserid", org.apache.thrift.protocol.TType.BOOL, (short)31);
  private static final org.apache.thrift.protocol.TField ALLOW_SEARCH_BY_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("allowSearchByEmail", org.apache.thrift.protocol.TType.BOOL, (short)32);
  private static final org.apache.thrift.protocol.TField PICTURE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("picturePath", org.apache.thrift.protocol.TType.STRING, (short)33);
  private static final org.apache.thrift.protocol.TField MUSIC_PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("musicProfile", org.apache.thrift.protocol.TType.STRING, (short)34);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProfileStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProfileTupleSchemeFactory();

  public java.lang.String mid; // required
  public java.lang.String userid; // required
  public java.lang.String phone; // required
  public java.lang.String email; // required
  public java.lang.String regionCode; // required
  public java.lang.String displayName; // required
  public java.lang.String phoneticName; // required
  public java.lang.String pictureStatus; // required
  public java.lang.String thumbnailUrl; // required
  public java.lang.String statusMessage; // required
  public boolean allowSearchByUserid; // required
  public boolean allowSearchByEmail; // required
  public java.lang.String picturePath; // required
  public java.lang.String musicProfile; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    USERID((short)3, "userid"),
    PHONE((short)10, "phone"),
    EMAIL((short)11, "email"),
    REGION_CODE((short)12, "regionCode"),
    DISPLAY_NAME((short)20, "displayName"),
    PHONETIC_NAME((short)21, "phoneticName"),
    PICTURE_STATUS((short)22, "pictureStatus"),
    THUMBNAIL_URL((short)23, "thumbnailUrl"),
    STATUS_MESSAGE((short)24, "statusMessage"),
    ALLOW_SEARCH_BY_USERID((short)31, "allowSearchByUserid"),
    ALLOW_SEARCH_BY_EMAIL((short)32, "allowSearchByEmail"),
    PICTURE_PATH((short)33, "picturePath"),
    MUSIC_PROFILE((short)34, "musicProfile");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MID
          return MID;
        case 3: // USERID
          return USERID;
        case 10: // PHONE
          return PHONE;
        case 11: // EMAIL
          return EMAIL;
        case 12: // REGION_CODE
          return REGION_CODE;
        case 20: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 21: // PHONETIC_NAME
          return PHONETIC_NAME;
        case 22: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 23: // THUMBNAIL_URL
          return THUMBNAIL_URL;
        case 24: // STATUS_MESSAGE
          return STATUS_MESSAGE;
        case 31: // ALLOW_SEARCH_BY_USERID
          return ALLOW_SEARCH_BY_USERID;
        case 32: // ALLOW_SEARCH_BY_EMAIL
          return ALLOW_SEARCH_BY_EMAIL;
        case 33: // PICTURE_PATH
          return PICTURE_PATH;
        case 34: // MUSIC_PROFILE
          return MUSIC_PROFILE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ALLOWSEARCHBYUSERID_ISSET_ID = 0;
  private static final int __ALLOWSEARCHBYEMAIL_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USERID, new org.apache.thrift.meta_data.FieldMetaData("userid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REGION_CODE, new org.apache.thrift.meta_data.FieldMetaData("regionCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONETIC_NAME, new org.apache.thrift.meta_data.FieldMetaData("phoneticName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("pictureStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THUMBNAIL_URL, new org.apache.thrift.meta_data.FieldMetaData("thumbnailUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("statusMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ALLOW_SEARCH_BY_USERID, new org.apache.thrift.meta_data.FieldMetaData("allowSearchByUserid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ALLOW_SEARCH_BY_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("allowSearchByEmail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PICTURE_PATH, new org.apache.thrift.meta_data.FieldMetaData("picturePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MUSIC_PROFILE, new org.apache.thrift.meta_data.FieldMetaData("musicProfile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Profile.class, metaDataMap);
  }

  public Profile() {
  }

  public Profile(
    java.lang.String mid,
    java.lang.String userid,
    java.lang.String phone,
    java.lang.String email,
    java.lang.String regionCode,
    java.lang.String displayName,
    java.lang.String phoneticName,
    java.lang.String pictureStatus,
    java.lang.String thumbnailUrl,
    java.lang.String statusMessage,
    boolean allowSearchByUserid,
    boolean allowSearchByEmail,
    java.lang.String picturePath,
    java.lang.String musicProfile)
  {
    this();
    this.mid = mid;
    this.userid = userid;
    this.phone = phone;
    this.email = email;
    this.regionCode = regionCode;
    this.displayName = displayName;
    this.phoneticName = phoneticName;
    this.pictureStatus = pictureStatus;
    this.thumbnailUrl = thumbnailUrl;
    this.statusMessage = statusMessage;
    this.allowSearchByUserid = allowSearchByUserid;
    setAllowSearchByUseridIsSet(true);
    this.allowSearchByEmail = allowSearchByEmail;
    setAllowSearchByEmailIsSet(true);
    this.picturePath = picturePath;
    this.musicProfile = musicProfile;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Profile(Profile other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetUserid()) {
      this.userid = other.userid;
    }
    if (other.isSetPhone()) {
      this.phone = other.phone;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetRegionCode()) {
      this.regionCode = other.regionCode;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetPhoneticName()) {
      this.phoneticName = other.phoneticName;
    }
    if (other.isSetPictureStatus()) {
      this.pictureStatus = other.pictureStatus;
    }
    if (other.isSetThumbnailUrl()) {
      this.thumbnailUrl = other.thumbnailUrl;
    }
    if (other.isSetStatusMessage()) {
      this.statusMessage = other.statusMessage;
    }
    this.allowSearchByUserid = other.allowSearchByUserid;
    this.allowSearchByEmail = other.allowSearchByEmail;
    if (other.isSetPicturePath()) {
      this.picturePath = other.picturePath;
    }
    if (other.isSetMusicProfile()) {
      this.musicProfile = other.musicProfile;
    }
  }

  public Profile deepCopy() {
    return new Profile(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    this.userid = null;
    this.phone = null;
    this.email = null;
    this.regionCode = null;
    this.displayName = null;
    this.phoneticName = null;
    this.pictureStatus = null;
    this.thumbnailUrl = null;
    this.statusMessage = null;
    setAllowSearchByUseridIsSet(false);
    this.allowSearchByUserid = false;
    setAllowSearchByEmailIsSet(false);
    this.allowSearchByEmail = false;
    this.picturePath = null;
    this.musicProfile = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public Profile setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public java.lang.String getUserid() {
    return this.userid;
  }

  public Profile setUserid(java.lang.String userid) {
    this.userid = userid;
    return this;
  }

  public void unsetUserid() {
    this.userid = null;
  }

  /** Returns true if field userid is set (has been assigned a value) and false otherwise */
  public boolean isSetUserid() {
    return this.userid != null;
  }

  public void setUseridIsSet(boolean value) {
    if (!value) {
      this.userid = null;
    }
  }

  public java.lang.String getPhone() {
    return this.phone;
  }

  public Profile setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  public void unsetPhone() {
    this.phone = null;
  }

  /** Returns true if field phone is set (has been assigned a value) and false otherwise */
  public boolean isSetPhone() {
    return this.phone != null;
  }

  public void setPhoneIsSet(boolean value) {
    if (!value) {
      this.phone = null;
    }
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public Profile setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public java.lang.String getRegionCode() {
    return this.regionCode;
  }

  public Profile setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  public void unsetRegionCode() {
    this.regionCode = null;
  }

  /** Returns true if field regionCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRegionCode() {
    return this.regionCode != null;
  }

  public void setRegionCodeIsSet(boolean value) {
    if (!value) {
      this.regionCode = null;
    }
  }

  public java.lang.String getDisplayName() {
    return this.displayName;
  }

  public Profile setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public java.lang.String getPhoneticName() {
    return this.phoneticName;
  }

  public Profile setPhoneticName(java.lang.String phoneticName) {
    this.phoneticName = phoneticName;
    return this;
  }

  public void unsetPhoneticName() {
    this.phoneticName = null;
  }

  /** Returns true if field phoneticName is set (has been assigned a value) and false otherwise */
  public boolean isSetPhoneticName() {
    return this.phoneticName != null;
  }

  public void setPhoneticNameIsSet(boolean value) {
    if (!value) {
      this.phoneticName = null;
    }
  }

  public java.lang.String getPictureStatus() {
    return this.pictureStatus;
  }

  public Profile setPictureStatus(java.lang.String pictureStatus) {
    this.pictureStatus = pictureStatus;
    return this;
  }

  public void unsetPictureStatus() {
    this.pictureStatus = null;
  }

  /** Returns true if field pictureStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureStatus() {
    return this.pictureStatus != null;
  }

  public void setPictureStatusIsSet(boolean value) {
    if (!value) {
      this.pictureStatus = null;
    }
  }

  public java.lang.String getThumbnailUrl() {
    return this.thumbnailUrl;
  }

  public Profile setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  public void unsetThumbnailUrl() {
    this.thumbnailUrl = null;
  }

  /** Returns true if field thumbnailUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetThumbnailUrl() {
    return this.thumbnailUrl != null;
  }

  public void setThumbnailUrlIsSet(boolean value) {
    if (!value) {
      this.thumbnailUrl = null;
    }
  }

  public java.lang.String getStatusMessage() {
    return this.statusMessage;
  }

  public Profile setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public void unsetStatusMessage() {
    this.statusMessage = null;
  }

  /** Returns true if field statusMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusMessage() {
    return this.statusMessage != null;
  }

  public void setStatusMessageIsSet(boolean value) {
    if (!value) {
      this.statusMessage = null;
    }
  }

  public boolean isAllowSearchByUserid() {
    return this.allowSearchByUserid;
  }

  public Profile setAllowSearchByUserid(boolean allowSearchByUserid) {
    this.allowSearchByUserid = allowSearchByUserid;
    setAllowSearchByUseridIsSet(true);
    return this;
  }

  public void unsetAllowSearchByUserid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOWSEARCHBYUSERID_ISSET_ID);
  }

  /** Returns true if field allowSearchByUserid is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowSearchByUserid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOWSEARCHBYUSERID_ISSET_ID);
  }

  public void setAllowSearchByUseridIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOWSEARCHBYUSERID_ISSET_ID, value);
  }

  public boolean isAllowSearchByEmail() {
    return this.allowSearchByEmail;
  }

  public Profile setAllowSearchByEmail(boolean allowSearchByEmail) {
    this.allowSearchByEmail = allowSearchByEmail;
    setAllowSearchByEmailIsSet(true);
    return this;
  }

  public void unsetAllowSearchByEmail() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALLOWSEARCHBYEMAIL_ISSET_ID);
  }

  /** Returns true if field allowSearchByEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetAllowSearchByEmail() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALLOWSEARCHBYEMAIL_ISSET_ID);
  }

  public void setAllowSearchByEmailIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALLOWSEARCHBYEMAIL_ISSET_ID, value);
  }

  public java.lang.String getPicturePath() {
    return this.picturePath;
  }

  public Profile setPicturePath(java.lang.String picturePath) {
    this.picturePath = picturePath;
    return this;
  }

  public void unsetPicturePath() {
    this.picturePath = null;
  }

  /** Returns true if field picturePath is set (has been assigned a value) and false otherwise */
  public boolean isSetPicturePath() {
    return this.picturePath != null;
  }

  public void setPicturePathIsSet(boolean value) {
    if (!value) {
      this.picturePath = null;
    }
  }

  public java.lang.String getMusicProfile() {
    return this.musicProfile;
  }

  public Profile setMusicProfile(java.lang.String musicProfile) {
    this.musicProfile = musicProfile;
    return this;
  }

  public void unsetMusicProfile() {
    this.musicProfile = null;
  }

  /** Returns true if field musicProfile is set (has been assigned a value) and false otherwise */
  public boolean isSetMusicProfile() {
    return this.musicProfile != null;
  }

  public void setMusicProfileIsSet(boolean value) {
    if (!value) {
      this.musicProfile = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((java.lang.String)value);
      }
      break;

    case USERID:
      if (value == null) {
        unsetUserid();
      } else {
        setUserid((java.lang.String)value);
      }
      break;

    case PHONE:
      if (value == null) {
        unsetPhone();
      } else {
        setPhone((java.lang.String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.String)value);
      }
      break;

    case REGION_CODE:
      if (value == null) {
        unsetRegionCode();
      } else {
        setRegionCode((java.lang.String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((java.lang.String)value);
      }
      break;

    case PHONETIC_NAME:
      if (value == null) {
        unsetPhoneticName();
      } else {
        setPhoneticName((java.lang.String)value);
      }
      break;

    case PICTURE_STATUS:
      if (value == null) {
        unsetPictureStatus();
      } else {
        setPictureStatus((java.lang.String)value);
      }
      break;

    case THUMBNAIL_URL:
      if (value == null) {
        unsetThumbnailUrl();
      } else {
        setThumbnailUrl((java.lang.String)value);
      }
      break;

    case STATUS_MESSAGE:
      if (value == null) {
        unsetStatusMessage();
      } else {
        setStatusMessage((java.lang.String)value);
      }
      break;

    case ALLOW_SEARCH_BY_USERID:
      if (value == null) {
        unsetAllowSearchByUserid();
      } else {
        setAllowSearchByUserid((java.lang.Boolean)value);
      }
      break;

    case ALLOW_SEARCH_BY_EMAIL:
      if (value == null) {
        unsetAllowSearchByEmail();
      } else {
        setAllowSearchByEmail((java.lang.Boolean)value);
      }
      break;

    case PICTURE_PATH:
      if (value == null) {
        unsetPicturePath();
      } else {
        setPicturePath((java.lang.String)value);
      }
      break;

    case MUSIC_PROFILE:
      if (value == null) {
        unsetMusicProfile();
      } else {
        setMusicProfile((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case USERID:
      return getUserid();

    case PHONE:
      return getPhone();

    case EMAIL:
      return getEmail();

    case REGION_CODE:
      return getRegionCode();

    case DISPLAY_NAME:
      return getDisplayName();

    case PHONETIC_NAME:
      return getPhoneticName();

    case PICTURE_STATUS:
      return getPictureStatus();

    case THUMBNAIL_URL:
      return getThumbnailUrl();

    case STATUS_MESSAGE:
      return getStatusMessage();

    case ALLOW_SEARCH_BY_USERID:
      return isAllowSearchByUserid();

    case ALLOW_SEARCH_BY_EMAIL:
      return isAllowSearchByEmail();

    case PICTURE_PATH:
      return getPicturePath();

    case MUSIC_PROFILE:
      return getMusicProfile();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case USERID:
      return isSetUserid();
    case PHONE:
      return isSetPhone();
    case EMAIL:
      return isSetEmail();
    case REGION_CODE:
      return isSetRegionCode();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case PHONETIC_NAME:
      return isSetPhoneticName();
    case PICTURE_STATUS:
      return isSetPictureStatus();
    case THUMBNAIL_URL:
      return isSetThumbnailUrl();
    case STATUS_MESSAGE:
      return isSetStatusMessage();
    case ALLOW_SEARCH_BY_USERID:
      return isSetAllowSearchByUserid();
    case ALLOW_SEARCH_BY_EMAIL:
      return isSetAllowSearchByEmail();
    case PICTURE_PATH:
      return isSetPicturePath();
    case MUSIC_PROFILE:
      return isSetMusicProfile();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Profile)
      return this.equals((Profile)that);
    return false;
  }

  public boolean equals(Profile that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_userid = true && this.isSetUserid();
    boolean that_present_userid = true && that.isSetUserid();
    if (this_present_userid || that_present_userid) {
      if (!(this_present_userid && that_present_userid))
        return false;
      if (!this.userid.equals(that.userid))
        return false;
    }

    boolean this_present_phone = true && this.isSetPhone();
    boolean that_present_phone = true && that.isSetPhone();
    if (this_present_phone || that_present_phone) {
      if (!(this_present_phone && that_present_phone))
        return false;
      if (!this.phone.equals(that.phone))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_regionCode = true && this.isSetRegionCode();
    boolean that_present_regionCode = true && that.isSetRegionCode();
    if (this_present_regionCode || that_present_regionCode) {
      if (!(this_present_regionCode && that_present_regionCode))
        return false;
      if (!this.regionCode.equals(that.regionCode))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_phoneticName = true && this.isSetPhoneticName();
    boolean that_present_phoneticName = true && that.isSetPhoneticName();
    if (this_present_phoneticName || that_present_phoneticName) {
      if (!(this_present_phoneticName && that_present_phoneticName))
        return false;
      if (!this.phoneticName.equals(that.phoneticName))
        return false;
    }

    boolean this_present_pictureStatus = true && this.isSetPictureStatus();
    boolean that_present_pictureStatus = true && that.isSetPictureStatus();
    if (this_present_pictureStatus || that_present_pictureStatus) {
      if (!(this_present_pictureStatus && that_present_pictureStatus))
        return false;
      if (!this.pictureStatus.equals(that.pictureStatus))
        return false;
    }

    boolean this_present_thumbnailUrl = true && this.isSetThumbnailUrl();
    boolean that_present_thumbnailUrl = true && that.isSetThumbnailUrl();
    if (this_present_thumbnailUrl || that_present_thumbnailUrl) {
      if (!(this_present_thumbnailUrl && that_present_thumbnailUrl))
        return false;
      if (!this.thumbnailUrl.equals(that.thumbnailUrl))
        return false;
    }

    boolean this_present_statusMessage = true && this.isSetStatusMessage();
    boolean that_present_statusMessage = true && that.isSetStatusMessage();
    if (this_present_statusMessage || that_present_statusMessage) {
      if (!(this_present_statusMessage && that_present_statusMessage))
        return false;
      if (!this.statusMessage.equals(that.statusMessage))
        return false;
    }

    boolean this_present_allowSearchByUserid = true;
    boolean that_present_allowSearchByUserid = true;
    if (this_present_allowSearchByUserid || that_present_allowSearchByUserid) {
      if (!(this_present_allowSearchByUserid && that_present_allowSearchByUserid))
        return false;
      if (this.allowSearchByUserid != that.allowSearchByUserid)
        return false;
    }

    boolean this_present_allowSearchByEmail = true;
    boolean that_present_allowSearchByEmail = true;
    if (this_present_allowSearchByEmail || that_present_allowSearchByEmail) {
      if (!(this_present_allowSearchByEmail && that_present_allowSearchByEmail))
        return false;
      if (this.allowSearchByEmail != that.allowSearchByEmail)
        return false;
    }

    boolean this_present_picturePath = true && this.isSetPicturePath();
    boolean that_present_picturePath = true && that.isSetPicturePath();
    if (this_present_picturePath || that_present_picturePath) {
      if (!(this_present_picturePath && that_present_picturePath))
        return false;
      if (!this.picturePath.equals(that.picturePath))
        return false;
    }

    boolean this_present_musicProfile = true && this.isSetMusicProfile();
    boolean that_present_musicProfile = true && that.isSetMusicProfile();
    if (this_present_musicProfile || that_present_musicProfile) {
      if (!(this_present_musicProfile && that_present_musicProfile))
        return false;
      if (!this.musicProfile.equals(that.musicProfile))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMid()) ? 131071 : 524287);
    if (isSetMid())
      hashCode = hashCode * 8191 + mid.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserid()) ? 131071 : 524287);
    if (isSetUserid())
      hashCode = hashCode * 8191 + userid.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhone()) ? 131071 : 524287);
    if (isSetPhone())
      hashCode = hashCode * 8191 + phone.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + email.hashCode();

    hashCode = hashCode * 8191 + ((isSetRegionCode()) ? 131071 : 524287);
    if (isSetRegionCode())
      hashCode = hashCode * 8191 + regionCode.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisplayName()) ? 131071 : 524287);
    if (isSetDisplayName())
      hashCode = hashCode * 8191 + displayName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPhoneticName()) ? 131071 : 524287);
    if (isSetPhoneticName())
      hashCode = hashCode * 8191 + phoneticName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPictureStatus()) ? 131071 : 524287);
    if (isSetPictureStatus())
      hashCode = hashCode * 8191 + pictureStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetThumbnailUrl()) ? 131071 : 524287);
    if (isSetThumbnailUrl())
      hashCode = hashCode * 8191 + thumbnailUrl.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatusMessage()) ? 131071 : 524287);
    if (isSetStatusMessage())
      hashCode = hashCode * 8191 + statusMessage.hashCode();

    hashCode = hashCode * 8191 + ((allowSearchByUserid) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((allowSearchByEmail) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetPicturePath()) ? 131071 : 524287);
    if (isSetPicturePath())
      hashCode = hashCode * 8191 + picturePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetMusicProfile()) ? 131071 : 524287);
    if (isSetMusicProfile())
      hashCode = hashCode * 8191 + musicProfile.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Profile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserid()).compareTo(other.isSetUserid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userid, other.userid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPhone()).compareTo(other.isSetPhone());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhone()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phone, other.phone);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRegionCode()).compareTo(other.isSetRegionCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegionCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.regionCode, other.regionCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPhoneticName()).compareTo(other.isSetPhoneticName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhoneticName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phoneticName, other.phoneticName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPictureStatus()).compareTo(other.isSetPictureStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pictureStatus, other.pictureStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetThumbnailUrl()).compareTo(other.isSetThumbnailUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThumbnailUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.thumbnailUrl, other.thumbnailUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatusMessage()).compareTo(other.isSetStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusMessage, other.statusMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAllowSearchByUserid()).compareTo(other.isSetAllowSearchByUserid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowSearchByUserid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allowSearchByUserid, other.allowSearchByUserid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAllowSearchByEmail()).compareTo(other.isSetAllowSearchByEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllowSearchByEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allowSearchByEmail, other.allowSearchByEmail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPicturePath()).compareTo(other.isSetPicturePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicturePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.picturePath, other.picturePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMusicProfile()).compareTo(other.isSetMusicProfile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMusicProfile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.musicProfile, other.musicProfile);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Profile(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userid:");
    if (this.userid == null) {
      sb.append("null");
    } else {
      sb.append(this.userid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phone:");
    if (this.phone == null) {
      sb.append("null");
    } else {
      sb.append(this.phone);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("regionCode:");
    if (this.regionCode == null) {
      sb.append("null");
    } else {
      sb.append(this.regionCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phoneticName:");
    if (this.phoneticName == null) {
      sb.append("null");
    } else {
      sb.append(this.phoneticName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureStatus:");
    if (this.pictureStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("thumbnailUrl:");
    if (this.thumbnailUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.thumbnailUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statusMessage:");
    if (this.statusMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.statusMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("allowSearchByUserid:");
    sb.append(this.allowSearchByUserid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("allowSearchByEmail:");
    sb.append(this.allowSearchByEmail);
    first = false;
    if (!first) sb.append(", ");
    sb.append("picturePath:");
    if (this.picturePath == null) {
      sb.append("null");
    } else {
      sb.append(this.picturePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("musicProfile:");
    if (this.musicProfile == null) {
      sb.append("null");
    } else {
      sb.append(this.musicProfile);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProfileStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileStandardScheme getScheme() {
      return new ProfileStandardScheme();
    }
  }

  private static class ProfileStandardScheme extends org.apache.thrift.scheme.StandardScheme<Profile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USERID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userid = iprot.readString();
              struct.setUseridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // PHONE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phone = iprot.readString();
              struct.setPhoneIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // REGION_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.regionCode = iprot.readString();
              struct.setRegionCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // PHONETIC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phoneticName = iprot.readString();
              struct.setPhoneticNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 23: // THUMBNAIL_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.thumbnailUrl = iprot.readString();
              struct.setThumbnailUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 24: // STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusMessage = iprot.readString();
              struct.setStatusMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // ALLOW_SEARCH_BY_USERID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allowSearchByUserid = iprot.readBool();
              struct.setAllowSearchByUseridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 32: // ALLOW_SEARCH_BY_EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.allowSearchByEmail = iprot.readBool();
              struct.setAllowSearchByEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 33: // PICTURE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picturePath = iprot.readString();
              struct.setPicturePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 34: // MUSIC_PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.musicProfile = iprot.readString();
              struct.setMusicProfileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Profile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.userid != null) {
        oprot.writeFieldBegin(USERID_FIELD_DESC);
        oprot.writeString(struct.userid);
        oprot.writeFieldEnd();
      }
      if (struct.phone != null) {
        oprot.writeFieldBegin(PHONE_FIELD_DESC);
        oprot.writeString(struct.phone);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.regionCode != null) {
        oprot.writeFieldBegin(REGION_CODE_FIELD_DESC);
        oprot.writeString(struct.regionCode);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.phoneticName != null) {
        oprot.writeFieldBegin(PHONETIC_NAME_FIELD_DESC);
        oprot.writeString(struct.phoneticName);
        oprot.writeFieldEnd();
      }
      if (struct.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(struct.pictureStatus);
        oprot.writeFieldEnd();
      }
      if (struct.thumbnailUrl != null) {
        oprot.writeFieldBegin(THUMBNAIL_URL_FIELD_DESC);
        oprot.writeString(struct.thumbnailUrl);
        oprot.writeFieldEnd();
      }
      if (struct.statusMessage != null) {
        oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.statusMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ALLOW_SEARCH_BY_USERID_FIELD_DESC);
      oprot.writeBool(struct.allowSearchByUserid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALLOW_SEARCH_BY_EMAIL_FIELD_DESC);
      oprot.writeBool(struct.allowSearchByEmail);
      oprot.writeFieldEnd();
      if (struct.picturePath != null) {
        oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
        oprot.writeString(struct.picturePath);
        oprot.writeFieldEnd();
      }
      if (struct.musicProfile != null) {
        oprot.writeFieldBegin(MUSIC_PROFILE_FIELD_DESC);
        oprot.writeString(struct.musicProfile);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProfileTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProfileTupleScheme getScheme() {
      return new ProfileTupleScheme();
    }
  }

  private static class ProfileTupleScheme extends org.apache.thrift.scheme.TupleScheme<Profile> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetUserid()) {
        optionals.set(1);
      }
      if (struct.isSetPhone()) {
        optionals.set(2);
      }
      if (struct.isSetEmail()) {
        optionals.set(3);
      }
      if (struct.isSetRegionCode()) {
        optionals.set(4);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(5);
      }
      if (struct.isSetPhoneticName()) {
        optionals.set(6);
      }
      if (struct.isSetPictureStatus()) {
        optionals.set(7);
      }
      if (struct.isSetThumbnailUrl()) {
        optionals.set(8);
      }
      if (struct.isSetStatusMessage()) {
        optionals.set(9);
      }
      if (struct.isSetAllowSearchByUserid()) {
        optionals.set(10);
      }
      if (struct.isSetAllowSearchByEmail()) {
        optionals.set(11);
      }
      if (struct.isSetPicturePath()) {
        optionals.set(12);
      }
      if (struct.isSetMusicProfile()) {
        optionals.set(13);
      }
      oprot.writeBitSet(optionals, 14);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetUserid()) {
        oprot.writeString(struct.userid);
      }
      if (struct.isSetPhone()) {
        oprot.writeString(struct.phone);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetRegionCode()) {
        oprot.writeString(struct.regionCode);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
      if (struct.isSetPhoneticName()) {
        oprot.writeString(struct.phoneticName);
      }
      if (struct.isSetPictureStatus()) {
        oprot.writeString(struct.pictureStatus);
      }
      if (struct.isSetThumbnailUrl()) {
        oprot.writeString(struct.thumbnailUrl);
      }
      if (struct.isSetStatusMessage()) {
        oprot.writeString(struct.statusMessage);
      }
      if (struct.isSetAllowSearchByUserid()) {
        oprot.writeBool(struct.allowSearchByUserid);
      }
      if (struct.isSetAllowSearchByEmail()) {
        oprot.writeBool(struct.allowSearchByEmail);
      }
      if (struct.isSetPicturePath()) {
        oprot.writeString(struct.picturePath);
      }
      if (struct.isSetMusicProfile()) {
        oprot.writeString(struct.musicProfile);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Profile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(14);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.userid = iprot.readString();
        struct.setUseridIsSet(true);
      }
      if (incoming.get(2)) {
        struct.phone = iprot.readString();
        struct.setPhoneIsSet(true);
      }
      if (incoming.get(3)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(4)) {
        struct.regionCode = iprot.readString();
        struct.setRegionCodeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.phoneticName = iprot.readString();
        struct.setPhoneticNameIsSet(true);
      }
      if (incoming.get(7)) {
        struct.pictureStatus = iprot.readString();
        struct.setPictureStatusIsSet(true);
      }
      if (incoming.get(8)) {
        struct.thumbnailUrl = iprot.readString();
        struct.setThumbnailUrlIsSet(true);
      }
      if (incoming.get(9)) {
        struct.statusMessage = iprot.readString();
        struct.setStatusMessageIsSet(true);
      }
      if (incoming.get(10)) {
        struct.allowSearchByUserid = iprot.readBool();
        struct.setAllowSearchByUseridIsSet(true);
      }
      if (incoming.get(11)) {
        struct.allowSearchByEmail = iprot.readBool();
        struct.setAllowSearchByEmailIsSet(true);
      }
      if (incoming.get(12)) {
        struct.picturePath = iprot.readString();
        struct.setPicturePathIsSet(true);
      }
      if (incoming.get(13)) {
        struct.musicProfile = iprot.readString();
        struct.setMusicProfileIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

