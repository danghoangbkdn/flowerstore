/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import storysflower.com.storysflower.model.tables.tables.Image;


/**
 * image table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImageRecord extends UpdatableRecordImpl<ImageRecord> implements Record2<Long, byte[]> {

    private static final long serialVersionUID = 1522590636;

    /**
     * Setter for <code>public.image.image_id</code>.
     */
    public void setImageId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.image.image_id</code>.
     */
    public Long getImageId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.image.image_data</code>.
     */
    public void setImageData(byte... value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.image.image_data</code>.
     */
    public byte[] getImageData() {
        return (byte[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, byte[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, byte[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Image.IMAGE.IMAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return Image.IMAGE.IMAGE_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getImageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getImageData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getImageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getImageData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value1(Long value) {
        setImageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value2(byte... value) {
        setImageData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord values(Long value1, byte[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImageRecord
     */
    public ImageRecord() {
        super(Image.IMAGE);
    }

    /**
     * Create a detached, initialised ImageRecord
     */
    public ImageRecord(Long imageId, byte[] imageData) {
        super(Image.IMAGE);

        set(0, imageId);
        set(1, imageData);
    }
}
