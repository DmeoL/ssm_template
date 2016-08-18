package com.dsky.baas.gameinvite.dao;

import java.util.List;
import java.util.Map;

import com.dsky.baas.gameinvite.model.GameConfig;

public interface GameConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    int insert(GameConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    int insertSelective(GameConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    GameConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GameConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GameConfig record);
    
    
    
    List<GameConfig> selectByGameId(int gameId);
    
    //通过游戏id和项目名称获得一个项目
    GameConfig selectByGameIdAndOptionName(Map<String, Object> param);
}