package com.bjpowernode.test;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;
import com.bjpowernode.vo.StudentAndClassVo2;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @ClassName Test3
 * @Description TODO
 * @Author Eelit
 * @Date 2021/8/16 22:40
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

        /*List<Student> students = studentDao.getAll();

        for (Student student : students) {
            System.out.println(student);
        }*/

        /*List<Student> students = studentDao.select7("x");
        for (Student student : students) {
            System.out.println("student = " + student);
        }*/

        /*List<Student> students = studentDao.select16();
        for (Student student : students) {
            System.out.println("student = " + student);
        }*/

        /*List<Map<String, Object>> list= studentDao.select23();

        for (Map<String, Object> stringObjectMap : list) {

            Set key = stringObjectMap.keySet();

            for (Object o : key) {
                System.out.println("{" + o + "," + stringObjectMap.get(o)+ "}");
            }
        }*/

        /*Map map = new HashMap();
        map.put("id", "A00");
        map.put("address", "生");
        Student s = studentDao.select24(map);
        System.out.println("s = " + s);*/

        //传数组
        /*String[] array = {"A0001", "A0003", "A0005"};
        List<Student> list = studentDao.select25(array);
        for (Student o : list) {
            System.out.println("o = " + o);
        }*/

        //传集合(Map不行) List行
        /*Map map = new HashMap();
        map.put("age1", 21);
        map.put("age2", 23);*/
        /*ArrayList<Integer> integers = new ArrayList<>();
        integers.add(21);
        integers.add(23);
        List<Student> list = studentDao.select26(integers);
        for (Student o : list) {
            System.out.println("o = " + o);
        }*/

        //返回map
        /*List<Map<String, Object>> slist = studentDao.select27();
        for (Map<String, Object> map : slist) {
            Set set = map.keySet();
            for (Object o : set) {
                System.out.println("key="+o);
                System.out.println("value="+map.get(o));
            }
            System.out.println("------------------------------------");
        }*/

        /*List<StudentAndClassVo2> slist = studentDao.select28();
        for (StudentAndClassVo2 vo2 : slist) {
            System.out.println(vo2);
        }*/

        List<StudentAndClassVo2> slist = studentDao.select29("z");
        for (StudentAndClassVo2 vo2 : slist) {
            System.out.println(vo2);
        }
    }
}
