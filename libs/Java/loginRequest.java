/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class loginRequest implements org.apache.thrift.TBase<loginRequest, loginRequest._Fields>, java.io.Serializable, Cloneable, Comparable<loginRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("loginRequest");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IDENTITY_PROVIDER_FIELD_DESC = new org.apache.thrift.protocol.TField("identityProvider", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField IDENTIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("identifier", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField KEEP_LOGGED_IN_FIELD_DESC = new org.apache.thrift.protocol.TField("keepLoggedIn", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField ACCESS_LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("accessLocation", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SYSTEM_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("systemName", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CERTIFICATE_FIELD_DESC = new org.apache.thrift.protocol.TField("certificate", org.apache.thrift.protocol.TType.STRING, (short)8);
  private static final org.apache.thrift.protocol.TField VERIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("verifier", org.apache.thrift.protocol.TType.STRING, (short)9);
  private static final org.apache.thrift.protocol.TField SECRET_FIELD_DESC = new org.apache.thrift.protocol.TField("secret", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField E2EE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("e2eeVersion", org.apache.thrift.protocol.TType.I32, (short)11);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new loginRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new loginRequestTupleSchemeFactory();

  public int type; // required
  public int identityProvider; // required
  public java.lang.String identifier; // required
  public java.lang.String password; // required
  public boolean keepLoggedIn; // required
  public java.lang.String accessLocation; // required
  public java.lang.String systemName; // required
  public java.lang.String certificate; // required
  public java.lang.String verifier; // required
  public java.lang.String secret; // required
  public int e2eeVersion; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    IDENTITY_PROVIDER((short)2, "identityProvider"),
    IDENTIFIER((short)3, "identifier"),
    PASSWORD((short)4, "password"),
    KEEP_LOGGED_IN((short)5, "keepLoggedIn"),
    ACCESS_LOCATION((short)6, "accessLocation"),
    SYSTEM_NAME((short)7, "systemName"),
    CERTIFICATE((short)8, "certificate"),
    VERIFIER((short)9, "verifier"),
    SECRET((short)10, "secret"),
    E2EE_VERSION((short)11, "e2eeVersion");

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
        case 1: // TYPE
          return TYPE;
        case 2: // IDENTITY_PROVIDER
          return IDENTITY_PROVIDER;
        case 3: // IDENTIFIER
          return IDENTIFIER;
        case 4: // PASSWORD
          return PASSWORD;
        case 5: // KEEP_LOGGED_IN
          return KEEP_LOGGED_IN;
        case 6: // ACCESS_LOCATION
          return ACCESS_LOCATION;
        case 7: // SYSTEM_NAME
          return SYSTEM_NAME;
        case 8: // CERTIFICATE
          return CERTIFICATE;
        case 9: // VERIFIER
          return VERIFIER;
        case 10: // SECRET
          return SECRET;
        case 11: // E2EE_VERSION
          return E2EE_VERSION;
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
  private static final int __TYPE_ISSET_ID = 0;
  private static final int __IDENTITYPROVIDER_ISSET_ID = 1;
  private static final int __KEEPLOGGEDIN_ISSET_ID = 2;
  private static final int __E2EEVERSION_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IDENTITY_PROVIDER, new org.apache.thrift.meta_data.FieldMetaData("identityProvider", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IDENTIFIER, new org.apache.thrift.meta_data.FieldMetaData("identifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEEP_LOGGED_IN, new org.apache.thrift.meta_data.FieldMetaData("keepLoggedIn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ACCESS_LOCATION, new org.apache.thrift.meta_data.FieldMetaData("accessLocation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SYSTEM_NAME, new org.apache.thrift.meta_data.FieldMetaData("systemName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CERTIFICATE, new org.apache.thrift.meta_data.FieldMetaData("certificate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERIFIER, new org.apache.thrift.meta_data.FieldMetaData("verifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECRET, new org.apache.thrift.meta_data.FieldMetaData("secret", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.E2EE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("e2eeVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(loginRequest.class, metaDataMap);
  }

  public loginRequest() {
  }

  public loginRequest(
    int type,
    int identityProvider,
    java.lang.String identifier,
    java.lang.String password,
    boolean keepLoggedIn,
    java.lang.String accessLocation,
    java.lang.String systemName,
    java.lang.String certificate,
    java.lang.String verifier,
    java.lang.String secret,
    int e2eeVersion)
  {
    this();
    this.type = type;
    setTypeIsSet(true);
    this.identityProvider = identityProvider;
    setIdentityProviderIsSet(true);
    this.identifier = identifier;
    this.password = password;
    this.keepLoggedIn = keepLoggedIn;
    setKeepLoggedInIsSet(true);
    this.accessLocation = accessLocation;
    this.systemName = systemName;
    this.certificate = certificate;
    this.verifier = verifier;
    this.secret = secret;
    this.e2eeVersion = e2eeVersion;
    setE2eeVersionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public loginRequest(loginRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.type = other.type;
    this.identityProvider = other.identityProvider;
    if (other.isSetIdentifier()) {
      this.identifier = other.identifier;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    this.keepLoggedIn = other.keepLoggedIn;
    if (other.isSetAccessLocation()) {
      this.accessLocation = other.accessLocation;
    }
    if (other.isSetSystemName()) {
      this.systemName = other.systemName;
    }
    if (other.isSetCertificate()) {
      this.certificate = other.certificate;
    }
    if (other.isSetVerifier()) {
      this.verifier = other.verifier;
    }
    if (other.isSetSecret()) {
      this.secret = other.secret;
    }
    this.e2eeVersion = other.e2eeVersion;
  }

  public loginRequest deepCopy() {
    return new loginRequest(this);
  }

  @Override
  public void clear() {
    setTypeIsSet(false);
    this.type = 0;
    setIdentityProviderIsSet(false);
    this.identityProvider = 0;
    this.identifier = null;
    this.password = null;
    setKeepLoggedInIsSet(false);
    this.keepLoggedIn = false;
    this.accessLocation = null;
    this.systemName = null;
    this.certificate = null;
    this.verifier = null;
    this.secret = null;
    setE2eeVersionIsSet(false);
    this.e2eeVersion = 0;
  }

  public int getType() {
    return this.type;
  }

  public loginRequest setType(int type) {
    this.type = type;
    setTypeIsSet(true);
    return this;
  }

  public void unsetType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TYPE_ISSET_ID);
  }

  public void setTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TYPE_ISSET_ID, value);
  }

  public int getIdentityProvider() {
    return this.identityProvider;
  }

  public loginRequest setIdentityProvider(int identityProvider) {
    this.identityProvider = identityProvider;
    setIdentityProviderIsSet(true);
    return this;
  }

  public void unsetIdentityProvider() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __IDENTITYPROVIDER_ISSET_ID);
  }

  /** Returns true if field identityProvider is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentityProvider() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __IDENTITYPROVIDER_ISSET_ID);
  }

  public void setIdentityProviderIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __IDENTITYPROVIDER_ISSET_ID, value);
  }

  public java.lang.String getIdentifier() {
    return this.identifier;
  }

  public loginRequest setIdentifier(java.lang.String identifier) {
    this.identifier = identifier;
    return this;
  }

  public void unsetIdentifier() {
    this.identifier = null;
  }

  /** Returns true if field identifier is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentifier() {
    return this.identifier != null;
  }

  public void setIdentifierIsSet(boolean value) {
    if (!value) {
      this.identifier = null;
    }
  }

  public java.lang.String getPassword() {
    return this.password;
  }

  public loginRequest setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public boolean isKeepLoggedIn() {
    return this.keepLoggedIn;
  }

  public loginRequest setKeepLoggedIn(boolean keepLoggedIn) {
    this.keepLoggedIn = keepLoggedIn;
    setKeepLoggedInIsSet(true);
    return this;
  }

  public void unsetKeepLoggedIn() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __KEEPLOGGEDIN_ISSET_ID);
  }

  /** Returns true if field keepLoggedIn is set (has been assigned a value) and false otherwise */
  public boolean isSetKeepLoggedIn() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __KEEPLOGGEDIN_ISSET_ID);
  }

  public void setKeepLoggedInIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __KEEPLOGGEDIN_ISSET_ID, value);
  }

  public java.lang.String getAccessLocation() {
    return this.accessLocation;
  }

  public loginRequest setAccessLocation(java.lang.String accessLocation) {
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

  public java.lang.String getSystemName() {
    return this.systemName;
  }

  public loginRequest setSystemName(java.lang.String systemName) {
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

  public java.lang.String getCertificate() {
    return this.certificate;
  }

  public loginRequest setCertificate(java.lang.String certificate) {
    this.certificate = certificate;
    return this;
  }

  public void unsetCertificate() {
    this.certificate = null;
  }

  /** Returns true if field certificate is set (has been assigned a value) and false otherwise */
  public boolean isSetCertificate() {
    return this.certificate != null;
  }

  public void setCertificateIsSet(boolean value) {
    if (!value) {
      this.certificate = null;
    }
  }

  public java.lang.String getVerifier() {
    return this.verifier;
  }

  public loginRequest setVerifier(java.lang.String verifier) {
    this.verifier = verifier;
    return this;
  }

  public void unsetVerifier() {
    this.verifier = null;
  }

  /** Returns true if field verifier is set (has been assigned a value) and false otherwise */
  public boolean isSetVerifier() {
    return this.verifier != null;
  }

  public void setVerifierIsSet(boolean value) {
    if (!value) {
      this.verifier = null;
    }
  }

  public java.lang.String getSecret() {
    return this.secret;
  }

  public loginRequest setSecret(java.lang.String secret) {
    this.secret = secret;
    return this;
  }

  public void unsetSecret() {
    this.secret = null;
  }

  /** Returns true if field secret is set (has been assigned a value) and false otherwise */
  public boolean isSetSecret() {
    return this.secret != null;
  }

  public void setSecretIsSet(boolean value) {
    if (!value) {
      this.secret = null;
    }
  }

  public int getE2eeVersion() {
    return this.e2eeVersion;
  }

  public loginRequest setE2eeVersion(int e2eeVersion) {
    this.e2eeVersion = e2eeVersion;
    setE2eeVersionIsSet(true);
    return this;
  }

  public void unsetE2eeVersion() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __E2EEVERSION_ISSET_ID);
  }

  /** Returns true if field e2eeVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetE2eeVersion() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __E2EEVERSION_ISSET_ID);
  }

  public void setE2eeVersionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __E2EEVERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((java.lang.Integer)value);
      }
      break;

    case IDENTITY_PROVIDER:
      if (value == null) {
        unsetIdentityProvider();
      } else {
        setIdentityProvider((java.lang.Integer)value);
      }
      break;

    case IDENTIFIER:
      if (value == null) {
        unsetIdentifier();
      } else {
        setIdentifier((java.lang.String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((java.lang.String)value);
      }
      break;

    case KEEP_LOGGED_IN:
      if (value == null) {
        unsetKeepLoggedIn();
      } else {
        setKeepLoggedIn((java.lang.Boolean)value);
      }
      break;

    case ACCESS_LOCATION:
      if (value == null) {
        unsetAccessLocation();
      } else {
        setAccessLocation((java.lang.String)value);
      }
      break;

    case SYSTEM_NAME:
      if (value == null) {
        unsetSystemName();
      } else {
        setSystemName((java.lang.String)value);
      }
      break;

    case CERTIFICATE:
      if (value == null) {
        unsetCertificate();
      } else {
        setCertificate((java.lang.String)value);
      }
      break;

    case VERIFIER:
      if (value == null) {
        unsetVerifier();
      } else {
        setVerifier((java.lang.String)value);
      }
      break;

    case SECRET:
      if (value == null) {
        unsetSecret();
      } else {
        setSecret((java.lang.String)value);
      }
      break;

    case E2EE_VERSION:
      if (value == null) {
        unsetE2eeVersion();
      } else {
        setE2eeVersion((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case IDENTITY_PROVIDER:
      return getIdentityProvider();

    case IDENTIFIER:
      return getIdentifier();

    case PASSWORD:
      return getPassword();

    case KEEP_LOGGED_IN:
      return isKeepLoggedIn();

    case ACCESS_LOCATION:
      return getAccessLocation();

    case SYSTEM_NAME:
      return getSystemName();

    case CERTIFICATE:
      return getCertificate();

    case VERIFIER:
      return getVerifier();

    case SECRET:
      return getSecret();

    case E2EE_VERSION:
      return getE2eeVersion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case IDENTITY_PROVIDER:
      return isSetIdentityProvider();
    case IDENTIFIER:
      return isSetIdentifier();
    case PASSWORD:
      return isSetPassword();
    case KEEP_LOGGED_IN:
      return isSetKeepLoggedIn();
    case ACCESS_LOCATION:
      return isSetAccessLocation();
    case SYSTEM_NAME:
      return isSetSystemName();
    case CERTIFICATE:
      return isSetCertificate();
    case VERIFIER:
      return isSetVerifier();
    case SECRET:
      return isSetSecret();
    case E2EE_VERSION:
      return isSetE2eeVersion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof loginRequest)
      return this.equals((loginRequest)that);
    return false;
  }

  public boolean equals(loginRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true;
    boolean that_present_type = true;
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (this.type != that.type)
        return false;
    }

    boolean this_present_identityProvider = true;
    boolean that_present_identityProvider = true;
    if (this_present_identityProvider || that_present_identityProvider) {
      if (!(this_present_identityProvider && that_present_identityProvider))
        return false;
      if (this.identityProvider != that.identityProvider)
        return false;
    }

    boolean this_present_identifier = true && this.isSetIdentifier();
    boolean that_present_identifier = true && that.isSetIdentifier();
    if (this_present_identifier || that_present_identifier) {
      if (!(this_present_identifier && that_present_identifier))
        return false;
      if (!this.identifier.equals(that.identifier))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_keepLoggedIn = true;
    boolean that_present_keepLoggedIn = true;
    if (this_present_keepLoggedIn || that_present_keepLoggedIn) {
      if (!(this_present_keepLoggedIn && that_present_keepLoggedIn))
        return false;
      if (this.keepLoggedIn != that.keepLoggedIn)
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

    boolean this_present_systemName = true && this.isSetSystemName();
    boolean that_present_systemName = true && that.isSetSystemName();
    if (this_present_systemName || that_present_systemName) {
      if (!(this_present_systemName && that_present_systemName))
        return false;
      if (!this.systemName.equals(that.systemName))
        return false;
    }

    boolean this_present_certificate = true && this.isSetCertificate();
    boolean that_present_certificate = true && that.isSetCertificate();
    if (this_present_certificate || that_present_certificate) {
      if (!(this_present_certificate && that_present_certificate))
        return false;
      if (!this.certificate.equals(that.certificate))
        return false;
    }

    boolean this_present_verifier = true && this.isSetVerifier();
    boolean that_present_verifier = true && that.isSetVerifier();
    if (this_present_verifier || that_present_verifier) {
      if (!(this_present_verifier && that_present_verifier))
        return false;
      if (!this.verifier.equals(that.verifier))
        return false;
    }

    boolean this_present_secret = true && this.isSetSecret();
    boolean that_present_secret = true && that.isSetSecret();
    if (this_present_secret || that_present_secret) {
      if (!(this_present_secret && that_present_secret))
        return false;
      if (!this.secret.equals(that.secret))
        return false;
    }

    boolean this_present_e2eeVersion = true;
    boolean that_present_e2eeVersion = true;
    if (this_present_e2eeVersion || that_present_e2eeVersion) {
      if (!(this_present_e2eeVersion && that_present_e2eeVersion))
        return false;
      if (this.e2eeVersion != that.e2eeVersion)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + type;

    hashCode = hashCode * 8191 + identityProvider;

    hashCode = hashCode * 8191 + ((isSetIdentifier()) ? 131071 : 524287);
    if (isSetIdentifier())
      hashCode = hashCode * 8191 + identifier.hashCode();

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    hashCode = hashCode * 8191 + ((keepLoggedIn) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetAccessLocation()) ? 131071 : 524287);
    if (isSetAccessLocation())
      hashCode = hashCode * 8191 + accessLocation.hashCode();

    hashCode = hashCode * 8191 + ((isSetSystemName()) ? 131071 : 524287);
    if (isSetSystemName())
      hashCode = hashCode * 8191 + systemName.hashCode();

    hashCode = hashCode * 8191 + ((isSetCertificate()) ? 131071 : 524287);
    if (isSetCertificate())
      hashCode = hashCode * 8191 + certificate.hashCode();

    hashCode = hashCode * 8191 + ((isSetVerifier()) ? 131071 : 524287);
    if (isSetVerifier())
      hashCode = hashCode * 8191 + verifier.hashCode();

    hashCode = hashCode * 8191 + ((isSetSecret()) ? 131071 : 524287);
    if (isSetSecret())
      hashCode = hashCode * 8191 + secret.hashCode();

    hashCode = hashCode * 8191 + e2eeVersion;

    return hashCode;
  }

  @Override
  public int compareTo(loginRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetIdentityProvider()).compareTo(other.isSetIdentityProvider());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentityProvider()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identityProvider, other.identityProvider);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIdentifier()).compareTo(other.isSetIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identifier, other.identifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKeepLoggedIn()).compareTo(other.isSetKeepLoggedIn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeepLoggedIn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keepLoggedIn, other.keepLoggedIn);
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
    lastComparison = java.lang.Boolean.valueOf(isSetCertificate()).compareTo(other.isSetCertificate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCertificate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.certificate, other.certificate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVerifier()).compareTo(other.isSetVerifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.verifier, other.verifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSecret()).compareTo(other.isSetSecret());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecret()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.secret, other.secret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetE2eeVersion()).compareTo(other.isSetE2eeVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetE2eeVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.e2eeVersion, other.e2eeVersion);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("loginRequest(");
    boolean first = true;

    sb.append("type:");
    sb.append(this.type);
    first = false;
    if (!first) sb.append(", ");
    sb.append("identityProvider:");
    sb.append(this.identityProvider);
    first = false;
    if (!first) sb.append(", ");
    sb.append("identifier:");
    if (this.identifier == null) {
      sb.append("null");
    } else {
      sb.append(this.identifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("keepLoggedIn:");
    sb.append(this.keepLoggedIn);
    first = false;
    if (!first) sb.append(", ");
    sb.append("accessLocation:");
    if (this.accessLocation == null) {
      sb.append("null");
    } else {
      sb.append(this.accessLocation);
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
    sb.append("certificate:");
    if (this.certificate == null) {
      sb.append("null");
    } else {
      sb.append(this.certificate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("verifier:");
    if (this.verifier == null) {
      sb.append("null");
    } else {
      sb.append(this.verifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("secret:");
    if (this.secret == null) {
      sb.append("null");
    } else {
      sb.append(this.secret);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("e2eeVersion:");
    sb.append(this.e2eeVersion);
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

  private static class loginRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public loginRequestStandardScheme getScheme() {
      return new loginRequestStandardScheme();
    }
  }

  private static class loginRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<loginRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, loginRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = iprot.readI32();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IDENTITY_PROVIDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.identityProvider = iprot.readI32();
              struct.setIdentityProviderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IDENTIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.identifier = iprot.readString();
              struct.setIdentifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // KEEP_LOGGED_IN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.keepLoggedIn = iprot.readBool();
              struct.setKeepLoggedInIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ACCESS_LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accessLocation = iprot.readString();
              struct.setAccessLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SYSTEM_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.systemName = iprot.readString();
              struct.setSystemNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CERTIFICATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.certificate = iprot.readString();
              struct.setCertificateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // VERIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.verifier = iprot.readString();
              struct.setVerifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // SECRET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.secret = iprot.readString();
              struct.setSecretIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // E2EE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.e2eeVersion = iprot.readI32();
              struct.setE2eeVersionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, loginRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(struct.type);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IDENTITY_PROVIDER_FIELD_DESC);
      oprot.writeI32(struct.identityProvider);
      oprot.writeFieldEnd();
      if (struct.identifier != null) {
        oprot.writeFieldBegin(IDENTIFIER_FIELD_DESC);
        oprot.writeString(struct.identifier);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(KEEP_LOGGED_IN_FIELD_DESC);
      oprot.writeBool(struct.keepLoggedIn);
      oprot.writeFieldEnd();
      if (struct.accessLocation != null) {
        oprot.writeFieldBegin(ACCESS_LOCATION_FIELD_DESC);
        oprot.writeString(struct.accessLocation);
        oprot.writeFieldEnd();
      }
      if (struct.systemName != null) {
        oprot.writeFieldBegin(SYSTEM_NAME_FIELD_DESC);
        oprot.writeString(struct.systemName);
        oprot.writeFieldEnd();
      }
      if (struct.certificate != null) {
        oprot.writeFieldBegin(CERTIFICATE_FIELD_DESC);
        oprot.writeString(struct.certificate);
        oprot.writeFieldEnd();
      }
      if (struct.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(struct.verifier);
        oprot.writeFieldEnd();
      }
      if (struct.secret != null) {
        oprot.writeFieldBegin(SECRET_FIELD_DESC);
        oprot.writeString(struct.secret);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(E2EE_VERSION_FIELD_DESC);
      oprot.writeI32(struct.e2eeVersion);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class loginRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public loginRequestTupleScheme getScheme() {
      return new loginRequestTupleScheme();
    }
  }

  private static class loginRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<loginRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, loginRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetIdentityProvider()) {
        optionals.set(1);
      }
      if (struct.isSetIdentifier()) {
        optionals.set(2);
      }
      if (struct.isSetPassword()) {
        optionals.set(3);
      }
      if (struct.isSetKeepLoggedIn()) {
        optionals.set(4);
      }
      if (struct.isSetAccessLocation()) {
        optionals.set(5);
      }
      if (struct.isSetSystemName()) {
        optionals.set(6);
      }
      if (struct.isSetCertificate()) {
        optionals.set(7);
      }
      if (struct.isSetVerifier()) {
        optionals.set(8);
      }
      if (struct.isSetSecret()) {
        optionals.set(9);
      }
      if (struct.isSetE2eeVersion()) {
        optionals.set(10);
      }
      oprot.writeBitSet(optionals, 11);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type);
      }
      if (struct.isSetIdentityProvider()) {
        oprot.writeI32(struct.identityProvider);
      }
      if (struct.isSetIdentifier()) {
        oprot.writeString(struct.identifier);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetKeepLoggedIn()) {
        oprot.writeBool(struct.keepLoggedIn);
      }
      if (struct.isSetAccessLocation()) {
        oprot.writeString(struct.accessLocation);
      }
      if (struct.isSetSystemName()) {
        oprot.writeString(struct.systemName);
      }
      if (struct.isSetCertificate()) {
        oprot.writeString(struct.certificate);
      }
      if (struct.isSetVerifier()) {
        oprot.writeString(struct.verifier);
      }
      if (struct.isSetSecret()) {
        oprot.writeString(struct.secret);
      }
      if (struct.isSetE2eeVersion()) {
        oprot.writeI32(struct.e2eeVersion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, loginRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(11);
      if (incoming.get(0)) {
        struct.type = iprot.readI32();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.identityProvider = iprot.readI32();
        struct.setIdentityProviderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.identifier = iprot.readString();
        struct.setIdentifierIsSet(true);
      }
      if (incoming.get(3)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(4)) {
        struct.keepLoggedIn = iprot.readBool();
        struct.setKeepLoggedInIsSet(true);
      }
      if (incoming.get(5)) {
        struct.accessLocation = iprot.readString();
        struct.setAccessLocationIsSet(true);
      }
      if (incoming.get(6)) {
        struct.systemName = iprot.readString();
        struct.setSystemNameIsSet(true);
      }
      if (incoming.get(7)) {
        struct.certificate = iprot.readString();
        struct.setCertificateIsSet(true);
      }
      if (incoming.get(8)) {
        struct.verifier = iprot.readString();
        struct.setVerifierIsSet(true);
      }
      if (incoming.get(9)) {
        struct.secret = iprot.readString();
        struct.setSecretIsSet(true);
      }
      if (incoming.get(10)) {
        struct.e2eeVersion = iprot.readI32();
        struct.setE2eeVersionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

