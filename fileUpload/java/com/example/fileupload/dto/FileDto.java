package com.example.fileupload.dto;

public class FileDto {
    private String oriName;
    private String savedFileName;
    private String savedPathFileName;
    private Long savedFileSize;

    public FileDto(String oriName, String savedFileName, String savedPathFileName, Long savedFileSize) {
        this.oriName = oriName;
        this.savedFileName = savedFileName;
        this.savedPathFileName = savedPathFileName;
        this.savedFileSize = savedFileSize;
    }

    public String getOriName() {
        return oriName;
    }

    public void setOriName(String oriName) {
        this.oriName = oriName;
    }

    public String getSavedFileName() {
        return savedFileName;
    }

    public void setSavedFileName(String savedFileName) {
        this.savedFileName = savedFileName;
    }

    public String getSavedPathFileName() {
        return savedPathFileName;
    }

    public void setSavedPathFileName(String savedPathFileName) {
        this.savedPathFileName = savedPathFileName;
    }

    public Long getSavedFileSize() {
        return savedFileSize;
    }

    public void setSavedFileSize(Long savedFileSize) {
        this.savedFileSize = savedFileSize;
    }
}
