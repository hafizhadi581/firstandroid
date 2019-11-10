package com.example.asdscreening.rules;

public class Rule17 {

    private boolean isWatchMe;
    private boolean isWatchBabble;
    private boolean isWatchPraise;
    private boolean isWatchLook;

    public Rule17(boolean isWatchMe, boolean isWatchBabble, boolean isWatchPraise, boolean isWatchLook) {
        this.isWatchMe = isWatchMe;
        this.isWatchBabble = isWatchBabble;
        this.isWatchPraise = isWatchPraise;
        this.isWatchLook = isWatchLook;
    }

    public boolean isWatchMe() {
        return isWatchMe;
    }

    public void setWatchMe(boolean watchMe) {
        isWatchMe = watchMe;
    }

    public boolean isWatchBabble() {
        return isWatchBabble;
    }

    public void setWatchBabble(boolean watchBabble) {
        isWatchBabble = watchBabble;
    }

    public boolean isWatchPraise() {
        return isWatchPraise;
    }

    public void setWatchPraise(boolean watchPraise) {
        isWatchPraise = watchPraise;
    }

    public boolean isWatchLook() {
        return isWatchLook;
    }

    public void setWatchLook(boolean watchLook) {
        isWatchLook = watchLook;
    }

    public boolean isPass(){

        if(isWatchMe || isWatchBabble || isWatchPraise || isWatchLook ) {
            return true;
        }
        else {
            return false;
        }
    }
}

