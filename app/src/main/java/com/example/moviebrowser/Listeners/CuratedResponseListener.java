    package com.example.moviebrowser.Listeners;

    import com.example.moviebrowser.Models.CuratedApiResponse;

    public interface CuratedResponseListener { // galerija aplikacije
        void onFetch(CuratedApiResponse response, String message);
        void onError(String message);
    }
