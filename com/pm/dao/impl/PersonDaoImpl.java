package pm.dao.impl;

import pm.dao.IPersonDao;
import pm.pojo.Person;

import java.sql.Connection;
import java.util.List;

/**
 * Created by csu118 on 2016/12/5.
 */
public class PersonDaoImpl implements IPersonDao{
    private Connection conn = null;
    public PersonDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public boolean doCreate(Person person) throws Exception {
        return false;
    }

    @Override
    public boolean doUpdate(Person person) throws Exception {
        return false;
    }

    @Override
    public boolean doDelete(int pid) throws Exception {
        return false;
    }

    @Override
    public boolean findById(int pid) throws Exception {
        return false;
    }

    @Override
    public List<Person> findAll(String keyWord) throws Exception {
        return null;
    }
}
