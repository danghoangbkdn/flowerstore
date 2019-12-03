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
import storysflower.com.storysflower.model.tables.tables.records.TopicRecord;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * topic table
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.11.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Topic extends TableImpl<TopicRecord> {

    /**
     * The reference instance of <code>public.topic</code>
     */
    public static final Topic TOPIC = new Topic();
    private static final long serialVersionUID = 2093157174;
    /**
     * The column <code>public.topic.topic_id</code>.
     */
    public final TableField<TopicRecord, Long> TOPIC_ID = createField("topic_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('topic_topic_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");
    /**
     * The column <code>public.topic.topic_name</code>.
     */
    public final TableField<TopicRecord, String> TOPIC_NAME = createField("topic_name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.topic</code> table reference
     */
    public Topic() {
        this(DSL.name("topic"), null);
    }

    /**
     * Create an aliased <code>public.topic</code> table reference
     */
    public Topic(String alias) {
        this(DSL.name(alias), TOPIC);
    }

    /**
     * Create an aliased <code>public.topic</code> table reference
     */
    public Topic(Name alias) {
        this(alias, TOPIC);
    }

    private Topic(Name alias, Table<TopicRecord> aliased) {
        this(alias, aliased, null);
    }

    private Topic(Name alias, Table<TopicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("topic table"));
    }

    public <O extends Record> Topic(Table<O> child, ForeignKey<O, TopicRecord> key) {
        super(child, key, TOPIC);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TopicRecord> getRecordType() {
        return TopicRecord.class;
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
        return Arrays.<Index>asList(Indexes.TOPIC_PKEY, Indexes.TOPIC_TOPIC_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TopicRecord, Long> getIdentity() {
        return Keys.IDENTITY_TOPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TopicRecord> getPrimaryKey() {
        return Keys.TOPIC_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TopicRecord>> getKeys() {
        return Arrays.<UniqueKey<TopicRecord>>asList(Keys.TOPIC_PKEY, Keys.TOPIC_TOPIC_NAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Topic as(String alias) {
        return new Topic(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Topic as(Name alias) {
        return new Topic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Topic rename(String name) {
        return new Topic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Topic rename(Name name) {
        return new Topic(name, null);
    }
}
