package org.chengcai.day10override02;

public class Person01 {
	
	private int age;
    private String name;
    private String sex;
	

    public void  eat(){
        System.out.println("Ï²»¶³ÔÏã½¶");
     }
     public void sleep(){
        System.out.println("Ë¯¾õºÜÊæÌ¹");
   }


    
    public Person01() {
		
	}

	public Person01(int age, String name, String sex) {
		
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	

}
