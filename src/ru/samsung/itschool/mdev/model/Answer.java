package ru.samsung.itschool.mdev.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {
    @SerializedName("awardYear")
    @Expose
    private String awardYear;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("categoryFullName")
    @Expose
    private CategoryFullName categoryFullName;
    @SerializedName("dateAwarded")
    @Expose
    private String dateAwarded;
    @SerializedName("prizeAmount")
    @Expose
    private Integer prizeAmount;
    @SerializedName("prizeAmountAdjusted")
    @Expose
    private Integer prizeAmountAdjusted;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("laureates")
    @Expose
    private List<Laureate> laureates = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public String getAwardYear() {
        return awardYear;
    }

    public void setAwardYear(String awardYear) {
        this.awardYear = awardYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CategoryFullName getCategoryFullName() {
        return categoryFullName;
    }

    public void setCategoryFullName(CategoryFullName categoryFullName) {
        this.categoryFullName = categoryFullName;
    }

    public String getDateAwarded() {
        return dateAwarded;
    }

    public void setDateAwarded(String dateAwarded) {
        this.dateAwarded = dateAwarded;
    }

    public Integer getPrizeAmount() {
        return prizeAmount;
    }

    public void setPrizeAmount(Integer prizeAmount) {
        this.prizeAmount = prizeAmount;
    }

    public Integer getPrizeAmountAdjusted() {
        return prizeAmountAdjusted;
    }

    public void setPrizeAmountAdjusted(Integer prizeAmountAdjusted) {
        this.prizeAmountAdjusted = prizeAmountAdjusted;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}

class Category {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}

class CategoryFullName {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("no")
    @Expose
    private String no;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}

class Links {

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("types")
    @Expose
    private String types;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}
class Links__1 {

    @SerializedName("rel")
    @Expose
    private String rel;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("types")
    @Expose
    private String types;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}
class Meta {

    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

}
class Motivation {

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("se")
    @Expose
    private String se;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getSe() {
        return se;
    }

    public void setSe(String se) {
        this.se = se;
    }

}