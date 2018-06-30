/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class LoginSession implements org.apache.thrift.TBase<LoginSession, LoginSession._Fields>, java.io.Serializable, Cloneable, Comparable<LoginSession> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LoginSession");

  private static final org.apache.thrift.protocol.TField TOKEN_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenKey", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXPIRATION_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("expirationTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField APPLICATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationType", org.apache.thrift.protocol.TType.I32, (short)11);
  private static final org.apache.thrift.protocol.TField SYSTEM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("systemName", org.apache.thrift.protocol.TType.STRING, (short)12);
  private static final org.apache.thrift.protocol.TField ACCESS_LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("accessLocation", org.apache.thrift.protocol.TType.STRING, (short)22);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LoginSessionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LoginSessionTupleSchemeFactory();

  public java.lang.String tokenKey; // required
  public long expirationTime; // required
  /**
   * 
   * @see ApplicationType
   */
  public ApplicationType applicationType; // required
  public java.lang.String systemName; // required
  public java.lang.String accessLocation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOKEN_KEY((short)1, "tokenKey"),
    EXPIRATION_TIME((short)3, "expirationTime"),
    /**
     * 
     * @see ApplicationType
     */
    APPLICATION_TYPE((short)11, "applicationType"),
    SYSTEM_NAME((short)12, "systemName"),
    ACCESS_LOCATION((short)22, "accessLocation");

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
        case 1: // TOKEN_KEY
          return TOKEN_KEY;
        case 3: // EXPIRATION_TIME
          return EXPIRATION_TIME;
        case 11: // APPLICATION_TYPE
          return APPLICATION_TYPE;
        case 12: // SYSTEM_NAME
          return SYSTEM_NAME;
        case 22: // ACCESS_LOCATION
          return ACCESS_LOCATION;
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
  private static final int __EXPIRATIONTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN_KEY, new org.apache.thrift.meta_data.FieldMetaData("tokenKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPIRATION_TIME, new org.apache.thrift.meta_data.FieldMetaData("expirationTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.APPLICATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("applicationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ApplicationType.class)));
    tmpMap.put(_Fields.SYSTEM_NAME, new org.apache.thrift.meta_data.FieldMetaData("systemName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACCESS_LOCATION, new org.apache.thrift.meta_data.FieldMetaData("accessLocation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LoginSession.class, metaDataMap);
  }

  public LoginSession() {
  }

  public LoginSession(
    java.lang.String tokenKey,
    long expirationTime,
    ApplicationType applicationType,
    java.lang.String systemName,
    java.lang.String accessLocation)
  {
    this();
    this.tokenKey = tokenKey;
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
    this.applicationType = applicationType;
    this.systemName = systemName;
    this.accessLocation = accessLocation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LoginSession(LoginSession other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTokenKey()) {
      this.tokenKey = other.tokenKey;
    }
    this.expirationTime = other.expirationTime;
    if (other.isSetApplicationType()) {
      this.applicationType = other.applicationType;
    }
    if (other.isSetSystemName()) {
      this.systemName = other.systemName;
    }
    if (other.isSetAccessLocation()) {
      this.accessLocation = other.accessLocation;
    }
  }

  public LoginSession deepCopy() {
    return new LoginSession(this);
  }

  @Override
  public void clear() {
    this.tokenKey = null;
    setExpirationTimeIsSet(false);
    this.expirationTime = 0;
    this.applicationType = null;
    this.systemName = null;
    this.accessLocation = null;
  }

  public java.lang.String getTokenKey() {
    return this.tokenKey;
  }

  public LoginSession setTokenKey(java.lang.String tokenKey) {
    this.tokenKey = tokenKey;
    return this;
  }

  public void unsetTokenKey() {
    this.tokenKey = null;
  }

  /** Returns true if field tokenKey is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenKey() {
    return this.tokenKey != null;
  }

  public void setTokenKeyIsSet(boolean value) {
    if (!value) {
      this.tokenKey = null;
    }
  }

  public long getExpirationTime() {
    return this.expirationTime;
  }

  public LoginSession setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
    return this;
  }

  public void unsetExpirationTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  /** Returns true if field expirationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExpirationTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID);
  }

  public void setExpirationTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRATIONTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see ApplicationType
   */
  public ApplicationType getApplicationType() {
    return this.applicationType;
  }

  /**
   * 
   * @see ApplicationType
   */
  public LoginSession setApplicationType(ApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  public void unsetApplicationType() {
    this.applicationType = null;
  }

  /** Returns true if field applicationType is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationType() {
    return this.applicationType != null;
  }

  public void setApplicationTypeIsSet(boolean value) {
    if (!value) {
      this.applicationType = null;
    }
  }

  public java.lang.String getSystemName() {
    return this.systemName;
  }

  public LoginSession setSystemName(java.lang.String systemName) {
    this.systemName = systemName;
    return this;
  }

  public void unsetSystemName() {
    this.systemName = null;
  }

  /** Returns true if field systemName is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemName() {
    return this.systemName != null;
  }

  public void setSystemNameIsSet(boolean value) {
    if (!value) {
      this.systemName = null;
    }
  }

  public java.lang.String getAccessLocation() {
    return this.accessLocation;
  }

  public LoginSession setAccessLocation(java.lang.String accessLocation) {
    this.accessLocation = accessLocation;
    return this;
  }

  public void unsetAccessLocation() {
    this.accessLocation = null;
  }

  /** Returns true if field accessLocation is set (has been assigned a value) and false otherwise */
  public boolean isSetAccessLocation() {
    return this.accessLocation != null;
  }

  public void setAccessLocationIsSet(boolean value) {
    if (!value) {
      this.accessLocation = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TOKEN_KEY:
      if (value == null) {
        unsetTokenKey();
      } else {
        setTokenKey((java.lang.String)value);
      }
      break;

    case EXPIRATION_TIME:
      if (value == null) {
        unsetExpirationTime();
      } else {
        setExpirationTime((java.lang.Long)value);
      }
      break;

    case APPLICATION_TYPE:
      if (value == null) {
        unsetApplicationType();
      } else {
        setApplicationType((ApplicationType)value);
      }
      break;

    case SYSTEM_NAME:
      if (value == null) {
        unsetSystemName();
      } else {
        setSystemName((java.lang.String)value);
      }
      break;

    case ACCESS_LOCATION:
      if (value == null) {
        unsetAccessLocation();
      } else {
        setAccessLocation((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN_KEY:
      return getTokenKey();

    case EXPIRATION_TIME:
      return getExpirationTime();

    case APPLICATION_TYPE:
      return getApplicationType();

    case SYSTEM_NAME:
      return getSystemName();

    case ACCESS_LOCATION:
      return getAccessLocation();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOKEN_KEY:
      return isSetTokenKey();
    case EXPIRATION_TIME:
      return isSetExpirationTime();
    case APPLICATION_TYPE:
      return isSetApplicationType();
    case SYSTEM_NAME:
      return isSetSystemName();
    case ACCESS_LOCATION:
      return isSetAccessLocation();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof LoginSession)
      return this.equals((LoginSession)that);
    return false;
  }

  public boolean equals(LoginSession that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tokenKey = true && this.isSetTokenKey();
    boolean that_present_tokenKey = true && that.isSetTokenKey();
    if (this_present_tokenKey || that_present_tokenKey) {
      if (!(this_present_tokenKey && that_present_tokenKey))
        return false;
      if (!this.tokenKey.equals(that.tokenKey))
        return false;
    }

    boolean this_present_expirationTime = true;
    boolean that_present_expirationTime = true;
    if (this_present_expirationTime || that_present_expirationTime) {
      if (!(this_present_expirationTime && that_present_expirationTime))
        return false;
      if (this.expirationTime != that.expirationTime)
        return false;
    }

    boolean this_present_applicationType = true && this.isSetApplicationType();
    boolean that_present_applicationType = true && that.isSetApplicationType();
    if (this_present_applicationType || that_present_applicationType) {
      if (!(this_present_applicationType && that_present_applicationType))
        return false;
      if (!this.applicationType.equals(that.applicationType))
        return false;
    }

    boolean this_present_systemName = true && this.isSetSystemName();
    boolean that_present_systemName = true && that.isSetSystemName();
    if (this_present_systemName || that_present_systemName) {
      if (!(this_present_systemName && that_present_systemName))
        return false;
      if (!this.systemName.equals(that.systemName))
        return false;
    }

    boolean this_present_accessLocation = true && this.isSetAccessLocation();
    boolean that_present_accessLocation = true && that.isSetAccessLocation();
    if (this_present_accessLocation || that_present_accessLocation) {
      if (!(this_present_accessLocation && that_present_accessLocation))
        return false;
      if (!this.accessLocation.equals(that.accessLocation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTokenKey()) ? 131071 : 524287);
    if (isSetTokenKey())
      hashCode = hashCode * 8191 + tokenKey.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expirationTime);

    hashCode = hashCode * 8191 + ((isSetApplicationType()) ? 131071 : 524287);
    if (isSetApplicationType())
      hashCode = hashCode * 8191 + applicationType.getValue();

    hashCode = hashCode * 8191 + ((isSetSystemName()) ? 131071 : 524287);
    if (isSetSystemName())
      hashCode = hashCode * 8191 + systemName.hashCode();

    hashCode = hashCode * 8191 + ((isSetAccessLocation()) ? 131071 : 524287);
    if (isSetAccessLocation())
      hashCode = hashCode * 8191 + accessLocation.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LoginSession other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTokenKey()).compareTo(other.isSetTokenKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenKey, other.tokenKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExpirationTime()).compareTo(other.isSetExpirationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpirationTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expirationTime, other.expirationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetApplicationType()).compareTo(other.isSetApplicationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationType, other.applicationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSystemName()).compareTo(other.isSetSystemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.systemName, other.systemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccessLocation()).compareTo(other.isSetAccessLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccessLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accessLocation, other.accessLocation);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LoginSession(");
    boolean first = true;

    sb.append("tokenKey:");
    if (this.tokenKey == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expirationTime:");
    sb.append(this.expirationTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationType:");
    if (this.applicationType == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemName:");
    if (this.systemName == null) {
      sb.append("null");
    } else {
      sb.append(this.systemName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accessLocation:");
    if (this.accessLocation == null) {
      sb.append("null");
    } else {
      sb.append(this.accessLocation);
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

  private static class LoginSessionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LoginSessionStandardScheme getScheme() {
      return new LoginSessionStandardScheme();
    }
  }

  private static class LoginSessionStandardScheme extends org.apache.thrift.scheme.StandardScheme<LoginSession> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LoginSession struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tokenKey = iprot.readString();
              struct.setTokenKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPIRATION_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expirationTime = iprot.readI64();
              struct.setExpirationTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // APPLICATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.applicationType = ApplicationType.findByValue(iprot.readI32());
              struct.setApplicationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // SYSTEM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.systemName = iprot.readString();
              struct.setSystemNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // ACCESS_LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accessLocation = iprot.readString();
              struct.setAccessLocationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LoginSession struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tokenKey != null) {
        oprot.writeFieldBegin(TOKEN_KEY_FIELD_DESC);
        oprot.writeString(struct.tokenKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPIRATION_TIME_FIELD_DESC);
      oprot.writeI64(struct.expirationTime);
      oprot.writeFieldEnd();
      if (struct.applicationType != null) {
        oprot.writeFieldBegin(APPLICATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.applicationType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.systemName != null) {
        oprot.writeFieldBegin(SYSTEM_NAME_FIELD_DESC);
        oprot.writeString(struct.systemName);
        oprot.writeFieldEnd();
      }
      if (struct.accessLocation != null) {
        oprot.writeFieldBegin(ACCESS_LOCATION_FIELD_DESC);
        oprot.writeString(struct.accessLocation);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LoginSessionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public LoginSessionTupleScheme getScheme() {
      return new LoginSessionTupleScheme();
    }
  }

  private static class LoginSessionTupleScheme extends org.apache.thrift.scheme.TupleScheme<LoginSession> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LoginSession struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTokenKey()) {
        optionals.set(0);
      }
      if (struct.isSetExpirationTime()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationType()) {
        optionals.set(2);
      }
      if (struct.isSetSystemName()) {
        optionals.set(3);
      }
      if (struct.isSetAccessLocation()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTokenKey()) {
        oprot.writeString(struct.tokenKey);
      }
      if (struct.isSetExpirationTime()) {
        oprot.writeI64(struct.expirationTime);
      }
      if (struct.isSetApplicationType()) {
        oprot.writeI32(struct.applicationType.getValue());
      }
      if (struct.isSetSystemName()) {
        oprot.writeString(struct.systemName);
      }
      if (struct.isSetAccessLocation()) {
        oprot.writeString(struct.accessLocation);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LoginSession struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tokenKey = iprot.readString();
        struct.setTokenKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.expirationTime = iprot.readI64();
        struct.setExpirationTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationType = ApplicationType.findByValue(iprot.readI32());
        struct.setApplicationTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.systemName = iprot.readString();
        struct.setSystemNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.accessLocation = iprot.readString();
        struct.setAccessLocationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

