package com.yann;



public class TestTryCatch {
	private static void printData(){
		for(int i = 0;i<5;i++){
			int x= 3;
			int y = 0;
			int result = 0;
			try{
				result = x/y;
			}catch(Exception e){
//					System.out.println("ddd");
//				 logger.error("³ýÊý¡£¡£", e);
				 e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		printData();
	}
}
