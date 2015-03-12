/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.agezhc.thrift.recommend;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-8")
public class PRRequest implements org.apache.thrift.TBase<PRRequest, PRRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PRRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PRRequest");

  private static final org.apache.thrift.protocol.TField STUID_FIELD_DESC = new org.apache.thrift.protocol.TField("stuid", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PAGE_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("page_size", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PAGE_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("page_index", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PRRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PRRequestTupleSchemeFactory());
  }

  public long stuid; // required
  public int page_size; // required
  public int page_index; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STUID((short)1, "stuid"),
    PAGE_SIZE((short)2, "page_size"),
    PAGE_INDEX((short)3, "page_index");

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
        case 1: // STUID
          return STUID;
        case 2: // PAGE_SIZE
          return PAGE_SIZE;
        case 3: // PAGE_INDEX
          return PAGE_INDEX;
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
  private static final int __STUID_ISSET_ID = 0;
  private static final int __PAGE_SIZE_ISSET_ID = 1;
  private static final int __PAGE_INDEX_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STUID, new org.apache.thrift.meta_data.FieldMetaData("stuid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PAGE_SIZE, new org.apache.thrift.meta_data.FieldMetaData("page_size", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PAGE_INDEX, new org.apache.thrift.meta_data.FieldMetaData("page_index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PRRequest.class, metaDataMap);
  }

  public PRRequest() {
  }

  public PRRequest(
    long stuid,
    int page_size,
    int page_index)
  {
    this();
    this.stuid = stuid;
    setStuidIsSet(true);
    this.page_size = page_size;
    setPage_sizeIsSet(true);
    this.page_index = page_index;
    setPage_indexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PRRequest(PRRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.stuid = other.stuid;
    this.page_size = other.page_size;
    this.page_index = other.page_index;
  }

  public PRRequest deepCopy() {
    return new PRRequest(this);
  }

  @Override
  public void clear() {
    setStuidIsSet(false);
    this.stuid = 0;
    setPage_sizeIsSet(false);
    this.page_size = 0;
    setPage_indexIsSet(false);
    this.page_index = 0;
  }

  public long getStuid() {
    return this.stuid;
  }

  public PRRequest setStuid(long stuid) {
    this.stuid = stuid;
    setStuidIsSet(true);
    return this;
  }

  public void unsetStuid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STUID_ISSET_ID);
  }

  /** Returns true if field stuid is set (has been assigned a value) and false otherwise */
  public boolean isSetStuid() {
    return EncodingUtils.testBit(__isset_bitfield, __STUID_ISSET_ID);
  }

  public void setStuidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STUID_ISSET_ID, value);
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STUID:
      if (value == null) {
        unsetStuid();
      } else {
        setStuid((Long)value);
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

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STUID:
      return Long.valueOf(getStuid());

    case PAGE_SIZE:
      return Integer.valueOf(getPage_size());

    case PAGE_INDEX:
      return Integer.valueOf(getPage_index());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STUID:
      return isSetStuid();
    case PAGE_SIZE:
      return isSetPage_size();
    case PAGE_INDEX:
      return isSetPage_index();
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

    boolean this_present_stuid = true;
    boolean that_present_stuid = true;
    if (this_present_stuid || that_present_stuid) {
      if (!(this_present_stuid && that_present_stuid))
        return false;
      if (this.stuid != that.stuid)
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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stuid = true;
    list.add(present_stuid);
    if (present_stuid)
      list.add(stuid);

    boolean present_page_size = true;
    list.add(present_page_size);
    if (present_page_size)
      list.add(page_size);

    boolean present_page_index = true;
    list.add(present_page_index);
    if (present_page_index)
      list.add(page_index);

    return list.hashCode();
  }

  @Override
  public int compareTo(PRRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStuid()).compareTo(other.isSetStuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stuid, other.stuid);
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

    sb.append("stuid:");
    sb.append(this.stuid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_size:");
    sb.append(this.page_size);
    first = false;
    if (!first) sb.append(", ");
    sb.append("page_index:");
    sb.append(this.page_index);
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
          case 1: // STUID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.stuid = iprot.readI64();
              struct.setStuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PAGE_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_size = iprot.readI32();
              struct.setPage_sizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PAGE_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.page_index = iprot.readI32();
              struct.setPage_indexIsSet(true);
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
      oprot.writeFieldBegin(STUID_FIELD_DESC);
      oprot.writeI64(struct.stuid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_SIZE_FIELD_DESC);
      oprot.writeI32(struct.page_size);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PAGE_INDEX_FIELD_DESC);
      oprot.writeI32(struct.page_index);
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
      if (struct.isSetStuid()) {
        optionals.set(0);
      }
      if (struct.isSetPage_size()) {
        optionals.set(1);
      }
      if (struct.isSetPage_index()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStuid()) {
        oprot.writeI64(struct.stuid);
      }
      if (struct.isSetPage_size()) {
        oprot.writeI32(struct.page_size);
      }
      if (struct.isSetPage_index()) {
        oprot.writeI32(struct.page_index);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PRRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stuid = iprot.readI64();
        struct.setStuidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.page_size = iprot.readI32();
        struct.setPage_sizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.page_index = iprot.readI32();
        struct.setPage_indexIsSet(true);
      }
    }
  }

}

