package com.example.mambayamba.stackoverflowviewer.model.questionpage;

/**
 * Created by mambayamba on 21.11.2016.
 */
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
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = new ArrayList<Answer>();
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("last_editor")
    @Expose
    private LastEditor lastEditor;
    @SerializedName("can_close")
    @Expose
    private Boolean canClose;
    @SerializedName("can_flag")
    @Expose
    private Boolean canFlag;
    @SerializedName("reopen_vote_count")
    @Expose
    private Integer reopenVoteCount;
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
    @SerializedName("share_link")
    @Expose
    private String shareLink;
    @SerializedName("body_markdown")
    @Expose
    private String bodyMarkdown;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;

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
     * @param downVoteCount
     * @param questionId
     * @param link
     * @param lastActivityDate
     * @param shareLink
     * @param score
     * @param answers
     * @param lastEditor
     * @param lastEditDate
     * @param reopenVoteCount
     * @param bodyMarkdown
     * @param creationDate
     * @param canFlag
     * @param upVoteCount
     * @param title
     * @param answerCount
     * @param favoriteCount
     * @param canClose
     * @param isAnswered
     * @param owner
     * @param viewCount
     */
    public Item(List<String> tags, List<Answer> answers, Owner owner, LastEditor lastEditor, Boolean canClose, Boolean canFlag, Integer reopenVoteCount, Boolean isAnswered, Integer viewCount, Integer favoriteCount, Integer downVoteCount, Integer upVoteCount, Integer answerCount, Integer score, Integer lastActivityDate, Integer creationDate, Integer lastEditDate, Integer questionId, String shareLink, String bodyMarkdown, String link, String title, String body) {
        this.tags = tags;
        this.answers = answers;
        this.owner = owner;
        this.lastEditor = lastEditor;
        this.canClose = canClose;
        this.canFlag = canFlag;
        this.reopenVoteCount = reopenVoteCount;
        this.isAnswered = isAnswered;
        this.viewCount = viewCount;
        this.favoriteCount = favoriteCount;
        this.downVoteCount = downVoteCount;
        this.upVoteCount = upVoteCount;
        this.answerCount = answerCount;
        this.score = score;
        this.lastActivityDate = lastActivityDate;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
        this.questionId = questionId;
        this.shareLink = shareLink;
        this.bodyMarkdown = bodyMarkdown;
        this.link = link;
        this.title = title;
        this.body = body;
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
     * The answers
     */
    public List<Answer> getAnswers() {
        return answers;
    }

    /**
     *
     * @param answers
     * The answers
     */
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
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
     * The canClose
     */
    public Boolean getCanClose() {
        return canClose;
    }

    /**
     *
     * @param canClose
     * The can_close
     */
    public void setCanClose(Boolean canClose) {
        this.canClose = canClose;
    }

    /**
     *
     * @return
     * The canFlag
     */
    public Boolean getCanFlag() {
        return canFlag;
    }

    /**
     *
     * @param canFlag
     * The can_flag
     */
    public void setCanFlag(Boolean canFlag) {
        this.canFlag = canFlag;
    }

    /**
     *
     * @return
     * The reopenVoteCount
     */
    public Integer getReopenVoteCount() {
        return reopenVoteCount;
    }

    /**
     *
     * @param reopenVoteCount
     * The reopen_vote_count
     */
    public void setReopenVoteCount(Integer reopenVoteCount) {
        this.reopenVoteCount = reopenVoteCount;
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
     * The shareLink
     */
    public String getShareLink() {
        return shareLink;
    }

    /**
     *
     * @param shareLink
     * The share_link
     */
    public void setShareLink(String shareLink) {
        this.shareLink = shareLink;
    }

    /**
     *
     * @return
     * The bodyMarkdown
     */
    public String getBodyMarkdown() {
        return bodyMarkdown;
    }

    /**
     *
     * @param bodyMarkdown
     * The body_markdown
     */
    public void setBodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
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

}