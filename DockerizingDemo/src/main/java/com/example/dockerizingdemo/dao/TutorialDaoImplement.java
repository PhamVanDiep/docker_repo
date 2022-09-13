package com.example.dockerizingdemo.dao;

import com.example.dockerizingdemo.model.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class TutorialDaoImplement extends JdbcDaoSupport implements TutorialDao{
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
    @Override
    public List<Tutorial> getAllTutorials() {
        String query = "SELECT * FROM tutorial";
        List<Map<String,Object>> rows = getJdbcTemplate().queryForList(query);
        List<Tutorial> result = new ArrayList<>();
        for (Map<String,Object> row : rows) {
            Tutorial tutorial = new Tutorial();
            tutorial.setId(Integer.parseInt(row.get("id").toString()));
            tutorial.setName(row.get("name").toString());
            tutorial.setPrice(Double.parseDouble(row.get("price").toString()));
            tutorial.setDescription(row.get("description").toString());
            String publishedString = row.get("published").toString();
            if (publishedString.equalsIgnoreCase("true")) {
                tutorial.setPublished(Byte.valueOf("1"));
            } else {
                tutorial.setPublished(Byte.valueOf("0"));
            }
            result.add(tutorial);
        }
        return result;
    }

    @Override
    public void REPLACETutorial(Tutorial tutorial) {
        String sql = "REPLACE INTO tutorial (id, name, price, description, published) values (?, ?, ?, ?, ?)";
        getJdbcTemplate().update(sql, new Object[] {tutorial.getId(), tutorial.getName(), tutorial.getPrice(), tutorial.getDescription(), tutorial.getPublished()});
    }
}
