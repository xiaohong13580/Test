//吃货联盟

package cn.jbit.bdqn;
import java.util.*; 
public class Chihuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			String[] name = new String[10];		//名字
			String[] di = new String[10];		//地址
			double[] money = {38.0,20.0,10.0};	//单价
			String[] cai ={"红烧带鱼","鱼香肉丝","时令鲜疏"};   //菜单
			int zan = 0;
			int[] dian = new int[3];			//点赞
			int[] fen = new int[10];				//份数
			int[] shi = new int[10];				//时间
			int[] bian = {1,2,3};				//菜品编号
			int bia = 0;
			double song = 5.0;					//送餐费
			double[] zong = new double[10]; 		//总金额
			int[] zhuang = new int[10];			//订单状态
			Boolean xun = true;   //循环
			int shu;
			do{
				System.out.println("欢迎使用“吃货联盟订餐系统”");
				System.out.println("*******************************");
				System.out.println("1.我要订餐");
				System.out.println("2.查看餐袋");
				System.out.println("3.签收订单");
				System.out.println("4.删除订单");
				System.out.println("5.我要点赞");
				System.out.println("6.退出系统");
				System.out.println("*******************************");
				System.out.print("请选择：");
				shu = input.nextInt();
					switch(shu){
					case 1:
						Boolean a = false;
						for(int i = 0;i<name.length;i++){
							if(name[i]==null){
								a = true;
								System.out.println("****我要订餐****");
								System.out.print("请输入订餐人姓名：");
								name[i] = input.next();
								System.out.println("序号\t菜品名称\t单价\t点贊数");
								System.out.println(bian[0]+".\t"+cai[0]+"\t"+money[0]+"\t"+dian[0]);
								System.out.println(bian[1]+".\t"+cai[1]+"\t"+money[1]+"\t"+dian[1]);
								System.out.println(bian[2]+".\t"+cai[2]+"\t"+money[2]+"\t"+dian[2]);
								System.out.print("请选择您要点的菜品编号：");
								bia= input.nextInt();
								while(bia> 3 || bia < 1){
									System.out.print("输入错误，请重新输入");
									bia= input.nextInt();
								}
								System.out.print("请选择您要输入的份数：");
								fen[i] = input.nextInt();
								System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）：");
								shi[i] = input.nextInt();
								while(shi[i] > 20 || shi[i] < 10){
									System.out.print("输入错误，请重新输入");
									shi[i] = input.nextInt();
								}
								System.out.print("请输入送餐地址：");
								di[i]= input.next();
								System.out.println("订餐成功！");
								System.out.println("您订的是："+cai[bia-1]+fen[i]+"份");
								System.out.println("送餐时间："+shi[i]+"点");
								if(money[bia-1]*fen[i]>=50){
									zong[i]=money[bia-1]*fen[i];
									System.out.println("餐费："+money[bia-1]*fen[i]+"元,送餐费0.0元，总计："+zong[i]+"元。");
								}else{
									zong[i]=money[bia-1]*fen[i]+song;
									System.out.println("餐费："+money[bia-1]*fen[i]+"元,送餐费"+song+"元，总计："+zong[i]+"元。");
								}
								System.out.println("输入0时返回");
								shu = input.nextInt();
								if(shu==0){
									break;
								}else{
									continue;						
								}
							}
						}
						continue;
					case 2:
						System.out.println("****查看餐袋****");
						System.out.println("序号\t订餐人\t餐品信息\t\t送餐时间\t送餐地址\t  总金额\t订单状态");
						for(int i = 0; i < name.length;i++){
							if(name[i]!=null){
								String tai = (zhuang[i]==0)?"已预订":"已完成";
								System.out.println((i+1)+"\t"+name[i]+"\t"+cai[bia-1]+fen[i]+"份        \t"+shi[i]+"点\t"+di[i]+"\t"+zong[i]+"\t"+tai);	
							}
						}
						System.out.println("输入0返回主菜单：");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("退出程序");
						break;
					case 3:
						System.out.println("****签收订单****");
						for(int i = 0 ;i < name.length;i++){
							System.out.print("请选择要签收的订单序号：");
							shu = input.nextInt();
							if(name[shu-1]!=null && zhuang[shu-1]==0){
								System.out.println("订单签收成功！");
								zhuang[shu-1] = 1;
								break;
							}else{
									System.out.println("您输入的序号无，请输入正确序号!");
									break;
							}
						}
						System.out.println("输入0返回主菜单：");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("退出程序");
						break;
					case 4:
						System.out.println("****删除订单****");
						System.out.print("请输入要删除的订单序号：");
						shu = input.nextInt();
						for(int i = 0;i < name.length;i++){
							if(name[shu-1]!=null && zhuang[i]==1){
								System.out.println("已删除");
								name[shu-1] = null;
								break;
							}else if(name[shu-1]!=null && zhuang[shu-1]==0){
									System.out.println("您选择的订单未签收，不能删除");
									break;
							}
						}
						System.out.println("输入0返回主菜单：");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("退出程序");
						break;
					case 5:
						for(int i = 0 ;i < name.length;i++){
							System.out.println("****我要点赞****");
							System.out.println("序号\t菜品名称\t单价\t点贊数");
							System.out.println(bian[0]+".\t"+cai[0]+"\t"+money[0]+"\t"+dian[0]);
							System.out.println(bian[1]+".\t"+cai[1]+"\t"+money[1]+"\t"+dian[1]);
							System.out.println(bian[2]+".\t"+cai[2]+"\t"+money[2]+"\t"+dian[2]);
							System.out.print("请输入您要点赞的序号：");
							zan = input.nextInt();
								if(zan <= 3 && zan >= 1){
									System.out.println("点赞成功！");
									if(zan==1){
										dian[0]++;
										break;
									}
									if(zan==2){
										dian[1]++;
										break;
										}
									if(zan==3){
										dian[2]++;
										break;
									}
								}else{
									System.out.println("你点赞的菜品序号无，请输入正确序号");
									break;
								}	
								System.out.println("输入0时返回");
								shu = input.nextInt();
								if(shu==0){
									break;
								}else{
									continue;						
								}
						}
						continue;
					case 6:
						System.out.println("****退出系统****");
						System.out.println("谢谢使用，欢迎下次光临");
						break;
					default:
						System.out.println("输入错误，请输入正确选择项目");
						break;		
					}
					break;
			}while(xun==true);
	}

}
