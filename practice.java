package whil;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String con = null;
		String user = null;
		int pwd  = 0;
		int curd = 0;
		//���������
		int max = 9999;
		int min = 1000;
		int card = (int)(Math.random()*(max-min)) +min;
		//�������������յ�¼���û�������
		String userr = null;
		int pwdd = 0;
		int count = 0;
		int car = 0;
		int[] ca = new int[5];
		do {
			System.out.println("��ӭ���븻��ϵͳ");
			System.out.println("1.ע��");
			System.out.println("2.��¼");
			System.out.println("3.�齱");
			System.out.println("*******************");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			switch(choose) {
				case 1:
					System.out.println("����ϵͳ>ע��");
					System.out.println("����д������Ϣ");
					System.out.print("�û���");
					user = input.next();
					System.out.print("����");
					pwd = input.nextInt();
					System.out.println("ע��ɹ�,��Ǻ���ÿ���");
					System.out.println("�û���\t����\t��Ա����");
					System.out.println(user+"\t"+pwd+"\t"+card);
					System.out.println("������(y/n)");
					con = input.next();
					break;
				case 2:
					System.out.println("����ϵͳ>��¼");
					for(int i=0;i<3;i++) {
						System.out.print("�������û���");
						userr = input.next();
						System.out.print("����������");
						pwdd = input.nextInt();
						if(userr.equals(user) && pwd == pwdd) {
							System.out.println("��ӭ��"+userr);
						}else {
							System.out.println("��������");
						}
					}
					System.out.println("�����������");
					
					break;
				case 3:
					System.out.println("�齱");
					System.out.println("�������Ŀ���");
					car = input.nextInt();
					System.out.print("���ڵ���������Ϊ");
					for(int i=0;i<ca.length;i++) {
						ca[i] = (int)(Math.random()*(max-min)) +min;
						System.out.println(ca[i]);
						if(ca[i] == card) {
							System.out.println("��ϲ���������˻�Ա");
						}else {
							System.out.println("��Ǹ�㲻��");
							break;
						}
					}
					System.out.println("������(y/n)");
					con = input.next();
					break;
				default:
					System.out.println("����������������������");
					break;
				}
		}while("y".equals(con));
			System.out.println("ϵͳ�˳���ллʹ��!");
	}

}
