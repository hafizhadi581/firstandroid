package com.example.asdscreening.rules;

public class Rule18 {

    private boolean isCommand;
    private boolean isSituation;
    private boolean isDinnerTime;
    private boolean isBlanket;
    private boolean isBook;

    public Rule18(boolean isCommand, boolean isSituation, boolean isDinnerTime, boolean isBlanket, boolean isBook) {
        this.isCommand = isCommand;
        this.isSituation = isSituation;
        this.isDinnerTime = isDinnerTime;
        this.isBlanket = isBlanket;
        this.isBook = isBook;
    }

    public boolean isCommand() {
        return isCommand;
    }

    public void setCommand(boolean command) {
        isCommand = command;
    }

    public boolean isSituation() {
        return isSituation;
    }

    public void setSituation(boolean situation) {
        isSituation = situation;
    }

    public boolean isDinnerTime() {
        return isDinnerTime;
    }

    public void setDinnerTime(boolean dinnerTime) {
        isDinnerTime = dinnerTime;
    }

    public boolean isBlanket() {
        return isBlanket;
    }

    public void setBlanket(boolean blanket) {
        isBlanket = blanket;
    }

    public boolean isBook() {
        return isBook;
    }

    public void setBook(boolean book) {
        isBook = book;
    }

    public boolean isPass(){

        if(isCommand){
            if( isSituation || isBlanket || isBook ){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if(isDinnerTime){
                if( isSituation || isBlanket || isBook ){
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }

    }
}
//        isCommand
//        isSituation
//        isBlanket
//        isBook
//        isDinnerTime