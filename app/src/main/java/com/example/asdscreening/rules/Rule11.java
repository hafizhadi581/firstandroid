package com.example.asdscreening.rules;

public class Rule11 {

    private boolean isSmileBack;
    private boolean isSmileSmile;
    private boolean isSmileEnter;
    private boolean isSmileReturn;
    private boolean isAlwaysSmile;
    private boolean isBringBlock;
    private boolean isSmileRandom;

    private int failCount;
    private int passCount;

    public Rule11(boolean isSmileBack, boolean isSmileSmile, boolean isSmileEnter, boolean isSmileReturn, boolean isAlwaysSmile, boolean isBringBlock, boolean isSmileRandom) {
        this.isSmileBack = isSmileBack;
        this.isSmileSmile = isSmileSmile;
        this.isSmileEnter = isSmileEnter;
        this.isSmileReturn = isSmileReturn;
        this.isAlwaysSmile = isAlwaysSmile;
        this.isBringBlock = isBringBlock;
        this.isSmileRandom = isSmileRandom;
    }

    public boolean isSmileBack() {
        return isSmileBack;
    }

    public void setSmileBack(boolean smileBack) {
        isSmileBack = smileBack;
    }

    public boolean isSmileSmile() {
        return isSmileSmile;
    }

    public void setSmileSmile(boolean smileSmile) {
        isSmileSmile = smileSmile;
    }

    public boolean isSmileEnter() {
        return isSmileEnter;
    }

    public void setSmileEnter(boolean smileEnter) {
        isSmileEnter = smileEnter;
    }

    public boolean isSmileReturn() {
        return isSmileReturn;
    }

    public void setSmileReturn(boolean smileReturn) {
        isSmileReturn = smileReturn;
    }

    public boolean isAlwaysSmile() {
        return isAlwaysSmile;
    }

    public void setAlwaysSmile(boolean alwaysSmile) {
        isAlwaysSmile = alwaysSmile;
    }

    public boolean isBringBlock() {
        return isBringBlock;
    }

    public void setBringBlock(boolean bringBlock) {
        isBringBlock = bringBlock;
    }

    public boolean isSmileRandom() {
        return isSmileRandom;
    }

    public void setSmileRandom(boolean smileRandom) {
        isSmileRandom = smileRandom;
    }

    public boolean isPass(){
        failCount = 0;
        passCount = 0;

        if (isSmileBack){
            return true;
        }
        else {
            if (isSmileSmile){
                passCount++;
            }
            if (isSmileEnter){
                passCount++;
            }
            if (isSmileReturn){
                passCount++;
            }
            if (isAlwaysSmile){
                failCount++;
            }
            if (isBringBlock){
                failCount++;
            }
            if (isSmileRandom){
                failCount++;
            }
            return passCount>=failCount;
        }

    }
}
//if ( isSmileSmile || isSmileEnter || isSmileReturn || isAlwaysSmile || isBringBlock || isSmileRandom)
