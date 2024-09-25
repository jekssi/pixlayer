package com.example.moviebrowser.Listeners;

import com.example.moviebrowser.Models.SearchApiResponse;

public interface SearchResponseListener {
    // ne radi
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
