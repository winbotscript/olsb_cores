/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum LoginType implements org.apache.thrift.TEnum {
  ID_CREDENTIAL(0),
  QRCODE(1),
  ID_CREDENTIAL_WITH_E2EE(2);

  private final int value;

  private LoginType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static LoginType findByValue(int value) { 
    switch (value) {
      case 0:
        return ID_CREDENTIAL;
      case 1:
        return QRCODE;
      case 2:
        return ID_CREDENTIAL_WITH_E2EE;
      default:
        return null;
    }
  }
}
