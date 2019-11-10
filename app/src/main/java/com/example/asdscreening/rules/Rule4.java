package com.example.asdscreening.rules;

public class Rule4 {

    private boolean isClimbStairs;
    private boolean isClimbChairs;
    private boolean isClimbFurniture;
    private boolean isClimbPlayground;

    public Rule4(boolean isClimbStairs, boolean isClimbChairs, boolean isClimbFurniture, boolean isClimbPlayground) {
        this.isClimbStairs = isClimbStairs;
        this.isClimbChairs = isClimbChairs;
        this.isClimbFurniture = isClimbFurniture;
        this.isClimbPlayground = isClimbPlayground;
    }

    public boolean isClimbStairs() {
        return isClimbStairs;
    }

    public void setClimbStairs(boolean climbStairs) {
        isClimbStairs = climbStairs;
    }

    public boolean isClimbChairs() {
        return isClimbChairs;
    }

    public void setClimbChairs(boolean climbChairs) {
        isClimbChairs = climbChairs;
    }

    public boolean isClimbFurniture() {
        return isClimbFurniture;
    }

    public void setClimbFurniture(boolean climbFurniture) {
        isClimbFurniture = climbFurniture;
    }

    public boolean isClimbPlayground() {
        return isClimbPlayground;
    }

    public void setClimbPlayground(boolean climbPlayground) {
        isClimbPlayground = climbPlayground;
    }

    public boolean isPass() {
        if (isClimbStairs || isClimbChairs || isClimbFurniture || isClimbPlayground){
            return true;
        }
        else
            return false;
    }
}
