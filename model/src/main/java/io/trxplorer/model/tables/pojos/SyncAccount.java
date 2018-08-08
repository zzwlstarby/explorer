/*
 * This file is generated by jOOQ.
*/
package io.trxplorer.model.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class SyncAccount implements Serializable {

    private static final long serialVersionUID = 930128836;

    private ULong     id;
    private String    address;
    private Timestamp dateCreated;
    private Timestamp dateLocked;
    private String    origin;
    private Timestamp txTimestamp;

    public SyncAccount() {}

    public SyncAccount(SyncAccount value) {
        this.id = value.id;
        this.address = value.address;
        this.dateCreated = value.dateCreated;
        this.dateLocked = value.dateLocked;
        this.origin = value.origin;
        this.txTimestamp = value.txTimestamp;
    }

    public SyncAccount(
        ULong     id,
        String    address,
        Timestamp dateCreated,
        Timestamp dateLocked,
        String    origin,
        Timestamp txTimestamp
    ) {
        this.id = id;
        this.address = address;
        this.dateCreated = dateCreated;
        this.dateLocked = dateLocked;
        this.origin = origin;
        this.txTimestamp = txTimestamp;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateLocked() {
        return this.dateLocked;
    }

    public void setDateLocked(Timestamp dateLocked) {
        this.dateLocked = dateLocked;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Timestamp getTxTimestamp() {
        return this.txTimestamp;
    }

    public void setTxTimestamp(Timestamp txTimestamp) {
        this.txTimestamp = txTimestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SyncAccount (");

        sb.append(id);
        sb.append(", ").append(address);
        sb.append(", ").append(dateCreated);
        sb.append(", ").append(dateLocked);
        sb.append(", ").append(origin);
        sb.append(", ").append(txTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
