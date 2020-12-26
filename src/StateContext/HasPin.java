package StateContext;

import State.ATMState;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMAchine){
        atmMachine = newATMMAchine;
    }

    @Override
    public void insertCart() {
        System.out.println("You cannot enter , already card is entered");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected ");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Already Entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.cashInMachine){
            atmMachine.setAtmState(atmMachine.getNoCardState());
            System.out.println("Machine doesnot have enough money");
            System.out.println("Card Ejected");
        }
        else{
            System.out.println(cashToWithdraw + "is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Card Ejected");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if(atmMachine.cashInMachine <= 0){
                atmMachine.setAtmState(atmMachine.getNoCashState());
            }
        }
    }


}
