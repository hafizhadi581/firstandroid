package com.example.asdscreening.rules;

public class Rule8 {
    private boolean isInterestedInOtherChildren;
    private boolean isInterestedNotBrotherSister;
    private boolean isRespondToOtherChildren;
    private boolean isPlayingWithOtherChildren;
    private boolean isTalkingToOtherChildren;
    private boolean isBabbleOrMakeNoise;
    private boolean isWatchingOtherChildren;
    private boolean isSmillingAtOtherChildren;
    private boolean isActingShyAtOtherChildren;
    private boolean isGettingExcitedAtOtherChildren;
    private boolean isRespondToOtherChildrenHalfOfTime;

    public Rule8(boolean isInterestedInOtherChildren, boolean isInterestedNotBrotherSister, boolean isRespondToOtherChildren, boolean isPlayingWithOtherChildren, boolean isTalkingToOtherChildren, boolean isBabbleOrMakeNoise, boolean isWatchingOtherChildren, boolean isSmillingAtOtherChildren, boolean isActingShyAtOtherChildren, boolean isGettingExcitedAtOtherChildren, boolean isRespondToOtherChildrenHalfOfTime) {
        this.isInterestedInOtherChildren = isInterestedInOtherChildren;
        this.isInterestedNotBrotherSister = isInterestedNotBrotherSister;
        this.isRespondToOtherChildren = isRespondToOtherChildren;
        this.isPlayingWithOtherChildren = isPlayingWithOtherChildren;
        this.isTalkingToOtherChildren = isTalkingToOtherChildren;
        this.isBabbleOrMakeNoise = isBabbleOrMakeNoise;
        this.isWatchingOtherChildren = isWatchingOtherChildren;
        this.isSmillingAtOtherChildren = isSmillingAtOtherChildren;
        this.isActingShyAtOtherChildren = isActingShyAtOtherChildren;
        this.isGettingExcitedAtOtherChildren = isGettingExcitedAtOtherChildren;
        this.isRespondToOtherChildrenHalfOfTime = isRespondToOtherChildrenHalfOfTime;
    }

    public boolean isInterestedInOtherChildren() {
        return isInterestedInOtherChildren;
    }

    public void setInterestedInOtherChildren(boolean interestedInOtherChildren) {
        isInterestedInOtherChildren = interestedInOtherChildren;
    }

    public boolean isInterestedNotBrotherSister() {
        return isInterestedNotBrotherSister;
    }

    public void setInterestedNotBrotherSister(boolean interestedNotBrotherSister) {
        isInterestedNotBrotherSister = interestedNotBrotherSister;
    }

    public boolean isRespondToOtherChildren() {
        return isRespondToOtherChildren;
    }

    public void setRespondToOtherChildren(boolean respondToOtherChildren) {
        isRespondToOtherChildren = respondToOtherChildren;
    }

    public boolean isPlayingWithOtherChildren() {
        return isPlayingWithOtherChildren;
    }

    public void setPlayingWithOtherChildren(boolean playingWithOtherChildren) {
        isPlayingWithOtherChildren = playingWithOtherChildren;
    }

    public boolean isTalkingToOtherChildren() {
        return isTalkingToOtherChildren;
    }

    public void setTalkingToOtherChildren(boolean talkingToOtherChildren) {
        isTalkingToOtherChildren = talkingToOtherChildren;
    }

    public boolean isBabbleOrMakeNoise() {
        return isBabbleOrMakeNoise;
    }

    public void setBabbleOrMakeNoise(boolean babbleOrMakeNoise) {
        isBabbleOrMakeNoise = babbleOrMakeNoise;
    }

    public boolean isWatchingOtherChildren() {
        return isWatchingOtherChildren;
    }

    public void setWatchingOtherChildren(boolean watchingOtherChildren) {
        isWatchingOtherChildren = watchingOtherChildren;
    }

    public boolean isSmillingAtOtherChildren() {
        return isSmillingAtOtherChildren;
    }

    public void setSmillingAtOtherChildren(boolean smillingAtOtherChildren) {
        isSmillingAtOtherChildren = smillingAtOtherChildren;
    }

    public boolean isActingShyAtOtherChildren() {
        return isActingShyAtOtherChildren;
    }

    public void setActingShyAtOtherChildren(boolean actingShyAtOtherChildren) {
        isActingShyAtOtherChildren = actingShyAtOtherChildren;
    }

    public boolean isGettingExcitedAtOtherChildren() {
        return isGettingExcitedAtOtherChildren;
    }

    public void setGettingExcitedAtOtherChildren(boolean gettingExcitedAtOtherChildren) {
        isGettingExcitedAtOtherChildren = gettingExcitedAtOtherChildren;
    }

    public boolean isRespondToOtherChildrenHalfOfTime() {
        return isRespondToOtherChildrenHalfOfTime;
    }

    public void setRespondToOtherChildrenHalfOfTime(boolean respondToOtherChildrenHalfOfTime) {
        isRespondToOtherChildrenHalfOfTime = respondToOtherChildrenHalfOfTime;
    }

    public boolean isPass() {

        if (isInterestedInOtherChildren) {
            if (isInterestedNotBrotherSister) {
                return true;
            } else {
                if (isRespondToOtherChildren) {
                    if (isPlayingWithOtherChildren || isPlayingWithOtherChildren || isTalkingToOtherChildren || isBabbleOrMakeNoise || isWatchingOtherChildren || isSmillingAtOtherChildren || isActingShyAtOtherChildren || isGettingExcitedAtOtherChildren) {
                        if (isRespondToOtherChildrenHalfOfTime) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else
                    return false;
            }
        } else {
            return false;
        }

    }

}
//        if (isInterestedNotBrotherSister|| isRespondToOtherChildren || isPlayingWithOtherChildren || isTalkingToOtherChildren ||
//        isBabbleOrMakeNoise || isWatchingOtherChildren || isSmillingAtOtherChildren ||
//        isActingShyAtOtherChildren || isGettingExcitedAtOtherChildren ||
//        isRespondToOtherChildrenHalfOfTime )


