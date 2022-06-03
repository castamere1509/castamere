package org.chengcai.homework.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork {
	
	public static void main(String[] args) {

	//创建list集合放入Student03类的对象
	/** 姓名   年龄    性别    成绩
	 *  小花    18       女        90
	 *  小白    19       女       63
	 *  小黑    20       男       59
	 *  小王    21        男       98
	 * 
	 */
	
	List<Student03> stus = new ArrayList<Student03>();
	
	Student03 stu1 = new Student03();
	stu1.setAge(18);
	stu1.setName("小花");
	stu1.setSex("女");
    stu1.setScore(90);
	Student03 stu2 = new Student03();
	stu2.setAge(19);
	stu2.setName("小白");
	stu2.setSex("女");
    stu2.setScore(63);
	Student03 stu3 = new Student03();
	stu3.setAge(20);
	stu3.setName("小黑");
	stu3.setSex("男");
    stu3.setScore(59);
	Student03 stu4 = new Student03();
	stu4.setAge(21);
	stu4.setName("小王");
	stu4.setSex("男");
    stu4.setScore(98);
    
    stus.add(stu1);//0
    stus.add(stu2);//1
    stus.add(stu3);//2
    stus.add(stu4);//3
    System.out.println(stus);
    
    
   
	//查出谁的成绩高于60
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()>60){
			System.out.println(stus.get(i).getName());
		}
		
	}
		
	 System.out.println("-----查询女生的姓名------");
	//查询女生的姓名
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getSex().equals("女")){
			System.out.println(stus.get(i).getName());
		}
		
	}	
	System.out.println("------出谁的成绩比小白高--------");
	//查出谁的成绩比小白高，提示：先查小白的成绩，再去比较
	double xbsc=0;
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getName().equals("小白")){
			xbsc=stus.get(i).getScore();//小白的成绩
		}
		
	}
	
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()>xbsc){//拿各个对象的成绩和小白比
			System.out.println(stus.get(i).getName());//比他高的把名字打印出来
		}
		
	}
	
	
	
	//给小白的成绩+10分
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getName().equals("小白")){
			//stus.get(i).getScore()+10----小白的分数+10的值
			stus.get(i).setScore(stus.get(i).getScore()+10);//把值赋予给小白的分数
		}
		
	}
	
	
	
	System.out.println("---删除集合里面成绩没及格的对象--");
	//删除集合里面成绩没及格的对象
	for(int i =0;i<stus.size();i++){
		if(stus.get(i).getScore()<60){
			stus.remove(i);
		}
		
	}
	System.out.println(stus);
	
	
	//创建set集合放入Student03类的对象
	/** 姓名   年龄    性别    成绩
	 *  小花    18       女        90
	 *  小白    19       女       63
	 *  小黑    20       男       59
	 *  小王    21        男       98
	 * 
	 */
	
Set<Student03> stust = new HashSet<Student03>();
	
	Student03 stut1 = new Student03();
	stut1.setAge(18);
	stut1.setName("小花");
	stut1.setSex("女");
    stut1.setScore(90);
	Student03 stut2 = new Student03();
	stut2.setAge(19);
	stut2.setName("小白");
	stut2.setSex("女");
    stut2.setScore(63);
	Student03 stut3 = new Student03();
	stut3.setAge(20);
	stut3.setName("小黑");
	stut3.setSex("男");
    stut3.setScore(59);
	Student03 stut4 = new Student03();
	stut4.setAge(21);
	stut4.setName("小王");
	stut4.setSex("男");
    stut4.setScore(98);
    
    stust.add(stut1);
    stust.add(stut2);
    stust.add(stut3);
    stust.add(stut4);
	
	System.out.println("--------set---------");
	//查出谁的成绩高于60
    for(Student03 s:stust){
    	if(s.getScore()>60){
			System.out.println(s.getName());
		}
    	
    }
    
	System.out.println("-------查询所有男生高于60的姓名--------");
	//查询所有男生高于60的姓名
    for(Student03 s:stust){
    	if(s.getScore()>60 && s.getSex().equals("男")){
			System.out.println(s.getName());
		}
    	
    }
    
    System.out.println("-----查出谁的成绩比小白高------");
	//查出谁的成绩比小白高，提示：先查小白的成绩，再去比较
    
    for(Student03 s:stust){
    	if(s.getName().equals("小白")){
			xbsc=s.getScore();
		}
    	
    }
    
    for(Student03 s:stust){
    	if(s.getScore()>xbsc){
			System.out.println(s.getName());
		}
    	
    }	
    
    
    
	//给小黑的成绩+10分
    for(Student03 s:stust){
    	if(s.getName().equals("小黑")){
			//s.getScore()+10----小黑的分数+10的值
			s.setScore(s.getScore()+10);//把值赋予给小黑的分数
		}
    	
    }
	
	
	
	//分别创建list和set集合存入本包三个类的任意对象和所有基本类型的包装类的数据
    List<Object> lst = new ArrayList<Object>();
    lst.add((byte)1);//加入byte类型数据时，强制转换为Object
    lst.add((short)1);
    lst.add(1);
    lst.add(1L);
    lst.add(1.1F);
    lst.add(1.1);
    lst.add('a');
    lst.add(false);
    lst.add(new Student03(18,"xiaohua", "nv",90.5));
    lst.add(new Emp02());
    lst.add(new Person01());
    
    
    Set<Object> st = new HashSet<Object>();
    st.add((byte)1);//加入byte类型数据时，强制转换为Object
    st.add((short)1);
    st.add(1);
    st.add(1L);
    st.add(1.1F);
    st.add(1.1);
    st.add('a');
    st.add(false);
    st.add(new Student03(18,"xiaohua", "nv",90.5));
    st.add(new Emp02());
    st.add(new Person01());
	
	//遍历打印这两个集合的数据
	for(int i=0;i<lst.size();i++){
		System.out.println(lst.get(i));
	}
	
	System.out.println("-----set遍历-------");
	for(Object o:st){
		System.out.println(o);
	}
	

}
}