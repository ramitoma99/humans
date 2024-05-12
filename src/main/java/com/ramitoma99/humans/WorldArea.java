package com.ramitoma99.humans;

public class WorldArea {

    public char tileContent;
    public int tileUsersCount = 0;

    public WorldArea(char new_tileContent) {

        this.tileContent = new_tileContent;

    }

    public char getTileContent(){
        return tileContent;
    }

    public void setTileContent(char new_tileContent){
        this.tileContent = new_tileContent;
    }

    public void increaseTileUsers() {

        this.tileUsersCount++;

    }

    public int getTileUsersCount() {

        return tileUsersCount;

    }

}
