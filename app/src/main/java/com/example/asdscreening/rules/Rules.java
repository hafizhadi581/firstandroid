package com.example.asdscreening.rules;

public class Rules {
    private static Rules instance;

    private int score;
    private String risk;
    private Rule1 rule1;
    private Rule2 rule2;
    private Rule3 rule3;
    private Rule4 rule4;
    private Rule5 rule5;
    private Rule6 rule6;
    private Rule7 rule7;
    private Rule8 rule8;
    private Rule9 rule9;
    private Rule10 rule10;
    private Rule11 rule11;
    private Rule12 rule12;
    private Rule13 rule13;
    private Rule14 rule14;
    private Rule15 rule15;
    private Rule16 rule16;
    private Rule17 rule17;
    private Rule18 rule18;
    private Rule19 rule19;
    private Rule20 rule20;

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

    public void setRule7(Rule7 rule7) { this.rule7 = rule7; }

    public Rule7 getRule7() { return rule7; }

    public void setRule8(Rule8 rule8) { this.rule8 = rule8; }

    public Rule8 getRule8() { return rule8; }

    public void setRule9(Rule9 rule9) { this.rule9 = rule9; }

    public Rule9 getRule9() { return rule9; }

    public void setRule10(Rule10 rule10) { this.rule10 = rule10; }

    public Rule10 getRule10() { return rule10; }

    public void setRule11(Rule11 rule11) { this.rule11 = rule11; }

    public Rule11 getRule11() { return rule11; }

    public void setRule12(Rule12 rule12) { this.rule12 = rule12; }

    public Rule12 getRule12() { return rule12; }

    public void setRule13(Rule13 rule13) { this.rule13 = rule13; }

    public Rule13 getRule13() { return rule13; }

    public void setRule14(Rule14 rule14) { this.rule14 = rule14; }

    public Rule14 getRule14() { return rule14; }

    public void setRule15(Rule15 rule15) { this.rule15 = rule15; }

    public Rule15 getRule15() { return rule15; }

    public void setRule16(Rule16 rule16) { this.rule16 = rule16; }

    public Rule16 getRule16() { return rule16; }

    public void setRule17(Rule17 rule17) { this.rule17 = rule17; }

    public Rule17 getRule17() { return rule17; }

    public void setRule18(Rule18 rule18) { this.rule18 = rule18; }

    public Rule18 getRule18() { return rule18; }

    public void setRule19(Rule19 rule19) { this.rule19 = rule19; }

    public Rule19 getRule19() { return rule19; }

    public void setRule20(Rule20 rule20) { this.rule20 = rule20; }

    public Rule20 getRule20() { return rule20; }

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
        if (rule9 != null && !rule9.isPass()) {
            score++;
        }
        if (rule10 != null && !rule10.isPass()) {
            score++;
        }
        if (rule11 != null && !rule11.isPass()) {
            score++;
        }
        if (rule12 != null && !rule12.isPass()) {
            score++;
        }
        if (rule13 != null && !rule13.isPass()) {
            score++;
        }
        if (rule14 != null && !rule14.isPass()) {
            score++;
        }
        if (rule15 != null && !rule15.isPass()) {
            score++;
        }
        if (rule16 != null && !rule16.isPass()) {
            score++;
        }
        if (rule17 != null && !rule17.isPass()) {
            score++;
        }
        if (rule18 != null && !rule18.isPass()) {
            score++;
        }
        if (rule19 != null && !rule19.isPass()) {
            score++;
        }
        if (rule20 != null && !rule20.isPass()) {
            score++;
        }

        return score;
    }
    public String getRisk(){

        if(score >= 0 && score <= 2){
            risk = "LOW RISK";
        }
        else if (score >= 3 && score <= 7){
            risk = "MEDIUM RISK";
        }
        else {
            risk = "HIGH RISK";
        }
        return risk;
    }


    //    public void calculateFirstRules(boolean checked, boolean checked1, boolean checked2, boolean checked3, boolean checked4, boolean checked5) {
//    }
}
