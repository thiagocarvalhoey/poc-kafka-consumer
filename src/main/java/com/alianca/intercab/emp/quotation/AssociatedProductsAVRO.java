/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.alianca.intercab.emp.quotation;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AssociatedProductsAVRO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6872295230436923045L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AssociatedProductsAVRO\",\"namespace\":\"com.alianca.intercab.emp.quotation\",\"fields\":[{\"name\":\"quotationId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AssociatedProductsAVRO> ENCODER =
      new BinaryMessageEncoder<AssociatedProductsAVRO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AssociatedProductsAVRO> DECODER =
      new BinaryMessageDecoder<AssociatedProductsAVRO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AssociatedProductsAVRO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AssociatedProductsAVRO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AssociatedProductsAVRO>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AssociatedProductsAVRO to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AssociatedProductsAVRO from a ByteBuffer. */
  public static AssociatedProductsAVRO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long quotationId;
  @Deprecated public long productId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AssociatedProductsAVRO() {}

  /**
   * All-args constructor.
   * @param quotationId The new value for quotationId
   * @param productId The new value for productId
   */
  public AssociatedProductsAVRO(java.lang.Long quotationId, java.lang.Long productId) {
    this.quotationId = quotationId;
    this.productId = productId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return quotationId;
    case 1: return productId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: quotationId = (java.lang.Long)value$; break;
    case 1: productId = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'quotationId' field.
   * @return The value of the 'quotationId' field.
   */
  public java.lang.Long getQuotationId() {
    return quotationId;
  }

  /**
   * Sets the value of the 'quotationId' field.
   * @param value the value to set.
   */
  public void setQuotationId(java.lang.Long value) {
    this.quotationId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   * @return The value of the 'productId' field.
   */
  public java.lang.Long getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   * @param value the value to set.
   */
  public void setProductId(java.lang.Long value) {
    this.productId = value;
  }

  /**
   * Creates a new AssociatedProductsAVRO RecordBuilder.
   * @return A new AssociatedProductsAVRO RecordBuilder
   */
  public static com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder newBuilder() {
    return new com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder();
  }

  /**
   * Creates a new AssociatedProductsAVRO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AssociatedProductsAVRO RecordBuilder
   */
  public static com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder newBuilder(com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder other) {
    return new com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder(other);
  }

  /**
   * Creates a new AssociatedProductsAVRO RecordBuilder by copying an existing AssociatedProductsAVRO instance.
   * @param other The existing instance to copy.
   * @return A new AssociatedProductsAVRO RecordBuilder
   */
  public static com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder newBuilder(com.alianca.intercab.emp.quotation.AssociatedProductsAVRO other) {
    return new com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder(other);
  }

  /**
   * RecordBuilder for AssociatedProductsAVRO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AssociatedProductsAVRO>
    implements org.apache.avro.data.RecordBuilder<AssociatedProductsAVRO> {

    private long quotationId;
    private long productId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.quotationId)) {
        this.quotationId = data().deepCopy(fields()[0].schema(), other.quotationId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productId)) {
        this.productId = data().deepCopy(fields()[1].schema(), other.productId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AssociatedProductsAVRO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.alianca.intercab.emp.quotation.AssociatedProductsAVRO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.quotationId)) {
        this.quotationId = data().deepCopy(fields()[0].schema(), other.quotationId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productId)) {
        this.productId = data().deepCopy(fields()[1].schema(), other.productId);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'quotationId' field.
      * @return The value.
      */
    public java.lang.Long getQuotationId() {
      return quotationId;
    }

    /**
      * Sets the value of the 'quotationId' field.
      * @param value The value of 'quotationId'.
      * @return This builder.
      */
    public com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder setQuotationId(long value) {
      validate(fields()[0], value);
      this.quotationId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'quotationId' field has been set.
      * @return True if the 'quotationId' field has been set, false otherwise.
      */
    public boolean hasQuotationId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'quotationId' field.
      * @return This builder.
      */
    public com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder clearQuotationId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productId' field.
      * @return The value.
      */
    public java.lang.Long getProductId() {
      return productId;
    }

    /**
      * Sets the value of the 'productId' field.
      * @param value The value of 'productId'.
      * @return This builder.
      */
    public com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder setProductId(long value) {
      validate(fields()[1], value);
      this.productId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productId' field has been set.
      * @return True if the 'productId' field has been set, false otherwise.
      */
    public boolean hasProductId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productId' field.
      * @return This builder.
      */
    public com.alianca.intercab.emp.quotation.AssociatedProductsAVRO.Builder clearProductId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AssociatedProductsAVRO build() {
      try {
        AssociatedProductsAVRO record = new AssociatedProductsAVRO();
        record.quotationId = fieldSetFlags()[0] ? this.quotationId : (java.lang.Long) defaultValue(fields()[0]);
        record.productId = fieldSetFlags()[1] ? this.productId : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AssociatedProductsAVRO>
    WRITER$ = (org.apache.avro.io.DatumWriter<AssociatedProductsAVRO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AssociatedProductsAVRO>
    READER$ = (org.apache.avro.io.DatumReader<AssociatedProductsAVRO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}