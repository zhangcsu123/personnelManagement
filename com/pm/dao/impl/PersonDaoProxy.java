package pm.dao.impl;

import jdbc.DatabaseConnection;
import pm.dao.IPersonDao;
import pm.pojo.Person;

import java.util.List;

/**
 * Created by csu118 on 2016/12/13.
 */
public class PersonDaoProxy implements IPersonDao {

    private DatabaseConnection dbc = null;
    private IPersonDao dao = null;

    public PersonDaoProxy() {
        this.dbc = new DatabaseConnection();
        this.dao = new PersonDaoImpl(this.dbc.getConnection());
    }

    @Override
    public boolean doCreate(Person person) throws Exception {
        boolean flag = false;
        try {
            flag = this.dao.doCreate(person);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.closed();
        }
        return flag;
    }

    @Override
    public boolean doUpdate(Person person) throws Exception {
        boolean flag = false;
        try {
            flag = this.dao.doUpdate(person);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.closed();
        }
        return flag;
    }

    @Override
    public boolean doDelete(int pid) throws Exception {
        boolean flag = false;
        try {
            flag = this.dao.doDelete(pid);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.closed();
        }
        return flag;
    }

    @Override
    public boolean findById(int pid) throws Exception {
        boolean flag = false;
        try {
            flag = this.dao.findById(pid);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.closed();
        }
        return flag;
    }

    @Override
    public List<Person> findAll(String keyWord) throws Exception {
        List<Person> per = null;
        try {
            per = this.dao.findAll(keyWord);
        } catch(Exception e) {
            throw e;
        } finally {
            this.dbc.closed();
        }
        return per;
    }
}
