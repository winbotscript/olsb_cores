/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum ErrorCode implements org.apache.thrift.TEnum {
  ILLEGAL_ARGUMENT(0),
  AUTHENTICATION_FAILED(1),
  DB_FAILED(2),
  INVALID_STATE(3),
  EXCESSIVE_ACCESS(4),
  NOT_FOUND(5),
  INVALID_MID(9),
  NOT_A_MEMBER(10),
  INVALID_LENGTH(6),
  NOT_AVAILABLE_USER(7),
  NOT_AUTHORIZED_DEVICE(8),
  NOT_AUTHORIZED_SESSION(14),
  INCOMPATIBLE_APP_VERSION(11),
  NOT_READY(12),
  NOT_AVAILABLE_SESSION(13),
  SYSTEM_ERROR(15),
  NO_AVAILABLE_VERIFICATION_METHOD(16),
  NOT_AUTHENTICATED(17),
  INVALID_IDENTITY_CREDENTIAL(18),
  NOT_AVAILABLE_IDENTITY_IDENTIFIER(19),
  INTERNAL_ERROR(20),
  NO_SUCH_IDENTITY_IDENFIER(21),
  DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY(22),
  ILLEGAL_IDENTITY_CREDENTIAL(23),
  UNKNOWN_CHANNEL(24),
  NO_SUCH_MESSAGE_BOX(25),
  NOT_AVAILABLE_MESSAGE_BOX(26),
  CHANNEL_DOES_NOT_MATCH(27),
  NOT_YOUR_MESSAGE(28),
  MESSAGE_DEFINED_ERROR(29),
  USER_CANNOT_ACCEPT_PRESENTS(30),
  USER_NOT_STICKER_OWNER(32),
  MAINTENANCE_ERROR(33),
  ACCOUNT_NOT_MATCHED(34),
  ABUSE_BLOCK(35),
  NOT_FRIEND(36),
  NOT_ALLOWED_CALL(37),
  BLOCK_FRIEND(38),
  INCOMPATIBLE_VOIP_VERSION(39),
  INVALID_SNS_ACCESS_TOKEN(40),
  EXTERNAL_SERVICE_NOT_AVAILABLE(41),
  NOT_ALLOWED_ADD_CONTACT(42),
  NOT_CERTIFICATED(43),
  NOT_ALLOWED_SECONDARY_DEVICE(44),
  INVALID_PIN_CODE(45),
  NOT_FOUND_IDENTITY_CREDENTIAL(46),
  EXCEED_FILE_MAX_SIZE(47),
  EXCEED_DAILY_QUOTA(48),
  NOT_SUPPORT_SEND_FILE(49),
  MUST_UPGRADE(50),
  NOT_AVAILABLE_PIN_CODE_SESSION(51),
  EXPIRED_REVISION(52),
  NOT_YET_PHONE_NUMBER(54),
  BAD_CALL_NUMBER(55),
  UNAVAILABLE_CALL_NUMBER(56),
  NOT_SUPPORT_CALL_SERVICE(57),
  CONGESTION_CONTROL(58),
  NO_BALANCE(59),
  NOT_PERMITTED_CALLER_ID(60),
  NO_CALLER_ID_LIMIT_EXCEEDED(61),
  CALLER_ID_VERIFICATION_REQUIRED(62),
  NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED(63),
  MESSAGE_NOT_FOUND(64),
  INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT(65),
  ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED(66),
  ACCOUNT_MIGRATION_PINCODE_BLOCKED(67),
  INVALID_PASSWORD_FORMAT(69),
  FEATURE_RESTRICTED(70),
  MESSAGE_NOT_DESTRUCTIBLE(71),
  PAID_CALL_REDEEM_FAILED(72),
  PREVENTED_JOIN_BY_TICKET(73),
  SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT(75),
  SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY(76),
  SECURITY_CENTER_NOT_VERIFIED(77),
  SECURITY_CENTER_BLOCKED_BY_SETTING(78),
  SECURITY_CENTER_BLOCKED(79),
  TALK_PROXY_EXCEPTION(80),
  E2EE_INVALID_PROTOCOL(81),
  E2EE_RETRY_ENCRYPT(82),
  E2EE_UPDATE_SENDER_KEY(83),
  E2EE_UPDATE_RECEIVER_KEY(84),
  E2EE_INVALID_ARGUMENT(85),
  E2EE_INVALID_VERSION(86),
  E2EE_SENDER_DISABLED(87),
  E2EE_RECEIVER_DISABLED(88),
  E2EE_SENDER_NOT_ALLOWED(89),
  E2EE_RECEIVER_NOT_ALLOWED(90),
  E2EE_RESEND_FAIL(91),
  E2EE_RESEND_OK(92),
  HITOKOTO_BACKUP_NO_AVAILABLE_DATA(93),
  E2EE_UPDATE_PRIMARY_DEVICE(94),
  SUCCESS(95),
  CANCEL(96),
  E2EE_PRIMARY_NOT_SUPPORT(97),
  E2EE_RETRY_PLAIN(98),
  E2EE_RECREATE_GROUP_KEY(99),
  E2EE_GROUP_TOO_MANY_MEMBERS(100),
  SERVER_BUSY(101),
  NOT_ALLOWED_ADD_FOLLOW(102),
  INCOMING_FRIEND_REQUEST_LIMIT(103),
  OUTGOING_FRIEND_REQUEST_LIMIT(104),
  OUTGOING_FRIEND_REQUEST_QUOTA(105),
  DUPLICATED(106),
  BANNED(107);

  private final int value;

  private ErrorCode(int value) {
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
  public static ErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return ILLEGAL_ARGUMENT;
      case 1:
        return AUTHENTICATION_FAILED;
      case 2:
        return DB_FAILED;
      case 3:
        return INVALID_STATE;
      case 4:
        return EXCESSIVE_ACCESS;
      case 5:
        return NOT_FOUND;
      case 9:
        return INVALID_MID;
      case 10:
        return NOT_A_MEMBER;
      case 6:
        return INVALID_LENGTH;
      case 7:
        return NOT_AVAILABLE_USER;
      case 8:
        return NOT_AUTHORIZED_DEVICE;
      case 14:
        return NOT_AUTHORIZED_SESSION;
      case 11:
        return INCOMPATIBLE_APP_VERSION;
      case 12:
        return NOT_READY;
      case 13:
        return NOT_AVAILABLE_SESSION;
      case 15:
        return SYSTEM_ERROR;
      case 16:
        return NO_AVAILABLE_VERIFICATION_METHOD;
      case 17:
        return NOT_AUTHENTICATED;
      case 18:
        return INVALID_IDENTITY_CREDENTIAL;
      case 19:
        return NOT_AVAILABLE_IDENTITY_IDENTIFIER;
      case 20:
        return INTERNAL_ERROR;
      case 21:
        return NO_SUCH_IDENTITY_IDENFIER;
      case 22:
        return DEACTIVATED_ACCOUNT_BOUND_TO_THIS_IDENTITY;
      case 23:
        return ILLEGAL_IDENTITY_CREDENTIAL;
      case 24:
        return UNKNOWN_CHANNEL;
      case 25:
        return NO_SUCH_MESSAGE_BOX;
      case 26:
        return NOT_AVAILABLE_MESSAGE_BOX;
      case 27:
        return CHANNEL_DOES_NOT_MATCH;
      case 28:
        return NOT_YOUR_MESSAGE;
      case 29:
        return MESSAGE_DEFINED_ERROR;
      case 30:
        return USER_CANNOT_ACCEPT_PRESENTS;
      case 32:
        return USER_NOT_STICKER_OWNER;
      case 33:
        return MAINTENANCE_ERROR;
      case 34:
        return ACCOUNT_NOT_MATCHED;
      case 35:
        return ABUSE_BLOCK;
      case 36:
        return NOT_FRIEND;
      case 37:
        return NOT_ALLOWED_CALL;
      case 38:
        return BLOCK_FRIEND;
      case 39:
        return INCOMPATIBLE_VOIP_VERSION;
      case 40:
        return INVALID_SNS_ACCESS_TOKEN;
      case 41:
        return EXTERNAL_SERVICE_NOT_AVAILABLE;
      case 42:
        return NOT_ALLOWED_ADD_CONTACT;
      case 43:
        return NOT_CERTIFICATED;
      case 44:
        return NOT_ALLOWED_SECONDARY_DEVICE;
      case 45:
        return INVALID_PIN_CODE;
      case 46:
        return NOT_FOUND_IDENTITY_CREDENTIAL;
      case 47:
        return EXCEED_FILE_MAX_SIZE;
      case 48:
        return EXCEED_DAILY_QUOTA;
      case 49:
        return NOT_SUPPORT_SEND_FILE;
      case 50:
        return MUST_UPGRADE;
      case 51:
        return NOT_AVAILABLE_PIN_CODE_SESSION;
      case 52:
        return EXPIRED_REVISION;
      case 54:
        return NOT_YET_PHONE_NUMBER;
      case 55:
        return BAD_CALL_NUMBER;
      case 56:
        return UNAVAILABLE_CALL_NUMBER;
      case 57:
        return NOT_SUPPORT_CALL_SERVICE;
      case 58:
        return CONGESTION_CONTROL;
      case 59:
        return NO_BALANCE;
      case 60:
        return NOT_PERMITTED_CALLER_ID;
      case 61:
        return NO_CALLER_ID_LIMIT_EXCEEDED;
      case 62:
        return CALLER_ID_VERIFICATION_REQUIRED;
      case 63:
        return NO_CALLER_ID_LIMIT_EXCEEDED_AND_VERIFICATION_REQUIRED;
      case 64:
        return MESSAGE_NOT_FOUND;
      case 65:
        return INVALID_ACCOUNT_MIGRATION_PINCODE_FORMAT;
      case 66:
        return ACCOUNT_MIGRATION_PINCODE_NOT_MATCHED;
      case 67:
        return ACCOUNT_MIGRATION_PINCODE_BLOCKED;
      case 69:
        return INVALID_PASSWORD_FORMAT;
      case 70:
        return FEATURE_RESTRICTED;
      case 71:
        return MESSAGE_NOT_DESTRUCTIBLE;
      case 72:
        return PAID_CALL_REDEEM_FAILED;
      case 73:
        return PREVENTED_JOIN_BY_TICKET;
      case 75:
        return SEND_MESSAGE_NOT_PERMITTED_FROM_LINE_AT;
      case 76:
        return SEND_MESSAGE_NOT_PERMITTED_WHILE_AUTO_REPLY;
      case 77:
        return SECURITY_CENTER_NOT_VERIFIED;
      case 78:
        return SECURITY_CENTER_BLOCKED_BY_SETTING;
      case 79:
        return SECURITY_CENTER_BLOCKED;
      case 80:
        return TALK_PROXY_EXCEPTION;
      case 81:
        return E2EE_INVALID_PROTOCOL;
      case 82:
        return E2EE_RETRY_ENCRYPT;
      case 83:
        return E2EE_UPDATE_SENDER_KEY;
      case 84:
        return E2EE_UPDATE_RECEIVER_KEY;
      case 85:
        return E2EE_INVALID_ARGUMENT;
      case 86:
        return E2EE_INVALID_VERSION;
      case 87:
        return E2EE_SENDER_DISABLED;
      case 88:
        return E2EE_RECEIVER_DISABLED;
      case 89:
        return E2EE_SENDER_NOT_ALLOWED;
      case 90:
        return E2EE_RECEIVER_NOT_ALLOWED;
      case 91:
        return E2EE_RESEND_FAIL;
      case 92:
        return E2EE_RESEND_OK;
      case 93:
        return HITOKOTO_BACKUP_NO_AVAILABLE_DATA;
      case 94:
        return E2EE_UPDATE_PRIMARY_DEVICE;
      case 95:
        return SUCCESS;
      case 96:
        return CANCEL;
      case 97:
        return E2EE_PRIMARY_NOT_SUPPORT;
      case 98:
        return E2EE_RETRY_PLAIN;
      case 99:
        return E2EE_RECREATE_GROUP_KEY;
      case 100:
        return E2EE_GROUP_TOO_MANY_MEMBERS;
      case 101:
        return SERVER_BUSY;
      case 102:
        return NOT_ALLOWED_ADD_FOLLOW;
      case 103:
        return INCOMING_FRIEND_REQUEST_LIMIT;
      case 104:
        return OUTGOING_FRIEND_REQUEST_LIMIT;
      case 105:
        return OUTGOING_FRIEND_REQUEST_QUOTA;
      case 106:
        return DUPLICATED;
      case 107:
        return BANNED;
      default:
        return null;
    }
  }
}
