package com.example.asdscreening.rules;

public class Rule21 {

    private boolean isNotSatisfyDoctor;
    private boolean isNotSatisfySurrounding;
    private boolean isNotSatisfySelf;

    public Rule21(boolean isNotSatisfyDoctor, boolean isNotSatisfySurrounding, boolean isNotSatisfySelf) {
        this.isNotSatisfyDoctor = isNotSatisfyDoctor;
        this.isNotSatisfySurrounding = isNotSatisfySurrounding;
        this.isNotSatisfySelf = isNotSatisfySelf;
    }

    public boolean isNotSatisfyDoctor() {
        return isNotSatisfyDoctor;
    }

    public void setNotSatisfyDoctor(boolean notSatisfyDoctor) {
        isNotSatisfyDoctor = notSatisfyDoctor;
    }

    public boolean isNotSatisfySurrounding() {
        return isNotSatisfySurrounding;
    }

    public void setNotSatisfySurrounding(boolean notSatisfySurrounding) {
        isNotSatisfySurrounding = notSatisfySurrounding;
    }

    public boolean isNotSatisfySelf() {
        return isNotSatisfySelf;
    }

    public void setNotSatisfySelf(boolean notSatisfySelf) {
        isNotSatisfySelf = notSatisfySelf;
    }

    private boolean isPass(){
        if(isNotSatisfyDoctor){
            return true;
        }
        else if(isNotSatisfySurrounding){
            return true;
        }
        else if(isNotSatisfySelf){
            return true;
        }
        else {
            return false;
        }
    }
}
