package com.example.asdscreening.rules;

public class Rule13 {

    private boolean isWalk;
    private boolean isWalkOn;

    public Rule13(boolean isWalk, boolean isWalkOn) {
        this.isWalk = isWalk;
        this.isWalkOn = isWalkOn;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isWalkOn() {
        return isWalkOn;
    }

    public void setWalkOn(boolean walkOn) {
        isWalkOn = walkOn;
    }

    public boolean isPass(){
        if(isWalk)
        {
            if(isWalkOn){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
