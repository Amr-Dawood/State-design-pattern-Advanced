package StateContext;

import State.ATMState;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMAchine){
        atmMachine = newATMMAchine;
    }

    @Override
    public void insertCart() {
        System.out.println("Machine is empty");
    }

    @Override
    public void ejectCard() {
        System.out.println("Machine is empty");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Machine is empty");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Machine is empty");
    }
}
