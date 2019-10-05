package com.example.asdscreening.rules;

public class Rules {
    private static Rules instance;

    private int score;
    private Rule1 rule1;
    private Rule2 rule2;
    private Rule3 rule3;


    private Rules() {

    }
    public static Rules newInstance() {
        return new Rules();
    }

    public static Rules getInstance() {
        if (instance == null) {
            instance = new Rules();
            return instance;
        } else {
            return instance;
        }
    }

    public void setRule1(Rule1 rule1) {
        this.rule1 = rule1;
    }

    ;

    public Rule1 getRule1() {
        return rule1;
    }

    public void setRule2(Rule2 rule2) {
        this.rule2 = rule2;
    }

    public Rule2 getRule2() {
        return rule2;
    }

    public Rule3 getRule3() {
        return rule3;
    }

    public void setRule3(Rule3 rule3) {
        this.rule3 = rule3;
    }

    public int getScore(){

        score = 0;
        if(rule1!=null && !rule1.isPass()){
            score++;
        }
        if(rule2!= null && rule2.isPass()){
            score++;
        }
        if(rule3!= null &&!rule3.isPass()){
            score++;
        }

        return score;
    }



    //    public void calculateFirstRules(boolean checked, boolean checked1, boolean checked2, boolean checked3, boolean checked4, boolean checked5) {
//    }
}
