package com.everis.ideaton.service.types;

import com.everis.ideaton.domain.Category;
import com.everis.ideaton.domain.Role;
import com.everis.ideaton.domain.SocialPlatform;
import com.everis.ideaton.domain.StateType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Override
    public List<String> getCategoryTypes() {
        List<String> categorylist = new ArrayList<>();
        Arrays.asList(Category.values()).forEach(value -> categorylist.add(value.toString()));
        return categorylist;
    }

    @Override
    public List<String> getRoleTypes() {
        List<String> roleList = new ArrayList<>();
        Arrays.asList(Role.values()).forEach(value -> roleList.add(value.toString()));
        return roleList;
    }

    @Override
    public List<String> getStateTypeTypes() {
        List<String> staeList = new ArrayList<>();
        Arrays.asList(StateType.values()).forEach(value -> staeList.add(value.toString()));
        return staeList;
    }

    @Override
    public List<String> getSocialPlatformTypes() {
        List<String> socialPlatformList = new ArrayList<>();
        Arrays.asList(SocialPlatform.values()).forEach(value -> socialPlatformList.add(value.toString()));
        return socialPlatformList;
    }
}
