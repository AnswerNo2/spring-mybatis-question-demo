package com.test.service;

import com.test.entity.Person;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private SqlSessionTemplate sessionTemplate;

    public List<Person> testName(String name) {
        Map param = new HashMap<>();
        param.put("name", name);
        //TODO when your parameter have key named 'orderBy', it will be wrong like this :
        //TODO wrong message
        //TODO ### The error occurred while setting parameters
        //TODO ### SQL: SELECT * FROM person WHERE name = ? order by []
        param.put("orderBy", new ArrayList<>());
        //param.put("orderTest", new ArrayList<>());
        param.put("test", new ArrayList<>());
        return sessionTemplate.selectList("com.test.entity.Person.testName", param);
    }

}
