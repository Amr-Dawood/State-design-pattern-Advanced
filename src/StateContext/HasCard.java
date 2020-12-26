package StateContext;

import State.ATMState;

public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMAchine){
        atmMachine = newATMMAchine;
    }

    @Override
    public void insertCart() {
        System.out.println("You cannot enter it, you already insert one");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234){
            System.out.println("correct pin");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin());
        }
        else {
            System.out.println("wrong PIN entered");
            atmMachine.correctPinEntered = false;
            System.out.println("CARD REJECTED");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("ENTER PIN FIRST");
    }
}
