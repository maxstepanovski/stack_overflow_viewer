package com.example.mambayamba.stackoverflowviewer.model.question.featured;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("last_editor")
    @Expose
    private LastEditor lastEditor;
    @SerializedName("is_answered")
    @Expose
    private Boolean isAnswered;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    @SerializedName("favorite_count")
    @Expose
    private Integer favoriteCount;
    @SerializedName("down_vote_count")
    @Expose
    private Integer downVoteCount;
    @SerializedName("up_vote_count")
    @Expose
    private Integer upVoteCount;
    @SerializedName("bounty_amount")
    @Expose
    private Integer bountyAmount;
    @SerializedName("bounty_closes_date")
    @Expose
    private Integer bountyClosesDate;
    @SerializedName("answer_count")
    @Expose
    private Integer answerCount;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("last_edit_date")
    @Expose
    private Integer lastEditDate;
    @SerializedName("question_id")
    @Expose
    private Integer questionId;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("accepted_answer_id")
    @Expose
    private Integer acceptedAnswerId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param tags
     * @param bountyClosesDate
     * @param downVoteCount
     * @param questionId
     * @param bountyAmount
     * @param link
     * @param lastActivityDate
     * @param score
     * @param lastEditor
     * @param lastEditDate
     * @param creationDate
     * @param upVoteCount
     * @param title
     * @param answerCount
     * @param favoriteCount
     * @param isAnswered
     * @param owner
     * @param acceptedAnswerId
     * @param viewCount
     */
    public Item(List<String> tags, Owner owner, LastEditor lastEditor, Boolean isAnswered, Integer viewCount, Integer favoriteCount, Integer downVoteCount, Integer upVoteCount, Integer bountyAmount, Integer bountyClosesDate, Integer answerCount, Integer score, Integer lastActivityDate, Integer creationDate, Integer lastEditDate, Integer questionId, String link, String title, Integer acceptedAnswerId) {
        this.tags = tags;
        this.owner = owner;
        this.lastEditor = lastEditor;
        this.isAnswered = isAnswered;
        this.viewCount = viewCount;
        this.favoriteCount = favoriteCount;
        this.downVoteCount = downVoteCount;
        this.upVoteCount = upVoteCount;
        this.bountyAmount = bountyAmount;
        this.bountyClosesDate = bountyClosesDate;
        this.answerCount = answerCount;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.questionId = questionId;
        this.link = link;
        this.title = title;
        this.acceptedAnswerId = acceptedAnswerId;
    }

    /**
     *
     * @return
     * The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     *
     * @param tags
     * The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
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
     * The lastEditor
     */
    public LastEditor getLastEditor() {
        return lastEditor;
    }

    /**
     *
     * @param lastEditor
     * The last_editor
     */
    public void setLastEditor(LastEditor lastEditor) {
        this.lastEditor = lastEditor;
    }

    /**
     *
     * @return
     * The isAnswered
     */
    public Boolean getIsAnswered() {
        return isAnswered;
    }

    /**
     *
     * @param isAnswered
     * The is_answered
     */
    public void setIsAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    /**
     *
     * @return
     * The viewCount
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     *
     * @param viewCount
     * The view_count
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     *
     * @return
     * The favoriteCount
     */
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    /**
     *
     * @param favoriteCount
     * The favorite_count
     */
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    /**
     *
     * @return
     * The downVoteCount
     */
    public Integer getDownVoteCount() {
        return downVoteCount;
    }

    /**
     *
     * @param downVoteCount
     * The down_vote_count
     */
    public void setDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    /**
     *
     * @return
     * The upVoteCount
     */
    public Integer getUpVoteCount() {
        return upVoteCount;
    }

    /**
     *
     * @param upVoteCount
     * The up_vote_count
     */
    public void setUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    /**
     *
     * @return
     * The bountyAmount
     */
    public Integer getBountyAmount() {
        return bountyAmount;
    }

    /**
     *
     * @param bountyAmount
     * The bounty_amount
     */
    public void setBountyAmount(Integer bountyAmount) {
        this.bountyAmount = bountyAmount;
    }

    /**
     *
     * @return
     * The bountyClosesDate
     */
    public Integer getBountyClosesDate() {
        return bountyClosesDate;
    }

    /**
     *
     * @param bountyClosesDate
     * The bounty_closes_date
     */
    public void setBountyClosesDate(Integer bountyClosesDate) {
        this.bountyClosesDate = bountyClosesDate;
    }

    /**
     *
     * @return
     * The answerCount
     */
    public Integer getAnswerCount() {
        return answerCount;
    }

    /**
     *
     * @param answerCount
     * The answer_count
     */
    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
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

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The acceptedAnswerId
     */
    public Integer getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    /**
     *
     * @param acceptedAnswerId
     * The accepted_answer_id
     */
    public void setAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

}
