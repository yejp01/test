package com.yann;

import java.util.Timer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyTimerTask implements ServletContextListener {
	private Timer timer = null;

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		timer.cancel();
		event.getServletContext().log("��ʱ������");
		System.out.println("ֹͣ���ݳ��򡭡�");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// �������ʼ������������tomcat������ʱ�����������������,����ʾ����������ʵ�ֶ�ʱ������
		timer = new Timer(true);
		event.getServletContext().log("��ʱ��������");// �����־������tomcat��־�в鿴��
		timer.schedule(new exportHistoryBean(event.getServletContext()), 0,
				5 * 1000);// ����
							// exportHistoryBean��0��ʾ�������ӳ٣�5*1000��ʾÿ��5��ִ������60*60*1000��ʾһ��Сʱ��
	}
	
	public static void main(String[] args) {
		MyTimerTask myTimerTask = new MyTimerTask();
		ServletContextEvent event = new ServletContextEvent(null);
		myTimerTask.contextInitialized(event);
		System.out.println("11111");
	}
}
