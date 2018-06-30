/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class Contact implements org.apache.thrift.TBase<Contact, Contact._Fields>, java.io.Serializable, Cloneable, Comparable<Contact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Contact");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)10);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)11);
  private static final org.apache.thrift.protocol.TField RELATION_FIELD_DESC = new org.apache.thrift.protocol.TField("relation", org.apache.thrift.protocol.TType.I32, (short)21);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)22);
  private static final org.apache.thrift.protocol.TField PHONETIC_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("phoneticName", org.apache.thrift.protocol.TType.STRING, (short)23);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)24);
  private static final org.apache.thrift.protocol.TField THUMBNAIL_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("thumbnailUrl", org.apache.thrift.protocol.TType.STRING, (short)25);
  private static final org.apache.thrift.protocol.TField STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusMessage", org.apache.thrift.protocol.TType.STRING, (short)26);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_OVERRIDDEN_FIELD_DESC = new org.apache.thrift.protocol.TField("displayNameOverridden", org.apache.thrift.protocol.TType.STRING, (short)27);
  private static final org.apache.thrift.protocol.TField FAVORITE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("favoriteTime", org.apache.thrift.protocol.TType.I64, (short)28);
  private static final org.apache.thrift.protocol.TField CAPABLE_VOICE_CALL_FIELD_DESC = new org.apache.thrift.protocol.TField("capableVoiceCall", org.apache.thrift.protocol.TType.BOOL, (short)31);
  private static final org.apache.thrift.protocol.TField CAPABLE_VIDEO_CALL_FIELD_DESC = new org.apache.thrift.protocol.TField("capableVideoCall", org.apache.thrift.protocol.TType.BOOL, (short)32);
  private static final org.apache.thrift.protocol.TField CAPABLE_MYHOME_FIELD_DESC = new org.apache.thrift.protocol.TField("capableMyhome", org.apache.thrift.protocol.TType.BOOL, (short)33);
  private static final org.apache.thrift.protocol.TField CAPABLE_BUDDY_FIELD_DESC = new org.apache.thrift.protocol.TField("capableBuddy", org.apache.thrift.protocol.TType.BOOL, (short)34);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.I32, (short)35);
  private static final org.apache.thrift.protocol.TField SETTINGS_FIELD_DESC = new org.apache.thrift.protocol.TField("settings", org.apache.thrift.protocol.TType.I64, (short)36);
  private static final org.apache.thrift.protocol.TField PICTURE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("picturePath", org.apache.thrift.protocol.TType.STRING, (short)37);
  private static final org.apache.thrift.protocol.TField RECOMMEND_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendParams", org.apache.thrift.protocol.TType.STRING, (short)38);
  private static final org.apache.thrift.protocol.TField FRIEND_REQUEST_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("friendRequestStatus", org.apache.thrift.protocol.TType.I32, (short)39);
  private static final org.apache.thrift.protocol.TField MUSIC_PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("musicProfile", org.apache.thrift.protocol.TType.STRING, (short)40);
  private static final org.apache.thrift.protocol.TField VIDEO_PROFILE_FIELD_DESC = new org.apache.thrift.protocol.TField("videoProfile", org.apache.thrift.protocol.TType.STRING, (short)42);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ContactStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ContactTupleSchemeFactory();

  public java.lang.String mid; // required
  public long createdTime; // required
  /**
   * 
   * @see ContactType
   */
  public ContactType type; // required
  /**
   * 
   * @see ContactStatus
   */
  public ContactStatus status; // required
  /**
   * 
   * @see ContactRelation
   */
  public ContactRelation relation; // required
  public java.lang.String displayName; // required
  public java.lang.String phoneticName; // required
  public java.lang.String pictureStatus; // required
  public java.lang.String thumbnailUrl; // required
  public java.lang.String statusMessage; // required
  public java.lang.String displayNameOverridden; // required
  public long favoriteTime; // required
  public boolean capableVoiceCall; // required
  public boolean capableVideoCall; // required
  public boolean capableMyhome; // required
  public boolean capableBuddy; // required
  public int attributes; // required
  public long settings; // required
  public java.lang.String picturePath; // required
  public java.lang.String recommendParams; // required
  public int friendRequestStatus; // required
  public java.lang.String musicProfile; // required
  public java.lang.String videoProfile; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    CREATED_TIME((short)2, "createdTime"),
    /**
     * 
     * @see ContactType
     */
    TYPE((short)10, "type"),
    /**
     * 
     * @see ContactStatus
     */
    STATUS((short)11, "status"),
    /**
     * 
     * @see ContactRelation
     */
    RELATION((short)21, "relation"),
    DISPLAY_NAME((short)22, "displayName"),
    PHONETIC_NAME((short)23, "phoneticName"),
    PICTURE_STATUS((short)24, "pictureStatus"),
    THUMBNAIL_URL((short)25, "thumbnailUrl"),
    STATUS_MESSAGE((short)26, "statusMessage"),
    DISPLAY_NAME_OVERRIDDEN((short)27, "displayNameOverridden"),
    FAVORITE_TIME((short)28, "favoriteTime"),
    CAPABLE_VOICE_CALL((short)31, "capableVoiceCall"),
    CAPABLE_VIDEO_CALL((short)32, "capableVideoCall"),
    CAPABLE_MYHOME((short)33, "capableMyhome"),
    CAPABLE_BUDDY((short)34, "capableBuddy"),
    ATTRIBUTES((short)35, "attributes"),
    SETTINGS((short)36, "settings"),
    PICTURE_PATH((short)37, "picturePath"),
    RECOMMEND_PARAMS((short)38, "recommendParams"),
    FRIEND_REQUEST_STATUS((short)39, "friendRequestStatus"),
    MUSIC_PROFILE((short)40, "musicProfile"),
    VIDEO_PROFILE((short)42, "videoProfile");

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
        case 2: // CREATED_TIME
          return CREATED_TIME;
        case 10: // TYPE
          return TYPE;
        case 11: // STATUS
          return STATUS;
        case 21: // RELATION
          return RELATION;
        case 22: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 23: // PHONETIC_NAME
          return PHONETIC_NAME;
        case 24: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 25: // THUMBNAIL_URL
          return THUMBNAIL_URL;
        case 26: // STATUS_MESSAGE
          return STATUS_MESSAGE;
        case 27: // DISPLAY_NAME_OVERRIDDEN
          return DISPLAY_NAME_OVERRIDDEN;
        case 28: // FAVORITE_TIME
          return FAVORITE_TIME;
        case 31: // CAPABLE_VOICE_CALL
          return CAPABLE_VOICE_CALL;
        case 32: // CAPABLE_VIDEO_CALL
          return CAPABLE_VIDEO_CALL;
        case 33: // CAPABLE_MYHOME
          return CAPABLE_MYHOME;
        case 34: // CAPABLE_BUDDY
          return CAPABLE_BUDDY;
        case 35: // ATTRIBUTES
          return ATTRIBUTES;
        case 36: // SETTINGS
          return SETTINGS;
        case 37: // PICTURE_PATH
          return PICTURE_PATH;
        case 38: // RECOMMEND_PARAMS
          return RECOMMEND_PARAMS;
        case 39: // FRIEND_REQUEST_STATUS
          return FRIEND_REQUEST_STATUS;
        case 40: // MUSIC_PROFILE
          return MUSIC_PROFILE;
        case 42: // VIDEO_PROFILE
          return VIDEO_PROFILE;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __FAVORITETIME_ISSET_ID = 1;
  private static final int __CAPABLEVOICECALL_ISSET_ID = 2;
  private static final int __CAPABLEVIDEOCALL_ISSET_ID = 3;
  private static final int __CAPABLEMYHOME_ISSET_ID = 4;
  private static final int __CAPABLEBUDDY_ISSET_ID = 5;
  private static final int __ATTRIBUTES_ISSET_ID = 6;
  private static final int __SETTINGS_ISSET_ID = 7;
  private static final int __FRIENDREQUESTSTATUS_ISSET_ID = 8;
  private short __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContactType.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContactStatus.class)));
    tmpMap.put(_Fields.RELATION, new org.apache.thrift.meta_data.FieldMetaData("relation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContactRelation.class)));
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
    tmpMap.put(_Fields.DISPLAY_NAME_OVERRIDDEN, new org.apache.thrift.meta_data.FieldMetaData("displayNameOverridden", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FAVORITE_TIME, new org.apache.thrift.meta_data.FieldMetaData("favoriteTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CAPABLE_VOICE_CALL, new org.apache.thrift.meta_data.FieldMetaData("capableVoiceCall", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CAPABLE_VIDEO_CALL, new org.apache.thrift.meta_data.FieldMetaData("capableVideoCall", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CAPABLE_MYHOME, new org.apache.thrift.meta_data.FieldMetaData("capableMyhome", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CAPABLE_BUDDY, new org.apache.thrift.meta_data.FieldMetaData("capableBuddy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SETTINGS, new org.apache.thrift.meta_data.FieldMetaData("settings", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PICTURE_PATH, new org.apache.thrift.meta_data.FieldMetaData("picturePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RECOMMEND_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("recommendParams", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FRIEND_REQUEST_STATUS, new org.apache.thrift.meta_data.FieldMetaData("friendRequestStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MUSIC_PROFILE, new org.apache.thrift.meta_data.FieldMetaData("musicProfile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VIDEO_PROFILE, new org.apache.thrift.meta_data.FieldMetaData("videoProfile", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Contact.class, metaDataMap);
  }

  public Contact() {
  }

  public Contact(
    java.lang.String mid,
    long createdTime,
    ContactType type,
    ContactStatus status,
    ContactRelation relation,
    java.lang.String displayName,
    java.lang.String phoneticName,
    java.lang.String pictureStatus,
    java.lang.String thumbnailUrl,
    java.lang.String statusMessage,
    java.lang.String displayNameOverridden,
    long favoriteTime,
    boolean capableVoiceCall,
    boolean capableVideoCall,
    boolean capableMyhome,
    boolean capableBuddy,
    int attributes,
    long settings,
    java.lang.String picturePath,
    java.lang.String recommendParams,
    int friendRequestStatus,
    java.lang.String musicProfile,
    java.lang.String videoProfile)
  {
    this();
    this.mid = mid;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.type = type;
    this.status = status;
    this.relation = relation;
    this.displayName = displayName;
    this.phoneticName = phoneticName;
    this.pictureStatus = pictureStatus;
    this.thumbnailUrl = thumbnailUrl;
    this.statusMessage = statusMessage;
    this.displayNameOverridden = displayNameOverridden;
    this.favoriteTime = favoriteTime;
    setFavoriteTimeIsSet(true);
    this.capableVoiceCall = capableVoiceCall;
    setCapableVoiceCallIsSet(true);
    this.capableVideoCall = capableVideoCall;
    setCapableVideoCallIsSet(true);
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
    this.capableBuddy = capableBuddy;
    setCapableBuddyIsSet(true);
    this.attributes = attributes;
    setAttributesIsSet(true);
    this.settings = settings;
    setSettingsIsSet(true);
    this.picturePath = picturePath;
    this.recommendParams = recommendParams;
    this.friendRequestStatus = friendRequestStatus;
    setFriendRequestStatusIsSet(true);
    this.musicProfile = musicProfile;
    this.videoProfile = videoProfile;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Contact(Contact other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    this.createdTime = other.createdTime;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetRelation()) {
      this.relation = other.relation;
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
    if (other.isSetDisplayNameOverridden()) {
      this.displayNameOverridden = other.displayNameOverridden;
    }
    this.favoriteTime = other.favoriteTime;
    this.capableVoiceCall = other.capableVoiceCall;
    this.capableVideoCall = other.capableVideoCall;
    this.capableMyhome = other.capableMyhome;
    this.capableBuddy = other.capableBuddy;
    this.attributes = other.attributes;
    this.settings = other.settings;
    if (other.isSetPicturePath()) {
      this.picturePath = other.picturePath;
    }
    if (other.isSetRecommendParams()) {
      this.recommendParams = other.recommendParams;
    }
    this.friendRequestStatus = other.friendRequestStatus;
    if (other.isSetMusicProfile()) {
      this.musicProfile = other.musicProfile;
    }
    if (other.isSetVideoProfile()) {
      this.videoProfile = other.videoProfile;
    }
  }

  public Contact deepCopy() {
    return new Contact(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.type = null;
    this.status = null;
    this.relation = null;
    this.displayName = null;
    this.phoneticName = null;
    this.pictureStatus = null;
    this.thumbnailUrl = null;
    this.statusMessage = null;
    this.displayNameOverridden = null;
    setFavoriteTimeIsSet(false);
    this.favoriteTime = 0;
    setCapableVoiceCallIsSet(false);
    this.capableVoiceCall = false;
    setCapableVideoCallIsSet(false);
    this.capableVideoCall = false;
    setCapableMyhomeIsSet(false);
    this.capableMyhome = false;
    setCapableBuddyIsSet(false);
    this.capableBuddy = false;
    setAttributesIsSet(false);
    this.attributes = 0;
    setSettingsIsSet(false);
    this.settings = 0;
    this.picturePath = null;
    this.recommendParams = null;
    setFriendRequestStatusIsSet(false);
    this.friendRequestStatus = 0;
    this.musicProfile = null;
    this.videoProfile = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public Contact setMid(java.lang.String mid) {
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

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Contact setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see ContactType
   */
  public ContactType getType() {
    return this.type;
  }

  /**
   * 
   * @see ContactType
   */
  public Contact setType(ContactType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * 
   * @see ContactStatus
   */
  public ContactStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see ContactStatus
   */
  public Contact setStatus(ContactStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  /**
   * 
   * @see ContactRelation
   */
  public ContactRelation getRelation() {
    return this.relation;
  }

  /**
   * 
   * @see ContactRelation
   */
  public Contact setRelation(ContactRelation relation) {
    this.relation = relation;
    return this;
  }

  public void unsetRelation() {
    this.relation = null;
  }

  /** Returns true if field relation is set (has been assigned a value) and false otherwise */
  public boolean isSetRelation() {
    return this.relation != null;
  }

  public void setRelationIsSet(boolean value) {
    if (!value) {
      this.relation = null;
    }
  }

  public java.lang.String getDisplayName() {
    return this.displayName;
  }

  public Contact setDisplayName(java.lang.String displayName) {
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

  public Contact setPhoneticName(java.lang.String phoneticName) {
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

  public Contact setPictureStatus(java.lang.String pictureStatus) {
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

  public Contact setThumbnailUrl(java.lang.String thumbnailUrl) {
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

  public Contact setStatusMessage(java.lang.String statusMessage) {
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

  public java.lang.String getDisplayNameOverridden() {
    return this.displayNameOverridden;
  }

  public Contact setDisplayNameOverridden(java.lang.String displayNameOverridden) {
    this.displayNameOverridden = displayNameOverridden;
    return this;
  }

  public void unsetDisplayNameOverridden() {
    this.displayNameOverridden = null;
  }

  /** Returns true if field displayNameOverridden is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayNameOverridden() {
    return this.displayNameOverridden != null;
  }

  public void setDisplayNameOverriddenIsSet(boolean value) {
    if (!value) {
      this.displayNameOverridden = null;
    }
  }

  public long getFavoriteTime() {
    return this.favoriteTime;
  }

  public Contact setFavoriteTime(long favoriteTime) {
    this.favoriteTime = favoriteTime;
    setFavoriteTimeIsSet(true);
    return this;
  }

  public void unsetFavoriteTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FAVORITETIME_ISSET_ID);
  }

  /** Returns true if field favoriteTime is set (has been assigned a value) and false otherwise */
  public boolean isSetFavoriteTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FAVORITETIME_ISSET_ID);
  }

  public void setFavoriteTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FAVORITETIME_ISSET_ID, value);
  }

  public boolean isCapableVoiceCall() {
    return this.capableVoiceCall;
  }

  public Contact setCapableVoiceCall(boolean capableVoiceCall) {
    this.capableVoiceCall = capableVoiceCall;
    setCapableVoiceCallIsSet(true);
    return this;
  }

  public void unsetCapableVoiceCall() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CAPABLEVOICECALL_ISSET_ID);
  }

  /** Returns true if field capableVoiceCall is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableVoiceCall() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CAPABLEVOICECALL_ISSET_ID);
  }

  public void setCapableVoiceCallIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CAPABLEVOICECALL_ISSET_ID, value);
  }

  public boolean isCapableVideoCall() {
    return this.capableVideoCall;
  }

  public Contact setCapableVideoCall(boolean capableVideoCall) {
    this.capableVideoCall = capableVideoCall;
    setCapableVideoCallIsSet(true);
    return this;
  }

  public void unsetCapableVideoCall() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CAPABLEVIDEOCALL_ISSET_ID);
  }

  /** Returns true if field capableVideoCall is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableVideoCall() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CAPABLEVIDEOCALL_ISSET_ID);
  }

  public void setCapableVideoCallIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CAPABLEVIDEOCALL_ISSET_ID, value);
  }

  public boolean isCapableMyhome() {
    return this.capableMyhome;
  }

  public Contact setCapableMyhome(boolean capableMyhome) {
    this.capableMyhome = capableMyhome;
    setCapableMyhomeIsSet(true);
    return this;
  }

  public void unsetCapableMyhome() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID);
  }

  /** Returns true if field capableMyhome is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableMyhome() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID);
  }

  public void setCapableMyhomeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CAPABLEMYHOME_ISSET_ID, value);
  }

  public boolean isCapableBuddy() {
    return this.capableBuddy;
  }

  public Contact setCapableBuddy(boolean capableBuddy) {
    this.capableBuddy = capableBuddy;
    setCapableBuddyIsSet(true);
    return this;
  }

  public void unsetCapableBuddy() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CAPABLEBUDDY_ISSET_ID);
  }

  /** Returns true if field capableBuddy is set (has been assigned a value) and false otherwise */
  public boolean isSetCapableBuddy() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CAPABLEBUDDY_ISSET_ID);
  }

  public void setCapableBuddyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CAPABLEBUDDY_ISSET_ID, value);
  }

  public int getAttributes() {
    return this.attributes;
  }

  public Contact setAttributes(int attributes) {
    this.attributes = attributes;
    setAttributesIsSet(true);
    return this;
  }

  public void unsetAttributes() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ATTRIBUTES_ISSET_ID);
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ATTRIBUTES_ISSET_ID);
  }

  public void setAttributesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ATTRIBUTES_ISSET_ID, value);
  }

  public long getSettings() {
    return this.settings;
  }

  public Contact setSettings(long settings) {
    this.settings = settings;
    setSettingsIsSet(true);
    return this;
  }

  public void unsetSettings() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SETTINGS_ISSET_ID);
  }

  /** Returns true if field settings is set (has been assigned a value) and false otherwise */
  public boolean isSetSettings() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SETTINGS_ISSET_ID);
  }

  public void setSettingsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SETTINGS_ISSET_ID, value);
  }

  public java.lang.String getPicturePath() {
    return this.picturePath;
  }

  public Contact setPicturePath(java.lang.String picturePath) {
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

  public java.lang.String getRecommendParams() {
    return this.recommendParams;
  }

  public Contact setRecommendParams(java.lang.String recommendParams) {
    this.recommendParams = recommendParams;
    return this;
  }

  public void unsetRecommendParams() {
    this.recommendParams = null;
  }

  /** Returns true if field recommendParams is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendParams() {
    return this.recommendParams != null;
  }

  public void setRecommendParamsIsSet(boolean value) {
    if (!value) {
      this.recommendParams = null;
    }
  }

  public int getFriendRequestStatus() {
    return this.friendRequestStatus;
  }

  public Contact setFriendRequestStatus(int friendRequestStatus) {
    this.friendRequestStatus = friendRequestStatus;
    setFriendRequestStatusIsSet(true);
    return this;
  }

  public void unsetFriendRequestStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FRIENDREQUESTSTATUS_ISSET_ID);
  }

  /** Returns true if field friendRequestStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetFriendRequestStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FRIENDREQUESTSTATUS_ISSET_ID);
  }

  public void setFriendRequestStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FRIENDREQUESTSTATUS_ISSET_ID, value);
  }

  public java.lang.String getMusicProfile() {
    return this.musicProfile;
  }

  public Contact setMusicProfile(java.lang.String musicProfile) {
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

  public java.lang.String getVideoProfile() {
    return this.videoProfile;
  }

  public Contact setVideoProfile(java.lang.String videoProfile) {
    this.videoProfile = videoProfile;
    return this;
  }

  public void unsetVideoProfile() {
    this.videoProfile = null;
  }

  /** Returns true if field videoProfile is set (has been assigned a value) and false otherwise */
  public boolean isSetVideoProfile() {
    return this.videoProfile != null;
  }

  public void setVideoProfileIsSet(boolean value) {
    if (!value) {
      this.videoProfile = null;
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

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ContactType)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((ContactStatus)value);
      }
      break;

    case RELATION:
      if (value == null) {
        unsetRelation();
      } else {
        setRelation((ContactRelation)value);
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

    case DISPLAY_NAME_OVERRIDDEN:
      if (value == null) {
        unsetDisplayNameOverridden();
      } else {
        setDisplayNameOverridden((java.lang.String)value);
      }
      break;

    case FAVORITE_TIME:
      if (value == null) {
        unsetFavoriteTime();
      } else {
        setFavoriteTime((java.lang.Long)value);
      }
      break;

    case CAPABLE_VOICE_CALL:
      if (value == null) {
        unsetCapableVoiceCall();
      } else {
        setCapableVoiceCall((java.lang.Boolean)value);
      }
      break;

    case CAPABLE_VIDEO_CALL:
      if (value == null) {
        unsetCapableVideoCall();
      } else {
        setCapableVideoCall((java.lang.Boolean)value);
      }
      break;

    case CAPABLE_MYHOME:
      if (value == null) {
        unsetCapableMyhome();
      } else {
        setCapableMyhome((java.lang.Boolean)value);
      }
      break;

    case CAPABLE_BUDDY:
      if (value == null) {
        unsetCapableBuddy();
      } else {
        setCapableBuddy((java.lang.Boolean)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((java.lang.Integer)value);
      }
      break;

    case SETTINGS:
      if (value == null) {
        unsetSettings();
      } else {
        setSettings((java.lang.Long)value);
      }
      break;

    case PICTURE_PATH:
      if (value == null) {
        unsetPicturePath();
      } else {
        setPicturePath((java.lang.String)value);
      }
      break;

    case RECOMMEND_PARAMS:
      if (value == null) {
        unsetRecommendParams();
      } else {
        setRecommendParams((java.lang.String)value);
      }
      break;

    case FRIEND_REQUEST_STATUS:
      if (value == null) {
        unsetFriendRequestStatus();
      } else {
        setFriendRequestStatus((java.lang.Integer)value);
      }
      break;

    case MUSIC_PROFILE:
      if (value == null) {
        unsetMusicProfile();
      } else {
        setMusicProfile((java.lang.String)value);
      }
      break;

    case VIDEO_PROFILE:
      if (value == null) {
        unsetVideoProfile();
      } else {
        setVideoProfile((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case CREATED_TIME:
      return getCreatedTime();

    case TYPE:
      return getType();

    case STATUS:
      return getStatus();

    case RELATION:
      return getRelation();

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

    case DISPLAY_NAME_OVERRIDDEN:
      return getDisplayNameOverridden();

    case FAVORITE_TIME:
      return getFavoriteTime();

    case CAPABLE_VOICE_CALL:
      return isCapableVoiceCall();

    case CAPABLE_VIDEO_CALL:
      return isCapableVideoCall();

    case CAPABLE_MYHOME:
      return isCapableMyhome();

    case CAPABLE_BUDDY:
      return isCapableBuddy();

    case ATTRIBUTES:
      return getAttributes();

    case SETTINGS:
      return getSettings();

    case PICTURE_PATH:
      return getPicturePath();

    case RECOMMEND_PARAMS:
      return getRecommendParams();

    case FRIEND_REQUEST_STATUS:
      return getFriendRequestStatus();

    case MUSIC_PROFILE:
      return getMusicProfile();

    case VIDEO_PROFILE:
      return getVideoProfile();

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
    case CREATED_TIME:
      return isSetCreatedTime();
    case TYPE:
      return isSetType();
    case STATUS:
      return isSetStatus();
    case RELATION:
      return isSetRelation();
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
    case DISPLAY_NAME_OVERRIDDEN:
      return isSetDisplayNameOverridden();
    case FAVORITE_TIME:
      return isSetFavoriteTime();
    case CAPABLE_VOICE_CALL:
      return isSetCapableVoiceCall();
    case CAPABLE_VIDEO_CALL:
      return isSetCapableVideoCall();
    case CAPABLE_MYHOME:
      return isSetCapableMyhome();
    case CAPABLE_BUDDY:
      return isSetCapableBuddy();
    case ATTRIBUTES:
      return isSetAttributes();
    case SETTINGS:
      return isSetSettings();
    case PICTURE_PATH:
      return isSetPicturePath();
    case RECOMMEND_PARAMS:
      return isSetRecommendParams();
    case FRIEND_REQUEST_STATUS:
      return isSetFriendRequestStatus();
    case MUSIC_PROFILE:
      return isSetMusicProfile();
    case VIDEO_PROFILE:
      return isSetVideoProfile();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Contact)
      return this.equals((Contact)that);
    return false;
  }

  public boolean equals(Contact that) {
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

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_relation = true && this.isSetRelation();
    boolean that_present_relation = true && that.isSetRelation();
    if (this_present_relation || that_present_relation) {
      if (!(this_present_relation && that_present_relation))
        return false;
      if (!this.relation.equals(that.relation))
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

    boolean this_present_displayNameOverridden = true && this.isSetDisplayNameOverridden();
    boolean that_present_displayNameOverridden = true && that.isSetDisplayNameOverridden();
    if (this_present_displayNameOverridden || that_present_displayNameOverridden) {
      if (!(this_present_displayNameOverridden && that_present_displayNameOverridden))
        return false;
      if (!this.displayNameOverridden.equals(that.displayNameOverridden))
        return false;
    }

    boolean this_present_favoriteTime = true;
    boolean that_present_favoriteTime = true;
    if (this_present_favoriteTime || that_present_favoriteTime) {
      if (!(this_present_favoriteTime && that_present_favoriteTime))
        return false;
      if (this.favoriteTime != that.favoriteTime)
        return false;
    }

    boolean this_present_capableVoiceCall = true;
    boolean that_present_capableVoiceCall = true;
    if (this_present_capableVoiceCall || that_present_capableVoiceCall) {
      if (!(this_present_capableVoiceCall && that_present_capableVoiceCall))
        return false;
      if (this.capableVoiceCall != that.capableVoiceCall)
        return false;
    }

    boolean this_present_capableVideoCall = true;
    boolean that_present_capableVideoCall = true;
    if (this_present_capableVideoCall || that_present_capableVideoCall) {
      if (!(this_present_capableVideoCall && that_present_capableVideoCall))
        return false;
      if (this.capableVideoCall != that.capableVideoCall)
        return false;
    }

    boolean this_present_capableMyhome = true;
    boolean that_present_capableMyhome = true;
    if (this_present_capableMyhome || that_present_capableMyhome) {
      if (!(this_present_capableMyhome && that_present_capableMyhome))
        return false;
      if (this.capableMyhome != that.capableMyhome)
        return false;
    }

    boolean this_present_capableBuddy = true;
    boolean that_present_capableBuddy = true;
    if (this_present_capableBuddy || that_present_capableBuddy) {
      if (!(this_present_capableBuddy && that_present_capableBuddy))
        return false;
      if (this.capableBuddy != that.capableBuddy)
        return false;
    }

    boolean this_present_attributes = true;
    boolean that_present_attributes = true;
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (this.attributes != that.attributes)
        return false;
    }

    boolean this_present_settings = true;
    boolean that_present_settings = true;
    if (this_present_settings || that_present_settings) {
      if (!(this_present_settings && that_present_settings))
        return false;
      if (this.settings != that.settings)
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

    boolean this_present_recommendParams = true && this.isSetRecommendParams();
    boolean that_present_recommendParams = true && that.isSetRecommendParams();
    if (this_present_recommendParams || that_present_recommendParams) {
      if (!(this_present_recommendParams && that_present_recommendParams))
        return false;
      if (!this.recommendParams.equals(that.recommendParams))
        return false;
    }

    boolean this_present_friendRequestStatus = true;
    boolean that_present_friendRequestStatus = true;
    if (this_present_friendRequestStatus || that_present_friendRequestStatus) {
      if (!(this_present_friendRequestStatus && that_present_friendRequestStatus))
        return false;
      if (this.friendRequestStatus != that.friendRequestStatus)
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

    boolean this_present_videoProfile = true && this.isSetVideoProfile();
    boolean that_present_videoProfile = true && that.isSetVideoProfile();
    if (this_present_videoProfile || that_present_videoProfile) {
      if (!(this_present_videoProfile && that_present_videoProfile))
        return false;
      if (!this.videoProfile.equals(that.videoProfile))
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

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetStatus()) ? 131071 : 524287);
    if (isSetStatus())
      hashCode = hashCode * 8191 + status.getValue();

    hashCode = hashCode * 8191 + ((isSetRelation()) ? 131071 : 524287);
    if (isSetRelation())
      hashCode = hashCode * 8191 + relation.getValue();

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

    hashCode = hashCode * 8191 + ((isSetDisplayNameOverridden()) ? 131071 : 524287);
    if (isSetDisplayNameOverridden())
      hashCode = hashCode * 8191 + displayNameOverridden.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(favoriteTime);

    hashCode = hashCode * 8191 + ((capableVoiceCall) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((capableVideoCall) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((capableMyhome) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((capableBuddy) ? 131071 : 524287);

    hashCode = hashCode * 8191 + attributes;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(settings);

    hashCode = hashCode * 8191 + ((isSetPicturePath()) ? 131071 : 524287);
    if (isSetPicturePath())
      hashCode = hashCode * 8191 + picturePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetRecommendParams()) ? 131071 : 524287);
    if (isSetRecommendParams())
      hashCode = hashCode * 8191 + recommendParams.hashCode();

    hashCode = hashCode * 8191 + friendRequestStatus;

    hashCode = hashCode * 8191 + ((isSetMusicProfile()) ? 131071 : 524287);
    if (isSetMusicProfile())
      hashCode = hashCode * 8191 + musicProfile.hashCode();

    hashCode = hashCode * 8191 + ((isSetVideoProfile()) ? 131071 : 524287);
    if (isSetVideoProfile())
      hashCode = hashCode * 8191 + videoProfile.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Contact other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRelation()).compareTo(other.isSetRelation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relation, other.relation);
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
    lastComparison = java.lang.Boolean.valueOf(isSetDisplayNameOverridden()).compareTo(other.isSetDisplayNameOverridden());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayNameOverridden()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayNameOverridden, other.displayNameOverridden);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFavoriteTime()).compareTo(other.isSetFavoriteTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFavoriteTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.favoriteTime, other.favoriteTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCapableVoiceCall()).compareTo(other.isSetCapableVoiceCall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableVoiceCall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capableVoiceCall, other.capableVoiceCall);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCapableVideoCall()).compareTo(other.isSetCapableVideoCall());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableVideoCall()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capableVideoCall, other.capableVideoCall);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCapableMyhome()).compareTo(other.isSetCapableMyhome());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableMyhome()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capableMyhome, other.capableMyhome);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCapableBuddy()).compareTo(other.isSetCapableBuddy());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapableBuddy()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capableBuddy, other.capableBuddy);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSettings()).compareTo(other.isSetSettings());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettings()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settings, other.settings);
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
    lastComparison = java.lang.Boolean.valueOf(isSetRecommendParams()).compareTo(other.isSetRecommendParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendParams, other.recommendParams);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFriendRequestStatus()).compareTo(other.isSetFriendRequestStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFriendRequestStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.friendRequestStatus, other.friendRequestStatus);
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
    lastComparison = java.lang.Boolean.valueOf(isSetVideoProfile()).compareTo(other.isSetVideoProfile());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVideoProfile()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.videoProfile, other.videoProfile);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Contact(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relation:");
    if (this.relation == null) {
      sb.append("null");
    } else {
      sb.append(this.relation);
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
    sb.append("displayNameOverridden:");
    if (this.displayNameOverridden == null) {
      sb.append("null");
    } else {
      sb.append(this.displayNameOverridden);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("favoriteTime:");
    sb.append(this.favoriteTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableVoiceCall:");
    sb.append(this.capableVoiceCall);
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableVideoCall:");
    sb.append(this.capableVideoCall);
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableMyhome:");
    sb.append(this.capableMyhome);
    first = false;
    if (!first) sb.append(", ");
    sb.append("capableBuddy:");
    sb.append(this.capableBuddy);
    first = false;
    if (!first) sb.append(", ");
    sb.append("attributes:");
    sb.append(this.attributes);
    first = false;
    if (!first) sb.append(", ");
    sb.append("settings:");
    sb.append(this.settings);
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
    sb.append("recommendParams:");
    if (this.recommendParams == null) {
      sb.append("null");
    } else {
      sb.append(this.recommendParams);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("friendRequestStatus:");
    sb.append(this.friendRequestStatus);
    first = false;
    if (!first) sb.append(", ");
    sb.append("musicProfile:");
    if (this.musicProfile == null) {
      sb.append("null");
    } else {
      sb.append(this.musicProfile);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("videoProfile:");
    if (this.videoProfile == null) {
      sb.append("null");
    } else {
      sb.append(this.videoProfile);
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

  private static class ContactStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContactStandardScheme getScheme() {
      return new ContactStandardScheme();
    }
  }

  private static class ContactStandardScheme extends org.apache.thrift.scheme.StandardScheme<Contact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Contact struct) throws org.apache.thrift.TException {
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
          case 2: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ContactType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = ContactStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // RELATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.relation = ContactRelation.findByValue(iprot.readI32());
              struct.setRelationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 23: // PHONETIC_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.phoneticName = iprot.readString();
              struct.setPhoneticNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 24: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 25: // THUMBNAIL_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.thumbnailUrl = iprot.readString();
              struct.setThumbnailUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 26: // STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusMessage = iprot.readString();
              struct.setStatusMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 27: // DISPLAY_NAME_OVERRIDDEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayNameOverridden = iprot.readString();
              struct.setDisplayNameOverriddenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 28: // FAVORITE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.favoriteTime = iprot.readI64();
              struct.setFavoriteTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // CAPABLE_VOICE_CALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.capableVoiceCall = iprot.readBool();
              struct.setCapableVoiceCallIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 32: // CAPABLE_VIDEO_CALL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.capableVideoCall = iprot.readBool();
              struct.setCapableVideoCallIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 33: // CAPABLE_MYHOME
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.capableMyhome = iprot.readBool();
              struct.setCapableMyhomeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 34: // CAPABLE_BUDDY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.capableBuddy = iprot.readBool();
              struct.setCapableBuddyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 35: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.attributes = iprot.readI32();
              struct.setAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 36: // SETTINGS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.settings = iprot.readI64();
              struct.setSettingsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 37: // PICTURE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picturePath = iprot.readString();
              struct.setPicturePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 38: // RECOMMEND_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.recommendParams = iprot.readString();
              struct.setRecommendParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 39: // FRIEND_REQUEST_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.friendRequestStatus = iprot.readI32();
              struct.setFriendRequestStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 40: // MUSIC_PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.musicProfile = iprot.readString();
              struct.setMusicProfileIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 42: // VIDEO_PROFILE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.videoProfile = iprot.readString();
              struct.setVideoProfileIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Contact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI32(struct.status.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.relation != null) {
        oprot.writeFieldBegin(RELATION_FIELD_DESC);
        oprot.writeI32(struct.relation.getValue());
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
      if (struct.displayNameOverridden != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_OVERRIDDEN_FIELD_DESC);
        oprot.writeString(struct.displayNameOverridden);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FAVORITE_TIME_FIELD_DESC);
      oprot.writeI64(struct.favoriteTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CAPABLE_VOICE_CALL_FIELD_DESC);
      oprot.writeBool(struct.capableVoiceCall);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CAPABLE_VIDEO_CALL_FIELD_DESC);
      oprot.writeBool(struct.capableVideoCall);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CAPABLE_MYHOME_FIELD_DESC);
      oprot.writeBool(struct.capableMyhome);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CAPABLE_BUDDY_FIELD_DESC);
      oprot.writeBool(struct.capableBuddy);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
      oprot.writeI32(struct.attributes);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SETTINGS_FIELD_DESC);
      oprot.writeI64(struct.settings);
      oprot.writeFieldEnd();
      if (struct.picturePath != null) {
        oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
        oprot.writeString(struct.picturePath);
        oprot.writeFieldEnd();
      }
      if (struct.recommendParams != null) {
        oprot.writeFieldBegin(RECOMMEND_PARAMS_FIELD_DESC);
        oprot.writeString(struct.recommendParams);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FRIEND_REQUEST_STATUS_FIELD_DESC);
      oprot.writeI32(struct.friendRequestStatus);
      oprot.writeFieldEnd();
      if (struct.musicProfile != null) {
        oprot.writeFieldBegin(MUSIC_PROFILE_FIELD_DESC);
        oprot.writeString(struct.musicProfile);
        oprot.writeFieldEnd();
      }
      if (struct.videoProfile != null) {
        oprot.writeFieldBegin(VIDEO_PROFILE_FIELD_DESC);
        oprot.writeString(struct.videoProfile);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ContactTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ContactTupleScheme getScheme() {
      return new ContactTupleScheme();
    }
  }

  private static class ContactTupleScheme extends org.apache.thrift.scheme.TupleScheme<Contact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Contact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetStatus()) {
        optionals.set(3);
      }
      if (struct.isSetRelation()) {
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
      if (struct.isSetDisplayNameOverridden()) {
        optionals.set(10);
      }
      if (struct.isSetFavoriteTime()) {
        optionals.set(11);
      }
      if (struct.isSetCapableVoiceCall()) {
        optionals.set(12);
      }
      if (struct.isSetCapableVideoCall()) {
        optionals.set(13);
      }
      if (struct.isSetCapableMyhome()) {
        optionals.set(14);
      }
      if (struct.isSetCapableBuddy()) {
        optionals.set(15);
      }
      if (struct.isSetAttributes()) {
        optionals.set(16);
      }
      if (struct.isSetSettings()) {
        optionals.set(17);
      }
      if (struct.isSetPicturePath()) {
        optionals.set(18);
      }
      if (struct.isSetRecommendParams()) {
        optionals.set(19);
      }
      if (struct.isSetFriendRequestStatus()) {
        optionals.set(20);
      }
      if (struct.isSetMusicProfile()) {
        optionals.set(21);
      }
      if (struct.isSetVideoProfile()) {
        optionals.set(22);
      }
      oprot.writeBitSet(optionals, 23);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetRelation()) {
        oprot.writeI32(struct.relation.getValue());
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
      if (struct.isSetDisplayNameOverridden()) {
        oprot.writeString(struct.displayNameOverridden);
      }
      if (struct.isSetFavoriteTime()) {
        oprot.writeI64(struct.favoriteTime);
      }
      if (struct.isSetCapableVoiceCall()) {
        oprot.writeBool(struct.capableVoiceCall);
      }
      if (struct.isSetCapableVideoCall()) {
        oprot.writeBool(struct.capableVideoCall);
      }
      if (struct.isSetCapableMyhome()) {
        oprot.writeBool(struct.capableMyhome);
      }
      if (struct.isSetCapableBuddy()) {
        oprot.writeBool(struct.capableBuddy);
      }
      if (struct.isSetAttributes()) {
        oprot.writeI32(struct.attributes);
      }
      if (struct.isSetSettings()) {
        oprot.writeI64(struct.settings);
      }
      if (struct.isSetPicturePath()) {
        oprot.writeString(struct.picturePath);
      }
      if (struct.isSetRecommendParams()) {
        oprot.writeString(struct.recommendParams);
      }
      if (struct.isSetFriendRequestStatus()) {
        oprot.writeI32(struct.friendRequestStatus);
      }
      if (struct.isSetMusicProfile()) {
        oprot.writeString(struct.musicProfile);
      }
      if (struct.isSetVideoProfile()) {
        oprot.writeString(struct.videoProfile);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Contact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(23);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = ContactType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.status = ContactStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.relation = ContactRelation.findByValue(iprot.readI32());
        struct.setRelationIsSet(true);
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
        struct.displayNameOverridden = iprot.readString();
        struct.setDisplayNameOverriddenIsSet(true);
      }
      if (incoming.get(11)) {
        struct.favoriteTime = iprot.readI64();
        struct.setFavoriteTimeIsSet(true);
      }
      if (incoming.get(12)) {
        struct.capableVoiceCall = iprot.readBool();
        struct.setCapableVoiceCallIsSet(true);
      }
      if (incoming.get(13)) {
        struct.capableVideoCall = iprot.readBool();
        struct.setCapableVideoCallIsSet(true);
      }
      if (incoming.get(14)) {
        struct.capableMyhome = iprot.readBool();
        struct.setCapableMyhomeIsSet(true);
      }
      if (incoming.get(15)) {
        struct.capableBuddy = iprot.readBool();
        struct.setCapableBuddyIsSet(true);
      }
      if (incoming.get(16)) {
        struct.attributes = iprot.readI32();
        struct.setAttributesIsSet(true);
      }
      if (incoming.get(17)) {
        struct.settings = iprot.readI64();
        struct.setSettingsIsSet(true);
      }
      if (incoming.get(18)) {
        struct.picturePath = iprot.readString();
        struct.setPicturePathIsSet(true);
      }
      if (incoming.get(19)) {
        struct.recommendParams = iprot.readString();
        struct.setRecommendParamsIsSet(true);
      }
      if (incoming.get(20)) {
        struct.friendRequestStatus = iprot.readI32();
        struct.setFriendRequestStatusIsSet(true);
      }
      if (incoming.get(21)) {
        struct.musicProfile = iprot.readString();
        struct.setMusicProfileIsSet(true);
      }
      if (incoming.get(22)) {
        struct.videoProfile = iprot.readString();
        struct.setVideoProfileIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

