package com.exam.metering;

import java.io.Serializable;

public class ClassTagDTO implements Serializable {
    String classTagId;
    String classTagName;

    public ClassTagDTO(String classTagName) {
        this.classTagName = classTagName;
    }

    public ClassTagDTO(String classTagId, String classTagName) {
        this.classTagId = classTagId;
        this.classTagName = classTagName;
    }

    public String getClassTagId() { return classTagId; }
    public void setClassTagId(String classTagId) { this.classTagId = classTagId; }

    public String getClassTagName() { return classTagName; }
    public void setClassTagName(String classTagName) { this.classTagName = classTagName; }
}
