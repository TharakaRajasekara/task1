package com.example.Task1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class SupportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String issueType;
    private Date createdAt;

    public SupportEntity() {
    }

    public SupportEntity(String description, String issueType, Date createdAt) {
        this.description = description;
        this.issueType = issueType;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "SupportEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", issueType='" + issueType + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}


