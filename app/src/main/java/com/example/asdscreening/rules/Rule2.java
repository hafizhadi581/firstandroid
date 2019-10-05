package com.example.asdscreening.rules;

public class Rule2 {
    private boolean isIgnoreSound;
    private boolean isIgnorePeople;

    public Rule2(boolean isIgnoreSound, boolean isIgnorePeople) {
        this.isIgnoreSound = isIgnoreSound;
        this.isIgnorePeople = isIgnorePeople;
    }

    public boolean isIgnoreSound() {
        return isIgnoreSound;
    }

    public void setIgnoreSound(boolean ignoreSound) {
        isIgnoreSound = ignoreSound;
    }

    public boolean isIgnorePeople() {
        return isIgnorePeople;
    }

    public void setIgnorePeople(boolean ignorePeople) {
        isIgnorePeople = ignorePeople;
    }

    public boolean isPass() {

        if (isIgnoreSound || isIgnorePeople ) {
            return true;
        }
        else
            return false;
    }
}
