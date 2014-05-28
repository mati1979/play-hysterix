package com.github.mati1979.play.hysterix;

import play.libs.F;

import java.util.UUID;

/**
 * Created by mati on 25/05/2014.
 */
public class HysterixHttpRequest {

    private String requestId;

    private HysterixHttpRequestsCache hysterixHttpRequestsCache;

    public HysterixHttpRequest(final HysterixHttpRequestsCache hysterixHttpRequestsCache, final HysterixCommand command) {
        this.requestId = UUID.randomUUID().toString();
        this.hysterixHttpRequestsCache = hysterixHttpRequestsCache.addRequest(requestId, command);
    }

    public String getRequestId() {
        return requestId;
    }

    public F.Promise executeRequest() {
        return hysterixHttpRequestsCache.execute(requestId);
    }

}
