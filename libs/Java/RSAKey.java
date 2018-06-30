/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class RSAKey implements org.apache.thrift.TBase<RSAKey, RSAKey._Fields>, java.io.Serializable, Cloneable, Comparable<RSAKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RSAKey");

  private static final org.apache.thrift.protocol.TField KEYNM_FIELD_DESC = new org.apache.thrift.protocol.TField("keynm", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NVALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("nvalue", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EVALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("evalue", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SESSION_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionKey", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RSAKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RSAKeyTupleSchemeFactory();

  public java.lang.String keynm; // required
  public java.lang.String nvalue; // required
  public java.lang.String evalue; // required
  public java.lang.String sessionKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEYNM((short)1, "keynm"),
    NVALUE((short)2, "nvalue"),
    EVALUE((short)3, "evalue"),
    SESSION_KEY((short)4, "sessionKey");

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
        case 1: // KEYNM
          return KEYNM;
        case 2: // NVALUE
          return NVALUE;
        case 3: // EVALUE
          return EVALUE;
        case 4: // SESSION_KEY
          return SESSION_KEY;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYNM, new org.apache.thrift.meta_data.FieldMetaData("keynm", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NVALUE, new org.apache.thrift.meta_data.FieldMetaData("nvalue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EVALUE, new org.apache.thrift.meta_data.FieldMetaData("evalue", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SESSION_KEY, new org.apache.thrift.meta_data.FieldMetaData("sessionKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RSAKey.class, metaDataMap);
  }

  public RSAKey() {
  }

  public RSAKey(
    java.lang.String keynm,
    java.lang.String nvalue,
    java.lang.String evalue,
    java.lang.String sessionKey)
  {
    this();
    this.keynm = keynm;
    this.nvalue = nvalue;
    this.evalue = evalue;
    this.sessionKey = sessionKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RSAKey(RSAKey other) {
    if (other.isSetKeynm()) {
      this.keynm = other.keynm;
    }
    if (other.isSetNvalue()) {
      this.nvalue = other.nvalue;
    }
    if (other.isSetEvalue()) {
      this.evalue = other.evalue;
    }
    if (other.isSetSessionKey()) {
      this.sessionKey = other.sessionKey;
    }
  }

  public RSAKey deepCopy() {
    return new RSAKey(this);
  }

  @Override
  public void clear() {
    this.keynm = null;
    this.nvalue = null;
    this.evalue = null;
    this.sessionKey = null;
  }

  public java.lang.String getKeynm() {
    return this.keynm;
  }

  public RSAKey setKeynm(java.lang.String keynm) {
    this.keynm = keynm;
    return this;
  }

  public void unsetKeynm() {
    this.keynm = null;
  }

  /** Returns true if field keynm is set (has been assigned a value) and false otherwise */
  public boolean isSetKeynm() {
    return this.keynm != null;
  }

  public void setKeynmIsSet(boolean value) {
    if (!value) {
      this.keynm = null;
    }
  }

  public java.lang.String getNvalue() {
    return this.nvalue;
  }

  public RSAKey setNvalue(java.lang.String nvalue) {
    this.nvalue = nvalue;
    return this;
  }

  public void unsetNvalue() {
    this.nvalue = null;
  }

  /** Returns true if field nvalue is set (has been assigned a value) and false otherwise */
  public boolean isSetNvalue() {
    return this.nvalue != null;
  }

  public void setNvalueIsSet(boolean value) {
    if (!value) {
      this.nvalue = null;
    }
  }

  public java.lang.String getEvalue() {
    return this.evalue;
  }

  public RSAKey setEvalue(java.lang.String evalue) {
    this.evalue = evalue;
    return this;
  }

  public void unsetEvalue() {
    this.evalue = null;
  }

  /** Returns true if field evalue is set (has been assigned a value) and false otherwise */
  public boolean isSetEvalue() {
    return this.evalue != null;
  }

  public void setEvalueIsSet(boolean value) {
    if (!value) {
      this.evalue = null;
    }
  }

  public java.lang.String getSessionKey() {
    return this.sessionKey;
  }

  public RSAKey setSessionKey(java.lang.String sessionKey) {
    this.sessionKey = sessionKey;
    return this;
  }

  public void unsetSessionKey() {
    this.sessionKey = null;
  }

  /** Returns true if field sessionKey is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionKey() {
    return this.sessionKey != null;
  }

  public void setSessionKeyIsSet(boolean value) {
    if (!value) {
      this.sessionKey = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case KEYNM:
      if (value == null) {
        unsetKeynm();
      } else {
        setKeynm((java.lang.String)value);
      }
      break;

    case NVALUE:
      if (value == null) {
        unsetNvalue();
      } else {
        setNvalue((java.lang.String)value);
      }
      break;

    case EVALUE:
      if (value == null) {
        unsetEvalue();
      } else {
        setEvalue((java.lang.String)value);
      }
      break;

    case SESSION_KEY:
      if (value == null) {
        unsetSessionKey();
      } else {
        setSessionKey((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYNM:
      return getKeynm();

    case NVALUE:
      return getNvalue();

    case EVALUE:
      return getEvalue();

    case SESSION_KEY:
      return getSessionKey();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEYNM:
      return isSetKeynm();
    case NVALUE:
      return isSetNvalue();
    case EVALUE:
      return isSetEvalue();
    case SESSION_KEY:
      return isSetSessionKey();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof RSAKey)
      return this.equals((RSAKey)that);
    return false;
  }

  public boolean equals(RSAKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_keynm = true && this.isSetKeynm();
    boolean that_present_keynm = true && that.isSetKeynm();
    if (this_present_keynm || that_present_keynm) {
      if (!(this_present_keynm && that_present_keynm))
        return false;
      if (!this.keynm.equals(that.keynm))
        return false;
    }

    boolean this_present_nvalue = true && this.isSetNvalue();
    boolean that_present_nvalue = true && that.isSetNvalue();
    if (this_present_nvalue || that_present_nvalue) {
      if (!(this_present_nvalue && that_present_nvalue))
        return false;
      if (!this.nvalue.equals(that.nvalue))
        return false;
    }

    boolean this_present_evalue = true && this.isSetEvalue();
    boolean that_present_evalue = true && that.isSetEvalue();
    if (this_present_evalue || that_present_evalue) {
      if (!(this_present_evalue && that_present_evalue))
        return false;
      if (!this.evalue.equals(that.evalue))
        return false;
    }

    boolean this_present_sessionKey = true && this.isSetSessionKey();
    boolean that_present_sessionKey = true && that.isSetSessionKey();
    if (this_present_sessionKey || that_present_sessionKey) {
      if (!(this_present_sessionKey && that_present_sessionKey))
        return false;
      if (!this.sessionKey.equals(that.sessionKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetKeynm()) ? 131071 : 524287);
    if (isSetKeynm())
      hashCode = hashCode * 8191 + keynm.hashCode();

    hashCode = hashCode * 8191 + ((isSetNvalue()) ? 131071 : 524287);
    if (isSetNvalue())
      hashCode = hashCode * 8191 + nvalue.hashCode();

    hashCode = hashCode * 8191 + ((isSetEvalue()) ? 131071 : 524287);
    if (isSetEvalue())
      hashCode = hashCode * 8191 + evalue.hashCode();

    hashCode = hashCode * 8191 + ((isSetSessionKey()) ? 131071 : 524287);
    if (isSetSessionKey())
      hashCode = hashCode * 8191 + sessionKey.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(RSAKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetKeynm()).compareTo(other.isSetKeynm());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeynm()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keynm, other.keynm);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNvalue()).compareTo(other.isSetNvalue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNvalue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nvalue, other.nvalue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEvalue()).compareTo(other.isSetEvalue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvalue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.evalue, other.evalue);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSessionKey()).compareTo(other.isSetSessionKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionKey, other.sessionKey);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("RSAKey(");
    boolean first = true;

    sb.append("keynm:");
    if (this.keynm == null) {
      sb.append("null");
    } else {
      sb.append(this.keynm);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nvalue:");
    if (this.nvalue == null) {
      sb.append("null");
    } else {
      sb.append(this.nvalue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("evalue:");
    if (this.evalue == null) {
      sb.append("null");
    } else {
      sb.append(this.evalue);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionKey:");
    if (this.sessionKey == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionKey);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RSAKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RSAKeyStandardScheme getScheme() {
      return new RSAKeyStandardScheme();
    }
  }

  private static class RSAKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<RSAKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RSAKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYNM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.keynm = iprot.readString();
              struct.setKeynmIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NVALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nvalue = iprot.readString();
              struct.setNvalueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.evalue = iprot.readString();
              struct.setEvalueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SESSION_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionKey = iprot.readString();
              struct.setSessionKeyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RSAKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keynm != null) {
        oprot.writeFieldBegin(KEYNM_FIELD_DESC);
        oprot.writeString(struct.keynm);
        oprot.writeFieldEnd();
      }
      if (struct.nvalue != null) {
        oprot.writeFieldBegin(NVALUE_FIELD_DESC);
        oprot.writeString(struct.nvalue);
        oprot.writeFieldEnd();
      }
      if (struct.evalue != null) {
        oprot.writeFieldBegin(EVALUE_FIELD_DESC);
        oprot.writeString(struct.evalue);
        oprot.writeFieldEnd();
      }
      if (struct.sessionKey != null) {
        oprot.writeFieldBegin(SESSION_KEY_FIELD_DESC);
        oprot.writeString(struct.sessionKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RSAKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RSAKeyTupleScheme getScheme() {
      return new RSAKeyTupleScheme();
    }
  }

  private static class RSAKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<RSAKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RSAKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetKeynm()) {
        optionals.set(0);
      }
      if (struct.isSetNvalue()) {
        optionals.set(1);
      }
      if (struct.isSetEvalue()) {
        optionals.set(2);
      }
      if (struct.isSetSessionKey()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetKeynm()) {
        oprot.writeString(struct.keynm);
      }
      if (struct.isSetNvalue()) {
        oprot.writeString(struct.nvalue);
      }
      if (struct.isSetEvalue()) {
        oprot.writeString(struct.evalue);
      }
      if (struct.isSetSessionKey()) {
        oprot.writeString(struct.sessionKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RSAKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.keynm = iprot.readString();
        struct.setKeynmIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nvalue = iprot.readString();
        struct.setNvalueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.evalue = iprot.readString();
        struct.setEvalueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sessionKey = iprot.readString();
        struct.setSessionKeyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

