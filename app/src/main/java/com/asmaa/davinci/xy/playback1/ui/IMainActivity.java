package com.asmaa.davinci.xy.playback1.ui;

import android.support.v4.media.MediaMetadataCompat;

import com.asmaa.davinci.xy.playback1.MyApplication;
import com.asmaa.davinci.xy.playback1.models.Artist;
import com.asmaa.davinci.xy.playback1.util.MyPreferenceManager;

public interface IMainActivity {

    void showProgressBar();

    void hideProgressBar();

    void onCategorySelected(String category);

    void onArtistSelected(String category, Artist artist);

    void setActionBarTitle(String title);

    void playPause();

    MyApplication getMyApplicationInstance();

    void onMediaSelected(String playListId, MediaMetadataCompat mediaItem, int queuePosition);

    MyPreferenceManager getMyPreferenceManager();
}
