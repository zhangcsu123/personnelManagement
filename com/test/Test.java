package test;

import pm.facotry.DAOFactory;
import pm.pojo.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by csu118 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {

//1.查询
//        Person per = null;
//        try {
//            per = DAOFactory.getIPersonDaoInstance().findById(2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(per.getName());
//        System.out.println(per.getAge());
//        System.out.println(per.getBirthday());
//        System.out.println(per.getAddress());

//1.插入
//        Person per = new Person();
//        per.setPid(5);
//        per.setName("王五");
//        per.setAge(28);
//
//        String dateString = "2011-12-06";
//        try
//        {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = sdf.parse(dateString);
//            per.setBirthday(date);
//        }
//        catch (ParseException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//        per.setAddress("湖南省张家界");
//
//        try {
//            Boolean flag  = DAOFactory.getIPersonDaoInstance().doCreate(per);
//            System.out.println(flag);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }

}
