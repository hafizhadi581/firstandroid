package com.example.asdscreening.rules;

public class Rule5 {


    private boolean isLookAtHand;
    private boolean isMoveAFinger;
    private boolean isWiggleFingerNearEye;
    private boolean isHoldHandCloseEye;
    private boolean isHoldHandSideEye;
    private boolean isFlapHandNearFace;
    private boolean isHappenTwiceWeek;


    public Rule5(boolean isLookAtHand, boolean isMoveAFinger, boolean isWiggleFingerNearEye, boolean isHoldHandCloseEye, boolean isHoldHandSideEye, boolean isFlapHandNearFace, boolean isHappenTwiceWeek) {
        this.isLookAtHand = isLookAtHand;
        this.isMoveAFinger = isMoveAFinger;
        this.isWiggleFingerNearEye = isWiggleFingerNearEye;
        this.isHoldHandCloseEye = isHoldHandCloseEye;
        this.isHoldHandSideEye = isHoldHandSideEye;
        this.isFlapHandNearFace = isFlapHandNearFace;
        this.isHappenTwiceWeek = isHappenTwiceWeek;
    }

    public boolean isLookAtHand() {
        return isLookAtHand;
    }

    public void setLookAtHand(boolean lookAtHand) {
        isLookAtHand = lookAtHand;
    }

    public boolean isMoveAFinger() {
        return isMoveAFinger;
    }

    public void setMoveAFinger(boolean moveAFinger) {
        isMoveAFinger = moveAFinger;
    }

    public boolean isWiggleFingerNearEye() {
        return isWiggleFingerNearEye;
    }

    public void setWiggleFingerNearEye(boolean wiggleFingerNearEye) { isWiggleFingerNearEye = wiggleFingerNearEye; }

    public boolean isHoldHandCloseEye() {
        return isHoldHandCloseEye;
    }

    public void setHoldHandCloseEye(boolean holdHandCloseEye) { isHoldHandCloseEye = holdHandCloseEye; }

    public boolean isHoldHandSideEye() {
        return isHoldHandSideEye;
    }

    public void setHoldHandSideEye(boolean holdHandSideEye) {
        isHoldHandSideEye = holdHandSideEye;
    }

    public boolean isFlapHandNearFace() {
        return isFlapHandNearFace;
    }

    public void setFlapHandNearFace(boolean flapHandNearFace) { isFlapHandNearFace = flapHandNearFace; }

    public boolean isHappenTwiceWeek() { return isHappenTwiceWeek; }

    public void setHappenTwiceWeek(boolean happenTwiceWeek) { isHappenTwiceWeek = happenTwiceWeek; }

    public boolean isPass() {
        if (isLookAtHand) {
            return true;
        } else {
            if (isMoveAFinger) {
                return true;
            } else {
                if (isWiggleFingerNearEye || isHoldHandCloseEye || isHoldHandSideEye || isFlapHandNearFace) {
                    return false;
                }
                return true;
            }
        }
    }
}
//  isWiggleFingerNearEye || isHoldHandCloseEye || isHoldHandSideEye ||isFlapHandNearFace