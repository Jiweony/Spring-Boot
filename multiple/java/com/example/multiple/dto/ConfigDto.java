package com.example.multiple.dto;

import java.time.LocalDate;

public class ConfigDto {

    private int configId;
    private String configCode;
    private String configTitle;
    private String configComment;
    private String configColor;
    private LocalDate configDate;

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public String getConfigCode() {
        return configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigTitle() {
        return configTitle;
    }

    public void setConfigTitle(String configTitle) {
        this.configTitle = configTitle;
    }

    public String getConfigComment() {
        return configComment;
    }

    public void setConfigComment(String configComment) {
        this.configComment = configComment;
    }

    public String getConfigColor() {
        return configColor;
    }

    public void setConfigColor(String configColor) {
        this.configColor = configColor;
    }

    public LocalDate getConfigDate() {
        return configDate;
    }

    public void setConfigDate(LocalDate configDate) {
        this.configDate = configDate;
    }

    @Override
    public String toString() {
        return "ConfigDto{" +
                "configId=" + configId +
                ", configCode='" + configCode + '\'' +
                ", configTitle='" + configTitle + '\'' +
                ", configComment='" + configComment + '\'' +
                ", configColor='" + configColor + '\'' +
                ", configDate=" + configDate +
                '}';
    }
}
