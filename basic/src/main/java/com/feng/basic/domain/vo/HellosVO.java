package com.feng.basic.domain.vo;

import java.util.List;

/**
 * @desc：
 * @title：HellosVO
 * @author: tianfengluyao
 * @date: 2018/11/16 10:21
 */
public class HellosVO {

    private String appId;
    private List<String> videoIds;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<String> getVideoIds() {
        return videoIds;
    }

    public void setVideoIds(List<String> videoIds) {
        this.videoIds = videoIds;
    }
}
