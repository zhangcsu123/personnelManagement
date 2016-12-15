package pm.dao.impl;

import pm.dao.IPersonDao;
import pm.pojo.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "INSERT INTO person(pid,name,age,birthday,address)"
                + "VALUES(?,?,?,?,?)";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,String.valueOf(person.getPid()));
            pstmt.setString(2,person.getName());
            pstmt.setInt(3,person.getAge());
            pstmt.setDate(4,new java.sql.Date(person.getBirthday().getTime()));
            pstmt.setString(5,person.getAddress());
            int len = pstmt.executeUpdate();
            if(len > 0) {
                flag = true;
            }
        } catch(Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return flag;
    }

    @Override
    public boolean doUpdate(Person person) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "UPDATE person SET name=?,age=?,birthday=?,address=? WHERE pid=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,person.getName());
            pstmt.setInt(2,person.getAge());
            pstmt.setDate(3,new java.sql.Date(person.getBirthday().getTime()));
            pstmt.setString(4,person.getAddress());
            pstmt.setInt(5,person.getPid());
            int len = pstmt.executeUpdate();
            if(len > 0) {
                flag = true;
            }
        } catch(Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return flag;
    }

    @Override
    public boolean doDelete(int pid) throws Exception {
        boolean flag = false;
        PreparedStatement pstmt = null;
        String sql = "DELETE FROM person WHERE pid=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setInt(1,pid);
            int len = pstmt.executeUpdate();
            if(len > 0) {
                flag = true;
            }
        } catch(Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return flag;
    }

    @Override
    public Person findById(int pid) throws Exception {
        Person per = null;
        PreparedStatement pstmt = null;
        String sql = "SELECT  pid,name,age,birthday,address FROM person WHERE pid=?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setInt(1,pid);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()) {
                per = new Person();
                per.setPid(rs.getInt(1));
                per.setName(rs.getString(2));
                per.setAge(rs.getInt(3));
                per.setBirthday(rs.getDate(4));
                per.setAddress(rs.getString(5));
            }
        } catch(Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return per;
    }

    @Override
    public List<Person> findAll(String keyWord) throws Exception {
        List<Person> all = new ArrayList<Person>();
        PreparedStatement pstmt = null;
        String sql = "SELECT  pid,name,age,birthday,address FROM person"
                   + "WHERE name LIKE ? OR age LIKE ? OR birthday LIKE ? OR address LIKE ?";
        try {
            pstmt = this.conn.prepareStatement(sql);
            pstmt.setString(1,"%" + keyWord + "%");
            pstmt.setString(2,"%" + keyWord + "%");
            pstmt.setString(3,"%" + keyWord + "%");
            pstmt.setString(4,"%" + keyWord + "%");
            ResultSet rs = pstmt.executeQuery();
            Person per = null;
            while(rs.next()) {
                per = new Person();
                per.setPid(rs.getInt(1));
                per.setName(rs.getString(2));
                per.setAge(rs.getInt(3));
                per.setBirthday(rs.getDate(4));
                per.setAddress(rs.getString(5));
                all.add(per);
            }
        } catch(Exception e) {
            throw e;
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                throw e;
            }
        }
        return all;
    }
}
