/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class GroupPreference implements org.apache.thrift.TBase<GroupPreference, GroupPreference._Fields>, java.io.Serializable, Cloneable, Comparable<GroupPreference> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GroupPreference");

  private static final org.apache.thrift.protocol.TField INVITATION_TICKET_FIELD_DESC = new org.apache.thrift.protocol.TField("invitationTicket", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FAVORITE_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("favoriteTimestamp", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GroupPreferenceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GroupPreferenceTupleSchemeFactory();

  public java.lang.String invitationTicket; // required
  public long favoriteTimestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INVITATION_TICKET((short)1, "invitationTicket"),
    FAVORITE_TIMESTAMP((short)2, "favoriteTimestamp");

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
        case 1: // INVITATION_TICKET
          return INVITATION_TICKET;
        case 2: // FAVORITE_TIMESTAMP
          return FAVORITE_TIMESTAMP;
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
  private static final int __FAVORITETIMESTAMP_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INVITATION_TICKET, new org.apache.thrift.meta_data.FieldMetaData("invitationTicket", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FAVORITE_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("favoriteTimestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GroupPreference.class, metaDataMap);
  }

  public GroupPreference() {
  }

  public GroupPreference(
    java.lang.String invitationTicket,
    long favoriteTimestamp)
  {
    this();
    this.invitationTicket = invitationTicket;
    this.favoriteTimestamp = favoriteTimestamp;
    setFavoriteTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GroupPreference(GroupPreference other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetInvitationTicket()) {
      this.invitationTicket = other.invitationTicket;
    }
    this.favoriteTimestamp = other.favoriteTimestamp;
  }

  public GroupPreference deepCopy() {
    return new GroupPreference(this);
  }

  @Override
  public void clear() {
    this.invitationTicket = null;
    setFavoriteTimestampIsSet(false);
    this.favoriteTimestamp = 0;
  }

  public java.lang.String getInvitationTicket() {
    return this.invitationTicket;
  }

  public GroupPreference setInvitationTicket(java.lang.String invitationTicket) {
    this.invitationTicket = invitationTicket;
    return this;
  }

  public void unsetInvitationTicket() {
    this.invitationTicket = null;
  }

  /** Returns true if field invitationTicket is set (has been assigned a value) and false otherwise */
  public boolean isSetInvitationTicket() {
    return this.invitationTicket != null;
  }

  public void setInvitationTicketIsSet(boolean value) {
    if (!value) {
      this.invitationTicket = null;
    }
  }

  public long getFavoriteTimestamp() {
    return this.favoriteTimestamp;
  }

  public GroupPreference setFavoriteTimestamp(long favoriteTimestamp) {
    this.favoriteTimestamp = favoriteTimestamp;
    setFavoriteTimestampIsSet(true);
    return this;
  }

  public void unsetFavoriteTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __FAVORITETIMESTAMP_ISSET_ID);
  }

  /** Returns true if field favoriteTimestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetFavoriteTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __FAVORITETIMESTAMP_ISSET_ID);
  }

  public void setFavoriteTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __FAVORITETIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case INVITATION_TICKET:
      if (value == null) {
        unsetInvitationTicket();
      } else {
        setInvitationTicket((java.lang.String)value);
      }
      break;

    case FAVORITE_TIMESTAMP:
      if (value == null) {
        unsetFavoriteTimestamp();
      } else {
        setFavoriteTimestamp((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case INVITATION_TICKET:
      return getInvitationTicket();

    case FAVORITE_TIMESTAMP:
      return getFavoriteTimestamp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case INVITATION_TICKET:
      return isSetInvitationTicket();
    case FAVORITE_TIMESTAMP:
      return isSetFavoriteTimestamp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GroupPreference)
      return this.equals((GroupPreference)that);
    return false;
  }

  public boolean equals(GroupPreference that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_invitationTicket = true && this.isSetInvitationTicket();
    boolean that_present_invitationTicket = true && that.isSetInvitationTicket();
    if (this_present_invitationTicket || that_present_invitationTicket) {
      if (!(this_present_invitationTicket && that_present_invitationTicket))
        return false;
      if (!this.invitationTicket.equals(that.invitationTicket))
        return false;
    }

    boolean this_present_favoriteTimestamp = true;
    boolean that_present_favoriteTimestamp = true;
    if (this_present_favoriteTimestamp || that_present_favoriteTimestamp) {
      if (!(this_present_favoriteTimestamp && that_present_favoriteTimestamp))
        return false;
      if (this.favoriteTimestamp != that.favoriteTimestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetInvitationTicket()) ? 131071 : 524287);
    if (isSetInvitationTicket())
      hashCode = hashCode * 8191 + invitationTicket.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(favoriteTimestamp);

    return hashCode;
  }

  @Override
  public int compareTo(GroupPreference other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetInvitationTicket()).compareTo(other.isSetInvitationTicket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInvitationTicket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.invitationTicket, other.invitationTicket);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFavoriteTimestamp()).compareTo(other.isSetFavoriteTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFavoriteTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.favoriteTimestamp, other.favoriteTimestamp);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupPreference(");
    boolean first = true;

    sb.append("invitationTicket:");
    if (this.invitationTicket == null) {
      sb.append("null");
    } else {
      sb.append(this.invitationTicket);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("favoriteTimestamp:");
    sb.append(this.favoriteTimestamp);
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

  private static class GroupPreferenceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupPreferenceStandardScheme getScheme() {
      return new GroupPreferenceStandardScheme();
    }
  }

  private static class GroupPreferenceStandardScheme extends org.apache.thrift.scheme.StandardScheme<GroupPreference> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GroupPreference struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INVITATION_TICKET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.invitationTicket = iprot.readString();
              struct.setInvitationTicketIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FAVORITE_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.favoriteTimestamp = iprot.readI64();
              struct.setFavoriteTimestampIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GroupPreference struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.invitationTicket != null) {
        oprot.writeFieldBegin(INVITATION_TICKET_FIELD_DESC);
        oprot.writeString(struct.invitationTicket);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FAVORITE_TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.favoriteTimestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupPreferenceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GroupPreferenceTupleScheme getScheme() {
      return new GroupPreferenceTupleScheme();
    }
  }

  private static class GroupPreferenceTupleScheme extends org.apache.thrift.scheme.TupleScheme<GroupPreference> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GroupPreference struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInvitationTicket()) {
        optionals.set(0);
      }
      if (struct.isSetFavoriteTimestamp()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetInvitationTicket()) {
        oprot.writeString(struct.invitationTicket);
      }
      if (struct.isSetFavoriteTimestamp()) {
        oprot.writeI64(struct.favoriteTimestamp);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GroupPreference struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.invitationTicket = iprot.readString();
        struct.setInvitationTicketIsSet(true);
      }
      if (incoming.get(1)) {
        struct.favoriteTimestamp = iprot.readI64();
        struct.setFavoriteTimestampIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

