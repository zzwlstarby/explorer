/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.daos;


import io.trxplorer.model.tables.ContractAccountCreate;
import io.trxplorer.model.tables.records.ContractAccountCreateRecord;

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
public class ContractAccountCreateDao extends DAOImpl<ContractAccountCreateRecord, io.trxplorer.model.tables.pojos.ContractAccountCreate, ULong> {

    /**
     * Create a new ContractAccountCreateDao without any configuration
     */
    public ContractAccountCreateDao() {
        super(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE, io.trxplorer.model.tables.pojos.ContractAccountCreate.class);
    }

    /**
     * Create a new ContractAccountCreateDao with an attached configuration
     */
    public ContractAccountCreateDao(Configuration configuration) {
        super(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE, io.trxplorer.model.tables.pojos.ContractAccountCreate.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(io.trxplorer.model.tables.pojos.ContractAccountCreate object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountCreate> fetchById(ULong... values) {
        return fetch(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public io.trxplorer.model.tables.pojos.ContractAccountCreate fetchOneById(ULong value) {
        return fetchOne(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.ID, value);
    }

    /**
     * Fetch records that have <code>account_name IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountCreate> fetchByAccountName(String... values) {
        return fetch(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.ACCOUNT_NAME, values);
    }

    /**
     * Fetch records that have <code>owner_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountCreate> fetchByOwnerId(ULong... values) {
        return fetch(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.OWNER_ID, values);
    }

    /**
     * Fetch records that have <code>transaction_id IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountCreate> fetchByTransactionId(ULong... values) {
        return fetch(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.TRANSACTION_ID, values);
    }

    /**
     * Fetch records that have <code>owner_address IN (values)</code>
     */
    public List<io.trxplorer.model.tables.pojos.ContractAccountCreate> fetchByOwnerAddress(String... values) {
        return fetch(ContractAccountCreate.CONTRACT_ACCOUNT_CREATE.OWNER_ADDRESS, values);
    }
}
