package LLDQuestions.parkingLot.accounts;

import LLDQuestions.parkingLot.AccountStatus;
import LLDQuestions.parkingLot.Person;

public abstract class Account {
    String username;
    String password;
    AccountStatus status;
    Person person;

    public abstract void resetPassword();
}
