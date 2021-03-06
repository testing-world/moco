package com.github.dreamhead.moco.recorder;

import com.github.dreamhead.moco.HttpRequest;
import com.github.dreamhead.moco.model.MessageContent;
import com.github.dreamhead.moco.resource.ContentResource;

public class RecorderModifier implements RecorderConfig {
    private ContentResource resource;

    public RecorderModifier(final ContentResource resource) {
        this.resource = resource;
    }

    @Override
    public final boolean isFor(final String name) {
        return MODIFIER.equalsIgnoreCase(name);
    }

    public final MessageContent getMessageContent(final HttpRequest request) {
        return this.resource.readFor(request);
    }
}
