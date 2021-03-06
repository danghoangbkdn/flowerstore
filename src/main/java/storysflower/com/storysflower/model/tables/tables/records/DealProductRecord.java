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

import storysflower.com.storysflower.model.tables.tables.DealProduct;


/**
 * deal product table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DealProductRecord extends UpdatableRecordImpl<DealProductRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = 192571999;

    /**
     * Setter for <code>public.deal_product.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.deal_product.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.deal_product.product_id</code>.
     */
    public void setProductId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.deal_product.product_id</code>.
     */
    public Long getProductId() {
        return (Long) get(1);
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
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DealProduct.DEAL_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return DealProduct.DEAL_PRODUCT.PRODUCT_ID;
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
    public DealProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealProductRecord value2(Long value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DealProductRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DealProductRecord
     */
    public DealProductRecord() {
        super(DealProduct.DEAL_PRODUCT);
    }

    /**
     * Create a detached, initialised DealProductRecord
     */
    public DealProductRecord(Long id, Long productId) {
        super(DealProduct.DEAL_PRODUCT);

        set(0, id);
        set(1, productId);
    }
}
