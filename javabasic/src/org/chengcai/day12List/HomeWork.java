package org.chengcai.day12List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
	
	public static void main(String[] args){
	//创建list集合放入Student03类的对象
		/** 姓名   年龄    性别    成绩
		 *  小花    18       女        90
		 *  小白    19       女       63
		 *  小黑    20       男       59
		 *  小王    21        男       98
		 * 
		 */
	List<Student03> st = new ArrayList<Student03>();
	 Student03 st1 = new Student03("小花",18,"女",90);
	 Student03 st2 = new Student03("小白",19,"女",63);
	 Student03 st3 = new Student03("小黑",20,"男",59);
	 Student03 st4 = new Student03("小王",21,"男",98); 
	 st.add(st1);
	 st.add(st2);
	 st.add(st3);
	 st.add(st4);
		//查出谁的成绩高于60
	 System.out.println("查出谁的成绩高于60----------------------");
		for(Student03 s:st){
			if(s.getScore()>60){
				System.out.println(s.getName());
			}
		}
		//查询女生的姓名
		System.out.println("查询女生的姓名----------------------");
		for(Student03 s:st){
			if(s.getSex().equals("女")){
				System.out.println(s.getName());
			}
		}
		//查出谁的成绩比小白高，提示：先查小白的成绩，再去比较
		System.out.println("查出谁的成绩比小白高，提示：先查小白的成绩，再去比较-------------------");
		int aa =0;
		for(Student03 a:st){
			if(a.getName().equals("小白")){
				 aa =a.getScore();
				System.out.println(aa);
			}
		}
		for(Student03 s:st){
			if(s.getScore()>aa){
				System.out.println(s.getName());
			}
		}
		//给小白的成绩+10分
		System.out.println("给小白的成绩+10分-------------------------");
		int bb =0;
		for(Student03 b:st){
			if(b.getName().equals("小白")){
				bb =b.getScore();
				System.out.println(bb);
			}
		}
		for(Student03 s:st){
			if(s.getName().equals("小白")){
				s.setScore(bb+10);
			}
		}
		for(Student03 s:st){
			if(s.getName().equals("小白")){
				System.out.println(s.getScore());
			}
		}
		
		//删除集合里面成绩没及格的对象
		System.out.println("删除集合里面成绩没及格的对象-------------------------");

		for(Student03 s:st){
			if(s.getScore()<60){
				st.remove(s);
			}
		}
       System.out.println(st);
		//创建set集合放入Student03类的对象
		/** 姓名   年龄    性别    成绩
		 *  小花    18       女        90
		 *  小白    19       女       63
		 *  小黑    20       男       59
		 *  小王    21        男       98
		 * 
		 */
Set<Student03> sd = new HashSet<Student03>();
		
   Student03 sd1 = new Student03("小花",18,"女",90);
   Student03 sd2 = new Student03("小白",19,"女",63);
   Student03 sd3 = new Student03("小黑",20,"男",59);	
   Student03 sd4 = new Student03("小王",21,"男",98);
   sd.add(sd1);
   sd.add(sd2);
   sd.add(sd3);
   sd.add(sd4);
		//查出谁的成绩高于60
   System.out.println("查出谁的成绩高于60-------------------------");

		for(Student03 s:sd){
			if(s.getScore()>60){
				System.out.println(s.getName());
			}
		}
		//查询所有男生高于60的姓名
		System.out.println("查询所有男生高于60的姓名-------------------------");

		for(Student03 s:sd){
			if(s.getScore()>60&&s.getSex().equals("男")){
				System.out.println(s.getName());
			}
		}
		//查出谁的成绩比小白高，提示：先查小白的成绩，再去比较
		System.out.println("查出谁的成绩比小白高，提示：先查小白的成绩，再去比较-------------------------");

		int cc =0;
		for(Student03 a:sd){
			if(a.getName().equals("小白")){
				 cc =a.getScore();
			
			}
		}
		for(Student03 c:sd){
			if(c.getScore()>cc){
				System.out.println(c.getName());
			}
		}
		
		
		//给小黑的成绩+10分
		System.out.println("给小黑的成绩+10分-------------------------");

		int dd =0;
		for(Student03 b:sd){
			if(b.getName().equals("小黑")){
				dd =b.getScore();
				System.out.println(dd);
			}
		}
		for(Student03 s:sd){
			if(s.getName().equals("小黑")){
				s.setScore(dd+10);
			}
		}
		//分别创建list和set集合存入本包三个类的任意对象和所有基本类型的包装类的数据
		List<Object> ob = new ArrayList<Object>();
		
		ob.add((byte)1);
		ob.add((short)1);
		ob.add(1);
		ob.add(1L);
		ob.add(1.1f);
		ob.add(1.1);
		ob.add('a');
		ob.add(false);
		ob.add(new Student03());
		ob.add(new Emp02());
		ob.add(new Person01());
		Set<Object> oo = new HashSet<Object>();
		Object oo1 = new Student03();
		Object oo2 = new Person01();
		Object oo3 = new Emp02();
		oo.add(oo1);
		oo.add(oo2);
		oo.add(oo3);
		//遍历打印这两个集合的数据
		System.out.println("遍历打印这两个集合的数据-------------------------");

		for(Object o:ob){
			System.out.println(o);
		}
		
		for(Object r:oo){
			System.out.println(r);
		}
		
	}
}
