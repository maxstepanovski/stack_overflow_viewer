package com.example.mambayamba.stackoverflowviewer.model.questionpage;

/**
 * Created by mambayamba on 21.11.2016.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class BadgeCounts {

    @SerializedName("bronze")
    @Expose
    private Integer bronze;
    @SerializedName("silver")
    @Expose
    private Integer silver;
    @SerializedName("gold")
    @Expose
    private Integer gold;

    /**
     * No args constructor for use in serialization
     *
     */
    public BadgeCounts() {
    }

    /**
     *
     * @param bronze
     * @param silver
     * @param gold
     */
    public BadgeCounts(Integer bronze, Integer silver, Integer gold) {
        this.bronze = bronze;
        this.silver = silver;
        this.gold = gold;
    }

    /**
     *
     * @return
     * The bronze
     */
    public Integer getBronze() {
        return bronze;
    }

    /**
     *
     * @param bronze
     * The bronze
     */
    public void setBronze(Integer bronze) {
        this.bronze = bronze;
    }

    /**
     *
     * @return
     * The silver
     */
    public Integer getSilver() {
        return silver;
    }

    /**
     *
     * @param silver
     * The silver
     */
    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    /**
     *
     * @return
     * The gold
     */
    public Integer getGold() {
        return gold;
    }

    /**
     *
     * @param gold
     * The gold
     */
    public void setGold(Integer gold) {
        this.gold = gold;
    }

}
