package com.example.asdscreening.rules;

public class Rule7 {

    private boolean isSeeAirplane;
    private boolean isSeeTruck;
    private boolean isSeeBug;
    private boolean isSeeAnimal;
    private boolean cbAttentionPoint;
    private boolean isShowInterest;

    public Rule7(boolean isSeeAirplane, boolean isSeeTruck, boolean isSeeBug, boolean isSeeAnimal, boolean cbAttentionPoint, boolean isShowInterest) {
        this.isSeeAirplane = isSeeAirplane;
        this.isSeeTruck = isSeeTruck;
        this.isSeeBug = isSeeBug;
        this.isSeeAnimal = isSeeAnimal;
        this.cbAttentionPoint = cbAttentionPoint;
        this.isShowInterest = isShowInterest;
    }

    public boolean isSeeAirplane() { return isSeeAirplane; }

    public void setSeeAirplane(boolean seeAirplane) { isSeeAirplane = seeAirplane; }

    public boolean isSeeTruck() { return isSeeTruck; }

    public void setSeeTruck(boolean seeTruck) { isSeeTruck = seeTruck; }

    public boolean isSeeBug() { return isSeeBug; }

    public void setSeeBug(boolean seeBug) { isSeeBug = seeBug; }

    public boolean isSeeAnimal() { return isSeeAnimal; }

    public void setSeeAnimal(boolean seeAnimal) { isSeeAnimal = seeAnimal; }

    public boolean isCbAttentionPoint() { return cbAttentionPoint; }

    public void setCbAttentionPoint(boolean cbAttentionPoint) { this.cbAttentionPoint = cbAttentionPoint; }

    public boolean isShowInterest() { return isShowInterest; }

    public void setShowInterest(boolean showInterest) { isShowInterest = showInterest; }

    public boolean isPass(){
        if (isSeeAirplane || isSeeTruck || isSeeBug || isSeeAnimal){
            if (cbAttentionPoint){
                if(isShowInterest){
                    return true;
                }
                else {return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

}
//isSeeAirplane || isSeeTruck || isSeeBug || isSeeAnimal || cbAttentionPoint || isShowInterest;