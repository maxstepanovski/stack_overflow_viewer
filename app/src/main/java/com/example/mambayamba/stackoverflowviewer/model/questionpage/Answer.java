package com.example.mambayamba.stackoverflowviewer.model.questionpage;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Answer {

    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("is_accepted")
    @Expose
    private Boolean isAccepted;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @SerializedName("last_edit_date")
    @Expose
    private Integer lastEditDate;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("answer_id")
    @Expose
    private Integer answerId;
    @SerializedName("question_id")
    @Expose
    private Integer questionId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Answer() {
    }

    /**
     *
     * @param creationDate
     * @param questionId
     * @param lastActivityDate
     * @param score
     * @param owner
     * @param answerId
     * @param lastEditDate
     * @param isAccepted
     */
    public Answer(Owner owner, Boolean isAccepted, Integer score, Integer lastActivityDate, Integer lastEditDate, Integer creationDate, Integer answerId, Integer questionId) {
        this.owner = owner;
        this.isAccepted = isAccepted;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.lastEditDate = lastEditDate;
        this.creationDate = creationDate;
        this.answerId = answerId;
        this.questionId = questionId;
    }

    /**
     *
     * @return
     * The owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     * The owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     * The isAccepted
     */
    public Boolean getIsAccepted() {
        return isAccepted;
    }

    /**
     *
     * @param isAccepted
     * The is_accepted
     */
    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    /**
     *
     * @return
     * The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     *
     * @param score
     * The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     *
     * @return
     * The lastActivityDate
     */
    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     *
     * @param lastActivityDate
     * The last_activity_date
     */
    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    /**
     *
     * @return
     * The lastEditDate
     */
    public Integer getLastEditDate() {
        return lastEditDate;
    }

    /**
     *
     * @param lastEditDate
     * The last_edit_date
     */
    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    /**
     *
     * @return
     * The creationDate
     */
    public Integer getCreationDate() {
        return creationDate;
    }

    /**
     *
     * @param creationDate
     * The creation_date
     */
    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    /**
     *
     * @return
     * The answerId
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     *
     * @param answerId
     * The answer_id
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     *
     * @return
     * The questionId
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     *
     * @param questionId
     * The question_id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

}
