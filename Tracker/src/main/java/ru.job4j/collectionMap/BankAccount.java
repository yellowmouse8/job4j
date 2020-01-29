package ru.job4j.collectionmap;


import java.util.*;
import java.util.stream.Collectors;

public class BankAccount {
    private Map<UserP, List<Account>> rt = new HashMap<>();

    public Map<UserP, List<Account>> getRt() {
        return rt;
    }

    public void addUserP(UserP userP) {
        this.rt.putIfAbsent(userP, new ArrayList<>());
    }

    public void deleteUserP(UserP userP) {
        //this.rt.remove(userP);
        Map<UserP, List<Account>> map = rt.entrySet().stream().filter(a -> a.getKey() != userP)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        rt.clear();
        rt.putAll(map);
    }

    public void addAccountToUser(String passport, Account account) {
        rt.entrySet().stream().filter(a -> passport.equals(a.getKey().getPassport()))
                .findFirst()
                .ifPresent(a -> a.getValue().add(account));
    }


    public void deleteAccountFromUser(String passport, Account account) {
        rt.entrySet().stream().filter(a -> passport.equals(a.getKey().getPassport()))
                .findFirst()
                .ifPresent(a -> a.getValue().remove(account));
    }

    private List<Account> getUserAccounts(String passport) {
        return rt.entrySet().stream()
                .filter(a -> passport.equals(a.getKey().getPassport()))
                .findFirst()
                .map(Map.Entry::getValue)
                .filter(Objects::nonNull)
                .get();
    }

    public void transferMoney(String srcPassport, String srcRequisite, String dstPassport, String dstRequisite,
                              double amount) {
        Account srcAccount = getAccount(srcPassport, srcRequisite);
        Account dstAccount = getAccount(dstPassport, dstRequisite);
        srcAccount.transfer(dstAccount, amount);
    }

    private Account getAccount(String passport, String requisite) {
        return getUserAccounts(passport).stream()
                .filter(a -> a.getRequisites().equals(requisite))
                .findFirst()
                .filter(Objects::nonNull)
                .get();
    }
}
