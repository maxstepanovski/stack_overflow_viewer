package com.example.mambayamba.stackoverflowviewer.model.question.average;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Owner {

    @SerializedName("reputation")
    @Expose
    private Integer reputation;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("profile_image")
    @Expose
    private String profileImage;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("link")
    @Expose
    private String link;

    /**
     * No args constructor for use in serialization
     *
     */
    public Owner() {
    }

    /**
     *
     * @param profileImage
     * @param link
     * @param userId
     * @param reputation
     * @param displayName
     * @param userType
     */
    public Owner(Integer reputation, Integer userId, String userType, String profileImage, String displayName, String link) {
        this.reputation = reputation;
        this.userId = userId;
        this.userType = userType;
        this.profileImage = profileImage;
        this.displayName = displayName;
        this.link = link;
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

}

