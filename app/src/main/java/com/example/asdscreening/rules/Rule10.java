package com.example.asdscreening.rules;

public class Rule10 {

    private boolean isRespondLook;
    private boolean isRespondTalk;
    private boolean isRespondStop;
    private boolean isNoResponse;
    private boolean isHearButIgnore;
    private boolean isRespondParentInfront;
    private boolean isRespondTouch;

    private int failCount;
    private int passCount;

    public Rule10(boolean isRespondLook, boolean isRespondTalk, boolean isRespondStop, boolean isNoResponse, boolean isHearButIgnore, boolean isRespondParentInfront, boolean isRespondTouch) {
        this.isRespondLook = isRespondLook;
        this.isRespondTalk = isRespondTalk;
        this.isRespondStop = isRespondStop;
        this.isNoResponse = isNoResponse;
        this.isHearButIgnore = isHearButIgnore;
        this.isRespondParentInfront = isRespondParentInfront;
        this.isRespondTouch = isRespondTouch;
    }

    public boolean isRespondLook() {
        return isRespondLook;
    }

    public void setRespondLook(boolean respondLook) {
        isRespondLook = respondLook;
    }

    public boolean isRespondTalk() {
        return isRespondTalk;
    }

    public void setRespondTalk(boolean respondTalk) {
        isRespondTalk = respondTalk;
    }

    public boolean isRespondStop() {
        return isRespondStop;
    }

    public void setRespondStop(boolean respondStop) {
        isRespondStop = respondStop;
    }

    public boolean isNoResponse() {
        return isNoResponse;
    }

    public void setNoResponse(boolean noResponse) {
        isNoResponse = noResponse;
    }

    public boolean isHearButIgnore() {
        return isHearButIgnore;
    }

    public void setHearButIgnore(boolean hearButIgnore) {
        isHearButIgnore = hearButIgnore;
    }

    public boolean isRespondParentInfront() {
        return isRespondParentInfront;
    }

    public void setRespondParentInfront(boolean respondParentInfront) { isRespondParentInfront = respondParentInfront; }

    public boolean isRespondTouch() {
        return isRespondTouch;
    }

    public void setRespondTouch(boolean respondTouch) {
        isRespondTouch = respondTouch;
    }

    public boolean isPass(){
        failCount = 0;
        passCount = 0;

        if (isRespondLook()){
            passCount++;
        }
        if (isRespondTalk()){
            passCount++;
        }
        if (isRespondStop()){
            passCount++;
        }
        if (isNoResponse()){
            failCount++;
        }
        if (isHearButIgnore()){
            failCount++;
        }
        if (isRespondParentInfront()){
            failCount++;
        }
        if (isRespondTouch()){
            failCount++;
        }

        return passCount>=failCount;

    }

}
