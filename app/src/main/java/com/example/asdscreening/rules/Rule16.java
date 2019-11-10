package com.example.asdscreening.rules;

public class Rule16 {

    private boolean isLookSomething;
    private boolean isLookToward;
    private boolean isPointToward;
    private boolean isLookAround;
    private boolean isIgnore;
    private boolean isLookFace;

    private int passCount;
    private int failCount;

    public Rule16(boolean isLookSomething, boolean isLookToward, boolean isPointToward, boolean isLookAround, boolean isIgnore, boolean isLookFace) {
        this.isLookSomething = isLookSomething;
        this.isLookToward = isLookToward;
        this.isPointToward = isPointToward;
        this.isLookAround = isLookAround;
        this.isIgnore = isIgnore;
        this.isLookFace = isLookFace;
    }

    public boolean isLookSomething() {
        return isLookSomething;
    }

    public void setLookSomething(boolean lookSomething) {
        isLookSomething = lookSomething;
    }

    public boolean isLookToward() {
        return isLookToward;
    }

    public void setLookToward(boolean lookToward) {
        isLookToward = lookToward;
    }

    public boolean isPointToward() {
        return isPointToward;
    }

    public void setPointToward(boolean pointToward) {
        isPointToward = pointToward;
    }

    public boolean isLookAround() {
        return isLookAround;
    }

    public void setLookAround(boolean lookAround) {
        isLookAround = lookAround;
    }

    public boolean isIgnore() {
        return isIgnore;
    }

    public void setIgnore(boolean ignore) {
        isIgnore = ignore;
    }

    public boolean isLookFace() {
        return isLookFace;
    }

    public void setLookFace(boolean lookFace) {
        isLookFace = lookFace;
    }

    public boolean isPass(){

        passCount = 0;
        failCount = 0;
        if(isLookSomething){
            return true;
        }
        else{
            if(isLookToward ){
                passCount++;
            }
            if(isPointToward ){
                passCount++;
            }
            if(isLookAround ){
                passCount++;
            }
            if(isIgnore ){
                failCount++;
            }
            if(isLookFace ){
                failCount++;
            }

            return passCount >= failCount;
        }
    }
}
//         isLookSomething
//         isLookToward
//         isPointToward
//         isLookAround
//         isIgnore
//         isLookFace