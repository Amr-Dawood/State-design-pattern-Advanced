package StateContext;

import State.ATMState;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMAchine){
        atmMachine = newATMMAchine;
    }


    @Override
    public void insertCart() {
        System.out.println("Enter PIN");
        atmMachine.setAtmState(atmMachine.getYesCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a Card Fist");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Enter a Card Fist");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a Card Fist");
    }
}
