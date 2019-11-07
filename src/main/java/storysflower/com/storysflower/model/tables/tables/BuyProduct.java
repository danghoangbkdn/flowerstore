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
import storysflower.com.storysflower.model.tables.tables.records.BuyProductRecord;


/**
 * buy product table
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BuyProduct extends TableImpl<BuyProductRecord> {

    private static final long serialVersionUID = 209099991;

    /**
     * The reference instance of <code>public.buy_product</code>
     */
    public static final BuyProduct BUY_PRODUCT = new BuyProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuyProductRecord> getRecordType() {
        return BuyProductRecord.class;
    }

    /**
     * The column <code>public.buy_product.id</code>.
     */
    public final TableField<BuyProductRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('buy_product_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.buy_product.cart_id</code>.
     */
    public final TableField<BuyProductRecord, Long> CART_ID = createField("cart_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.buy_product.product_id</code>.
     */
    public final TableField<BuyProductRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.buy_product.quantity</code>.
     */
    public final TableField<BuyProductRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.buy_product.status</code>.
     */
    public final TableField<BuyProductRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.buy_product</code> table reference
     */
    public BuyProduct() {
        this(DSL.name("buy_product"), null);
    }

    /**
     * Create an aliased <code>public.buy_product</code> table reference
     */
    public BuyProduct(String alias) {
        this(DSL.name(alias), BUY_PRODUCT);
    }

    /**
     * Create an aliased <code>public.buy_product</code> table reference
     */
    public BuyProduct(Name alias) {
        this(alias, BUY_PRODUCT);
    }

    private BuyProduct(Name alias, Table<BuyProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private BuyProduct(Name alias, Table<BuyProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("buy product table"));
    }

    public <O extends Record> BuyProduct(Table<O> child, ForeignKey<O, BuyProductRecord> key) {
        super(child, key, BUY_PRODUCT);
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
        return Arrays.<Index>asList(Indexes.PK_BUY_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BuyProductRecord, Long> getIdentity() {
        return Keys.IDENTITY_BUY_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BuyProductRecord> getPrimaryKey() {
        return Keys.PK_BUY_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BuyProductRecord>> getKeys() {
        return Arrays.<UniqueKey<BuyProductRecord>>asList(Keys.PK_BUY_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BuyProductRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BuyProductRecord, ?>>asList(Keys.BUY_PRODUCT__FK_BUY_PRODUCT_CART, Keys.BUY_PRODUCT__FK_BUY_PRODUCT_PRODUCT);
    }

    public Cart cart() {
        return new Cart(this, Keys.BUY_PRODUCT__FK_BUY_PRODUCT_CART);
    }

    public Product product() {
        return new Product(this, Keys.BUY_PRODUCT__FK_BUY_PRODUCT_PRODUCT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProduct as(String alias) {
        return new BuyProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BuyProduct as(Name alias) {
        return new BuyProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BuyProduct rename(String name) {
        return new BuyProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BuyProduct rename(Name name) {
        return new BuyProduct(name, null);
    }
}
