package com.example.mambayamba.stackoverflowviewer.model.questionlist.excerpt;

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
    @SerializedName("equivalent_tag_search")
    @Expose
    private List<String> equivalentTagSearch = new ArrayList<String>();
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("last_activity_user")
    @Expose
    private LastActivityUser lastActivityUser;
    @SerializedName("question_score")
    @Expose
    private Integer questionScore;
    @SerializedName("is_accepted")
    @Expose
    private Boolean isAccepted;
    @SerializedName("has_accepted_answer")
    @Expose
    private Boolean hasAcceptedAnswer;
    @SerializedName("answer_count")
    @Expose
    private Integer answerCount;
    @SerializedName("is_answered")
    @Expose
    private Boolean isAnswered;
    @SerializedName("question_id")
    @Expose
    private Integer questionId;
    @SerializedName("item_type")
    @Expose
    private String itemType;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("last_activity_date")
    @Expose
    private Integer lastActivityDate;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("excerpt")
    @Expose
    private String excerpt;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("answer_id")
    @Expose
    private Integer answerId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Item() {
    }

    /**
     *
     * @param tags
     * @param body
     * @param questionId
     * @param excerpt
     * @param lastActivityDate
     * @param lastActivityUser
     * @param itemType
     * @param score
     * @param equivalentTagSearch
     * @param questionScore
     * @param creationDate
     * @param title
     * @param answerCount
     * @param isAnswered
     * @param owner
     * @param answerId
     * @param hasAcceptedAnswer
     * @param isAccepted
     */
    public Item(List<String> tags, List<String> equivalentTagSearch, Owner owner, LastActivityUser lastActivityUser, Integer questionScore, Boolean isAccepted, Boolean hasAcceptedAnswer, Integer answerCount, Boolean isAnswered, Integer questionId, String itemType, Integer score, Integer lastActivityDate, Integer creationDate, String body, String excerpt, String title, Integer answerId) {
        this.tags = tags;
        this.equivalentTagSearch = equivalentTagSearch;
        this.owner = owner;
        this.lastActivityUser = lastActivityUser;
        this.questionScore = questionScore;
        this.isAccepted = isAccepted;
        this.hasAcceptedAnswer = hasAcceptedAnswer;
        this.answerCount = answerCount;
        this.isAnswered = isAnswered;
        this.questionId = questionId;
        this.itemType = itemType;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.body = body;
        this.excerpt = excerpt;
        this.title = title;
        this.answerId = answerId;
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
     * The equivalentTagSearch
     */
    public List<String> getEquivalentTagSearch() {
        return equivalentTagSearch;
    }

    /**
     *
     * @param equivalentTagSearch
     * The equivalent_tag_search
     */
    public void setEquivalentTagSearch(List<String> equivalentTagSearch) {
        this.equivalentTagSearch = equivalentTagSearch;
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
     * The lastActivityUser
     */
    public LastActivityUser getLastActivityUser() {
        return lastActivityUser;
    }

    /**
     *
     * @param lastActivityUser
     * The last_activity_user
     */
    public void setLastActivityUser(LastActivityUser lastActivityUser) {
        this.lastActivityUser = lastActivityUser;
    }

    /**
     *
     * @return
     * The questionScore
     */
    public Integer getQuestionScore() {
        return questionScore;
    }

    /**
     *
     * @param questionScore
     * The question_score
     */
    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
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
     * The hasAcceptedAnswer
     */
    public Boolean getHasAcceptedAnswer() {
        return hasAcceptedAnswer;
    }

    /**
     *
     * @param hasAcceptedAnswer
     * The has_accepted_answer
     */
    public void setHasAcceptedAnswer(Boolean hasAcceptedAnswer) {
        this.hasAcceptedAnswer = hasAcceptedAnswer;
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
     * The itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     *
     * @param itemType
     * The item_type
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
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
     * The body
     */
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body
     * The body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     *
     * @return
     * The excerpt
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     *
     * @param excerpt
     * The excerpt
     */
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
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

}
