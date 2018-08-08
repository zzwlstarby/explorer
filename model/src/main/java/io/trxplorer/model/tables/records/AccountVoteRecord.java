/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.records;


import io.trxplorer.model.tables.AccountVote;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class AccountVoteRecord extends UpdatableRecordImpl<AccountVoteRecord> implements Record6<ULong, String, ULong, Long, ULong, Timestamp> {

    private static final long serialVersionUID = 657599977;

    /**
     * Setter for <code>tmp.account_vote.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>tmp.account_vote.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>tmp.account_vote.vote_address</code>.
     */
    public void setVoteAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tmp.account_vote.vote_address</code>.
     */
    public String getVoteAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tmp.account_vote.vote_account_id</code>.
     */
    public void setVoteAccountId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>tmp.account_vote.vote_account_id</code>.
     */
    public ULong getVoteAccountId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>tmp.account_vote.vote_count</code>.
     */
    public void setVoteCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>tmp.account_vote.vote_count</code>.
     */
    public Long getVoteCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>tmp.account_vote.account_id</code>.
     */
    public void setAccountId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>tmp.account_vote.account_id</code>.
     */
    public ULong getAccountId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>tmp.account_vote.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>tmp.account_vote.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, Long, ULong, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, String, ULong, Long, ULong, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return AccountVote.ACCOUNT_VOTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AccountVote.ACCOUNT_VOTE.VOTE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return AccountVote.ACCOUNT_VOTE.VOTE_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return AccountVote.ACCOUNT_VOTE.VOTE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return AccountVote.ACCOUNT_VOTE.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AccountVote.ACCOUNT_VOTE.TIMESTAMP;
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
        return getVoteAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getVoteAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getVoteCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value2(String value) {
        setVoteAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value3(ULong value) {
        setVoteAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value4(Long value) {
        setVoteCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value5(ULong value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord value6(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountVoteRecord values(ULong value1, String value2, ULong value3, Long value4, ULong value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountVoteRecord
     */
    public AccountVoteRecord() {
        super(AccountVote.ACCOUNT_VOTE);
    }

    /**
     * Create a detached, initialised AccountVoteRecord
     */
    public AccountVoteRecord(ULong id, String voteAddress, ULong voteAccountId, Long voteCount, ULong accountId, Timestamp timestamp) {
        super(AccountVote.ACCOUNT_VOTE);

        set(0, id);
        set(1, voteAddress);
        set(2, voteAccountId);
        set(3, voteCount);
        set(4, accountId);
        set(5, timestamp);
    }
}
