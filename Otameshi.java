/*
2012.11.26初版
2012.11.30更新
2012.12.05更新 Input 関連クラス化

*/

import java.io.*;

class Otameshi1 {
  public static void main(String args[]) {
		
		//乱数生成
		int c = (int)(Math.random()*1000);
		
			System.out.println("Ver 1.0.5");
			
			System.out.println("　 　　　 　　 　＿＿＿_");
			System.out.println("　　　　　　 ／ ＼　　／＼　ｷﾘｯ");
			System.out.println(".　　　　　／　（ー） （ー）＼　　　　天啓が来た！。");
			System.out.println("　　　　／　　 ⌒（__人__）⌒ ＼");
			System.out.println("　　　　|　　 　　　|r┬-|　　　|");
			System.out.println("　　　　 ＼　　　　 `ー'´　　 ／");
			System.out.println("　　　　ノ　　　　　　　　　　 　＼");
			System.out.println("　 ／´　　　　　　　　　　　　 　　ヽ");
			System.out.println("　|　　　　ｌ　　　　　　　　　　　　　　＼");
			System.out.println("　ヽ　　　 -一''''''\"~~｀`'ー--､　　　-一'''''''ー-､.");
			System.out.println("　　ヽ ＿＿＿＿(⌒)(⌒)⌒)　)　　(⌒＿(⌒)⌒)⌒))");
			System.out.println("０～９９９までの数を当ててください。");
			System.out.println("入力...");
			
			
			//Strに入力された値を代入
			//String str = br.readLine();
			String str;
			//int型 i に入力された値を代入
			int i = KeyIn.readInt();
			
			//boolean型のseikaiを作成：初期値にfalse代入
			boolean seikai = false;
			
			
			//メインループ
			for (int s = 1; seikai == false; s++) {
				//正解
				if ( i == c ) {
					System.out.println("おめでとうございます。[" + c + "] 正解です。");
					System.out.println("あなたは" + s + "回目で正解しました。");
					System.out.println("\nもう一度遊びますか。[Y : N]");
					//Input用意
					str = KeyIn.readStr();
					if (str.equals("Y") || str.equals("y")) {
						//初期化
						s = 0;
						//乱数生成
						c = (int)(Math.random()*1000);
						System.out.println("０～９９９までの数を当ててください。");
						//str = br.readLine();
						i = KeyIn.readInt();
					} else if(str.equals("N") || str.equals("n")){
						seikai = true;
						System.out.println("お疲れさまでした。");
					}
				//不正解
				} else {
					//正解に対して入力値が大きい場合
					if ( i > c ) {
						System.out.println("違います。入力値が大きいです。(入力値＞正解)");
					//正解に対して入力値が小さい場合
					} else if ( i < c ) {
						System.out.println("違います。入力値が小さいです。(入力値＜正解)");
					}
					System.out.println("０～９９９までの数を当ててください。");
					//Input用意
					//str = br.readLine();
					i = KeyIn.readInt();
				}
			}
		
	}
}

class KeyIn{
	static int readInt(){
		int f;
		InputStreamReader rin = new InputStreamReader(System.in);
		BufferedReader dis = new BufferedReader(rin);
		try{
			String line = dis.readLine();
			f = Integer.parseInt(line);
		}catch(NumberFormatException e){
			f = 0;
		}catch(IOException e){
			f = 0;
		}
			return f;
	}

	static String readStr(){
		String str=null;
		InputStreamReader rin = new InputStreamReader(System.in);
		BufferedReader dis = new BufferedReader(rin);
		try{
			str = dis.readLine();
		}catch(IOException e){
			str = null;
		}
			return str;
	}
}