package com.example.asdscreening.rules;

public class Rule20 {

    private boolean isMoving;
    private boolean isMovingBounce;
    private boolean isLaugh;
    private boolean isBabble;
    private boolean isRequest;

    public Rule20(boolean isMoving, boolean isMovingBounce, boolean isLaugh, boolean isBabble, boolean isRequest) {
        this.isMoving = isMoving;
        this.isMovingBounce = isMovingBounce;
        this.isLaugh = isLaugh;
        this.isBabble = isBabble;
        this.isRequest = isRequest;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isMovingBounce() {
        return isMovingBounce;
    }

    public void setMovingBounce(boolean movingBounce) {
        isMovingBounce = movingBounce;
    }

    public boolean isLaugh() {
        return isLaugh;
    }

    public void setLaugh(boolean laugh) {
        isLaugh = laugh;
    }

    public boolean isBabble() {
        return isBabble;
    }

    public void setBabble(boolean babble) {
        isBabble = babble;
    }

    public boolean isRequest() {
        return isRequest;
    }

    public void setRequest(boolean request) {
        isRequest = request;
    }

    public boolean isPass(){
        if(isMoving){
            if(isMovingBounce){
                return true;
            }
            else{
                if(isLaugh || isBabble || isRequest ) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        else {
            if(isLaugh || isBabble || isRequest ) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}

//        isMoving
//        isMovingBounce
//        isLaugh
//        isBabble
//        isRequest