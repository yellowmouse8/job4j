package ru.job4j.bank;

import org.junit.Test;
import ru.job4j.collectionmap.Account;
import ru.job4j.collectionmap.BankAccount;
import ru.job4j.collectionmap.UserP;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BankTransferTest {
    BankAccount bankAccount = new BankAccount();
    UserP userP1 = new UserP("Pim", "001");
    UserP userP2 = new UserP("Lom", "002");
    UserP userP3 = new UserP("Sam", "003");
    UserP userP4 = new UserP("LomTo", "002");

    @Test
    public void whenAddUserWithoutAdd() {
        bankAccount.addUserP(userP2);
        bankAccount.addUserP(userP4);
        UserP[] userPS = new UserP[2];
        bankAccount.getRt().keySet().toArray(userPS);
        assertThat(userPS[0].getName(), is("Lom"));
    }

    @Test
    public void whenDeleteUser() {
        bankAccount.addUserP(userP1);
        bankAccount.addUserP(userP2);
        bankAccount.addUserP(userP3);
        bankAccount.deleteUserP(userP1);
        UserP[] result = new UserP[bankAccount.getRt().size()];
        bankAccount.getRt().keySet().toArray(result);
        UserP[] expect = {userP2, userP3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddAccountToUSer() {
        bankAccount.addUserP(userP1);
        Account account = new Account("10", 10000);
        bankAccount.addAccountToUser("001", account);
        Account[] result = new Account[bankAccount.getRt().size()];
        bankAccount.getRt().get(userP1).toArray(result);
        Account[] expect = {account};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTransferMoney() {
        bankAccount.addUserP(userP3);
        Account account1 = new Account("10", 600);
        Account account2 = new Account("12", 200);
        bankAccount.addAccountToUser("003", account1);
        bankAccount.addAccountToUser("003", account2);
        assertThat(bankAccount.transferMoney("003", "10", "003", "12",
                400), is(true));
    }
}
