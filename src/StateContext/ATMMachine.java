package StateContext;

import State.ATMState;
import StateContext.*;

public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;


    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard  = new NoCard(this);
        hasCorrectPin = new HasPin(this);

        atmState = noCard;

        if (cashInMachine < 0)
            atmState = atmOutOfMoney;
    }

    void setAtmState(ATMState newATMState){
        atmState = newATMState;
    }

     void setCashInMachine(int newCashInMachine){
        cashInMachine = newCashInMachine;
     }

     void insertCard(){
        atmState.insertCart();
     }

    void ejectCard(){
        atmState.ejectCard();
    }

    void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw);
    }

    void insertPin(int pin){
        atmState.requestCash(pin);
    }

    public ATMState getYesCardState(){
        return hasCard;
    }

    public ATMState getNoCardState(){
        return noCard;
    }

    public ATMState getHasPin(){
        return hasCorrectPin;
    }

    public ATMState getNoCashState(){
        return atmOutOfMoney;
    }


}
