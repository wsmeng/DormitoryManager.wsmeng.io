package com.wsm.DormitoryManagement.bean;

public final class BuildingsBean {
	private int BuildingsId;
	private String BuildingsName;
	private String BuildingsDesc;
	public int getBuildingsId() {
		return BuildingsId;
	}
	public void setBuildingsId(int buildingsId) {
		BuildingsId = buildingsId;
	}
	public String getBuildingsName() {
		return BuildingsName;
	}
	public void setBuildingsName(String buildingsName) {
		BuildingsName = buildingsName;
	}
	public String getBuildingsDesc() {
		return BuildingsDesc;
	}
	public void setBuildingsDesc(String buildingsDesc) {
		BuildingsDesc = buildingsDesc;
	}
	public String toString(){
		return "ID: " + BuildingsId + "; ½¨ÖþÃû: " + BuildingsName + "; ½¨ÖþÃèÊö: " + BuildingsDesc;
	}
}
