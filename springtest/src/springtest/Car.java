package springtest;
public class Car {
	private String brand;
	private String color;
	private int maxSpeed;
    
     //��Ĭ�Ϲ��캯��
	public Car(){}
     
     //�ڴ��ι��캯��
	public Car(String brand,String color,int maxSpeed){ 
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

     //��δ���εķ���
	public void introduce() { 
       System.out.println("brand:"+brand+";color:"+color+";maxSpeed:" +maxSpeed);
	}
     //ʡ�Բ�����getter/Setter����

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
    
}