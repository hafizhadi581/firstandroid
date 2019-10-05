package com.example.asdscreening.rules;

public class Rule1 {

    private boolean lookAtObject;
    private boolean pointAtObject;
    private boolean lookAndCommentToObject;
    private boolean parrentCommantLook;
    private boolean ignoreParent;
    private boolean lookAroundRandomly;
    private boolean lookAtParentFinger;

    private int failCount;
    private int passCount;

    public Rule1(boolean lookAtObject, boolean pointAtObject, boolean lookAndCommentToObject, boolean parrentCommantLook, boolean ignoreParent, boolean lookAroundRandomly, boolean lookAtParentFinger) {

        this.lookAtObject = lookAtObject;
        this.pointAtObject = pointAtObject;
        this.lookAndCommentToObject = lookAndCommentToObject;
        this.parrentCommantLook = parrentCommantLook;
        this.ignoreParent = ignoreParent;
        this.lookAroundRandomly = lookAroundRandomly;
        this.lookAtParentFinger = lookAtParentFinger;
    }

    public boolean isLookAtObject() {
        return lookAtObject;
    }

    public boolean isPointAtObject() {
        return pointAtObject;
    }

    public boolean isLookAndCommentToObject() {
        return lookAndCommentToObject;
    }

    public boolean isParrentCommantLook() {
        return parrentCommantLook;
    }

    public boolean isIgnoreParent() {
        return ignoreParent;
    }

    public boolean isLookAroundRandomly() {
        return lookAroundRandomly;
    }

    public void setLookAtObject(boolean lookAtObject) {
        this.lookAtObject = lookAtObject;
    }

    public void setPointAtObject(boolean pointAtObject) {
        this.pointAtObject = pointAtObject;
    }

    public void setLookAndCommentToObject(boolean lookAndCommentToObject) {
        this.lookAndCommentToObject = lookAndCommentToObject;
    }

    public void setParrentCommantLook(boolean parrentCommantLook) {
        this.parrentCommantLook = parrentCommantLook;
    }

    public void setIgnoreParent(boolean ignoreParent) {
        this.ignoreParent = ignoreParent;
    }

    public void setLookAroundRandomly(boolean lookAroundRandomly) {
        this.lookAroundRandomly = lookAroundRandomly;
    }

    public boolean isLookAtParentFinger() {
        return lookAtParentFinger;
    }

    public void setLookAtParentFinger(boolean lookAtParentFinger) {
        this.lookAtParentFinger = lookAtParentFinger;
    }

    public boolean isPass() {
        failCount = 0;
        passCount = 0;

        if(isIgnoreParent()){
            failCount++;
        }
        if(isLookAroundRandomly()){
            failCount++;
        }
        if(isLookAtParentFinger()){
            failCount++;
        }

        if(isPointAtObject()){
            passCount++;
        }
        if(isParrentCommantLook()){
            passCount++;
        }
        if(isLookAtObject()){
            passCount++;
        }
        if(isLookAndCommentToObject()){
            passCount++;
        }

        return passCount>= failCount;
    }
}
