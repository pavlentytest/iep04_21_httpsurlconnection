package ru.samsung.itschool.mdev.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Laureate {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("knownName")
    @Expose
    private KnownName knownName;
    @SerializedName("portion")
    @Expose
    private String portion;
    @SerializedName("sortOrder")
    @Expose
    private String sortOrder;
    @SerializedName("motivation")
    @Expose
    private Motivation motivation;
    @SerializedName("links")
    @Expose
    private Links__1 links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KnownName getKnownName() {
        return knownName;
    }

    public void setKnownName(KnownName knownName) {
        this.knownName = knownName;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Motivation getMotivation() {
        return motivation;
    }

    public void setMotivation(Motivation motivation) {
        this.motivation = motivation;
    }

    public Links__1 getLinks() {
        return links;
    }

    public void setLinks(Links__1 links) {
        this.links = links;
    }

}
