package com.example.asdscreening.rules;

public class Rule19 {

    private boolean isLookFeel;
    private boolean isHearScary;
    private boolean isApproach;
    private boolean isUnfamilliar;

    public Rule19(boolean isLookFeel, boolean isHearScary, boolean isApproach, boolean isUnfamilliar) {
        this.isLookFeel = isLookFeel;
        this.isHearScary = isHearScary;
        this.isApproach = isApproach;
        this.isUnfamilliar = isUnfamilliar;
    }

    public boolean isLookFeel() {
        return isLookFeel;
    }

    public void setLookFeel(boolean lookFeel) {
        isLookFeel = lookFeel;
    }

    public boolean isHearScary() {
        return isHearScary;
    }

    public void setHearScary(boolean hearScary) {
        isHearScary = hearScary;
    }

    public boolean isApproach() {
        return isApproach;
    }

    public void setApproach(boolean approach) {
        isApproach = approach;
    }

    public boolean isUnfamilliar() {
        return isUnfamilliar;
    }

    public void setUnfamilliar(boolean unfamilliar) {
        isUnfamilliar = unfamilliar;
    }

    public boolean isPass(){
        if(isLookFeel){
            return true;
        }
        else{
            if(isHearScary){
                return true;
            }
            else {
                if (isApproach) {
                    return true;
                }
                else {
                    if(isUnfamilliar){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    }
}

//        isLookFeel
//        isHearScary
//        isApproach
//        isUnfamilliar