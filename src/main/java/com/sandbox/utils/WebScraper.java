package com.sandbox.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WebScraper {

    /**
     * Retrieves the body of a URL
     * @param url The URL
     * @return The source of the specified URL
     * @throws Exception
     */
    public String getUrl(String url) throws Exception {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
