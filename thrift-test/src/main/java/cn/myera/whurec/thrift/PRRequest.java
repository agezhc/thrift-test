/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.myera.whurec.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-4-21")
public class PRRequest implements org.apache.thrift.TBase<PRRequest, PRRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PRRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PRRequest");

  private static final org.apache.thrift.protocol.TField STU_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stu_id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField STU_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("stu_number", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STU_MODEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("stu_model_id", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("page_size", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField PAGE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("page_index", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField IS_PAGE_SHUFFLE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_page_shuffle", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField IS_ALL_SHUFFLE_FIELD_DESC = new org.apache.thrift.protocol.TField("is_all_shuffle", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PRRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PRRequestTupleSchemeFactory());
  }

  public String stu_id; // required
  public String stu_number; // required
  public int stu_model_id; // required
  public int page_size; // required
  public int page_index; // required
  public boolean is_page_shuffle; // required
  public boolean is_all_shuffle; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STU_ID((short)1, "stu_id"),
    STU_NUMBER((short)2, "stu_number"),
    STU_MODEL_ID((short)3, "stu_model_id"),
    PAGE_SIZE((short)4, "page_size"),
    PAGE_INDEX((short)5, "page_index"),
    IS_PAGE_SHUFFLE((short)6, "is_page_shuffle"),
    IS_ALL_SHUFFLE((short)7, "is_all_shuffle");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STU_ID
          return STU_ID;
        case 2: // STU_NUMBER
          return STU_NUMBER;
        case 3: // STU_MODEL_ID
          return STU_MODEL_ID;
        case 4: // PAGE_SIZE
          return PAGE_SIZE;
        case 5: // PAGE_INDEX
          return PAGE_INDEX;
        case 6: // IS_PAGE_SHUFFLE
          return IS_PAGE_SHUFFLE;
        case 7: // IS_ALL_SHUFFLE
          return IS_ALL_SHUFFLE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STU_MODEL_ID_ISSET_ID = 0;
  private static final int __PAGE_SIZE_ISSET_ID = 1;
  private static final int __PAGE_INDEX_ISSET_ID = 2;
  private static final int __IS_PAGE_SHUFFLE_ISSET_ID = 3;
  private static final int __IS_ALL_SHUFFLE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STU_ID, new org.apache.thrift.meta_data.FieldMetaData("stu_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STU_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("stu_number", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STU_MODEL_ID, new org.apache.thrift.meta_data.FieldMetaData("stu_model_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("page_size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("page_index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IS_PAGE_SHUFFLE, new org.apache.thrift.meta_data.FieldMetaData("is_page_shuffle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_ALL_SHUFFLE, new org.apache.thrift.meta_data.FieldMetaData("is_all_shuffle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PRRequest.class, metaDataMap);
  }

  public PRRequest() {
  }

  public PRRequest(
    String stu_id,
    String stu_number,
    int stu_model_id,
    int page_size,
    int page_index,
    boolean is_page_shuffle,
    boolean is_all_shuffle)
  {
    this();
    this.stu_id = stu_id;
    this.stu_number = stu_number;
    this.stu_model_id = stu_model_id;
    setStu_model_idIsSet(true);
    this.page_size = page_size;
    setPage_sizeIsSet(true);
    this.page_index = page_index;
    setPage_indexIsSet(true);
    this.is_page_shuffle = is_page_shuffle;
    setIs_page_shuffleIsSet(true);
    this.is_all_shuffle = is_all_shuffle;
    setIs_all_shuffleIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PRRequest(PRRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStu_id()) {
      this.stu_id = other.stu_id;
    }
    if (other.isSetStu_number()) {
      this.stu_number = other.stu_number;
    }
    this.stu_model_id = other.stu_model_id;
    this.page_size = other.page_size;
    this.page_index = other.page_index;
    this.is_page_shuffle = other.is_page_shuffle;
    this.is_all_shuffle = other.is_all_shuffle;
  }

  public PRRequest deepCopy() {
    return new PRRequest(this);
  }

  @Override
  public void clear() {
    this.stu_id = null;
    this.stu_number = null;
    setStu_model_idIsSet(false);
    this.stu_model_id = 0;
    setPage_sizeIsSet(false);
    this.page_size = 0;
    setPage_indexIsSet(false);
    this.page_index = 0;
    setIs_page_shuffleIsSet(false);
    this.is_page_shuffle = false;
    setIs_all_shuffleIsSet(false);
    this.is_all_shuffle = false;
  }

  public String getStu_id() {
    return this.stu_id;
  }

  public PRRequest setStu_id(String stu_id) {
    this.stu_id = stu_id;
    return this;
  }

  public void unsetStu_id() {
    this.stu_id = null;
  }

  /** Returns true if field stu_id is set (has been assigned a value) and false otherwise */
  public boolean isSetStu_id() {
    return this.stu_id != null;
  }

  public void setStu_idIsSet(boolean value) {
    if (!value) {
      this.stu_id = null;
    }
  }

  public String getStu_number() {
    return this.stu_number;
  }

  public PRRequest setStu_number(String stu_number) {
    this.stu_number = stu_number;
    return this;
  }

  public void unsetStu_number() {
    this.stu_number = null;
  }

  /** Returns true if field stu_number is set (has been assigned a value) and false otherwise */
  public boolean isSetStu_number() {
    return this.stu_number != null;
  }

  public void setStu_numberIsSet(boolean value) {
    if (!value) {
      this.stu_number = null;
    }
  }

  public int getStu_model_id() {
    return this.stu_model_id;
  }

  public PRRequest setStu_model_id(int stu_model_id) {
    this.stu_model_id = stu_model_id;
    setStu_model_idIsSet(true);
    return this;
  }

  public void unsetStu_model_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STU_MODEL_ID_ISSET_ID);
  }

  /** Returns true if field stu_model_id is set (has been assigned a value) and false otherwise */
  public boolean isSetStu_model_id() {
    return EncodingUtils.testBit(__isset_bitfield, __STU_MODEL_ID_ISSET_ID);
  }

  public void setStu_model_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STU_MODEL_ID_ISSET_ID, value);
  }

  public int getPage_size() {
    return this.page_size;
  }

  public PRRequest setPage_size(int page_size) {
    this.page_size = page_size;
    setPage_sizeIsSet(true);
    return this;
  }

  public void unsetPage_size() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID);
  }

  /** Returns true if field page_size is set (has been assigned a value) and false otherwise */
  public boolean isSetPage_size() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID);
  }

  public void setPage_sizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGE_SIZE_ISSET_ID, value);
  }

  public int getPage_index() {
    return this.page_index;
  }

  public PRRequest setPage_index(int page_index) {
    this.page_index = page_index;
    setPage_indexIsSet(true);
    return this;
  }

  public void unsetPage_index() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PAGE_INDEX_ISSET_ID);
  }

  /** Returns true if field page_index is set (has been assigned a value) and false otherwise */
  public boolean isSetPage_index() {
    return EncodingUtils.testBit(__isset_bitfield, __PAGE_INDEX_ISSET_ID);
  }

  public void setPage_indexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PAGE_INDEX_ISSET_ID, value);
  }

  public boolean isIs_page_shuffle() {
    return this.is_page_shuffle;
  }

  public PRRequest setIs_page_shuffle(boolean is_page_shuffle) {
    this.is_page_shuffle = is_page_shuffle;
    setIs_page_shuffleIsSet(true);
    return this;
  }

  public void unsetIs_page_shuffle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_PAGE_SHUFFLE_ISSET_ID);
  }

  /** Returns true if field is_page_shuffle is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_page_shuffle() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_PAGE_SHUFFLE_ISSET_ID);
  }

  public void setIs_page_shuffleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_PAGE_SHUFFLE_ISSET_ID, value);
  }

  public boolean isIs_all_shuffle() {
    return this.is_all_shuffle;
  }

  public PRRequest setIs_all_shuffle(boolean is_all_shuffle) {
    this.is_all_shuffle = is_all_shuffle;
    setIs_all_shuffleIsSet(true);
    return this;
  }

  public void unsetIs_all_shuffle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_ALL_SHUFFLE_ISSET_ID);
  }

  /** Returns true if field is_all_shuffle is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_all_shuffle() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_ALL_SHUFFLE_ISSET_ID);
  }

  public void setIs_all_shuffleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_ALL_SHUFFLE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STU_ID:
      if (value == null) {
        unsetStu_id();
      } else {
        setStu_id((String)value);
      }
      break;

    case STU_NUMBER:
      if (value == null) {
        unsetStu_number();
      } else {
        setStu_number((String)value);
      }
      break;

    case STU_MODEL_ID:
      if (value == null) {
        unsetStu_model_id();
      } else {
        setStu_model_id((Integer)value);
      }
      break;

    case PAGE_SIZE:
      if (value == null) {
        unsetPage_size();
      } else {
        setPage_size((Integer)value);
      }
      break;

    case PAGE_INDEX:
      if (value == null) {
        unsetPage_index();
      } else {
        setPage_index((Integer)value);
      }
      break;

    case IS_PAGE_SHUFFLE:
      if (value == null) {
        unsetIs_page_shuffle();
      } else {
        setIs_page_shuffle((Boolean)value);
      }
      break;

    case IS_ALL_SHUFFLE:
      if (value == null) {
        unsetIs_all_shuffle();
      } else {
        setIs_all_shuffle((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STU_ID:
      return getStu_id();

    case STU_NUMBER:
      return getStu_number();

    case STU_MODEL_ID:
      return Integer.valueOf(getStu_model_id());

    case PAGE_SIZE:
      return Integer.valueOf(getPage_size());

    case PAGE_INDEX:
      return Integer.valueOf(getPage_index());

    case IS_PAGE_SHUFFLE:
      return Boolean.valueOf(isIs_page_shuffle());

    case IS_ALL_SHUFFLE:
      return Boolean.valueOf(isIs_all_shuffle());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STU_ID:
      return isSetStu_id();
    case STU_NUMBER:
      return isSetStu_number();
    case STU_MODEL_ID:
      return isSetStu_model_id();
    case PAGE_SIZE:
      return isSetPage_size();
    case PAGE_INDEX:
      return isSetPage_index();
    case IS_PAGE_SHUFFLE:
      return isSetIs_page_shuffle();
    case IS_ALL_SHUFFLE:
      return isSetIs_all_shuffle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PRRequest)
      return this.equals((PRRequest)that);
    return false;
  }

  public boolean equals(PRRequest that) {
    if (that == null)
      return false;

    boolean this_present_stu_id = true && this.isSetStu_id();
    boolean that_present_stu_id = true && that.isSetStu_id();
    if (this_present_stu_id || that_present_stu_id) {
      if (!(this_present_stu_id && that_present_stu_id))
        return false;
      if (!this.stu_id.equals(that.stu_id))
        return false;
    }

    boolean this_present_stu_number = true && this.isSetStu_number();
    boolean that_present_stu_number = true && that.isSetStu_number();
    if (this_present_stu_number || that_present_stu_number) {
      if (!(this_present_stu_number && that_present_stu_number))
        return false;
      if (!this.stu_number.equals(that.stu_number))
        return false;
    }

    boolean this_present_stu_model_id = true;
    boolean that_present_stu_model_id = true;
    if (this_present_stu_model_id || that_present_stu_model_id) {
      if (!(this_present_stu_model_id && that_present_stu_model_id))
        return false;
      if (this.stu_model_id != that.stu_model_id)
        return false;
    }

    boolean this_present_page_size = true;
    boolean that_present_page_size = true;
    if (this_present_page_size || that_present_page_size) {
      if (!(this_present_page_size && that_present_page_size))
        return false;
      if (this.page_size != that.page_size)
        return false;
    }

    boolean this_present_page_index = true;
    boolean that_present_page_index = true;
    if (this_present_page_index || that_present_page_index) {
      if (!(this_present_page_index && that_present_page_index))
        return false;
      if (this.page_index != that.page_index)
        return false;
    }

    boolean this_present_is_page_shuffle = true;
    boolean that_present_is_page_shuffle = true;
    if (this_present_is_page_shuffle || that_present_is_page_shuffle) {
      if (!(this_present_is_page_shuffle && that_present_is_page_shuffle))
        return false;
      if (this.is_page_shuffle != that.is_page_shuffle)
        return false;
    }

    boolean this_present_is_all_shuffle = true;
    boolean that_present_is_all_shuffle = true;
    if (this_present_is_all_shuffle || that_present_is_all_shuffle) {
      if (!(this_present_is_all_shuffle && that_present_is_all_shuffle))
        return false;
      if (this.is_all_shuffle != that.is_all_shuffle)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stu_id = true && (isSetStu_id());
    list.add(present_stu_id);
    if (present_stu_id)
      list.add(stu_id);

    boolean present_stu_number = true && (isSetStu_number());
    list.add(present_stu_number);
    if (present_stu_number)
      list.add(stu_number);

    boolean present_stu_model_id = true;
    list.add(present_stu_model_id);
    if (present_stu_model_id)
      list.add(stu_model_id);

    boolean present_page_size = true;
    list.add(present_page_size);
    if (present_page_size)
      list.add(page_size);

    boolean present_page_index = true;
    list.add(present_page_index);
    if (present_page_index)
      list.add(page_index);

    boolean present_is_page_shuffle = true;
    list.add(present_is_page_shuffle);
    if (present_is_page_shuffle)
      list.add(is_page_shuffle);

    boolean present_is_all_shuffle = true;
    list.add(present_is_all_shuffle);
    if (present_is_all_shuffle)
      list.add(is_all_shuffle);

    return list.hashCode();
  }

  @Override
  public int compareTo(PRRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStu_id()).compareTo(other.isSetStu_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStu_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stu_id, other.stu_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStu_number()).compareTo(other.isSetStu_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStu_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stu_number, other.stu_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStu_model_id()).compareTo(other.isSetStu_model_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStu_model_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stu_model_id, other.stu_model_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPage_size()).compareTo(other.isSetPage_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page_size, other.page_size);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPage_index()).compareTo(other.isSetPage_index());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPage_index()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.page_index, other.page_index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_page_shuffle()).compareTo(other.isSetIs_page_shuffle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_page_shuffle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_page_shuffle, other.is_page_shuffle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_all_shuffle()).compareTo(other.isSetIs_all_shuffle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_all_shuffle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_all_shuffle, other.is_all_shuffle);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PRRequest(");
    boolean first = true;

    sb.append("stu_id:");
    if (this.stu_id == null) {
      sb.append("null");
    } else {
      sb.append(this.stu_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stu_number:");
    if (this.stu_number == null) {
      sb.append("null");
    } else {
      sb.append(this.stu_number);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stu_model_id:");
    sb.append(this.stu_model_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_size:");
    sb.append(this.page_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_index:");
    sb.append(this.page_index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_page_shuffle:");
    sb.append(this.is_page_shuffle);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_all_shuffle:");
    sb.append(this.is_all_shuffle);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PRRequestStandardSchemeFactory implements SchemeFactory {
    public PRRequestStandardScheme getScheme() {
      return new PRRequestStandardScheme();
    }
  }

  private static class PRRequestStandardScheme extends StandardScheme<PRRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PRRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STU_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stu_id = iprot.readString();
              struct.setStu_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STU_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stu_number = iprot.readString();
              struct.setStu_numberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STU_MODEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.stu_model_id = iprot.readI32();
              struct.setStu_model_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_size = iprot.readI32();
              struct.setPage_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PAGE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_index = iprot.readI32();
              struct.setPage_indexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_PAGE_SHUFFLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_page_shuffle = iprot.readBool();
              struct.setIs_page_shuffleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // IS_ALL_SHUFFLE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_all_shuffle = iprot.readBool();
              struct.setIs_all_shuffleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PRRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stu_id != null) {
        oprot.writeFieldBegin(STU_ID_FIELD_DESC);
        oprot.writeString(struct.stu_id);
        oprot.writeFieldEnd();
      }
      if (struct.stu_number != null) {
        oprot.writeFieldBegin(STU_NUMBER_FIELD_DESC);
        oprot.writeString(struct.stu_number);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STU_MODEL_ID_FIELD_DESC);
      oprot.writeI32(struct.stu_model_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.page_size);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_INDEX_FIELD_DESC);
      oprot.writeI32(struct.page_index);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_PAGE_SHUFFLE_FIELD_DESC);
      oprot.writeBool(struct.is_page_shuffle);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ALL_SHUFFLE_FIELD_DESC);
      oprot.writeBool(struct.is_all_shuffle);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PRRequestTupleSchemeFactory implements SchemeFactory {
    public PRRequestTupleScheme getScheme() {
      return new PRRequestTupleScheme();
    }
  }

  private static class PRRequestTupleScheme extends TupleScheme<PRRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PRRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStu_id()) {
        optionals.set(0);
      }
      if (struct.isSetStu_number()) {
        optionals.set(1);
      }
      if (struct.isSetStu_model_id()) {
        optionals.set(2);
      }
      if (struct.isSetPage_size()) {
        optionals.set(3);
      }
      if (struct.isSetPage_index()) {
        optionals.set(4);
      }
      if (struct.isSetIs_page_shuffle()) {
        optionals.set(5);
      }
      if (struct.isSetIs_all_shuffle()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetStu_id()) {
        oprot.writeString(struct.stu_id);
      }
      if (struct.isSetStu_number()) {
        oprot.writeString(struct.stu_number);
      }
      if (struct.isSetStu_model_id()) {
        oprot.writeI32(struct.stu_model_id);
      }
      if (struct.isSetPage_size()) {
        oprot.writeI32(struct.page_size);
      }
      if (struct.isSetPage_index()) {
        oprot.writeI32(struct.page_index);
      }
      if (struct.isSetIs_page_shuffle()) {
        oprot.writeBool(struct.is_page_shuffle);
      }
      if (struct.isSetIs_all_shuffle()) {
        oprot.writeBool(struct.is_all_shuffle);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PRRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.stu_id = iprot.readString();
        struct.setStu_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stu_number = iprot.readString();
        struct.setStu_numberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stu_model_id = iprot.readI32();
        struct.setStu_model_idIsSet(true);
      }
      if (incoming.get(3)) {
        struct.page_size = iprot.readI32();
        struct.setPage_sizeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.page_index = iprot.readI32();
        struct.setPage_indexIsSet(true);
      }
      if (incoming.get(5)) {
        struct.is_page_shuffle = iprot.readBool();
        struct.setIs_page_shuffleIsSet(true);
      }
      if (incoming.get(6)) {
        struct.is_all_shuffle = iprot.readBool();
        struct.setIs_all_shuffleIsSet(true);
      }
    }
  }

}

