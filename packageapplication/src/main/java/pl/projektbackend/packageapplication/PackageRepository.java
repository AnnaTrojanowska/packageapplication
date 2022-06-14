package pl.projektbackend.packageapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PackageRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<User> getAll(){
      return jdbcTemplate.query("Select idUsers, login, password, email FROM users", BeanPropertyRowMapper.newInstance(User.class));
    }

    public User getById(int idUsers)
    {
        return jdbcTemplate.queryForObject("select idUsers, login, password, email FROM users where idUsers=?", BeanPropertyRowMapper.newInstance(User.class), idUsers);
    }
}
