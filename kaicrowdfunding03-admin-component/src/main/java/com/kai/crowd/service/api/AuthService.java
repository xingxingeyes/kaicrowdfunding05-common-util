package com.kai.crowd.service.api;

import com.kai.crowd.entity.Auth;

import java.util.List;
import java.util.Map;

public interface AuthService {
    List<Auth> getAll();

    List<Integer> getAssignedAuthIdByRoleId(Integer roleId);

    void saveRoleAuthRelationship(Map<String, List<Integer>> map);
}
