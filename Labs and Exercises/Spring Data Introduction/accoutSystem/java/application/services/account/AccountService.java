package application.services.account;

import java.math.BigDecimal;

public interface AccountService {
    void withdrawMoney(BigDecimal money, Long id ) throws IllegalAccessException;
    void transferMoney(BigDecimal money, Long id ) throws IllegalAccessException;

}
