/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum MIDType implements org.apache.thrift.TEnum {
  USER(0),
  ROOM(1),
  GROUP(2),
  SQUARE(3),
  SQUARE_CHAT(4),
  SQUARE_MEMBER(5),
  BOT(6);

  private final int value;

  private MIDType(int value) {
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
  public static MIDType findByValue(int value) { 
    switch (value) {
      case 0:
        return USER;
      case 1:
        return ROOM;
      case 2:
        return GROUP;
      case 3:
        return SQUARE;
      case 4:
        return SQUARE_CHAT;
      case 5:
        return SQUARE_MEMBER;
      case 6:
        return BOT;
      default:
        return null;
    }
  }
}
