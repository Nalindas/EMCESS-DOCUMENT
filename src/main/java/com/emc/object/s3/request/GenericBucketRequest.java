package com.emc.object.s3.request;

import com.emc.object.Method;

public class GenericBucketRequest extends AbstractBucketRequest {
    private String query;

    public GenericBucketRequest(Method method, String bucketName) {
        super(method, bucketName, "");
    }

    @Override
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public GenericBucketRequest withQuery(String query) {
        setQuery(query);
        return this;
    }
}
