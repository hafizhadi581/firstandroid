package com.example.asdscreening.rules;

public class Rule5 {


    private boolean isLookAtHand;
    private boolean isMoveAFinger;

    private boolean isWiggleFingerNearEye;
    private boolean isHoldHandCloseEye;
    private boolean isHoldHandSideEye;
    private boolean isFlapHandNearFace;

    public Rule5(boolean checked, boolean cbYq5y2Checked, boolean cbYq5y3Checked, boolean cbYq5y4Checked, boolean cbYq5y5Checked, boolean cbYq5y6Checked, boolean cbYq5y7Checked) {
        this.isLookAtHand = isLookAtHand;
        this.isMoveAFinger = isMoveAFinger;
        this.isWiggleFingerNearEye = isWiggleFingerNearEye;
        this.isHoldHandCloseEye = isHoldHandCloseEye;
        this.isHoldHandSideEye = isHoldHandSideEye;
        this.isFlapHandNearFace = isFlapHandNearFace;
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

    public void setWiggleFingerNearEye(boolean wiggleFingerNearEye) {
        isWiggleFingerNearEye = wiggleFingerNearEye;
    }

    public boolean isHoldHandCloseEye() {
        return isHoldHandCloseEye;
    }

    public void setHoldHandCloseEye(boolean holdHandCloseEye) {
        isHoldHandCloseEye = holdHandCloseEye;
    }

    public boolean isHoldHandSideEye() {
        return isHoldHandSideEye;
    }

    public void setHoldHandSideEye(boolean holdHandSideEye) {
        isHoldHandSideEye = holdHandSideEye;
    }

    public boolean isFlapHandNearFace() {
        return isFlapHandNearFace;
    }

    public void setFlapHandNearFace(boolean flapHandNearFace) {
        isFlapHandNearFace = flapHandNearFace;
    }

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