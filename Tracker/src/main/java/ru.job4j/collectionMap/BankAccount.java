package ru.job4j.collectionmap;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccount {
    private Map<UserP, List<Account>> rt = new HashMap<>();

    public Map<UserP, List<Account>> getRt() {
        return rt;
    }

    public void addUserP(UserP userP) {
        this.rt.putIfAbsent(userP, new ArrayList<>());
    }

    public void deleteUserP(UserP userP) {
        this.rt.remove(userP);
    }

    public void addAccountToUser(String passport, Account account) {
        for (Map.Entry<UserP, List<Account>> i : rt.entrySet()) {
            if (i.getKey().equals(passport)
                    && i.getValue().indexOf(account) == -1) {
                i.getValue().add(account);
                break;
            }
        }
    }


    public void deleteAccountFromUser(String passport, Account account) {
        for (Map.Entry<UserP, List<Account>> i : rt.entrySet()) {
            if (i.getKey().equals(passport) && i.getValue().indexOf(account) != -1) {
                i.getValue().remove(account);
                break;
            }
        }
    }

    private List<Account> getUserAccounts(String passport) {
        List<Account> rst = null;
        for (Map.Entry<UserP, List<Account>> i : rt.entrySet()) {
            if (i.getKey().equals(passport)) {
                rst = i.getValue();
                break;
            }
        }
        return rst;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String dstPassport, String dstRequisite,
                                 double amount) {
        Account srcAccount = getAccount(srcPassport, srcRequisite);
        Account dstAccount = getAccount(dstPassport, dstRequisite);
        return srcAccount != null && dstAccount != null && srcAccount.transfer(dstAccount, amount);
    }

    private Account getAccount(String passport, String requisite) {
        Account rst = null;
        if (this.getUserAccounts(passport) != null) {
            for (Account account : this.getUserAccounts(passport)) {
                if (account.getRequisites().equals(requisite)) {
                    rst = account;
                    break;
                }
            }
        }
        return rst;
    }
}
