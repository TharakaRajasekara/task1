package com.example.Task1.dto;
import java.util.Date;
public class FAQDto {
    private Long id;
    private String question;
    private String answer;
    private Date updateDate;

    public FAQDto() {
    }

    public FAQDto(Long id, String question, String answer, Date updateDate) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "FAQDto{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}
