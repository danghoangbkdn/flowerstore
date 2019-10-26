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
import storysflower.com.storysflower.model.tables.tables.records.CustomerRecord;


/**
 * customer table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = -1534254319;

    /**
     * The reference instance of <code>public.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>public.customer.id</code>.
     */
    public final TableField<CustomerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('customer_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.customer.full_name</code>.
     */
    public final TableField<CustomerRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>public.customer.address</code>.
     */
    public final TableField<CustomerRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.customer.phone_number</code>.
     */
    public final TableField<CustomerRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>public.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("customer table"));
    }

    public <O extends Record> Customer(Table<O> child, ForeignKey<O, CustomerRecord> key) {
        super(child, key, CUSTOMER);
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
        return Arrays.<Index>asList(Indexes.CUSTOMER_EMAIL_KEY, Indexes.CUSTOMER_FULL_NAME_KEY, Indexes.PK_CUSTOMER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CustomerRecord, Long> getIdentity() {
        return Keys.IDENTITY_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.PK_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerRecord>>asList(Keys.PK_CUSTOMER, Keys.CUSTOMER_FULL_NAME_KEY, Keys.CUSTOMER_EMAIL_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }
}
