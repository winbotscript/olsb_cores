/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class MessageOperations implements org.apache.thrift.TBase<MessageOperations, MessageOperations._Fields>, java.io.Serializable, Cloneable, Comparable<MessageOperations> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MessageOperations");

  private static final org.apache.thrift.protocol.TField OPERATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("operations", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField END_FLAG_FIELD_DESC = new org.apache.thrift.protocol.TField("endFlag", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MessageOperationsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MessageOperationsTupleSchemeFactory();

  public java.util.List<MessageOperation> operations; // required
  public boolean endFlag; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OPERATIONS((short)1, "operations"),
    END_FLAG((short)2, "endFlag");

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
        case 1: // OPERATIONS
          return OPERATIONS;
        case 2: // END_FLAG
          return END_FLAG;
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
  private static final int __ENDFLAG_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OPERATIONS, new org.apache.thrift.meta_data.FieldMetaData("operations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MessageOperation.class))));
    tmpMap.put(_Fields.END_FLAG, new org.apache.thrift.meta_data.FieldMetaData("endFlag", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MessageOperations.class, metaDataMap);
  }

  public MessageOperations() {
  }

  public MessageOperations(
    java.util.List<MessageOperation> operations,
    boolean endFlag)
  {
    this();
    this.operations = operations;
    this.endFlag = endFlag;
    setEndFlagIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MessageOperations(MessageOperations other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetOperations()) {
      java.util.List<MessageOperation> __this__operations = new java.util.ArrayList<MessageOperation>(other.operations.size());
      for (MessageOperation other_element : other.operations) {
        __this__operations.add(new MessageOperation(other_element));
      }
      this.operations = __this__operations;
    }
    this.endFlag = other.endFlag;
  }

  public MessageOperations deepCopy() {
    return new MessageOperations(this);
  }

  @Override
  public void clear() {
    this.operations = null;
    setEndFlagIsSet(false);
    this.endFlag = false;
  }

  public int getOperationsSize() {
    return (this.operations == null) ? 0 : this.operations.size();
  }

  public java.util.Iterator<MessageOperation> getOperationsIterator() {
    return (this.operations == null) ? null : this.operations.iterator();
  }

  public void addToOperations(MessageOperation elem) {
    if (this.operations == null) {
      this.operations = new java.util.ArrayList<MessageOperation>();
    }
    this.operations.add(elem);
  }

  public java.util.List<MessageOperation> getOperations() {
    return this.operations;
  }

  public MessageOperations setOperations(java.util.List<MessageOperation> operations) {
    this.operations = operations;
    return this;
  }

  public void unsetOperations() {
    this.operations = null;
  }

  /** Returns true if field operations is set (has been assigned a value) and false otherwise */
  public boolean isSetOperations() {
    return this.operations != null;
  }

  public void setOperationsIsSet(boolean value) {
    if (!value) {
      this.operations = null;
    }
  }

  public boolean isEndFlag() {
    return this.endFlag;
  }

  public MessageOperations setEndFlag(boolean endFlag) {
    this.endFlag = endFlag;
    setEndFlagIsSet(true);
    return this;
  }

  public void unsetEndFlag() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENDFLAG_ISSET_ID);
  }

  /** Returns true if field endFlag is set (has been assigned a value) and false otherwise */
  public boolean isSetEndFlag() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENDFLAG_ISSET_ID);
  }

  public void setEndFlagIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENDFLAG_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OPERATIONS:
      if (value == null) {
        unsetOperations();
      } else {
        setOperations((java.util.List<MessageOperation>)value);
      }
      break;

    case END_FLAG:
      if (value == null) {
        unsetEndFlag();
      } else {
        setEndFlag((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OPERATIONS:
      return getOperations();

    case END_FLAG:
      return isEndFlag();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OPERATIONS:
      return isSetOperations();
    case END_FLAG:
      return isSetEndFlag();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MessageOperations)
      return this.equals((MessageOperations)that);
    return false;
  }

  public boolean equals(MessageOperations that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_operations = true && this.isSetOperations();
    boolean that_present_operations = true && that.isSetOperations();
    if (this_present_operations || that_present_operations) {
      if (!(this_present_operations && that_present_operations))
        return false;
      if (!this.operations.equals(that.operations))
        return false;
    }

    boolean this_present_endFlag = true;
    boolean that_present_endFlag = true;
    if (this_present_endFlag || that_present_endFlag) {
      if (!(this_present_endFlag && that_present_endFlag))
        return false;
      if (this.endFlag != that.endFlag)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOperations()) ? 131071 : 524287);
    if (isSetOperations())
      hashCode = hashCode * 8191 + operations.hashCode();

    hashCode = hashCode * 8191 + ((endFlag) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(MessageOperations other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOperations()).compareTo(other.isSetOperations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operations, other.operations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEndFlag()).compareTo(other.isSetEndFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndFlag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endFlag, other.endFlag);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageOperations(");
    boolean first = true;

    sb.append("operations:");
    if (this.operations == null) {
      sb.append("null");
    } else {
      sb.append(this.operations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endFlag:");
    sb.append(this.endFlag);
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

  private static class MessageOperationsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageOperationsStandardScheme getScheme() {
      return new MessageOperationsStandardScheme();
    }
  }

  private static class MessageOperationsStandardScheme extends org.apache.thrift.scheme.StandardScheme<MessageOperations> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MessageOperations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OPERATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.operations = new java.util.ArrayList<MessageOperation>(_list34.size);
                MessageOperation _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = new MessageOperation();
                  _elem35.read(iprot);
                  struct.operations.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setOperationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_FLAG
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.endFlag = iprot.readBool();
              struct.setEndFlagIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MessageOperations struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.operations != null) {
        oprot.writeFieldBegin(OPERATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.operations.size()));
          for (MessageOperation _iter37 : struct.operations)
          {
            _iter37.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(END_FLAG_FIELD_DESC);
      oprot.writeBool(struct.endFlag);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageOperationsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageOperationsTupleScheme getScheme() {
      return new MessageOperationsTupleScheme();
    }
  }

  private static class MessageOperationsTupleScheme extends org.apache.thrift.scheme.TupleScheme<MessageOperations> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MessageOperations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetOperations()) {
        optionals.set(0);
      }
      if (struct.isSetEndFlag()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOperations()) {
        {
          oprot.writeI32(struct.operations.size());
          for (MessageOperation _iter38 : struct.operations)
          {
            _iter38.write(oprot);
          }
        }
      }
      if (struct.isSetEndFlag()) {
        oprot.writeBool(struct.endFlag);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MessageOperations struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.operations = new java.util.ArrayList<MessageOperation>(_list39.size);
          MessageOperation _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new MessageOperation();
            _elem40.read(iprot);
            struct.operations.add(_elem40);
          }
        }
        struct.setOperationsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endFlag = iprot.readBool();
        struct.setEndFlagIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

