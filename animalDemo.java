package generate;

public class animalDemo {
	//�������䣬���أ��ܶ��ͳԶ��������Ժͷ���
public int age;
public double zhong;
//������
public animalDemo(){}
public animalDemo(int age,double zhong){
this.age=age;
this.zhong=zhong;
}
//set��get����
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
//�ܲ��ͳԶ����ķ���
public void getRun(){
	System.out.println("�һ��ܲ�������");
}
public void getEat(){
	System.out.println("�һ�Զ���������");
}

public static void main(String[] args){
	tiger  t=new tiger();
	t.getJiao();
}
}

 class cat extends animalDemo{
	//�����е���Ϊ
	 public void getJiao(){
			System.out.println("�һ������У�����");
		} 
 }
 
 class tiger extends cat{	 
 }
