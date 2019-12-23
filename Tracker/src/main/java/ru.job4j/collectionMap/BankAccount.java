package ru.job4j.collectionMap;

import java.util.*;

public class BankAccount {
    private TreeMap<UserP, List<Account>> rt = new TreeMap<>();

    public void addUserP(UserP userP) {
        this.rt.putIfAbsent(userP, new ArrayList<>());
    }

    public void deleteUserP(UserP userP) {
        this.rt.remove(userP);
    }

    public void addAccountToUser(String passport, Account account)  {
        for (Map.Entry<UserP, List<Account>> i : rt.entrySet()){
            if (i.getKey().equals(passport)
            && i.getValue().indexOf(account) == -1 ){
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

    public List<Account> getUserAccounts(String passport) {
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
        boolean rst = false;
        Account srcAccount = getAccount(srcPassport, srcRequisite);
        Account dstAccount = getAccount(dstPassport, dstRequisite);
        if (srcAccount != null && dstAccount != null && srcAccount.getValue() >= amount){
            srcAccount.setValue(srcAccount.getValue() - amount);
            dstAccount.setValue(dstAccount.getValue() + amount);
            rst = true;
        }
        return rst;
    }

    public Account getAccount (String passport , String requisite){
        Account rst = null;
        if (this.getUserAccounts(passport) != null){
            for (Account account : this.getUserAccounts(passport)){
                if (account.getRequisites().equals(requisite)){
                    rst = account;
                    break;
                }
            }
        }
        return rst;
    }

    public TreeMap< UserP, List<Account>> getRt (){
        return this.rt;
    }
}
