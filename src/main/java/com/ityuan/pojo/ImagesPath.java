package com.ityuan.pojo;

public class ImagesPath {

    private Integer imgId;
    private Integer pro_id;
    private String imgPath;
    private String imgName;

    public ImagesPath() {
    }

    public ImagesPath(Integer imgId, Integer pro_id, String imgPath, String imgName) {
        this.imgId = imgId;
        this.pro_id = pro_id;
        this.imgPath = imgPath;
        this.imgName = imgName;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Override
    public String toString() {
        return "ImagesPath{" +
                "imgId=" + imgId +
                ", pro_id=" + pro_id +
                ", imgPath='" + imgPath + '\'' +
                ", imgName='" + imgName + '\'' +
                '}';
    }
}
