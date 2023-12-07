package com.example.multiple.dto;

import java.time.LocalDate;

public class CommentDto {
    private int cId;
    private String cSubject;
    private String cWriter;
    private String cComment;
    private int cVisit;
    private LocalDate cRegdate;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcSubject() {
        return cSubject;
    }

    public void setcSubject(String cSubject) {
        this.cSubject = cSubject;
    }

    public String getcWriter() {
        return cWriter;
    }

    public void setcWriter(String cWriter) {
        this.cWriter = cWriter;
    }

    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }

    public int getcVisit() {
        return cVisit;
    }

    public void setcVisit(int cVisit) {
        this.cVisit = cVisit;
    }

    public LocalDate getcRegdate() {
        return cRegdate;
    }

    public void setcRegdate(LocalDate cRegdate) {
        this.cRegdate = cRegdate;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
                "cId=" + cId +
                ", cSubject='" + cSubject + '\'' +
                ", cWriter='" + cWriter + '\'' +
                ", cComment='" + cComment + '\'' +
                ", cVisit=" + cVisit +
                ", cRegdate=" + cRegdate +
                '}';
    }
}
