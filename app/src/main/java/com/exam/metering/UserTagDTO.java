package com.exam.metering;

import java.io.Serializable;

public class UserTagDTO implements Serializable {
    String userTagId;
    String userTagName;

    public UserTagDTO(String userTagName) {
        this.userTagName = userTagName;
    }

    public UserTagDTO(String userTagId, String userTagName) {
        this.userTagId = userTagId;
        this.userTagName = userTagName;
    }

    public String getUserTagId() { return userTagId; }
    public void setUserTagId(String userTagId) { this.userTagId = userTagId; }

    public String getUserTagName() { return userTagName; }
    public void setUserTagName(String userTagName) { this.userTagName = userTagName; }
}
