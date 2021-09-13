package com.thinklinux.user.service;

import com.thinklinux.user.entity.Department;
import com.thinklinux.user.entity.User;
import com.thinklinux.user.entity.UserDetail;
import com.thinklinux.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public UserDetail getUserDetailById(Long id) {
        User user= userRepository.getUserById(id);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+user.getDepartmentId(), Department.class);

        return new UserDetail(user,department);
    }
}
