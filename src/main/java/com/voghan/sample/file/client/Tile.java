package com.voghan.sample.file.client;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    
    /*
     * required fields:
     * Offer ID - F006
     * Event Name - F001
     * Department - F071
     * Class - F072
     * Subclass - F073
     * Offer Status
     * Creator
     * 
     */
    private String versionsId;
    private String offerId;
    private String eventName;
    private String department;
    private String deptClass;
    private String deptSubClass;
    private String status;
    private String statusTs;
    private String usrId;
    private List<TileVersion> versions;
    
    public Tile(String F000, String F002, String F003, String F006) {
	versionsId = F000 + "-" + F002 + "-" + F003 + "-" + F006;
	versions = new ArrayList<TileVersion>();
    }
    
    public List<TileVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<TileVersion> versions) {
        this.versions = versions;
    }
    
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDeptClass() {
        return deptClass;
    }

    public void setDeptClass(String deptClass) {
        this.deptClass = deptClass;
    }

    public String getDeptSubClass() {
        return deptSubClass;
    }

    public void setDeptSubClass(String deptSubClass) {
        this.deptSubClass = deptSubClass;
    }

    public String getStatusTs() {
        return statusTs;
    }

    public void setStatusTs(String statusTs) {
        this.statusTs = statusTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getVersionsId() {
        return versionsId;
    }

    public void setVersionsId(String versionsId) {
        this.versionsId = versionsId;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
