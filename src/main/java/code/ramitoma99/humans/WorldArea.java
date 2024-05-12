package code.ramitoma99.humans;

public class WorldArea {

    public char tileContent;
    public int tileUsers = 0;

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

        this.tileUsers++;

    }

    public int getTileUsers() {

        return tileUsers;

    }

}
