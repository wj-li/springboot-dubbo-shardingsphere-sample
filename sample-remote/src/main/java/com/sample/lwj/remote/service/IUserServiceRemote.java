package com.sample.lwj.remote.service;

import com.sample.lwj.remote.dto.UserDTO;

import java.util.Date;
import java.util.List;

public interface IUserServiceRemote {

    UserDTO selectByUsername(String username);

    Boolean insertSelective(UserDTO userDTO);

    UserDTO selectByPrimaryKey(Long id);

    Boolean updateByPrimaryKeySelective(UserDTO userDTO);

    List<UserDTO> select(UserDTO userDTO);

    List<UserDTO> selectByDateRange(Date start, Date end);

    List<UserDTO> selectByDate(Date date);

}