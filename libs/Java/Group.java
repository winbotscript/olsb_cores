/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class Group implements org.apache.thrift.TBase<Group, Group._Fields>, java.io.Serializable, Cloneable, Comparable<Group> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Group");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)11);
  private static final org.apache.thrift.protocol.TField PREVENTED_JOIN_BY_TICKET_FIELD_DESC = new org.apache.thrift.protocol.TField("preventedJoinByTicket", org.apache.thrift.protocol.TType.BOOL, (short)12);
  private static final org.apache.thrift.protocol.TField GROUP_PREFERENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("groupPreference", org.apache.thrift.protocol.TType.STRUCT, (short)13);
  private static final org.apache.thrift.protocol.TField MEMBERS_FIELD_DESC = new org.apache.thrift.protocol.TField("members", org.apache.thrift.protocol.TType.LIST, (short)20);
  private static final org.apache.thrift.protocol.TField CREATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("creator", org.apache.thrift.protocol.TType.STRUCT, (short)21);
  private static final org.apache.thrift.protocol.TField INVITEE_FIELD_DESC = new org.apache.thrift.protocol.TField("invitee", org.apache.thrift.protocol.TType.LIST, (short)22);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_DISABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationDisabled", org.apache.thrift.protocol.TType.BOOL, (short)31);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GroupStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GroupTupleSchemeFactory();

  public java.lang.String id; // required
  public long createdTime; // required
  public java.lang.String name; // required
  public java.lang.String pictureStatus; // required
  public boolean preventedJoinByTicket; // required
  public GroupPreference groupPreference; // required
  public java.util.List<Contact> members; // required
  public Contact creator; // required
  public java.util.List<Contact> invitee; // required
  public boolean notificationDisabled; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CREATED_TIME((short)2, "createdTime"),
    NAME((short)10, "name"),
    PICTURE_STATUS((short)11, "pictureStatus"),
    PREVENTED_JOIN_BY_TICKET((short)12, "preventedJoinByTicket"),
    GROUP_PREFERENCE((short)13, "groupPreference"),
    MEMBERS((short)20, "members"),
    CREATOR((short)21, "creator"),
    INVITEE((short)22, "invitee"),
    NOTIFICATION_DISABLED((short)31, "notificationDisabled");

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
        case 1: // ID
          return ID;
        case 2: // CREATED_TIME
          return CREATED_TIME;
        case 10: // NAME
          return NAME;
        case 11: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 12: // PREVENTED_JOIN_BY_TICKET
          return PREVENTED_JOIN_BY_TICKET;
        case 13: // GROUP_PREFERENCE
          return GROUP_PREFERENCE;
        case 20: // MEMBERS
          return MEMBERS;
        case 21: // CREATOR
          return CREATOR;
        case 22: // INVITEE
          return INVITEE;
        case 31: // NOTIFICATION_DISABLED
          return NOTIFICATION_DISABLED;
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
  private static final int __PREVENTEDJOINBYTICKET_ISSET_ID = 1;
  private static final int __NOTIFICATIONDISABLED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("pictureStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PREVENTED_JOIN_BY_TICKET, new org.apache.thrift.meta_data.FieldMetaData("preventedJoinByTicket", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.GROUP_PREFERENCE, new org.apache.thrift.meta_data.FieldMetaData("groupPreference", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GroupPreference.class)));
    tmpMap.put(_Fields.MEMBERS, new org.apache.thrift.meta_data.FieldMetaData("members", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    tmpMap.put(_Fields.CREATOR, new org.apache.thrift.meta_data.FieldMetaData("creator", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class)));
    tmpMap.put(_Fields.INVITEE, new org.apache.thrift.meta_data.FieldMetaData("invitee", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Contact.class))));
    tmpMap.put(_Fields.NOTIFICATION_DISABLED, new org.apache.thrift.meta_data.FieldMetaData("notificationDisabled", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Group.class, metaDataMap);
  }

  public Group() {
  }

  public Group(
    java.lang.String id,
    long createdTime,
    java.lang.String name,
    java.lang.String pictureStatus,
    boolean preventedJoinByTicket,
    GroupPreference groupPreference,
    java.util.List<Contact> members,
    Contact creator,
    java.util.List<Contact> invitee,
    boolean notificationDisabled)
  {
    this();
    this.id = id;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.name = name;
    this.pictureStatus = pictureStatus;
    this.preventedJoinByTicket = preventedJoinByTicket;
    setPreventedJoinByTicketIsSet(true);
    this.groupPreference = groupPreference;
    this.members = members;
    this.creator = creator;
    this.invitee = invitee;
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Group(Group other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.createdTime = other.createdTime;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetPictureStatus()) {
      this.pictureStatus = other.pictureStatus;
    }
    this.preventedJoinByTicket = other.preventedJoinByTicket;
    if (other.isSetGroupPreference()) {
      this.groupPreference = new GroupPreference(other.groupPreference);
    }
    if (other.isSetMembers()) {
      java.util.List<Contact> __this__members = new java.util.ArrayList<Contact>(other.members.size());
      for (Contact other_element : other.members) {
        __this__members.add(new Contact(other_element));
      }
      this.members = __this__members;
    }
    if (other.isSetCreator()) {
      this.creator = new Contact(other.creator);
    }
    if (other.isSetInvitee()) {
      java.util.List<Contact> __this__invitee = new java.util.ArrayList<Contact>(other.invitee.size());
      for (Contact other_element : other.invitee) {
        __this__invitee.add(new Contact(other_element));
      }
      this.invitee = __this__invitee;
    }
    this.notificationDisabled = other.notificationDisabled;
  }

  public Group deepCopy() {
    return new Group(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.name = null;
    this.pictureStatus = null;
    setPreventedJoinByTicketIsSet(false);
    this.preventedJoinByTicket = false;
    this.groupPreference = null;
    this.members = null;
    this.creator = null;
    this.invitee = null;
    setNotificationDisabledIsSet(false);
    this.notificationDisabled = false;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public Group setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Group setCreatedTime(long createdTime) {
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

  public java.lang.String getName() {
    return this.name;
  }

  public Group setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getPictureStatus() {
    return this.pictureStatus;
  }

  public Group setPictureStatus(java.lang.String pictureStatus) {
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

  public boolean isPreventedJoinByTicket() {
    return this.preventedJoinByTicket;
  }

  public Group setPreventedJoinByTicket(boolean preventedJoinByTicket) {
    this.preventedJoinByTicket = preventedJoinByTicket;
    setPreventedJoinByTicketIsSet(true);
    return this;
  }

  public void unsetPreventedJoinByTicket() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PREVENTEDJOINBYTICKET_ISSET_ID);
  }

  /** Returns true if field preventedJoinByTicket is set (has been assigned a value) and false otherwise */
  public boolean isSetPreventedJoinByTicket() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PREVENTEDJOINBYTICKET_ISSET_ID);
  }

  public void setPreventedJoinByTicketIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PREVENTEDJOINBYTICKET_ISSET_ID, value);
  }

  public GroupPreference getGroupPreference() {
    return this.groupPreference;
  }

  public Group setGroupPreference(GroupPreference groupPreference) {
    this.groupPreference = groupPreference;
    return this;
  }

  public void unsetGroupPreference() {
    this.groupPreference = null;
  }

  /** Returns true if field groupPreference is set (has been assigned a value) and false otherwise */
  public boolean isSetGroupPreference() {
    return this.groupPreference != null;
  }

  public void setGroupPreferenceIsSet(boolean value) {
    if (!value) {
      this.groupPreference = null;
    }
  }

  public int getMembersSize() {
    return (this.members == null) ? 0 : this.members.size();
  }

  public java.util.Iterator<Contact> getMembersIterator() {
    return (this.members == null) ? null : this.members.iterator();
  }

  public void addToMembers(Contact elem) {
    if (this.members == null) {
      this.members = new java.util.ArrayList<Contact>();
    }
    this.members.add(elem);
  }

  public java.util.List<Contact> getMembers() {
    return this.members;
  }

  public Group setMembers(java.util.List<Contact> members) {
    this.members = members;
    return this;
  }

  public void unsetMembers() {
    this.members = null;
  }

  /** Returns true if field members is set (has been assigned a value) and false otherwise */
  public boolean isSetMembers() {
    return this.members != null;
  }

  public void setMembersIsSet(boolean value) {
    if (!value) {
      this.members = null;
    }
  }

  public Contact getCreator() {
    return this.creator;
  }

  public Group setCreator(Contact creator) {
    this.creator = creator;
    return this;
  }

  public void unsetCreator() {
    this.creator = null;
  }

  /** Returns true if field creator is set (has been assigned a value) and false otherwise */
  public boolean isSetCreator() {
    return this.creator != null;
  }

  public void setCreatorIsSet(boolean value) {
    if (!value) {
      this.creator = null;
    }
  }

  public int getInviteeSize() {
    return (this.invitee == null) ? 0 : this.invitee.size();
  }

  public java.util.Iterator<Contact> getInviteeIterator() {
    return (this.invitee == null) ? null : this.invitee.iterator();
  }

  public void addToInvitee(Contact elem) {
    if (this.invitee == null) {
      this.invitee = new java.util.ArrayList<Contact>();
    }
    this.invitee.add(elem);
  }

  public java.util.List<Contact> getInvitee() {
    return this.invitee;
  }

  public Group setInvitee(java.util.List<Contact> invitee) {
    this.invitee = invitee;
    return this;
  }

  public void unsetInvitee() {
    this.invitee = null;
  }

  /** Returns true if field invitee is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitee() {
    return this.invitee != null;
  }

  public void setInviteeIsSet(boolean value) {
    if (!value) {
      this.invitee = null;
    }
  }

  public boolean isNotificationDisabled() {
    return this.notificationDisabled;
  }

  public Group setNotificationDisabled(boolean notificationDisabled) {
    this.notificationDisabled = notificationDisabled;
    setNotificationDisabledIsSet(true);
    return this;
  }

  public void unsetNotificationDisabled() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID);
  }

  /** Returns true if field notificationDisabled is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationDisabled() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID);
  }

  public void setNotificationDisabledIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONDISABLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case PICTURE_STATUS:
      if (value == null) {
        unsetPictureStatus();
      } else {
        setPictureStatus((java.lang.String)value);
      }
      break;

    case PREVENTED_JOIN_BY_TICKET:
      if (value == null) {
        unsetPreventedJoinByTicket();
      } else {
        setPreventedJoinByTicket((java.lang.Boolean)value);
      }
      break;

    case GROUP_PREFERENCE:
      if (value == null) {
        unsetGroupPreference();
      } else {
        setGroupPreference((GroupPreference)value);
      }
      break;

    case MEMBERS:
      if (value == null) {
        unsetMembers();
      } else {
        setMembers((java.util.List<Contact>)value);
      }
      break;

    case CREATOR:
      if (value == null) {
        unsetCreator();
      } else {
        setCreator((Contact)value);
      }
      break;

    case INVITEE:
      if (value == null) {
        unsetInvitee();
      } else {
        setInvitee((java.util.List<Contact>)value);
      }
      break;

    case NOTIFICATION_DISABLED:
      if (value == null) {
        unsetNotificationDisabled();
      } else {
        setNotificationDisabled((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CREATED_TIME:
      return getCreatedTime();

    case NAME:
      return getName();

    case PICTURE_STATUS:
      return getPictureStatus();

    case PREVENTED_JOIN_BY_TICKET:
      return isPreventedJoinByTicket();

    case GROUP_PREFERENCE:
      return getGroupPreference();

    case MEMBERS:
      return getMembers();

    case CREATOR:
      return getCreator();

    case INVITEE:
      return getInvitee();

    case NOTIFICATION_DISABLED:
      return isNotificationDisabled();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CREATED_TIME:
      return isSetCreatedTime();
    case NAME:
      return isSetName();
    case PICTURE_STATUS:
      return isSetPictureStatus();
    case PREVENTED_JOIN_BY_TICKET:
      return isSetPreventedJoinByTicket();
    case GROUP_PREFERENCE:
      return isSetGroupPreference();
    case MEMBERS:
      return isSetMembers();
    case CREATOR:
      return isSetCreator();
    case INVITEE:
      return isSetInvitee();
    case NOTIFICATION_DISABLED:
      return isSetNotificationDisabled();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Group)
      return this.equals((Group)that);
    return false;
  }

  public boolean equals(Group that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
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

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
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

    boolean this_present_preventedJoinByTicket = true;
    boolean that_present_preventedJoinByTicket = true;
    if (this_present_preventedJoinByTicket || that_present_preventedJoinByTicket) {
      if (!(this_present_preventedJoinByTicket && that_present_preventedJoinByTicket))
        return false;
      if (this.preventedJoinByTicket != that.preventedJoinByTicket)
        return false;
    }

    boolean this_present_groupPreference = true && this.isSetGroupPreference();
    boolean that_present_groupPreference = true && that.isSetGroupPreference();
    if (this_present_groupPreference || that_present_groupPreference) {
      if (!(this_present_groupPreference && that_present_groupPreference))
        return false;
      if (!this.groupPreference.equals(that.groupPreference))
        return false;
    }

    boolean this_present_members = true && this.isSetMembers();
    boolean that_present_members = true && that.isSetMembers();
    if (this_present_members || that_present_members) {
      if (!(this_present_members && that_present_members))
        return false;
      if (!this.members.equals(that.members))
        return false;
    }

    boolean this_present_creator = true && this.isSetCreator();
    boolean that_present_creator = true && that.isSetCreator();
    if (this_present_creator || that_present_creator) {
      if (!(this_present_creator && that_present_creator))
        return false;
      if (!this.creator.equals(that.creator))
        return false;
    }

    boolean this_present_invitee = true && this.isSetInvitee();
    boolean that_present_invitee = true && that.isSetInvitee();
    if (this_present_invitee || that_present_invitee) {
      if (!(this_present_invitee && that_present_invitee))
        return false;
      if (!this.invitee.equals(that.invitee))
        return false;
    }

    boolean this_present_notificationDisabled = true;
    boolean that_present_notificationDisabled = true;
    if (this_present_notificationDisabled || that_present_notificationDisabled) {
      if (!(this_present_notificationDisabled && that_present_notificationDisabled))
        return false;
      if (this.notificationDisabled != that.notificationDisabled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetPictureStatus()) ? 131071 : 524287);
    if (isSetPictureStatus())
      hashCode = hashCode * 8191 + pictureStatus.hashCode();

    hashCode = hashCode * 8191 + ((preventedJoinByTicket) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetGroupPreference()) ? 131071 : 524287);
    if (isSetGroupPreference())
      hashCode = hashCode * 8191 + groupPreference.hashCode();

    hashCode = hashCode * 8191 + ((isSetMembers()) ? 131071 : 524287);
    if (isSetMembers())
      hashCode = hashCode * 8191 + members.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreator()) ? 131071 : 524287);
    if (isSetCreator())
      hashCode = hashCode * 8191 + creator.hashCode();

    hashCode = hashCode * 8191 + ((isSetInvitee()) ? 131071 : 524287);
    if (isSetInvitee())
      hashCode = hashCode * 8191 + invitee.hashCode();

    hashCode = hashCode * 8191 + ((notificationDisabled) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(Group other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
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
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
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
    lastComparison = java.lang.Boolean.valueOf(isSetPreventedJoinByTicket()).compareTo(other.isSetPreventedJoinByTicket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreventedJoinByTicket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preventedJoinByTicket, other.preventedJoinByTicket);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGroupPreference()).compareTo(other.isSetGroupPreference());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroupPreference()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groupPreference, other.groupPreference);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMembers()).compareTo(other.isSetMembers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMembers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.members, other.members);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreator()).compareTo(other.isSetCreator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creator, other.creator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetInvitee()).compareTo(other.isSetInvitee());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitee()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitee, other.invitee);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNotificationDisabled()).compareTo(other.isSetNotificationDisabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationDisabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationDisabled, other.notificationDisabled);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Group(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
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
    sb.append("preventedJoinByTicket:");
    sb.append(this.preventedJoinByTicket);
    first = false;
    if (!first) sb.append(", ");
    sb.append("groupPreference:");
    if (this.groupPreference == null) {
      sb.append("null");
    } else {
      sb.append(this.groupPreference);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("members:");
    if (this.members == null) {
      sb.append("null");
    } else {
      sb.append(this.members);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creator:");
    if (this.creator == null) {
      sb.append("null");
    } else {
      sb.append(this.creator);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("invitee:");
    if (this.invitee == null) {
      sb.append("null");
    } else {
      sb.append(this.invitee);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationDisabled:");
    sb.append(this.notificationDisabled);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (groupPreference != null) {
      groupPreference.validate();
    }
    if (creator != null) {
      creator.validate();
    }
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

  private static class GroupStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupStandardScheme getScheme() {
      return new GroupStandardScheme();
    }
  }

  private static class GroupStandardScheme extends org.apache.thrift.scheme.StandardScheme<Group> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Group struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
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
          case 10: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // PREVENTED_JOIN_BY_TICKET
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.preventedJoinByTicket = iprot.readBool();
              struct.setPreventedJoinByTicketIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // GROUP_PREFERENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.groupPreference = new GroupPreference();
              struct.groupPreference.read(iprot);
              struct.setGroupPreferenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // MEMBERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.members = new java.util.ArrayList<Contact>(_list0.size);
                Contact _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Contact();
                  _elem1.read(iprot);
                  struct.members.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMembersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // CREATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.creator = new Contact();
              struct.creator.read(iprot);
              struct.setCreatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // INVITEE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.invitee = new java.util.ArrayList<Contact>(_list3.size);
                Contact _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = new Contact();
                  _elem4.read(iprot);
                  struct.invitee.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setInviteeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 31: // NOTIFICATION_DISABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.notificationDisabled = iprot.readBool();
              struct.setNotificationDisabledIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Group struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(struct.pictureStatus);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PREVENTED_JOIN_BY_TICKET_FIELD_DESC);
      oprot.writeBool(struct.preventedJoinByTicket);
      oprot.writeFieldEnd();
      if (struct.groupPreference != null) {
        oprot.writeFieldBegin(GROUP_PREFERENCE_FIELD_DESC);
        struct.groupPreference.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.members != null) {
        oprot.writeFieldBegin(MEMBERS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.members.size()));
          for (Contact _iter6 : struct.members)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.creator != null) {
        oprot.writeFieldBegin(CREATOR_FIELD_DESC);
        struct.creator.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.invitee != null) {
        oprot.writeFieldBegin(INVITEE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.invitee.size()));
          for (Contact _iter7 : struct.invitee)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(NOTIFICATION_DISABLED_FIELD_DESC);
      oprot.writeBool(struct.notificationDisabled);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupTupleScheme getScheme() {
      return new GroupTupleScheme();
    }
  }

  private static class GroupTupleScheme extends org.apache.thrift.scheme.TupleScheme<Group> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetPictureStatus()) {
        optionals.set(3);
      }
      if (struct.isSetPreventedJoinByTicket()) {
        optionals.set(4);
      }
      if (struct.isSetGroupPreference()) {
        optionals.set(5);
      }
      if (struct.isSetMembers()) {
        optionals.set(6);
      }
      if (struct.isSetCreator()) {
        optionals.set(7);
      }
      if (struct.isSetInvitee()) {
        optionals.set(8);
      }
      if (struct.isSetNotificationDisabled()) {
        optionals.set(9);
      }
      oprot.writeBitSet(optionals, 10);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetPictureStatus()) {
        oprot.writeString(struct.pictureStatus);
      }
      if (struct.isSetPreventedJoinByTicket()) {
        oprot.writeBool(struct.preventedJoinByTicket);
      }
      if (struct.isSetGroupPreference()) {
        struct.groupPreference.write(oprot);
      }
      if (struct.isSetMembers()) {
        {
          oprot.writeI32(struct.members.size());
          for (Contact _iter8 : struct.members)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.isSetCreator()) {
        struct.creator.write(oprot);
      }
      if (struct.isSetInvitee()) {
        {
          oprot.writeI32(struct.invitee.size());
          for (Contact _iter9 : struct.invitee)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.isSetNotificationDisabled()) {
        oprot.writeBool(struct.notificationDisabled);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(10);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.pictureStatus = iprot.readString();
        struct.setPictureStatusIsSet(true);
      }
      if (incoming.get(4)) {
        struct.preventedJoinByTicket = iprot.readBool();
        struct.setPreventedJoinByTicketIsSet(true);
      }
      if (incoming.get(5)) {
        struct.groupPreference = new GroupPreference();
        struct.groupPreference.read(iprot);
        struct.setGroupPreferenceIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.members = new java.util.ArrayList<Contact>(_list10.size);
          Contact _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = new Contact();
            _elem11.read(iprot);
            struct.members.add(_elem11);
          }
        }
        struct.setMembersIsSet(true);
      }
      if (incoming.get(7)) {
        struct.creator = new Contact();
        struct.creator.read(iprot);
        struct.setCreatorIsSet(true);
      }
      if (incoming.get(8)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.invitee = new java.util.ArrayList<Contact>(_list13.size);
          Contact _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = new Contact();
            _elem14.read(iprot);
            struct.invitee.add(_elem14);
          }
        }
        struct.setInviteeIsSet(true);
      }
      if (incoming.get(9)) {
        struct.notificationDisabled = iprot.readBool();
        struct.setNotificationDisabledIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

