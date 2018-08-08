/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.AccountVote;
import io.trxplorer.model.tables.records.AccountVoteRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class AccountVoteDao extends DAOImpl<AccountVoteRecord, io.trxplorer.model.tables.pojos.AccountVote, ULong> {

    /**
     * Create a new AccountVoteDao without any configuration
     */
    public AccountVoteDao() {
        super(AccountVote.ACCOUNT_VOTE, io.trxplorer.model.tables.pojos.AccountVote.class);
    }

    /**
     * Create a new AccountVoteDao with an attached configuration
     */
    public AccountVoteDao(Configuration configuration) {
        super(AccountVote.ACCOUNT_VOTE, io.trxplorer.model.tables.pojos.AccountVote.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.AccountVote object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchById(ULong... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.AccountVote fetchOneById(ULong value) {
        return fetchOne(AccountVote.ACCOUNT_VOTE.ID, value);
    }

    /**
     * Fetch records that have <code>vote_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchByVoteAddress(String... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.VOTE_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>vote_account_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchByVoteAccountId(ULong... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.VOTE_ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>vote_count IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchByVoteCount(Long... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.VOTE_COUNT, values);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchByAccountId(ULong... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.AccountVote> fetchByTimestamp(Timestamp... values) {
        return fetch(AccountVote.ACCOUNT_VOTE.TIMESTAMP, values);
    }
}
