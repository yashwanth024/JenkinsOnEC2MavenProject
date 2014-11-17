package com.bogotobogo;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAccount {

    @Test
    public void testFunds() {
       Account account = new Account(10);
       double amount = account.debit(5);
       Assert.assertEquals(5.0, amount);
    }
}
