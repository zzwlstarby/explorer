/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.Transaction;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record8<ULong, String, Timestamp, Timestamp, Byte, ULong, String, Integer> {

    private static final long serialVersionUID = -1557621835;

    /**
     * Setter for <code>tmp.transaction.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.transaction.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.transaction.hash</code>.
     */
    public void setHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.transaction.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.transaction.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.transaction.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>tmp.transaction.expiration</code>.
     */
    public void setExpiration(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.transaction.expiration</code>.
     */
    public Timestamp getExpiration() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>tmp.transaction.confirmed</code>.
     */
    public void setConfirmed(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.transaction.confirmed</code>.
     */
    public Byte getConfirmed() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>tmp.transaction.block_id</code>.
     */
    public void setBlockId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.transaction.block_id</code>.
     */
    public ULong getBlockId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>tmp.transaction.from</code>.
     */
    public void setFrom(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>tmp.transaction.from</code>.
     */
    public String getFrom() {
        return (String) get(6);
    }

    /**
     * Setter for <code>tmp.transaction.type</code>.
     */
    public void setType(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>tmp.transaction.type</code>.
     */
    public Integer getType() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, Timestamp, Timestamp, Byte, ULong, String, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, Timestamp, Timestamp, Byte, ULong, String, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Transaction.TRANSACTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Transaction.TRANSACTION.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Transaction.TRANSACTION.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Transaction.TRANSACTION.EXPIRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Transaction.TRANSACTION.CONFIRMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return Transaction.TRANSACTION.BLOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Transaction.TRANSACTION.FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Transaction.TRANSACTION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getExpiration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getConfirmed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getBlockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value3(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value4(Timestamp value) {
        setExpiration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value5(Byte value) {
        setConfirmed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value6(ULong value) {
        setBlockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value7(String value) {
        setFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord value8(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransactionRecord values(ULong value1, String value2, Timestamp value3, Timestamp value4, Byte value5, ULong value6, String value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(ULong id, String hash, Timestamp timestamp, Timestamp expiration, Byte confirmed, ULong blockId, String from, Integer type) {
        super(Transaction.TRANSACTION);

        set(0, id);
        set(1, hash);
        set(2, timestamp);
        set(3, expiration);
        set(4, confirmed);
        set(5, blockId);
        set(6, from);
        set(7, type);
    }
}
