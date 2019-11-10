package com.example.asdscreening.rules;

public class Rule14 {

    private boolean isLookForNeed;
    private boolean isLookForPlay;
    private boolean isLookForFeed;
    private boolean isLookForDiaper;
    private boolean isLookForRead;
    private boolean isLookForTalk;
    private boolean isLookForEye;
    private boolean isLookFor5Times;

    private int count;


    public Rule14(boolean isLookForNeed, boolean isLookForPlay, boolean isLookForFeed, boolean isLookForDiaper, boolean isLookForRead, boolean isLookForTalk, boolean isLookForEye, boolean isLookFor5Times) {
        this.isLookForNeed = isLookForNeed;
        this.isLookForPlay = isLookForPlay;
        this.isLookForFeed = isLookForFeed;
        this.isLookForDiaper = isLookForDiaper;
        this.isLookForRead = isLookForRead;
        this.isLookForTalk = isLookForTalk;
        this.isLookForEye = isLookForEye;
        this.isLookFor5Times = isLookFor5Times;
    }

    public boolean isLookForNeed() {
        return isLookForNeed;
    }

    public void setLookForNeed(boolean lookForNeed) {
        isLookForNeed = lookForNeed;
    }

    public boolean isLookForPlay() {
        return isLookForPlay;
    }

    public void setLookForPlay(boolean lookForPlay) {
        isLookForPlay = lookForPlay;
    }

    public boolean isLookForFeed() {
        return isLookForFeed;
    }

    public void setLookForFeed(boolean lookForFeed) {
        isLookForFeed = lookForFeed;
    }

    public boolean isLookForDiaper() {
        return isLookForDiaper;
    }

    public void setLookForDiaper(boolean lookForDiaper) {
        isLookForDiaper = lookForDiaper;
    }

    public boolean isLookForRead() {
        return isLookForRead;
    }

    public void setLookForRead(boolean lookForRead) {
        isLookForRead = lookForRead;
    }

    public boolean isLookForTalk() {
        return isLookForTalk;
    }

    public void setLookForTalk(boolean lookForTalk) {
        isLookForTalk = lookForTalk;
    }

    public boolean isLookForEye() {
        return isLookForEye;
    }

    public void setLookForEye(boolean lookForEye) {
        isLookForEye = lookForEye;
    }

    public boolean isLookFor5Times() {
        return isLookFor5Times;
    }

    public void setLookFor5Times(boolean lookFor5Times) {
        isLookFor5Times = lookFor5Times;
    }

    public boolean isPass() {
        count = 0;

        if (isLookForNeed) {
            count++;
        }
        if (isLookForPlay) {
            count++;
        }
        if (isLookForFeed) {
            count++;
        }
        if (isLookForDiaper) {
            count++;
        }
        if (isLookForRead) {
            count++;
        }
        if (isLookForTalk) {
            count++;
        }

        if (count >= 2) {
            return true;
        } else if (count == 1) {
            if (isLookForEye) {
                if (isLookFor5Times) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }


}
//        isLookForNeed
//        isLookForPlay
//        isLookForFeed
//        isLookForDiaper
//        isLookForRead
//        isLookForTalk
//        isLookForEye
//        isLookFor5Times