package lf.com.grpcdemoclient.domain;

import java.util.List;

/**
 * @Author linfan
 * @Date 2020/12/7 16:52
 * @Version 1.0
 */
public class InterruptStatusVo {
    //申请单号
    private String applicationId;
    // 申请人用户
    private String applyUser;
    // 中断开始时间
    private Long interruptStartTime;
    // 中断截止时间
    private Long interruptEndTime;
    // 延期开始时间
    private Long extensionStartTime;
    // 延期截止时间
    private Long extensionEndTime;
    // 状态是否处于中断过程中
    private boolean isIntrrupted ;
    // 施工地点-园区
    private String locationPark;
    // 施工地点-区域
    private String locationRegion;
    // 施工地点-栋
    private String locationBuilding;

    //TODO 中断项目
    private List<InterruptProjectVo> interruptProjects;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
    }

    public Long getInterruptStartTime() {
        return interruptStartTime;
    }

    public void setInterruptStartTime(Long interruptStartTime) {
        this.interruptStartTime = interruptStartTime;
    }

    public Long getInterruptEndTime() {
        return interruptEndTime;
    }

    public void setInterruptEndTime(Long interruptEndTime) {
        this.interruptEndTime = interruptEndTime;
    }

    public Long getExtensionStartTime() {
        return extensionStartTime;
    }

    public void setExtensionStartTime(Long extensionStartTime) {
        this.extensionStartTime = extensionStartTime;
    }

    public Long getExtensionEndTime() {
        return extensionEndTime;
    }

    public void setExtensionEndTime(Long extensionEndTime) {
        this.extensionEndTime = extensionEndTime;
    }

    public boolean isIntrrupted() {
        return isIntrrupted;
    }

    public void setIntrrupted(boolean intrrupted) {
        isIntrrupted = intrrupted;
    }

    public String getLocationPark() {
        return locationPark;
    }

    public void setLocationPark(String locationPark) {
        this.locationPark = locationPark;
    }

    public String getLocationRegion() {
        return locationRegion;
    }

    public void setLocationRegion(String locationRegion) {
        this.locationRegion = locationRegion;
    }

    public String getLocationBuilding() {
        return locationBuilding;
    }

    public void setLocationBuilding(String locationBuilding) {
        this.locationBuilding = locationBuilding;
    }

    public List<InterruptProjectVo> getInterruptProjects() {
        return interruptProjects;
    }

    public void setInterruptProjects(List<InterruptProjectVo> interruptProjects) {
        this.interruptProjects = interruptProjects;
    }
}
