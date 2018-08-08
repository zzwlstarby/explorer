/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.SyncAccount;
import io.trxplorer.model.tables.records.SyncAccountRecord;

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
public class SyncAccountDao extends DAOImpl<SyncAccountRecord, io.trxplorer.model.tables.pojos.SyncAccount, ULong> {

    /**
     * Create a new SyncAccountDao without any configuration
     */
    public SyncAccountDao() {
        super(SyncAccount.SYNC_ACCOUNT, io.trxplorer.model.tables.pojos.SyncAccount.class);
    }

    /**
     * Create a new SyncAccountDao with an attached configuration
     */
    public SyncAccountDao(Configuration configuration) {
        super(SyncAccount.SYNC_ACCOUNT, io.trxplorer.model.tables.pojos.SyncAccount.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.SyncAccount object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchById(ULong... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.SyncAccount fetchOneById(ULong value) {
        return fetchOne(SyncAccount.SYNC_ACCOUNT.ID, value);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchByAddress(String... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.ADDRESS, values);
    }

    /**
     * Fetch a unique record that has <code>address = value</code>
     */
    public io.trxplorer.model.tables.pojos.SyncAccount fetchOneByAddress(String value) {
        return fetchOne(SyncAccount.SYNC_ACCOUNT.ADDRESS, value);
    }

    /**
     * Fetch records that have <code>date_created IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchByDateCreated(Timestamp... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.DATE_CREATED, values);
    }

    /**
     * Fetch records that have <code>date_locked IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchByDateLocked(Timestamp... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.DATE_LOCKED, values);
    }

    /**
     * Fetch records that have <code>origin IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchByOrigin(String... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.ORIGIN, values);
    }

    /**
     * Fetch records that have <code>tx_timestamp IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.SyncAccount> fetchByTxTimestamp(Timestamp... values) {
        return fetch(SyncAccount.SYNC_ACCOUNT.TX_TIMESTAMP, values);
    }
}
