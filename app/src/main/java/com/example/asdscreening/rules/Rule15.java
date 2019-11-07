package com.example.asdscreening.rules;

public class Rule15 {

    private boolean isCopyTongue;
    private boolean isCopySound;
    private boolean isCopyWave;
    private boolean isCopyClap;
    private boolean isCopySignal;
    private boolean isCopyKiss;

    private int passCount;

    public Rule15(boolean isCopyTongue, boolean isCopySound, boolean isCopyWave, boolean isCopyClap, boolean isCopySignal, boolean isCopyKiss) {
        this.isCopyTongue = isCopyTongue;
        this.isCopySound = isCopySound;
        this.isCopyWave = isCopyWave;
        this.isCopyClap = isCopyClap;
        this.isCopySignal = isCopySignal;
        this.isCopyKiss = isCopyKiss;
    }

    public boolean isCopyTongue() {
        return isCopyTongue;
    }

    public void setCopyTongue(boolean copyTongue) {
        isCopyTongue = copyTongue;
    }

    public boolean isCopySound() {
        return isCopySound;
    }

    public void setCopySound(boolean copySound) {
        isCopySound = copySound;
    }

    public boolean isCopyWave() {
        return isCopyWave;
    }

    public void setCopyWave(boolean copyWave) {
        isCopyWave = copyWave;
    }

    public boolean isCopyClap() {
        return isCopyClap;
    }

    public void setCopyClap(boolean copyClap) {
        isCopyClap = copyClap;
    }

    public boolean isCopySignal() {
        return isCopySignal;
    }

    public void setCopySignal(boolean copySignal) {
        isCopySignal = copySignal;
    }

    public boolean isCopyKiss() {
        return isCopyKiss;
    }

    public void setCopyKiss(boolean copyKiss) {
        isCopyKiss = copyKiss;
    }

    public boolean isPass() {

        passCount = 0;

        if (isCopyTongue) {
            passCount++;
        }
        if (isCopySound) {
            passCount++;
        }
        if (isCopyWave) {
            passCount++;
        }
        if (isCopyClap) {
            passCount++;
        }
        if (isCopySignal) {
            passCount++;
        }
        if (isCopyKiss) {
            passCount++;
        }

        if (passCount >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
//         isCopyTongue;
//         isCopySound;
//         isCopyWave;
//         isCopyClap;
//         isCopySignal;
//         isCopyKiss;