/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-17")
public class GetFileMetadataByExprResult implements org.apache.thrift.TBase<GetFileMetadataByExprResult, GetFileMetadataByExprResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetFileMetadataByExprResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetFileMetadataByExprResult");

  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField IS_SUPPORTED_FIELD_DESC = new org.apache.thrift.protocol.TField("isSupported", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField UNKNOWN_FILE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("unknownFileIds", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetFileMetadataByExprResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetFileMetadataByExprResultTupleSchemeFactory());
  }

  private Map<Long,MetadataPpdResult> metadata; // required
  private boolean isSupported; // required
  private List<Long> unknownFileIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA((short)1, "metadata"),
    IS_SUPPORTED((short)2, "isSupported"),
    UNKNOWN_FILE_IDS((short)3, "unknownFileIds");

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
        case 1: // METADATA
          return METADATA;
        case 2: // IS_SUPPORTED
          return IS_SUPPORTED;
        case 3: // UNKNOWN_FILE_IDS
          return UNKNOWN_FILE_IDS;
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
  private static final int __ISSUPPORTED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetadataPpdResult.class))));
    tmpMap.put(_Fields.IS_SUPPORTED, new org.apache.thrift.meta_data.FieldMetaData("isSupported", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.UNKNOWN_FILE_IDS, new org.apache.thrift.meta_data.FieldMetaData("unknownFileIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetFileMetadataByExprResult.class, metaDataMap);
  }

  public GetFileMetadataByExprResult() {
  }

  public GetFileMetadataByExprResult(
    Map<Long,MetadataPpdResult> metadata,
    boolean isSupported,
    List<Long> unknownFileIds)
  {
    this();
    this.metadata = metadata;
    this.isSupported = isSupported;
    setIsSupportedIsSet(true);
    this.unknownFileIds = unknownFileIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetFileMetadataByExprResult(GetFileMetadataByExprResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMetadata()) {
      Map<Long,MetadataPpdResult> __this__metadata = new HashMap<Long,MetadataPpdResult>(other.metadata.size());
      for (Map.Entry<Long, MetadataPpdResult> other_element : other.metadata.entrySet()) {

        Long other_element_key = other_element.getKey();
        MetadataPpdResult other_element_value = other_element.getValue();

        Long __this__metadata_copy_key = other_element_key;

        MetadataPpdResult __this__metadata_copy_value = new MetadataPpdResult(other_element_value);

        __this__metadata.put(__this__metadata_copy_key, __this__metadata_copy_value);
      }
      this.metadata = __this__metadata;
    }
    this.isSupported = other.isSupported;
    if (other.isSetUnknownFileIds()) {
      List<Long> __this__unknownFileIds = new ArrayList<Long>(other.unknownFileIds);
      this.unknownFileIds = __this__unknownFileIds;
    }
  }

  public GetFileMetadataByExprResult deepCopy() {
    return new GetFileMetadataByExprResult(this);
  }

  @Override
  public void clear() {
    this.metadata = null;
    setIsSupportedIsSet(false);
    this.isSupported = false;
    this.unknownFileIds = null;
  }

  public int getMetadataSize() {
    return (this.metadata == null) ? 0 : this.metadata.size();
  }

  public void putToMetadata(long key, MetadataPpdResult val) {
    if (this.metadata == null) {
      this.metadata = new HashMap<Long,MetadataPpdResult>();
    }
    this.metadata.put(key, val);
  }

  public Map<Long,MetadataPpdResult> getMetadata() {
    return this.metadata;
  }

  public void setMetadata(Map<Long,MetadataPpdResult> metadata) {
    this.metadata = metadata;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public boolean isIsSupported() {
    return this.isSupported;
  }

  public void setIsSupported(boolean isSupported) {
    this.isSupported = isSupported;
    setIsSupportedIsSet(true);
  }

  public void unsetIsSupported() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID);
  }

  /** Returns true if field isSupported is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSupported() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID);
  }

  public void setIsSupportedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID, value);
  }

  public int getUnknownFileIdsSize() {
    return (this.unknownFileIds == null) ? 0 : this.unknownFileIds.size();
  }

  public java.util.Iterator<Long> getUnknownFileIdsIterator() {
    return (this.unknownFileIds == null) ? null : this.unknownFileIds.iterator();
  }

  public void addToUnknownFileIds(long elem) {
    if (this.unknownFileIds == null) {
      this.unknownFileIds = new ArrayList<Long>();
    }
    this.unknownFileIds.add(elem);
  }

  public List<Long> getUnknownFileIds() {
    return this.unknownFileIds;
  }

  public void setUnknownFileIds(List<Long> unknownFileIds) {
    this.unknownFileIds = unknownFileIds;
  }

  public void unsetUnknownFileIds() {
    this.unknownFileIds = null;
  }

  /** Returns true if field unknownFileIds is set (has been assigned a value) and false otherwise */
  public boolean isSetUnknownFileIds() {
    return this.unknownFileIds != null;
  }

  public void setUnknownFileIdsIsSet(boolean value) {
    if (!value) {
      this.unknownFileIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((Map<Long,MetadataPpdResult>)value);
      }
      break;

    case IS_SUPPORTED:
      if (value == null) {
        unsetIsSupported();
      } else {
        setIsSupported((Boolean)value);
      }
      break;

    case UNKNOWN_FILE_IDS:
      if (value == null) {
        unsetUnknownFileIds();
      } else {
        setUnknownFileIds((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA:
      return getMetadata();

    case IS_SUPPORTED:
      return Boolean.valueOf(isIsSupported());

    case UNKNOWN_FILE_IDS:
      return getUnknownFileIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA:
      return isSetMetadata();
    case IS_SUPPORTED:
      return isSetIsSupported();
    case UNKNOWN_FILE_IDS:
      return isSetUnknownFileIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetFileMetadataByExprResult)
      return this.equals((GetFileMetadataByExprResult)that);
    return false;
  }

  public boolean equals(GetFileMetadataByExprResult that) {
    if (that == null)
      return false;

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_isSupported = true;
    boolean that_present_isSupported = true;
    if (this_present_isSupported || that_present_isSupported) {
      if (!(this_present_isSupported && that_present_isSupported))
        return false;
      if (this.isSupported != that.isSupported)
        return false;
    }

    boolean this_present_unknownFileIds = true && this.isSetUnknownFileIds();
    boolean that_present_unknownFileIds = true && that.isSetUnknownFileIds();
    if (this_present_unknownFileIds || that_present_unknownFileIds) {
      if (!(this_present_unknownFileIds && that_present_unknownFileIds))
        return false;
      if (!this.unknownFileIds.equals(that.unknownFileIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_isSupported = true;
    list.add(present_isSupported);
    if (present_isSupported)
      list.add(isSupported);

    boolean present_unknownFileIds = true && (isSetUnknownFileIds());
    list.add(present_unknownFileIds);
    if (present_unknownFileIds)
      list.add(unknownFileIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetFileMetadataByExprResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSupported()).compareTo(other.isSetIsSupported());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSupported()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSupported, other.isSupported);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnknownFileIds()).compareTo(other.isSetUnknownFileIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnknownFileIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unknownFileIds, other.unknownFileIds);
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
    StringBuilder sb = new StringBuilder("GetFileMetadataByExprResult(");
    boolean first = true;

    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isSupported:");
    sb.append(this.isSupported);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unknownFileIds:");
    if (this.unknownFileIds == null) {
      sb.append("null");
    } else {
      sb.append(this.unknownFileIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMetadata()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' is unset! Struct:" + toString());
    }

    if (!isSetIsSupported()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'isSupported' is unset! Struct:" + toString());
    }

    if (!isSetUnknownFileIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unknownFileIds' is unset! Struct:" + toString());
    }

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

  private static class GetFileMetadataByExprResultStandardSchemeFactory implements SchemeFactory {
    public GetFileMetadataByExprResultStandardScheme getScheme() {
      return new GetFileMetadataByExprResultStandardScheme();
    }
  }

  private static class GetFileMetadataByExprResultStandardScheme extends StandardScheme<GetFileMetadataByExprResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetFileMetadataByExprResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map524 = iprot.readMapBegin();
                struct.metadata = new HashMap<Long,MetadataPpdResult>(2*_map524.size);
                long _key525;
                MetadataPpdResult _val526;
                for (int _i527 = 0; _i527 < _map524.size; ++_i527)
                {
                  _key525 = iprot.readI64();
                  _val526 = new MetadataPpdResult();
                  _val526.read(iprot);
                  struct.metadata.put(_key525, _val526);
                }
                iprot.readMapEnd();
              }
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_SUPPORTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSupported = iprot.readBool();
              struct.setIsSupportedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UNKNOWN_FILE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list528 = iprot.readListBegin();
                struct.unknownFileIds = new ArrayList<Long>(_list528.size);
                long _elem529;
                for (int _i530 = 0; _i530 < _list528.size; ++_i530)
                {
                  _elem529 = iprot.readI64();
                  struct.unknownFileIds.add(_elem529);
                }
                iprot.readListEnd();
              }
              struct.setUnknownFileIdsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetFileMetadataByExprResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, struct.metadata.size()));
          for (Map.Entry<Long, MetadataPpdResult> _iter531 : struct.metadata.entrySet())
          {
            oprot.writeI64(_iter531.getKey());
            _iter531.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_SUPPORTED_FIELD_DESC);
      oprot.writeBool(struct.isSupported);
      oprot.writeFieldEnd();
      if (struct.unknownFileIds != null) {
        oprot.writeFieldBegin(UNKNOWN_FILE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.unknownFileIds.size()));
          for (long _iter532 : struct.unknownFileIds)
          {
            oprot.writeI64(_iter532);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetFileMetadataByExprResultTupleSchemeFactory implements SchemeFactory {
    public GetFileMetadataByExprResultTupleScheme getScheme() {
      return new GetFileMetadataByExprResultTupleScheme();
    }
  }

  private static class GetFileMetadataByExprResultTupleScheme extends TupleScheme<GetFileMetadataByExprResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataByExprResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.metadata.size());
        for (Map.Entry<Long, MetadataPpdResult> _iter533 : struct.metadata.entrySet())
        {
          oprot.writeI64(_iter533.getKey());
          _iter533.getValue().write(oprot);
        }
      }
      oprot.writeBool(struct.isSupported);
      {
        oprot.writeI32(struct.unknownFileIds.size());
        for (long _iter534 : struct.unknownFileIds)
        {
          oprot.writeI64(_iter534);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataByExprResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map535 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.metadata = new HashMap<Long,MetadataPpdResult>(2*_map535.size);
        long _key536;
        MetadataPpdResult _val537;
        for (int _i538 = 0; _i538 < _map535.size; ++_i538)
        {
          _key536 = iprot.readI64();
          _val537 = new MetadataPpdResult();
          _val537.read(iprot);
          struct.metadata.put(_key536, _val537);
        }
      }
      struct.setMetadataIsSet(true);
      struct.isSupported = iprot.readBool();
      struct.setIsSupportedIsSet(true);
      {
        org.apache.thrift.protocol.TList _list539 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.unknownFileIds = new ArrayList<Long>(_list539.size);
        long _elem540;
        for (int _i541 = 0; _i541 < _list539.size; ++_i541)
        {
          _elem540 = iprot.readI64();
          struct.unknownFileIds.add(_elem540);
        }
      }
      struct.setUnknownFileIdsIsSet(true);
    }
  }

}

