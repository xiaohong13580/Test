//�Ի�����

package cn.jbit.bdqn;
import java.util.*; 
public class Chihuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			String[] name = new String[10];		//����
			String[] di = new String[10];		//��ַ
			double[] money = {38.0,20.0,10.0};	//����
			String[] cai ={"���մ���","������˿","ʱ������"};   //�˵�
			int zan = 0;
			int[] dian = new int[3];			//����
			int[] fen = new int[10];				//����
			int[] shi = new int[10];				//ʱ��
			int[] bian = {1,2,3};				//��Ʒ���
			int bia = 0;
			double song = 5.0;					//�Ͳͷ�
			double[] zong = new double[10]; 		//�ܽ��
			int[] zhuang = new int[10];			//����״̬
			Boolean xun = true;   //ѭ��
			int shu;
			do{
				System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
				System.out.println("*******************************");
				System.out.println("1.��Ҫ����");
				System.out.println("2.�鿴�ʹ�");
				System.out.println("3.ǩ�ն���");
				System.out.println("4.ɾ������");
				System.out.println("5.��Ҫ����");
				System.out.println("6.�˳�ϵͳ");
				System.out.println("*******************************");
				System.out.print("��ѡ��");
				shu = input.nextInt();
					switch(shu){
					case 1:
						Boolean a = false;
						for(int i = 0;i<name.length;i++){
							if(name[i]==null){
								a = true;
								System.out.println("****��Ҫ����****");
								System.out.print("�����붩����������");
								name[i] = input.next();
								System.out.println("���\t��Ʒ����\t����\t��ٝ��");
								System.out.println(bian[0]+".\t"+cai[0]+"\t"+money[0]+"\t"+dian[0]);
								System.out.println(bian[1]+".\t"+cai[1]+"\t"+money[1]+"\t"+dian[1]);
								System.out.println(bian[2]+".\t"+cai[2]+"\t"+money[2]+"\t"+dian[2]);
								System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
								bia= input.nextInt();
								while(bia> 3 || bia < 1){
									System.out.print("�����������������");
									bia= input.nextInt();
								}
								System.out.print("��ѡ����Ҫ����ķ�����");
								fen[i] = input.nextInt();
								System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ���");
								shi[i] = input.nextInt();
								while(shi[i] > 20 || shi[i] < 10){
									System.out.print("�����������������");
									shi[i] = input.nextInt();
								}
								System.out.print("�������Ͳ͵�ַ��");
								di[i]= input.next();
								System.out.println("���ͳɹ���");
								System.out.println("�������ǣ�"+cai[bia-1]+fen[i]+"��");
								System.out.println("�Ͳ�ʱ�䣺"+shi[i]+"��");
								if(money[bia-1]*fen[i]>=50){
									zong[i]=money[bia-1]*fen[i];
									System.out.println("�ͷѣ�"+money[bia-1]*fen[i]+"Ԫ,�Ͳͷ�0.0Ԫ���ܼƣ�"+zong[i]+"Ԫ��");
								}else{
									zong[i]=money[bia-1]*fen[i]+song;
									System.out.println("�ͷѣ�"+money[bia-1]*fen[i]+"Ԫ,�Ͳͷ�"+song+"Ԫ���ܼƣ�"+zong[i]+"Ԫ��");
								}
								System.out.println("����0ʱ����");
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
						System.out.println("****�鿴�ʹ�****");
						System.out.println("���\t������\t��Ʒ��Ϣ\t\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t  �ܽ��\t����״̬");
						for(int i = 0; i < name.length;i++){
							if(name[i]!=null){
								String tai = (zhuang[i]==0)?"��Ԥ��":"�����";
								System.out.println((i+1)+"\t"+name[i]+"\t"+cai[bia-1]+fen[i]+"��        \t"+shi[i]+"��\t"+di[i]+"\t"+zong[i]+"\t"+tai);	
							}
						}
						System.out.println("����0�������˵���");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("�˳�����");
						break;
					case 3:
						System.out.println("****ǩ�ն���****");
						for(int i = 0 ;i < name.length;i++){
							System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
							shu = input.nextInt();
							if(name[shu-1]!=null && zhuang[shu-1]==0){
								System.out.println("����ǩ�ճɹ���");
								zhuang[shu-1] = 1;
								break;
							}else{
									System.out.println("�����������ޣ���������ȷ���!");
									break;
							}
						}
						System.out.println("����0�������˵���");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("�˳�����");
						break;
					case 4:
						System.out.println("****ɾ������****");
						System.out.print("������Ҫɾ���Ķ�����ţ�");
						shu = input.nextInt();
						for(int i = 0;i < name.length;i++){
							if(name[shu-1]!=null && zhuang[i]==1){
								System.out.println("��ɾ��");
								name[shu-1] = null;
								break;
							}else if(name[shu-1]!=null && zhuang[shu-1]==0){
									System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ��");
									break;
							}
						}
						System.out.println("����0�������˵���");
						shu = input.nextInt();
						if(shu==0){
							continue;
						}
						System.out.println("�˳�����");
						break;
					case 5:
						for(int i = 0 ;i < name.length;i++){
							System.out.println("****��Ҫ����****");
							System.out.println("���\t��Ʒ����\t����\t��ٝ��");
							System.out.println(bian[0]+".\t"+cai[0]+"\t"+money[0]+"\t"+dian[0]);
							System.out.println(bian[1]+".\t"+cai[1]+"\t"+money[1]+"\t"+dian[1]);
							System.out.println(bian[2]+".\t"+cai[2]+"\t"+money[2]+"\t"+dian[2]);
							System.out.print("��������Ҫ���޵���ţ�");
							zan = input.nextInt();
								if(zan <= 3 && zan >= 1){
									System.out.println("���޳ɹ���");
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
									System.out.println("����޵Ĳ�Ʒ����ޣ���������ȷ���");
									break;
								}	
								System.out.println("����0ʱ����");
								shu = input.nextInt();
								if(shu==0){
									break;
								}else{
									continue;						
								}
						}
						continue;
					case 6:
						System.out.println("****�˳�ϵͳ****");
						System.out.println("ллʹ�ã���ӭ�´ι���");
						break;
					default:
						System.out.println("���������������ȷѡ����Ŀ");
						break;		
					}
					break;
			}while(xun==true);
	}

}
