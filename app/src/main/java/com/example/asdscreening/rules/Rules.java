package com.example.asdscreening.rules;

public class Rules {
    private static Rules instance;

    private boolean score1;
    private Rule1 rule1;


    private Rules() {

    }

    public static Rules getInstance() {
        if(instance == null){
            instance = new Rules();
            return instance;
        }else {
            return instance;
        }
    }

    public void setRule1(Rule1 rule1){
        this.rule1 = rule1;
    };

    public Rule1 getRule1() {
        return rule1;
    }

    public static Rules newInstance() {
       return new Rules();
    }

    //    public void calculateFirstRules(boolean checked, boolean checked1, boolean checked2, boolean checked3, boolean checked4, boolean checked5) {
//    }
}
