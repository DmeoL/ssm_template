package com.dsky.baas.gameinvite.model;

public class DeviceInvitedApply {
	private String tablePostfix;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_apply_0.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_apply_0.device_id
     *
     * @mbggenerated
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_apply_0.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_apply_0.apply_count
     *
     * @mbggenerated
     */
    private Integer applyCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_apply_0.id
     *
     * @return the value of device_invited_apply_0.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_apply_0.id
     *
     * @param id the value for device_invited_apply_0.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_apply_0.device_id
     *
     * @return the value of device_invited_apply_0.device_id
     *
     * @mbggenerated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_apply_0.device_id
     *
     * @param deviceId the value for device_invited_apply_0.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_apply_0.code
     *
     * @return the value of device_invited_apply_0.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_apply_0.code
     *
     * @param code the value for device_invited_apply_0.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_apply_0.apply_count
     *
     * @return the value of device_invited_apply_0.apply_count
     *
     * @mbggenerated
     */
    public Integer getApplyCount() {
        return applyCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_apply_0.apply_count
     *
     * @param applyCount the value for device_invited_apply_0.apply_count
     *
     * @mbggenerated
     */
    public void setApplyCount(Integer applyCount) {
        this.applyCount = applyCount;
    }

	public String getTablePostfix() {
		return tablePostfix;
	}

	public void setTablePostfix(String tablePostfix) {
		this.tablePostfix = tablePostfix;
	}
}