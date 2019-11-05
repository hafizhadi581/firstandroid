package com.example.asdscreening.rules;

public class Rules {
    private static Rules instance;

    private int score;
    private Rule1 rule1;
    private Rule2 rule2;
    private Rule3 rule3;
    private Rule4 rule4;
    private Rule5 rule5;
    private Rule6 rule6;
    private Rule7 rule7;
    private Rule8 rule8;


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

    public Rule1 getRule1() {
        return rule1;
    }

    public void setRule2(Rule2 rule2) {
        this.rule2 = rule2;
    }

    public Rule2 getRule2() {
        return rule2;
    }

    public void setRule3(Rule3 rule3) {
        this.rule3 = rule3;
    }

    public Rule3 getRule3() {
        return rule3;
    }

    public void setRule4(Rule4 rule4) { this.rule4 = rule4; }

    public Rule4 getRule4() { return rule4; }

    public void setRule5(Rule5 rule5) { this.rule5 = rule5; }

    public Rule5 getRule5() { return rule5; }

    public void setRule6(Rule6 rule6) { this.rule6 = rule6; }

    public Rule6 getRule6() { return rule6; }

    public Rule7 getRule7() { return rule7; }

    public void setRule7(Rule7 rule7) { this.rule7 = rule7; }

    public Rule8 getRule8() { return rule8; }

    public void setRule8(Rule8 rule8) { this.rule8 = rule8; }

    public int getScore() {

        score = 0;
        if (rule1 != null && !rule1.isPass()) {
            score++;
        }
        if (rule2 != null && rule2.isPass()) {
            score++;
        }
        if (rule3 != null && !rule3.isPass()) {
            score++;
        }
        if (rule4 != null && !rule4.isPass()) {
            score++;
        }
        if (rule5 != null && !rule5.isPass()) {
            score++;
        }
        if (rule6 != null && !rule6.isPass()) {
            score++;
        }
        if (rule7 != null && !rule7.isPass()) {
            score++;
        }
        if (rule8 != null && !rule8.isPass()) {
            score++;
        }
        return score;
    }


    //    public void calculateFirstRules(boolean checked, boolean checked1, boolean checked2, boolean checked3, boolean checked4, boolean checked5) {
//    }
}
