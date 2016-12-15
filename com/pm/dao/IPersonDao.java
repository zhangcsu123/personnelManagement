package pm.dao;

import pm.pojo.Person;

import java.util.List;

/**
 * Created by csu118 on 2016/12/5.
 */
public interface IPersonDao {
    /**
     * 增加操作
     */
    public boolean doCreate(Person person) throws Exception;

    /**
     * 修改操作
     */
    public boolean doUpdate(Person person) throws Exception;

    /**
     * 删除操作
     */
    public boolean doDelete(int pid) throws Exception;

    /**
     * 查询操作
     */
    public Person findById(int pid) throws Exception;

    /**
     * 查询所有
     */
    public List<Person> findAll(String keyWord) throws Exception;

}

