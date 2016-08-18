package com.dsky.baas.gameinvite.dao;

import com.dsky.baas.gameinvite.model.DeviceInvited;
import com.dsky.baas.gameinvite.model.DeviceInvitedApply;

public interface DeviceInvitedApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    int insert(DeviceInvitedApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    int insertSelective(DeviceInvitedApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    DeviceInvitedApply selectByPrimaryKey(DeviceInvitedApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeviceInvitedApply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_invited_apply_0
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeviceInvitedApply record);
    /**
     * 通过device和code查询
     * @author eaves.zhu
     * @param record
     * @return int
     */
    DeviceInvitedApply selectByDeviceAndCode(DeviceInvitedApply record);
    /**
     * 通过device和code跟新
     * @author eaves.zhu
     * @param record
     * @return
     */
    int updateByDeviceKeyAndCodeSelective(DeviceInvitedApply record);
}