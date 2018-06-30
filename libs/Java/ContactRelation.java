/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum ContactRelation implements org.apache.thrift.TEnum {
  ONEWAY(0),
  BOTH(1),
  NOT_REGISTERED(2);

  private final int value;

  private ContactRelation(int value) {
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
  public static ContactRelation findByValue(int value) { 
    switch (value) {
      case 0:
        return ONEWAY;
      case 1:
        return BOTH;
      case 2:
        return NOT_REGISTERED;
      default:
        return null;
    }
  }
}
