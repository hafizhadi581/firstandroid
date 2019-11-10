package com.example.asdscreening.rules;

public class Rule9 {

    private boolean isBringPictureToys;
    private boolean isBringDonePicture;
    private boolean isBringFlowers;
    private boolean isBringBugsOnGrass;
    private boolean isBringBlocks;
    private boolean isBringOnlyToShow;

    public Rule9(boolean isBringPictureToys, boolean isBringDonePicture, boolean isBringFlowers, boolean isBringBugsOnGrass, boolean isBringBlocks, boolean isBringOnlyToShow) {
        this.isBringPictureToys = isBringPictureToys;
        this.isBringDonePicture = isBringDonePicture;
        this.isBringFlowers = isBringFlowers;
        this.isBringBugsOnGrass = isBringBugsOnGrass;
        this.isBringBlocks = isBringBlocks;
        this.isBringOnlyToShow = isBringOnlyToShow;
    }

    public boolean isBringPictureToys() {
        return isBringPictureToys;
    }

    public void setBringPictureToys(boolean bringPictureToys) {
        isBringPictureToys = bringPictureToys;
    }

    public boolean isBringDonePicture() {
        return isBringDonePicture;
    }

    public void setBringDonePicture(boolean bringDonePicture) {
        isBringDonePicture = bringDonePicture;
    }

    public boolean isBringFlowers() {
        return isBringFlowers;
    }

    public void setBringFlowers(boolean bringFlowers) {
        isBringFlowers = bringFlowers;
    }

    public boolean isBringBugsOnGrass() {
        return isBringBugsOnGrass;
    }

    public void setBringBugsOnGrass(boolean bringBugsOnGrass) {
        isBringBugsOnGrass = bringBugsOnGrass;
    }

    public boolean isBringBlocks() {
        return isBringBlocks;
    }

    public void setBringBlocks(boolean bringBlocks) {
        isBringBlocks = bringBlocks;
    }

    public boolean isBringOnlyToShow() {
        return isBringOnlyToShow;
    }

    public void setBringOnlyToShow(boolean bringOnlyToShow) {
        isBringOnlyToShow = bringOnlyToShow;
    }

    public boolean isPass(){
        if(isBringPictureToys || isBringDonePicture || isBringFlowers || isBringBugsOnGrass || isBringBlocks){
            if (isBringOnlyToShow) {
                return true;
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

//isBringPictureToys || isBringDonePicture || isBringFlowers || isBringBugsOnGrass || isBringBlocks || isBringOnlyToShow