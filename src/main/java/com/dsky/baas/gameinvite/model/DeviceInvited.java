package com.dsky.baas.gameinvite.model;

public class DeviceInvited {
	private String tablePostfix;
    public String getTablePostfix() {
		return tablePostfix;
	}

	public void setTablePostfix(String tablePostfix) {
		this.tablePostfix = tablePostfix;
	}
	
	 private Integer actId;

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_0.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_0.device_id
     *
     * @mbggenerated
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_0.game_id
     *
     * @mbggenerated
     */
    private Integer gameId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_invited_0.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_0.id
     *
     * @return the value of device_invited_0.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_0.id
     *
     * @param id the value for device_invited_0.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_0.device_id
     *
     * @return the value of device_invited_0.device_id
     *
     * @mbggenerated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_0.device_id
     *
     * @param deviceId the value for device_invited_0.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_0.game_id
     *
     * @return the value of device_invited_0.game_id
     *
     * @mbggenerated
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_0.game_id
     *
     * @param gameId the value for device_invited_0.game_id
     *
     * @mbggenerated
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_invited_0.count
     *
     * @return the value of device_invited_0.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_invited_0.count
     *
     * @param count the value for device_invited_0.count
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}