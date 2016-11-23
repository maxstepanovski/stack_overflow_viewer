package com.example.mambayamba.stackoverflowviewer.model.questionpage;

/**
 * Created by mambayamba on 21.11.2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Owner {

    @SerializedName("badge_counts")
    @Expose
    private BadgeCounts badgeCounts;
    @SerializedName("view_count")
    @Expose
    private Integer viewCount;
    @SerializedName("down_vote_count")
    @Expose
    private Integer downVoteCount;
    @SerializedName("up_vote_count")
    @Expose
    private Integer upVoteCount;
    @SerializedName("answer_count")
    @Expose
    private Integer answerCount;
    @SerializedName("question_count")
    @Expose
    private Integer questionCount;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("is_employee")
    @Expose
    private Boolean isEmployee;
    @SerializedName("last_modified_date")
    @Expose
    private Integer lastModifiedDate;
    @SerializedName("last_access_date")
    @Expose
    private Integer lastAccessDate;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("reputation_change_year")
    @Expose
    private Integer reputationChangeYear;
    @SerializedName("reputation_change_quarter")
    @Expose
    private Integer reputationChangeQuarter;
    @SerializedName("reputation_change_month")
    @Expose
    private Integer reputationChangeMonth;
    @SerializedName("reputation_change_week")
    @Expose
    private Integer reputationChangeWeek;
    @SerializedName("reputation_change_day")
    @Expose
    private Integer reputationChangeDay;
    @SerializedName("reputation")
    @Expose
    private Integer reputation;
    @SerializedName("creation_date")
    @Expose
    private Integer creationDate;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("accept_rate")
    @Expose
    private Integer acceptRate;
    @SerializedName("about_me")
    @Expose
    private String aboutMe;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("website_url")
    @Expose
    private String websiteUrl;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("display_name")
    @Expose
    private String displayName;

    /**
     * No args constructor for use in serialization
     *
     */
    public Owner() {
    }

    /**
     *
     * @param accountId
     * @param location
     * @param link
     * @param reputationChangeDay
     * @param acceptRate
     * @param aboutMe
     * @param userType
     * @param upVoteCount
     * @param age
     * @param reputation
     * @param userId
     * @param badgeCounts
     * @param reputationChangeQuarter
     * @param websiteUrl
     * @param isEmployee
     * @param downVoteCount
     * @param reputationChangeYear
     * @param profileImage
     * @param creationDate
     * @param answerCount
     * @param questionCount
     * @param lastModifiedDate
     * @param reputationChangeMonth
     * @param displayName
     * @param reputationChangeWeek
     * @param viewCount
     * @param lastAccessDate
     */
    public Owner(BadgeCounts badgeCounts, Integer viewCount, Integer downVoteCount, Integer upVoteCount, Integer answerCount, Integer questionCount, Integer accountId, Boolean isEmployee, Integer lastModifiedDate, Integer lastAccessDate, Integer age, Integer reputationChangeYear, Integer reputationChangeQuarter, Integer reputationChangeMonth, Integer reputationChangeWeek, Integer reputationChangeDay, Integer reputation, Integer creationDate, String userType, Integer userId, Integer acceptRate, String aboutMe, String location, String websiteUrl, String link, String profileImage, String displayName) {
        this.badgeCounts = badgeCounts;
        this.viewCount = viewCount;
        this.downVoteCount = downVoteCount;
        this.upVoteCount = upVoteCount;
        this.answerCount = answerCount;
        this.questionCount = questionCount;
        this.accountId = accountId;
        this.isEmployee = isEmployee;
        this.lastModifiedDate = lastModifiedDate;
        this.lastAccessDate = lastAccessDate;
        this.age = age;
        this.reputationChangeYear = reputationChangeYear;
        this.reputationChangeQuarter = reputationChangeQuarter;
        this.reputationChangeMonth = reputationChangeMonth;
        this.reputationChangeWeek = reputationChangeWeek;
        this.reputationChangeDay = reputationChangeDay;
        this.reputation = reputation;
        this.creationDate = creationDate;
        this.userType = userType;
        this.userId = userId;
        this.acceptRate = acceptRate;
        this.aboutMe = aboutMe;
        this.location = location;
        this.websiteUrl = websiteUrl;
        this.link = link;
        this.profileImage = profileImage;
        this.displayName = displayName;
    }

    /**
     *
     * @return
     * The badgeCounts
     */
    public BadgeCounts getBadgeCounts() {
        return badgeCounts;
    }

    /**
     *
     * @param badgeCounts
     * The badge_counts
     */
    public void setBadgeCounts(BadgeCounts badgeCounts) {
        this.badgeCounts = badgeCounts;
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
     * The questionCount
     */
    public Integer getQuestionCount() {
        return questionCount;
    }

    /**
     *
     * @param questionCount
     * The question_count
     */
    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    /**
     *
     * @return
     * The accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     *
     * @param accountId
     * The account_id
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     *
     * @return
     * The isEmployee
     */
    public Boolean getIsEmployee() {
        return isEmployee;
    }

    /**
     *
     * @param isEmployee
     * The is_employee
     */
    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    /**
     *
     * @return
     * The lastModifiedDate
     */
    public Integer getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     *
     * @param lastModifiedDate
     * The last_modified_date
     */
    public void setLastModifiedDate(Integer lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     *
     * @return
     * The lastAccessDate
     */
    public Integer getLastAccessDate() {
        return lastAccessDate;
    }

    /**
     *
     * @param lastAccessDate
     * The last_access_date
     */
    public void setLastAccessDate(Integer lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    /**
     *
     * @return
     * The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     * The age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @return
     * The reputationChangeYear
     */
    public Integer getReputationChangeYear() {
        return reputationChangeYear;
    }

    /**
     *
     * @param reputationChangeYear
     * The reputation_change_year
     */
    public void setReputationChangeYear(Integer reputationChangeYear) {
        this.reputationChangeYear = reputationChangeYear;
    }

    /**
     *
     * @return
     * The reputationChangeQuarter
     */
    public Integer getReputationChangeQuarter() {
        return reputationChangeQuarter;
    }

    /**
     *
     * @param reputationChangeQuarter
     * The reputation_change_quarter
     */
    public void setReputationChangeQuarter(Integer reputationChangeQuarter) {
        this.reputationChangeQuarter = reputationChangeQuarter;
    }

    /**
     *
     * @return
     * The reputationChangeMonth
     */
    public Integer getReputationChangeMonth() {
        return reputationChangeMonth;
    }

    /**
     *
     * @param reputationChangeMonth
     * The reputation_change_month
     */
    public void setReputationChangeMonth(Integer reputationChangeMonth) {
        this.reputationChangeMonth = reputationChangeMonth;
    }

    /**
     *
     * @return
     * The reputationChangeWeek
     */
    public Integer getReputationChangeWeek() {
        return reputationChangeWeek;
    }

    /**
     *
     * @param reputationChangeWeek
     * The reputation_change_week
     */
    public void setReputationChangeWeek(Integer reputationChangeWeek) {
        this.reputationChangeWeek = reputationChangeWeek;
    }

    /**
     *
     * @return
     * The reputationChangeDay
     */
    public Integer getReputationChangeDay() {
        return reputationChangeDay;
    }

    /**
     *
     * @param reputationChangeDay
     * The reputation_change_day
     */
    public void setReputationChangeDay(Integer reputationChangeDay) {
        this.reputationChangeDay = reputationChangeDay;
    }

    /**
     *
     * @return
     * The reputation
     */
    public Integer getReputation() {
        return reputation;
    }

    /**
     *
     * @param reputation
     * The reputation
     */
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
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
     * The userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     *
     * @param userType
     * The user_type
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     *
     * @return
     * The userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     * The user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     *
     * @return
     * The acceptRate
     */
    public Integer getAcceptRate() {
        return acceptRate;
    }

    /**
     *
     * @param acceptRate
     * The accept_rate
     */
    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    /**
     *
     * @return
     * The aboutMe
     */
    public String getAboutMe() {
        return aboutMe;
    }

    /**
     *
     * @param aboutMe
     * The about_me
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The websiteUrl
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    /**
     *
     * @param websiteUrl
     * The website_url
     */
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
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
     * The profileImage
     */
    public String getProfileImage() {
        return profileImage;
    }

    /**
     *
     * @param profileImage
     * The profile_image
     */
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    /**
     *
     * @return
     * The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     * The display_name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}