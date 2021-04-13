package com.rtu.sebi.service;

import com.rtu.sebi.document.SebiUser;
import com.rtu.sebi.dto.SebiUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SebiUserService implements UserDetailsService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public SebiUser getById(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("sebiId").is(userId));
        List<SebiUser> users = mongoTemplate.find(query, SebiUser.class);
        return users.get(0);
    }

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        return new SebiUserDetails(getById(userId));
    }
}
