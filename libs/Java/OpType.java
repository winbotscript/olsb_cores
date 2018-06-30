/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum OpType implements org.apache.thrift.TEnum {
  END_OF_OPERATION(0),
  UPDATE_PROFILE(1),
  UPDATE_SETTINGS(36),
  NOTIFIED_UPDATE_PROFILE(2),
  REGISTER_USERID(3),
  ADD_CONTACT(4),
  NOTIFIED_ADD_CONTACT(5),
  BLOCK_CONTACT(6),
  UNBLOCK_CONTACT(7),
  NOTIFIED_RECOMMEND_CONTACT(8),
  CREATE_GROUP(9),
  UPDATE_GROUP(10),
  NOTIFIED_UPDATE_GROUP(11),
  INVITE_INTO_GROUP(12),
  NOTIFIED_INVITE_INTO_GROUP(13),
  CANCEL_INVITATION_GROUP(31),
  NOTIFIED_CANCEL_INVITATION_GROUP(32),
  LEAVE_GROUP(14),
  NOTIFIED_LEAVE_GROUP(15),
  ACCEPT_GROUP_INVITATION(16),
  NOTIFIED_ACCEPT_GROUP_INVITATION(17),
  REJECT_GROUP_INVITATION(34),
  NOTIFIED_REJECT_GROUP_INVITATION(35),
  KICKOUT_FROM_GROUP(18),
  NOTIFIED_KICKOUT_FROM_GROUP(19),
  CREATE_ROOM(20),
  INVITE_INTO_ROOM(21),
  NOTIFIED_INVITE_INTO_ROOM(22),
  LEAVE_ROOM(23),
  NOTIFIED_LEAVE_ROOM(24),
  SEND_MESSAGE(25),
  RECEIVE_MESSAGE(26),
  SEND_MESSAGE_RECEIPT(27),
  RECEIVE_MESSAGE_RECEIPT(28),
  SEND_CONTENT_RECEIPT(29),
  SEND_CHAT_CHECKED(40),
  SEND_CHAT_REMOVED(41),
  RECEIVE_ANNOUNCEMENT(30),
  INVITE_VIA_EMAIL(38),
  NOTIFIED_REGISTER_USER(37),
  NOTIFIED_UNREGISTER_USER(33),
  NOTIFIED_REQUEST_RECOVERY(39),
  NOTIFIED_FORCE_SYNC(42),
  SEND_CONTENT(43),
  SEND_MESSAGE_MYHOME(44),
  NOTIFIED_UPDATE_CONTENT_PREVIEW(45),
  REMOVE_ALL_MESSAGES(46),
  NOTIFIED_UPDATE_PURCHASES(47),
  DUMMY(48),
  UPDATE_CONTACT(49),
  NOTIFIED_RECEIVED_CALL(50),
  CANCEL_CALL(51),
  NOTIFIED_REDIRECT(52),
  NOTIFIED_CHANNEL_SYNC(53),
  FAILED_SEND_MESSAGE(54),
  NOTIFIED_READ_MESSAGE(55),
  FAILED_EMAIL_CONFIRMATION(56),
  NOTIFIED_PUSH_NOTICENTER_ITEM(59),
  NOTIFIED_CHAT_CONTENT(58),
  NOTIFIED_JOIN_CHAT(60),
  NOTIFIED_LEAVE_CHAT(61),
  NOTIFIED_TYPING(62),
  FRIEND_REQUEST_ACCEPTED(63),
  DESTROY_MESSAGE(64),
  NOTIFIED_DESTROY_MESSAGE(65),
  UPDATE_PUBLICKEYCHAIN(66),
  NOTIFIED_UPDATE_PUBLICKEYCHAIN(67),
  NOTIFIED_BLOCK_CONTACT(68),
  NOTIFIED_UNBLOCK_CONTACT(69),
  UPDATE_GROUPPREFERENCE(70),
  NOTIFIED_PAYMENT_EVENT(71),
  REGISTER_E2EE_PUBLICKEY(72),
  NOTIFIED_E2EE_KEY_EXCHANGE_REQ(73),
  NOTIFIED_E2EE_KEY_EXCHANGE_RESP(74),
  NOTIFIED_E2EE_MESSAGE_RESEND_REQ(75),
  NOTIFIED_E2EE_MESSAGE_RESEND_RESP(76),
  NOTIFIED_E2EE_KEY_UPDATE(77),
  NOTIFIED_BUDDY_UPDATE_PROFILE(78),
  NOTIFIED_UPDATE_LINEAT_TABS(79),
  UPDATE_ROOM(80),
  NOTIFIED_BEACON_DETECTED(81),
  UPDATE_EXTENDED_PROFILE(82),
  ADD_FOLLOW(83),
  NOTIFIED_ADD_FOLLOW(84),
  DELETE_FOLLOW(85),
  NOTIFIED_DELETE_FOLLOW(86),
  UPDATE_TIMELINE_SETTINGS(87),
  NOTIFIED_FRIEND_REQUEST(88),
  UPDATE_RINGBACK_TONE(89),
  NOTIFIED_POSTBACK(90),
  RECEIVE_READ_WATERMARK(91),
  NOTIFIED_MESSAGE_DELIVERED(92),
  NOTIFIED_UPDATE_CHAT_BAR(93),
  NOTIFIED_CHATAPP_INSTALLED(94),
  NOTIFIED_CHATAPP_UPDATED(95),
  NOTIFIED_CHATAPP_NEW_MARK(96),
  NOTIFIED_CHATAPP_DELETED(97),
  NOTIFIED_CHATAPP_SYNC(98),
  NOTIFIED_UPDATE_MESSAGE(99);

  private final int value;

  private OpType(int value) {
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
  public static OpType findByValue(int value) { 
    switch (value) {
      case 0:
        return END_OF_OPERATION;
      case 1:
        return UPDATE_PROFILE;
      case 36:
        return UPDATE_SETTINGS;
      case 2:
        return NOTIFIED_UPDATE_PROFILE;
      case 3:
        return REGISTER_USERID;
      case 4:
        return ADD_CONTACT;
      case 5:
        return NOTIFIED_ADD_CONTACT;
      case 6:
        return BLOCK_CONTACT;
      case 7:
        return UNBLOCK_CONTACT;
      case 8:
        return NOTIFIED_RECOMMEND_CONTACT;
      case 9:
        return CREATE_GROUP;
      case 10:
        return UPDATE_GROUP;
      case 11:
        return NOTIFIED_UPDATE_GROUP;
      case 12:
        return INVITE_INTO_GROUP;
      case 13:
        return NOTIFIED_INVITE_INTO_GROUP;
      case 31:
        return CANCEL_INVITATION_GROUP;
      case 32:
        return NOTIFIED_CANCEL_INVITATION_GROUP;
      case 14:
        return LEAVE_GROUP;
      case 15:
        return NOTIFIED_LEAVE_GROUP;
      case 16:
        return ACCEPT_GROUP_INVITATION;
      case 17:
        return NOTIFIED_ACCEPT_GROUP_INVITATION;
      case 34:
        return REJECT_GROUP_INVITATION;
      case 35:
        return NOTIFIED_REJECT_GROUP_INVITATION;
      case 18:
        return KICKOUT_FROM_GROUP;
      case 19:
        return NOTIFIED_KICKOUT_FROM_GROUP;
      case 20:
        return CREATE_ROOM;
      case 21:
        return INVITE_INTO_ROOM;
      case 22:
        return NOTIFIED_INVITE_INTO_ROOM;
      case 23:
        return LEAVE_ROOM;
      case 24:
        return NOTIFIED_LEAVE_ROOM;
      case 25:
        return SEND_MESSAGE;
      case 26:
        return RECEIVE_MESSAGE;
      case 27:
        return SEND_MESSAGE_RECEIPT;
      case 28:
        return RECEIVE_MESSAGE_RECEIPT;
      case 29:
        return SEND_CONTENT_RECEIPT;
      case 40:
        return SEND_CHAT_CHECKED;
      case 41:
        return SEND_CHAT_REMOVED;
      case 30:
        return RECEIVE_ANNOUNCEMENT;
      case 38:
        return INVITE_VIA_EMAIL;
      case 37:
        return NOTIFIED_REGISTER_USER;
      case 33:
        return NOTIFIED_UNREGISTER_USER;
      case 39:
        return NOTIFIED_REQUEST_RECOVERY;
      case 42:
        return NOTIFIED_FORCE_SYNC;
      case 43:
        return SEND_CONTENT;
      case 44:
        return SEND_MESSAGE_MYHOME;
      case 45:
        return NOTIFIED_UPDATE_CONTENT_PREVIEW;
      case 46:
        return REMOVE_ALL_MESSAGES;
      case 47:
        return NOTIFIED_UPDATE_PURCHASES;
      case 48:
        return DUMMY;
      case 49:
        return UPDATE_CONTACT;
      case 50:
        return NOTIFIED_RECEIVED_CALL;
      case 51:
        return CANCEL_CALL;
      case 52:
        return NOTIFIED_REDIRECT;
      case 53:
        return NOTIFIED_CHANNEL_SYNC;
      case 54:
        return FAILED_SEND_MESSAGE;
      case 55:
        return NOTIFIED_READ_MESSAGE;
      case 56:
        return FAILED_EMAIL_CONFIRMATION;
      case 59:
        return NOTIFIED_PUSH_NOTICENTER_ITEM;
      case 58:
        return NOTIFIED_CHAT_CONTENT;
      case 60:
        return NOTIFIED_JOIN_CHAT;
      case 61:
        return NOTIFIED_LEAVE_CHAT;
      case 62:
        return NOTIFIED_TYPING;
      case 63:
        return FRIEND_REQUEST_ACCEPTED;
      case 64:
        return DESTROY_MESSAGE;
      case 65:
        return NOTIFIED_DESTROY_MESSAGE;
      case 66:
        return UPDATE_PUBLICKEYCHAIN;
      case 67:
        return NOTIFIED_UPDATE_PUBLICKEYCHAIN;
      case 68:
        return NOTIFIED_BLOCK_CONTACT;
      case 69:
        return NOTIFIED_UNBLOCK_CONTACT;
      case 70:
        return UPDATE_GROUPPREFERENCE;
      case 71:
        return NOTIFIED_PAYMENT_EVENT;
      case 72:
        return REGISTER_E2EE_PUBLICKEY;
      case 73:
        return NOTIFIED_E2EE_KEY_EXCHANGE_REQ;
      case 74:
        return NOTIFIED_E2EE_KEY_EXCHANGE_RESP;
      case 75:
        return NOTIFIED_E2EE_MESSAGE_RESEND_REQ;
      case 76:
        return NOTIFIED_E2EE_MESSAGE_RESEND_RESP;
      case 77:
        return NOTIFIED_E2EE_KEY_UPDATE;
      case 78:
        return NOTIFIED_BUDDY_UPDATE_PROFILE;
      case 79:
        return NOTIFIED_UPDATE_LINEAT_TABS;
      case 80:
        return UPDATE_ROOM;
      case 81:
        return NOTIFIED_BEACON_DETECTED;
      case 82:
        return UPDATE_EXTENDED_PROFILE;
      case 83:
        return ADD_FOLLOW;
      case 84:
        return NOTIFIED_ADD_FOLLOW;
      case 85:
        return DELETE_FOLLOW;
      case 86:
        return NOTIFIED_DELETE_FOLLOW;
      case 87:
        return UPDATE_TIMELINE_SETTINGS;
      case 88:
        return NOTIFIED_FRIEND_REQUEST;
      case 89:
        return UPDATE_RINGBACK_TONE;
      case 90:
        return NOTIFIED_POSTBACK;
      case 91:
        return RECEIVE_READ_WATERMARK;
      case 92:
        return NOTIFIED_MESSAGE_DELIVERED;
      case 93:
        return NOTIFIED_UPDATE_CHAT_BAR;
      case 94:
        return NOTIFIED_CHATAPP_INSTALLED;
      case 95:
        return NOTIFIED_CHATAPP_UPDATED;
      case 96:
        return NOTIFIED_CHATAPP_NEW_MARK;
      case 97:
        return NOTIFIED_CHATAPP_DELETED;
      case 98:
        return NOTIFIED_CHATAPP_SYNC;
      case 99:
        return NOTIFIED_UPDATE_MESSAGE;
      default:
        return null;
    }
  }
}
