package State;

public interface ATMState {

    void insertCart();
    void ejectCard();
    void insertPin(int pin);
    void requestCash(int cashToWithdraw);

}
