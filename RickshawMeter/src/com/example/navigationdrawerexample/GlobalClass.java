package com.example.navigationdrawerexample;


public class GlobalClass {
	
	double[] meters={1.0,1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0,2.1,2.2,2.3,2.4,2.5,2.6,2.7,2.8,2.9,3.0,3.1,3.2,3.3,3.4,3.5,3.6,3.7,3.8,3.9,4.0,4.1,4.2,4.3,4.4};
    double[] fare={17,17,17,17,17,17,18.17,19.33,20.50,21.66,22.83,23.99,25.16,26.32,27.49,28.65,29.82,30.98,32.15,33.31,34.48,35.64,36.81,37.97,39.14,40.30,41.47,42.63,43.80,44.96,46.13,47.29,48.46,49.62,50.79};
	
    public int a=0;
    public int base=0;
    
	public String[] qArray=new String[10];{
	qArray[0]="Which Area do you live closest to?";
	qArray[1]="Do you own a Vehicle?";
	qArray[2]="How often do you travel in a Rickshaw in a week on an average?";
	qArray[3]="How frequently do you travel to these places in a month?";
	qArray[4]="Are you a:........?";
	}
	
	public String[] yn={"Yes","No"};
	public String[] areas={"Hadapsar","MG Road","Koregaon Park","Senapati Bapat Road","Viman Nagar","Hinjewadi","Wanowrie"};
	public int[] pvalues={180,120,120,0,150,200,130};
	
	
	
	public String[] fHeads={"Eureka!","Whatte Word!","Too Many RICKSHAWSS!!!"};
	public String[] facts={"The Rickshaw was invented by the Reverend Jonathan Scobie, an American Baptist Minister living in Yokohama, Japan built the first model in 1869 in order to transport his invalid wife. Today it remains a common mode of transportation In the Orient.","Rickshaw is a Japanese word for “Man Powered Vehicle","In India, there are more Rickshaws than Schools! That’s about 2.5 Million! Wow!"};

	public void setA(int pos)
	{
		a=pos;
	}
	public int setA()
	{
		return a;
	}
	public void setBaseline(int val)
	{
		base=val;
	}
	public int getBaseline()
	{
		return base;
	}

}
