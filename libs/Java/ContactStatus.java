/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum ContactStatus implements org.apache.thrift.TEnum {
  UNSPECIFIED(0),
  FRIEND(1),
  FRIEND_BLOCKED(2),
  RECOMMEND(3),
  RECOMMEND_BLOCKED(4),
  DELETED(5),
  DELETED_BLOCKED(6);

  private final int value;

  private ContactStatus(int value) {
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
  public static ContactStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return UNSPECIFIED;
      case 1:
        return FRIEND;
      case 2:
        return FRIEND_BLOCKED;
      case 3:
        return RECOMMEND;
      case 4:
        return RECOMMEND_BLOCKED;
      case 5:
        return DELETED;
      case 6:
        return DELETED_BLOCKED;
      default:
        return null;
    }
  }
}
