package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counter = 0;
        for (int i = 0, playlistLength = playList.length; i < playlistLength; i++){
            if (playList[i].equalsIgnoreCase(selection))
            {
                counter = i-startIndex;
            }
            if (counter > 2)
            {
                counter = playlistLength-counter;
            }
        }

        return counter;
    }
}
