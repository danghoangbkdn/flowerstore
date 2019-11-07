/*
 * This file is generated by jOOQ.
 */
package storysflower.com.storysflower.model.tables.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import storysflower.com.storysflower.model.tables.Indexes;
import storysflower.com.storysflower.model.tables.Keys;
import storysflower.com.storysflower.model.tables.Public;
import storysflower.com.storysflower.model.tables.tables.records.RecipientRecord;


/**
 * recipient table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Recipient extends TableImpl<RecipientRecord> {

    private static final long serialVersionUID = -449929112;

    /**
     * The reference instance of <code>public.recipient</code>
     */
    public static final Recipient RECIPIENT = new Recipient();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RecipientRecord> getRecordType() {
        return RecipientRecord.class;
    }

    /**
     * The column <code>public.recipient.id</code>.
     */
    public final TableField<RecipientRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('recipient_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.recipient.full_name</code>.
     */
    public final TableField<RecipientRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.recipient.address</code>.
     */
    public final TableField<RecipientRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.recipient.phone_number</code>.
     */
    public final TableField<RecipientRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.recipient.message_to_recipient</code>.
     */
    public final TableField<RecipientRecord, String> MESSAGE_TO_RECIPIENT = createField("message_to_recipient", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>public.recipient.message_to_us</code>.
     */
    public final TableField<RecipientRecord, String> MESSAGE_TO_US = createField("message_to_us", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.recipient</code> table reference
     */
    public Recipient() {
        this(DSL.name("recipient"), null);
    }

    /**
     * Create an aliased <code>public.recipient</code> table reference
     */
    public Recipient(String alias) {
        this(DSL.name(alias), RECIPIENT);
    }

    /**
     * Create an aliased <code>public.recipient</code> table reference
     */
    public Recipient(Name alias) {
        this(alias, RECIPIENT);
    }

    private Recipient(Name alias, Table<RecipientRecord> aliased) {
        this(alias, aliased, null);
    }

    private Recipient(Name alias, Table<RecipientRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("recipient table"));
    }

    public <O extends Record> Recipient(Table<O> child, ForeignKey<O, RecipientRecord> key) {
        super(child, key, RECIPIENT);
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
        return Arrays.<Index>asList(Indexes.PK_RECIPIENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RecipientRecord, Long> getIdentity() {
        return Keys.IDENTITY_RECIPIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RecipientRecord> getPrimaryKey() {
        return Keys.PK_RECIPIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RecipientRecord>> getKeys() {
        return Arrays.<UniqueKey<RecipientRecord>>asList(Keys.PK_RECIPIENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Recipient as(String alias) {
        return new Recipient(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Recipient as(Name alias) {
        return new Recipient(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Recipient rename(String name) {
        return new Recipient(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Recipient rename(Name name) {
        return new Recipient(name, null);
    }
}
