/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import storysflower.com.storysflower.model.tables.tables.Review;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * review table
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.11.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ReviewRecord extends UpdatableRecordImpl<ReviewRecord> implements Record5<Long, Long, Long, String, Timestamp> {

    private static final long serialVersionUID = 1917083937;

    /**
     * Create a detached ReviewRecord
     */
    public ReviewRecord() {
        super(Review.REVIEW);
    }

    /**
     * Create a detached, initialised ReviewRecord
     */
    public ReviewRecord(Long id, Long productId, Long userId, String content, Timestamp dateCreate) {
        super(Review.REVIEW);

        set(0, id);
        set(1, productId);
        set(2, userId);
        set(3, content);
        set(4, dateCreate);
    }

    /**
     * Getter for <code>public.review.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.review.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.review.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.review.product_id</code>.
     */
    public void setProductId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.review.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.review.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.review.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.review.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>public.review.date_create</code>.
     */
    public Timestamp getDateCreate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>public.review.date_create</code>.
     */
    public void setDateCreate(Timestamp value) {
        set(4, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Review.REVIEW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Review.REVIEW.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Review.REVIEW.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Review.REVIEW.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Review.REVIEW.DATE_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDateCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDateCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord value2(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord value3(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord value4(String value) {
        setContent(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord value5(Timestamp value) {
        setDateCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReviewRecord values(Long value1, Long value2, Long value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}
