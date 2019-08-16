package com.aserbao.aserbaosandroid.comon.base.beans;

import com.aserbao.aserbaosandroid.comon.commonData.StaticFinalValues;

/**
 * 功能:
 *
 * @author aserbao
 * @date : On 2019/2/19 4:51 PM
 * @email: this is empty email
 * @project:AserbaosAndroid
 * @package:com.aserbao.aserbaosandroid.base.beans
 */
public class BaseRecyclerBean {
    String name;            //名字
    int tag;                //标记
    private Class<?> clazz; //跳转的类
    int imageSrc;           //背景图片地址
    int viewType = StaticFinalValues.VIEW_HOLDER_TEXT;

    public BaseRecyclerBean(String name, int tag) {
        this.name = name;
        this.tag = tag;
        this.viewType = StaticFinalValues.VIEW_HOLDER_TEXT;
    }

    public BaseRecyclerBean(int tag, int imageSrc) {
        this.tag = tag;
        this.imageSrc = imageSrc;
        this.viewType = StaticFinalValues.VIEW_HOLDER_IMAGE_100H;
    }

    public BaseRecyclerBean(String name, int tag, Class<?> clazz) {
        this.name = name;
        this.tag = tag;
        this.clazz = clazz;
        this.viewType = StaticFinalValues.VIEW_HOLDER_CLASS;
    }


    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(int imageSrc) {
        this.imageSrc = imageSrc;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public BaseRecyclerBean(String name) {
        this.name = name;
    }

    public int getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
