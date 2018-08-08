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
public class AccountFrozen implements Serializable {

    private static final long serialVersionUID = 656347566;

    private ULong     id;
    private Long      balance;
    private Timestamp expireTime;
    private ULong     accountId;

    public AccountFrozen() {}

    public AccountFrozen(AccountFrozen value) {
        this.id = value.id;
        this.balance = value.balance;
        this.expireTime = value.expireTime;
        this.accountId = value.accountId;
    }

    public AccountFrozen(
        ULong     id,
        Long      balance,
        Timestamp expireTime,
        ULong     accountId
    ) {
        this.id = id;
        this.balance = balance;
        this.expireTime = expireTime;
        this.accountId = accountId;
    }

    public ULong getId() {
        return this.id;
    }

    public void setId(ULong id) {
        this.id = id;
    }

    public Long getBalance() {
        return this.balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Timestamp getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public ULong getAccountId() {
        return this.accountId;
    }

    public void setAccountId(ULong accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AccountFrozen (");

        sb.append(id);
        sb.append(", ").append(balance);
        sb.append(", ").append(expireTime);
        sb.append(", ").append(accountId);

        sb.append(")");
        return sb.toString();
    }
}
