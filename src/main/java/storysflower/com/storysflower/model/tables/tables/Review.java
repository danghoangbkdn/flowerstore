/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import storysflower.com.storysflower.model.tables.Indexes;
import storysflower.com.storysflower.model.tables.Keys;
import storysflower.com.storysflower.model.tables.Public;
import storysflower.com.storysflower.model.tables.tables.records.ReviewRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class Review extends TableImpl<ReviewRecord> {

    /**
     * The reference instance of <code>public.review</code>
     */
    public static final Review REVIEW = new Review();
    private static final long serialVersionUID = -1818503580;
    /**
     * The column <code>public.review.id</code>.
     */
    public final TableField<ReviewRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('review_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");
    /**
     * The column <code>public.review.product_id</code>.
     */
    public final TableField<ReviewRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
    /**
     * The column <code>public.review.user_id</code>.
     */
    public final TableField<ReviewRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");
    /**
     * The column <code>public.review.content</code>.
     */
    public final TableField<ReviewRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");
    /**
     * The column <code>public.review.date_create</code>.
     */
    public final TableField<ReviewRecord, Timestamp> DATE_CREATE = createField("date_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.review</code> table reference
     */
    public Review() {
        this(DSL.name("review"), null);
    }

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    public Review(String alias) {
        this(DSL.name(alias), REVIEW);
    }

    /**
     * Create an aliased <code>public.review</code> table reference
     */
    public Review(Name alias) {
        this(alias, REVIEW);
    }

    private Review(Name alias, Table<ReviewRecord> aliased) {
        this(alias, aliased, null);
    }

    private Review(Name alias, Table<ReviewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("review table"));
    }

    public <O extends Record> Review(Table<O> child, ForeignKey<O, ReviewRecord> key) {
        super(child, key, REVIEW);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReviewRecord> getRecordType() {
        return ReviewRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REVIEW_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReviewRecord, Long> getIdentity() {
        return Keys.IDENTITY_REVIEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReviewRecord> getPrimaryKey() {
        return Keys.REVIEW_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReviewRecord>> getKeys() {
        return Arrays.<UniqueKey<ReviewRecord>>asList(Keys.REVIEW_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ReviewRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ReviewRecord, ?>>asList(Keys.REVIEW__FK_REVIEW_PRODUCT, Keys.REVIEW__FK_REVIEW_USER);
    }

    public Product product() {
        return new Product(this, Keys.REVIEW__FK_REVIEW_PRODUCT);
    }

    public User user() {
        return new User(this, Keys.REVIEW__FK_REVIEW_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Review as(String alias) {
        return new Review(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Review as(Name alias) {
        return new Review(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Review rename(String name) {
        return new Review(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Review rename(Name name) {
        return new Review(name, null);
    }
}
