package whil;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String con = null;
		String user = null;
		int pwd  = 0;
		int curd = 0;
		//生成随机数
		int max = 9999;
		int min = 1000;
		int card = (int)(Math.random()*(max-min)) +min;
		//创建变量来接收登录的用户名密码
		String userr = null;
		int pwdd = 0;
		int count = 0;
		int car = 0;
		int[] ca = new int[5];
		do {
			System.out.println("欢迎进入富豪系统");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.抽奖");
			System.out.println("*******************");
			System.out.println("请选择");
			int choose = input.nextInt();
			switch(choose) {
				case 1:
					System.out.println("富豪系统>注册");
					System.out.println("请填写个人信息");
					System.out.print("用户名");
					user = input.next();
					System.out.print("密码");
					pwd = input.nextInt();
					System.out.println("注册成功,请记好你得卡号");
					System.out.println("用户名\t密码\t会员卡号");
					System.out.println(user+"\t"+pwd+"\t"+card);
					System.out.println("继续吗？(y/n)");
					con = input.next();
					break;
				case 2:
					System.out.println("富豪系统>登录");
					for(int i=0;i<3;i++) {
						System.out.print("请输入用户名");
						userr = input.next();
						System.out.print("请输入密码");
						pwdd = input.nextInt();
						if(userr.equals(user) && pwd == pwdd) {
							System.out.println("欢迎你"+userr);
						}else {
							System.out.println("输入有误");
						}
					}
					System.out.println("输入次数过多");
					
					break;
				case 3:
					System.out.println("抽奖");
					System.out.println("输入您的卡号");
					car = input.nextInt();
					System.out.print("本期的幸运数字为");
					for(int i=0;i<ca.length;i++) {
						ca[i] = (int)(Math.random()*(max-min)) +min;
						System.out.println(ca[i]);
						if(ca[i] == card) {
							System.out.println("恭喜你你是幸运会员");
						}else {
							System.out.println("抱歉你不是");
							break;
						}
					}
					System.out.println("继续吗？(y/n)");
					con = input.next();
					break;
				default:
					System.out.println("您的输入有误，请重新输入");
					break;
				}
		}while("y".equals(con));
			System.out.println("系统退出，谢谢使用!");
	}

}
