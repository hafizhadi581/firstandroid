package com.example.asdscreening.rules;

public class Rule12 {

    private boolean isReactSoundWashing;
    private boolean isReactSoundBabies;
    private boolean isReactSoundVaccuum;
    private boolean isReactSoundHairDryer;
    private boolean isReactSoundTraffic;
    private boolean isReactSoundBabies2;
    private boolean isReactSoundMusic;
    private boolean isReactSoundDoorBell;
    private boolean isReactSoundSuperMarket;

    private boolean isReactCoverEars;
    private boolean isReactLikingNoise;
    private boolean isReactSoundScream;
    private boolean isReactSoundCry;
    private boolean isReactSoundCover;

    private int failCount;
    private int passCount;
    private int count;

    public Rule12(boolean isReactSoundWashing, boolean isReactSoundBabies, boolean isReactSoundVaccuum, boolean isReactSoundHairDryer, boolean isReactSoundTraffic, boolean isReactSoundBabies2, boolean isReactSoundMusic, boolean isReactSoundDoorBell, boolean isReactSoundSuperMarket, boolean isReactCoverEars, boolean isReactLikingNoise, boolean isReactSoundScream, boolean isReactSoundCry, boolean isReactSoundCover) {
        this.isReactSoundWashing = isReactSoundWashing;
        this.isReactSoundBabies = isReactSoundBabies;
        this.isReactSoundVaccuum = isReactSoundVaccuum;
        this.isReactSoundHairDryer = isReactSoundHairDryer;
        this.isReactSoundTraffic = isReactSoundTraffic;
        this.isReactSoundBabies2 = isReactSoundBabies2;
        this.isReactSoundMusic = isReactSoundMusic;
        this.isReactSoundDoorBell = isReactSoundDoorBell;
        this.isReactSoundSuperMarket = isReactSoundSuperMarket;
        this.isReactCoverEars = isReactCoverEars;
        this.isReactLikingNoise = isReactLikingNoise;
        this.isReactSoundScream = isReactSoundScream;
        this.isReactSoundCry = isReactSoundCry;
        this.isReactSoundCover = isReactSoundCover;
    }

    public boolean isReactSoundWashing() {
        return isReactSoundWashing;
    }

    public void setReactSoundWashing(boolean reactSoundWashing) {
        isReactSoundWashing = reactSoundWashing;
    }

    public boolean isReactSoundBabies() {
        return isReactSoundBabies;
    }

    public void setReactSoundBabies(boolean reactSoundBabies) {
        isReactSoundBabies = reactSoundBabies;
    }

    public boolean isReactSoundVaccuum() {
        return isReactSoundVaccuum;
    }

    public void setReactSoundVaccuum(boolean reactSoundVaccuum) {
        isReactSoundVaccuum = reactSoundVaccuum;
    }

    public boolean isReactSoundHairDryer() {
        return isReactSoundHairDryer;
    }

    public void setReactSoundHairDryer(boolean reactSoundHairDryer) {
        isReactSoundHairDryer = reactSoundHairDryer;
    }

    public boolean isReactSoundTraffic() {
        return isReactSoundTraffic;
    }

    public void setReactSoundTraffic(boolean reactSoundTraffic) {
        isReactSoundTraffic = reactSoundTraffic;
    }

    public boolean isReactSoundBabies2() {
        return isReactSoundBabies2;
    }

    public void setReactSoundBabies2(boolean reactSoundBabies2) {
        isReactSoundBabies2 = reactSoundBabies2;
    }

    public boolean isReactSoundMusic() {
        return isReactSoundMusic;
    }

    public void setReactSoundMusic(boolean reactSoundMusic) {
        isReactSoundMusic = reactSoundMusic;
    }

    public boolean isReactSoundDoorBell() {
        return isReactSoundDoorBell;
    }

    public void setReactSoundDoorBell(boolean reactSoundDoorBell) {
        isReactSoundDoorBell = reactSoundDoorBell;
    }

    public boolean isReactSoundSuperMarket() {
        return isReactSoundSuperMarket;
    }

    public void setReactSoundSuperMarket(boolean reactSoundSuperMarket) {
        isReactSoundSuperMarket = reactSoundSuperMarket;
    }

    public boolean isReactCoverEars() {
        return isReactCoverEars;
    }

    public void setReactCoverEars(boolean reactCoverEars) {
        isReactCoverEars = reactCoverEars;
    }

    public boolean isReactLikingNoise() {
        return isReactLikingNoise;
    }

    public void setReactLikingNoise(boolean reactLikingNoise) {
        isReactLikingNoise = reactLikingNoise;
    }

    public boolean isReactSoundScream() {
        return isReactSoundScream;
    }

    public void setReactSoundScream(boolean reactSoundScream) {
        isReactSoundScream = reactSoundScream;
    }

    public boolean isReactSoundCry() {
        return isReactSoundCry;
    }

    public void setReactSoundCry(boolean reactSoundCry) {
        isReactSoundCry = reactSoundCry;
    }

    public boolean isReactSoundCover() {
        return isReactSoundCover;
    }

    public void setReactSoundCover(boolean reactSoundCover) {
        isReactSoundCover = reactSoundCover;
    }

    public boolean isPass() {
        failCount = 0;
        passCount = 0;

        // bawah
        if (isReactCoverEars) {
            passCount++;
        }
        if (isReactLikingNoise) {
            passCount++;
        }
        if (isReactSoundScream) {
            failCount++;
        }
        if (isReactSoundCry) {
            failCount++;
        }
        if (isReactSoundCover) {
            failCount++;
        }
        return passCount >= failCount;


    }
}

//isReactCoverEars;
//        isReactLikingNoise;
//        isReactSoundScream;
//        isReactSoundCry;
//        isReactSoundCover;

//isReactSoundWashing;
//        isReactSoundBabies;
//        isReactSoundVaccuum;
//        isReactSoundHairDryer;
//        isReactSoundTraffic;
//        isReactSoundBabies2;
//        isReactSoundMusic;
//        isReactSoundDoorBell;
//        isReactSoundSuperMarket;