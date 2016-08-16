package com.mvp.rutong.frame.data.entity;

/**
 * Created by han_l on 2016/5/30.
 */
public class User {

    private String sid;
    private String qrCodePicUrl;
    private String saLoginName;
    private String saLoginPassword;
    private String headPicUrl;
    private String userApproveStatus;
    private String userBalance;
    private String userLatitude;
    private String userLongitude;
    private String userNickName;
    private String userServiceCity;
    private String idCodeBackPic;
    private String idCodeFrontPic;
    private String headSelfPicUrl;
    private String userAddress;
    private String userAge;
    private String userApplyDatetime;
    private String userCompany;
    private String userHeadPic;
    private String userIdCode;
    private String userIdCodeBackPic;
    private String userIdCodeFrontPic;
    private String userSelfHeadPic;
    private String userRealName;
    private String userServiceStatus;
    private String userSex;
    private String userTelephone;
    private String friendNickName;
    private String userApprovedDatetime;
    private String userCollectionNum;
    private String userCreateDate;
    private String userMcount;
    private String userNum;
    private String userRefusalReason;
    private String userServiceNum;
    private String isReadNotify;//是否存在未读通知  0没有 1有


    private String domain;
    private String servedCount;

    //是否购买秘书服务0是未购买 1是购买
    private String saIsSecretary;

    //秘书服务ID
    private String secretaryId;

    //秘书服务有效时间
    private String secretaryTime;


    //秘书昵称
    private String secretaryName;


    //擅长
    private String userSpeciality;

    //常出没
    private String userFrequentAddress;

    //成交量
    private String count;
    //juli
    private String distance;

    private boolean isLogin = false;

    //账户信息，小秘书信息
    private User account;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getQrCodePicUrl() {
        return qrCodePicUrl;
    }

    public void setQrCodePicUrl(String qrCodePicUrl) {
        this.qrCodePicUrl = qrCodePicUrl;
    }

    public String getSaLoginName() {
        return saLoginName;
    }

    public void setSaLoginName(String saLoginName) {
        this.saLoginName = saLoginName;
    }

    public String getSaLoginPassword() {
        return saLoginPassword;
    }

    public void setSaLoginPassword(String saLoginPassword) {
        this.saLoginPassword = saLoginPassword;
    }

    public String getHeadPicUrl() {
        return headPicUrl;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
    }

    public String getUserApproveStatus() {
        return userApproveStatus;
    }

    public void setUserApproveStatus(String userApproveStatus) {
        this.userApproveStatus = userApproveStatus;
    }

    public String getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(String userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserLatitude() {
        return userLatitude;
    }

    public void setUserLatitude(String userLatitude) {
        this.userLatitude = userLatitude;
    }

    public String getUserLongitude() {
        return userLongitude;
    }

    public void setUserLongitude(String userLongitude) {
        this.userLongitude = userLongitude;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserServiceCity() {
        return userServiceCity;
    }

    public void setUserServiceCity(String userServiceCity) {
        this.userServiceCity = userServiceCity;
    }

    public String getIdCodeBackPic() {
        return idCodeBackPic;
    }

    public void setIdCodeBackPic(String idCodeBackPic) {
        this.idCodeBackPic = idCodeBackPic;
    }

    public String getIdCodeFrontPic() {
        return idCodeFrontPic;
    }

    public void setIdCodeFrontPic(String idCodeFrontPic) {
        this.idCodeFrontPic = idCodeFrontPic;
    }

    public String getHeadSelfPicUrl() {
        return headSelfPicUrl;
    }

    public void setHeadSelfPicUrl(String headSelfPicUrl) {
        this.headSelfPicUrl = headSelfPicUrl;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserApplyDatetime() {
        return userApplyDatetime;
    }

    public void setUserApplyDatetime(String userApplyDatetime) {
        this.userApplyDatetime = userApplyDatetime;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserHeadPic() {
        return userHeadPic;
    }

    public void setUserHeadPic(String userHeadPic) {
        this.userHeadPic = userHeadPic;
    }

    public String getUserIdCode() {
        return userIdCode;
    }

    public void setUserIdCode(String userIdCode) {
        this.userIdCode = userIdCode;
    }

    public String getUserIdCodeBackPic() {
        return userIdCodeBackPic;
    }

    public void setUserIdCodeBackPic(String userIdCodeBackPic) {
        this.userIdCodeBackPic = userIdCodeBackPic;
    }

    public String getUserIdCodeFrontPic() {
        return userIdCodeFrontPic;
    }

    public void setUserIdCodeFrontPic(String userIdCodeFrontPic) {
        this.userIdCodeFrontPic = userIdCodeFrontPic;
    }

    public String getUserSelfHeadPic() {
        return userSelfHeadPic;
    }

    public void setUserSelfHeadPic(String userSelfHeadPic) {
        this.userSelfHeadPic = userSelfHeadPic;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserServiceStatus() {
        return userServiceStatus;
    }

    public void setUserServiceStatus(String userServiceStatus) {
        this.userServiceStatus = userServiceStatus;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getFriendNickName() {
        return friendNickName;
    }

    public void setFriendNickName(String friendNickName) {
        this.friendNickName = friendNickName;
    }

    public String getUserApprovedDatetime() {
        return userApprovedDatetime;
    }

    public void setUserApprovedDatetime(String userApprovedDatetime) {
        this.userApprovedDatetime = userApprovedDatetime;
    }

    public String getUserCollectionNum() {
        return userCollectionNum;
    }

    public void setUserCollectionNum(String userCollectionNum) {
        this.userCollectionNum = userCollectionNum;
    }

    public String getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(String userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public String getUserMcount() {
        return userMcount;
    }

    public void setUserMcount(String userMcount) {
        this.userMcount = userMcount;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserRefusalReason() {
        return userRefusalReason;
    }

    public void setUserRefusalReason(String userRefusalReason) {
        this.userRefusalReason = userRefusalReason;
    }

    public String getUserServiceNum() {
        return userServiceNum;
    }

    public void setUserServiceNum(String userServiceNum) {
        this.userServiceNum = userServiceNum;
    }

    public String getIsReadNotify() {
        return isReadNotify;
    }

    public void setIsReadNotify(String isReadNotify) {
        this.isReadNotify = isReadNotify;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getServedCount() {
        return servedCount;
    }

    public void setServedCount(String servedCount) {
        this.servedCount = servedCount;
    }

    public String getSaIsSecretary() {
        return saIsSecretary;
    }

    public void setSaIsSecretary(String saIsSecretary) {
        this.saIsSecretary = saIsSecretary;
    }

    public String getSecretaryId() {
        return secretaryId;
    }

    public void setSecretaryId(String secretaryId) {
        this.secretaryId = secretaryId;
    }

    public String getSecretaryTime() {
        return secretaryTime;
    }

    public void setSecretaryTime(String secretaryTime) {
        this.secretaryTime = secretaryTime;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    public String getUserSpeciality() {
        return userSpeciality;
    }

    public void setUserSpeciality(String userSpeciality) {
        this.userSpeciality = userSpeciality;
    }

    public String getUserFrequentAddress() {
        return userFrequentAddress;
    }

    public void setUserFrequentAddress(String userFrequentAddress) {
        this.userFrequentAddress = userFrequentAddress;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public User getAccount() {
        return account;
    }

    public void setAccount(User account) {
        this.account = account;
    }
}
