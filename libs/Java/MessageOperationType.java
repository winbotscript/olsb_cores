/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum MessageOperationType implements org.apache.thrift.TEnum {
  SEND_MESSAGE(1),
  RECEIVE_MESSAGE(2),
  READ_MESSAGE(3),
  NOTIFIED_READ_MESSAGE(4),
  NOTIFIED_JOIN_CHAT(5),
  FAILED_SEND_MESSAGE(6),
  SEND_CONTENT(7),
  SEND_CONTENT_RECEIPT(8),
  SEND_CHAT_REMOVED(9),
  REMOVE_ALL_MESSAGES(10);

  private final int value;

  private MessageOperationType(int value) {
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
  public static MessageOperationType findByValue(int value) { 
    switch (value) {
      case 1:
        return SEND_MESSAGE;
      case 2:
        return RECEIVE_MESSAGE;
      case 3:
        return READ_MESSAGE;
      case 4:
        return NOTIFIED_READ_MESSAGE;
      case 5:
        return NOTIFIED_JOIN_CHAT;
      case 6:
        return FAILED_SEND_MESSAGE;
      case 7:
        return SEND_CONTENT;
      case 8:
        return SEND_CONTENT_RECEIPT;
      case 9:
        return SEND_CHAT_REMOVED;
      case 10:
        return REMOVE_ALL_MESSAGES;
      default:
        return null;
    }
  }
}
