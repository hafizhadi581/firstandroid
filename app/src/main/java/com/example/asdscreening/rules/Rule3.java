package com.example.asdscreening.rules;

public class Rule3 {

    private boolean isDrinkToyCup;
    private boolean isEatToy;
    private boolean isTalkTelephone;
    private boolean isFeedDoll;
    private boolean isPushCar;
    private boolean isPretend;
    private boolean isPutToyPot;
    private boolean isStirFood;
    private boolean isPutAction;
    private boolean isPretendVacuum;

    public Rule3(boolean isDrinkToyCup, boolean isEatToy, boolean isTalkTelephone, boolean isFeedDoll, boolean isPushCar, boolean isPretend, boolean isPutToyPot, boolean isStirFood, boolean isPutAction, boolean isPretendVacuum) {
        this.isDrinkToyCup = isDrinkToyCup;
        this.isEatToy = isEatToy;
        this.isTalkTelephone = isTalkTelephone;
        this.isFeedDoll = isFeedDoll;
        this.isPushCar = isPushCar;
        this.isPretend = isPretend;
        this.isPutToyPot = isPutToyPot;
        this.isStirFood = isStirFood;
        this.isPutAction = isPutAction;
        this.isPretendVacuum = isPretendVacuum;
    }

    public boolean isDrinkToyCup() {
        return isDrinkToyCup;
    }

    public void setDrinkToyCup(boolean drinkToyCup) {
        isDrinkToyCup = drinkToyCup;
    }

    public boolean isEatToy() {
        return isEatToy;
    }

    public void setEatToy(boolean eatToy) {
        isEatToy = eatToy;
    }

    public boolean isTalkTelephone() {
        return isTalkTelephone;
    }

    public void setTalkTelephone(boolean talkTelephone) {
        isTalkTelephone = talkTelephone;
    }

    public boolean isFeedDoll() {
        return isFeedDoll;
    }

    public void setFeedDoll(boolean feedDoll) {
        isFeedDoll = feedDoll;
    }

    public boolean isPushCar() {
        return isPushCar;
    }

    public void setPushCar(boolean pushCar) {
        isPushCar = pushCar;
    }

    public boolean isPretend() {
        return isPretend;
    }

    public void setPretend(boolean pretend) {
        isPretend = pretend;
    }

    public boolean isPutToyPot() {
        return isPutToyPot;
    }

    public void setPutToyPot(boolean putToyPot) {
        isPutToyPot = putToyPot;
    }

    public boolean isStirFood() {
        return isStirFood;
    }

    public void setStirFood(boolean stirFood) {
        isStirFood = stirFood;
    }

    public boolean isPutAction() {
        return isPutAction;
    }

    public void setPutAction(boolean putAction) {
        isPutAction = putAction;
    }

    public boolean isPretendVacuum() {
        return isPretendVacuum;
    }

    public void setPretendVacuum(boolean pretendVacuum) {
        isPretendVacuum = pretendVacuum;
    }

    public boolean isPass() {
        if (isDrinkToyCup || isEatToy || isTalkTelephone || isFeedDoll || isPushCar || isPretend || isPutToyPot || isStirFood || isPutAction || isPretendVacuum) {
            return true;
        } else {
            return false;
        }
    }
}
