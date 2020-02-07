package com.abhiandroid.retrofitexample;

import java.util.HashMap;
import java.util.Map;

public class UserListResponse {

    private String id;
    private String userName;
    private String mobileNo;
    private String emailAddress;
    private String password;
    private String isDeleted;

    private String StartTrip;
    private String EndTrip;
    private String StartLoc;
    private String EndLoc;
    private String SpeedDes01;
    private String SpeedDes02;
    private String SpeedDes03;
    private String SpeedDes04;
    private String SpeedDes05;
    private String OverAcel;
    private String HarshBrake;
    private String SmoothBrake;
    private String SmoothDrive;
    private String RapidAcel;
    private String NaturalDecel;
    private String IdleTime;
    private String AvgSpeed;
    private String AvgRPM;
    private String MaxSpeed;
    private String MaxRPM;
    private String UsualSpeed;
    private String UsualRPM;
    private String MedianSpeed;
    private String MedianRPM;
    private Integer v;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getStartTrip() {
        return StartTrip;
    }

    public void setStartTrip(String startTrip) {
        this.StartTrip = startTrip;
    }

    public String getEndTrip() {
        return EndTrip;
    }

    public void setEndTrip(String endTrip) {
        this.EndTrip = endTrip;
    }

    public String getStartLoc() {
        return StartLoc;
    }

    public void setStartLoc(String StartLoc) {
        this.StartLoc = StartLoc;
    }

    public String getEndLoc() {
        return EndLoc;
    }

    public void setEndLoc(String endLoc) {
        this.EndLoc = endLoc;
    }

    public String getSpeedDes01() {
        return SpeedDes01;
    }

    public void setSpeedDes01(String speedDes01) {
        this.SpeedDes01 = speedDes01;
    }

    public String getSpeedDes02() {
        return SpeedDes02;
    }

    public void setSpeedDes02(String speedDes02) {
        this.SpeedDes02 = speedDes02;
    }

    public String getSpeedDes03() {
        return SpeedDes03;
    }

    public void setSpeedDes03(String speedDes03) {
        this.SpeedDes03 = speedDes03;
    }

    public String getSpeedDes04() {
        return SpeedDes04;
    }

    public void setSpeedDes04(String speedDes04) {
        this.SpeedDes04 = speedDes04;
    }

    public String getSpeedDes05() {
        return SpeedDes05;
    }

    public void setSpeedDes05(String speedDes05) {
        this.SpeedDes05 = speedDes05;
    }

    public String getOverAcel() {
        return OverAcel;
    }

    public void setOverAcel(String overAcel) {
        this.OverAcel = overAcel;
    }

    public String getHarshBrake() {
        return HarshBrake;
    }

    public void setHarshBrake(String harshBrake) {
        this.HarshBrake = harshBrake;
    }

    public String getSmoothBrake() {
        return SmoothBrake;
    }

    public void setSmoothBrake(String smoothBrake) {
        this.SmoothBrake = smoothBrake;
    }

    public String getSmoothDrive() {
        return SmoothDrive;
    }

    public void setSmoothDrive(String smoothDrive) {
        this.SmoothDrive = smoothDrive;
    }

    public String getRapidAcel() {
        return RapidAcel;
    }

    public void setRapidAcel(String rapidAcel) {
        this.RapidAcel = rapidAcel;
    }

    public String getNaturalDecel() {
        return NaturalDecel;
    }

    public void setNaturalDecel(String naturalDecel) {
        this.NaturalDecel = naturalDecel;
    }

    public String getIdleTime() {
        return IdleTime;
    }

    public void setIdleTime(String idleTime) {
        this.IdleTime = idleTime;
    }

    public String getAvgSpeed() {
        return AvgSpeed;
    }

    public void setAvgSpeed(String avgSpeed) {
        this.AvgSpeed = avgSpeed;
    }

    public String getAvgRPM() {
        return AvgRPM;
    }

    public void setAvgRPM(String avgRPM) {
        this.AvgRPM = avgRPM;
    }

    public String getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.MaxSpeed = maxSpeed;
    }

    public String getMaxRPM() {
        return MaxRPM;
    }

    public void setMaxRPM(String maxRPM) {
        this.MaxRPM = maxRPM;
    }

    public String getUsualSpeed() {
        return UsualSpeed;
    }

    public void setUsualSpeed(String usualSpeed) {
        this.UsualSpeed = usualSpeed;
    }

    public String getUsualRPM() {
        return UsualRPM;
    }

    public void setUsualRPM(String usualRPM) {
        this.UsualRPM = usualRPM;
    }

    public String getMedianSpeed() {
        return MedianSpeed;
    }

    public void setMedianSpeed(String medianSpeed) {
        this.MedianSpeed = medianSpeed;
    }

    public String getMedianRPM() {
        return MedianRPM;
    }

    public void setMedianRPM(String medianRPM) {
        this.MedianRPM = medianRPM;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}