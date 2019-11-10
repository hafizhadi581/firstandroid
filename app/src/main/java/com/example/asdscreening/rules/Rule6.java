package com.example.asdscreening.rules;

public class Rule6 {

    private boolean isReachObjectWithHand;
    private boolean isLeadYouToObject;
    private boolean isTryToGetObject;
    private boolean isAskUsingWordOrSound;
    private boolean isPointWhenYouSayShowMe;
    private boolean condition;

    public Rule6(boolean isReachObjectWithHand, boolean isLeadYouToObject, boolean isTryToGetObject, boolean isAskUsingWordOrSound, boolean isPointWhenYouSayShowMe) {

        this.isReachObjectWithHand = isReachObjectWithHand;
        this.isLeadYouToObject = isLeadYouToObject;
        this.isTryToGetObject = isTryToGetObject;
        this.isAskUsingWordOrSound = isAskUsingWordOrSound;
        this.isPointWhenYouSayShowMe = isPointWhenYouSayShowMe;
    }

    public boolean isReachObjectWithHand() {
        return isReachObjectWithHand;
    }

    public void setReachObjectWithHand(boolean reachObjectWithHand) { isReachObjectWithHand = reachObjectWithHand; }

    public boolean isLeadYouToObject() {
        return isLeadYouToObject;
    }

    public void setLeadYouToObject(boolean leadYouToObject) {
        isLeadYouToObject = leadYouToObject;
    }

    public boolean isTryToGetObject() {
        return isTryToGetObject;
    }

    public void setTryToGetObject(boolean tryToGetObject) {
        isTryToGetObject = tryToGetObject;
    }

    public boolean isAskUsingWordOrSound() {
        return isAskUsingWordOrSound;
    }

    public void setAskUsingWordOrSound(boolean askUsingWordOrSound) { isAskUsingWordOrSound = askUsingWordOrSound; }

    public boolean isPointWhenYouSayShowMe() {
        return isPointWhenYouSayShowMe;
    }

    public void setPointWhenYouSayShowMe(boolean pointWhenYouSayShowMe) { isPointWhenYouSayShowMe = pointWhenYouSayShowMe; }

    public boolean isPass(){

        if (isReachObjectWithHand || isLeadYouToObject || isTryToGetObject || isAskUsingWordOrSound){
            if(isPointWhenYouSayShowMe){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
//if (isReachObjectWithHand || isLeadYouToObject || isTryToGetObject || isAskUsingWordOrSound || isPointWhenYouSayShowMe)