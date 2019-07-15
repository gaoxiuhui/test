package generate;

public class animalDemo {
	//具有年龄，体重，跑动和吃东西等属性和方法
public int age;
public double zhong;
//构造器
public animalDemo(){}
public animalDemo(int age,double zhong){
this.age=age;
this.zhong=zhong;
}
//set和get方法
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getZhong() {
	return zhong;
}
public void setZhong(double zhong) {
	this.zhong = zhong;
}
//跑步和吃东西的方法
public void getRun(){
	System.out.println("我会跑步！！！");
}
public void getEat(){
	System.out.println("我会吃东西！！！");
}

public static void main(String[] args){
	tiger  t=new tiger();
	t.getJiao();
}
}

 class cat extends animalDemo{
	//喵喵叫的行为
	 public void getJiao(){
			System.out.println("我会喵喵叫！！！");
		} 
 }
 
 class tiger extends cat{	 
 }
