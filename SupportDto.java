package com.example.Task1.dto;

public class SupportDto {
    private String description;
    private String issueType;

    public SupportDto() {
    }

    public SupportDto(String description, String issueType) {
        this.description = description;
        this.issueType = issueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    @Override
    public String toString() {
        return "SupportDto{" +
                "description='" + description + '\'' +
                ", issueType='" + issueType + '\'' +
                '}';
    }
}
